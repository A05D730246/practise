package controller;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controller.memberData.memberDataQueryUI;
import dao.impl.memberDaoImpl;
import model.member;
import util.calculate;

import javax.swing.JTextArea;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.SwingConstants;
import javax.swing.Timer;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.print.PrinterException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.swing.JScrollPane;
import javax.swing.ImageIcon;

public class orderSettlement extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField pay;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private int tripValue;
	private int chestnutPorkRibsValue;
	private int spicyPorkKnuckleValue;
	private JTextArea output;
	private static String Username;
	private boolean paymentConfirmed = false;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					orderSettlement frame = new orderSettlement(0, 0, 0, Username);
					frame.setUndecorated(true);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public orderSettlement(int tripValue, int chestnutPorkRibsValue, int spicyPorkKnuckleValue, String Username) {

		this.tripValue = tripValue;
		this.chestnutPorkRibsValue = chestnutPorkRibsValue;
		this.spicyPorkKnuckleValue = spicyPorkKnuckleValue;
		this.Username = Username;

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 820, 743);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setLocationRelativeTo(null);

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon(orderSettlement.class.getResource("/controller/images/點擊GIF 100.gif")));
		lblNewLabel_3.setBounds(126, 631, 87, 67);
		contentPane.add(lblNewLabel_3);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 23, 786, 285);
		contentPane.add(scrollPane);

		output = new JTextArea();
		scrollPane.setViewportView(output);
		output.setFont(new Font("微软雅黑", Font.BOLD, 20));

		JLabel lblNewLabel = new JLabel("付款金額:");
		lblNewLabel.setFont(new Font("微软雅黑", Font.BOLD, 35));
		lblNewLabel.setBounds(20, 318, 184, 61);
		contentPane.add(lblNewLabel);

		pay = new JTextField();
		pay.setHorizontalAlignment(SwingConstants.RIGHT);
		pay.setText("0");
		pay.setFont(new Font("微软雅黑", Font.BOLD, 30));
		pay.setBounds(190, 327, 189, 52);
		contentPane.add(pay);
		pay.setColumns(10);

		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(10, 389, 786, 219);
		contentPane.add(scrollPane_1);

		JTextArea output2 = new JTextArea();
		scrollPane_1.setViewportView(output2);
		output2.setFont(new Font("微软雅黑", Font.BOLD, 20));

		JRadioButton card = new JRadioButton("信用卡付款");
		buttonGroup.add(card);
		card.setHorizontalAlignment(SwingConstants.RIGHT);
		card.setFont(new Font("微软雅黑", Font.BOLD, 30));
		card.setBounds(570, 320, 226, 57);
		contentPane.add(card);

		JRadioButton cash = new JRadioButton("現金付款");
		buttonGroup.add(cash);
		cash.setHorizontalAlignment(SwingConstants.RIGHT);
		cash.setFont(new Font("微软雅黑", Font.BOLD, 30));
		cash.setBounds(385, 322, 183, 57);
		contentPane.add(cash);

		JButton btnNewButton_1 = new JButton("<html><center>產生訂單<br>並返回查詢</center></html>");
		btnNewButton_1.setForeground(new Color(255, 0, 0));
		btnNewButton_1.setEnabled(false);
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String Username=orderSettlement.Username;
				if (paymentConfirmed) {
					member m = new memberDaoImpl().queryUser(Username);
					  
					  m.setTrip(tripValue);
					  m.setChestnutPorkRibs(chestnutPorkRibsValue);
					  m.setSpicyPorkKnuckle(spicyPorkKnuckleValue);
					  
					  new memberDaoImpl().update2(m);
					 
					  memberDataQueryUI add=new memberDataQueryUI();
					  add.setUsername(Username.toString());
					  add.setVisible(true);
					  dispose();
				}
			}
		});
		btnNewButton_1.setFont(new Font("微软雅黑", Font.BOLD, 25));
		btnNewButton_1.setBounds(190, 618, 183, 67);
		contentPane.add(btnNewButton_1);

		JButton btnNewButton = new JButton("確認付款");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				try {
					int payValue = Integer.parseInt(pay.getText());
					int totalAmount = calculate.Sum(tripValue, chestnutPorkRibsValue, spicyPorkKnuckleValue);
					int totalAmount2 = calculate.discountSum(tripValue, chestnutPorkRibsValue, spicyPorkKnuckleValue);

					if ((calculate.Sum(tripValue, chestnutPorkRibsValue, spicyPorkKnuckleValue) >= 2000)) {
						int payBack = payValue - totalAmount2;

						output2.setText((payBack < 0) ? calculate.wrongpay()
								: ((cash.isSelected()) ? calculate.remainder(payBack)
										: (card.isSelected()) ? "信用卡直接付款免找零" : ""));

						paymentConfirmed = true;

						btnNewButton_1.setEnabled(true);
					} else {
						int payBack = payValue - totalAmount;

						output2.setText((payBack < 0) ? calculate.wrongpay()
								: ((cash.isSelected()) ? calculate.remainder(payBack)
										: (card.isSelected()) ? "信用卡直接付款免找零" : ""));
					}
				} catch (NumberFormatException ex) {
					output2.setText(calculate.wrongpay());
					ex.printStackTrace();
				}
			}
		});
		btnNewButton.setFont(new Font("微软雅黑", Font.BOLD, 25));
		btnNewButton.setBounds(10, 618, 173, 67);
		contentPane.add(btnNewButton);

		JButton btnNewButton_1_1 = new JButton("謝謝光臨");
		btnNewButton_1_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
			}
		});
		btnNewButton_1_1.setFont(new Font("微软雅黑", Font.BOLD, 25));
		btnNewButton_1_1.setBounds(385, 618, 173, 67);
		contentPane.add(btnNewButton_1_1);

		JLabel time = new JLabel("");
		time.setForeground(new Color(255, 0, 0));
		time.setVerticalAlignment(SwingConstants.BOTTOM);
		time.setHorizontalAlignment(SwingConstants.LEFT);
		time.setFont(new Font("微软雅黑", Font.BOLD, 15));
		time.setBounds(574, 631, 232, 67);
		contentPane.add(time);
		util.clock timeUpdater = new util.clock(time);
		timeUpdater.startTimer();

		performAdditionalCalculation();
	}

	private void performAdditionalCalculation() {

		output.setText((calculate.Sum(tripValue, chestnutPorkRibsValue, spicyPorkKnuckleValue) >= 2000)
				? "使用者帳號 : " + Username + "\n\n"
						+ calculate.detalls(tripValue, chestnutPorkRibsValue, spicyPorkKnuckleValue)
						+ calculate.discountsum(tripValue, chestnutPorkRibsValue, spicyPorkKnuckleValue) + "元"
				: "使用者帳號 : " + Username + "\n\n"
						+ calculate.detalls(tripValue, chestnutPorkRibsValue, spicyPorkKnuckleValue)
						+ calculate.sum(tripValue, chestnutPorkRibsValue, spicyPorkKnuckleValue) + "元");
	}
}
