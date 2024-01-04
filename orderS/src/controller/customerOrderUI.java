package controller;

import java.awt.EventQueue;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import model.customer;
import model.member;

import util.bringIn;
import util.cal;

import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JSpinner;
import java.awt.Font;
import java.awt.Image;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.Timer;
import java.awt.Color;
import javax.swing.SpinnerNumberModel;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStreamWriter;

import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class customerOrderUI extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	JLabel beefTripepng;
	private JTextField cash;
	private customer c;
	private member m;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JTextField name;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					customerOrderUI frame = new customerOrderUI();
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
	public customerOrderUI() {

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 752, 680);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel panel = new JPanel();
		panel.setBounds(10, 10, 416, 58);
		contentPane.add(panel);
		panel.setLayout(null);

		JLabel lblNewLabel = new JLabel("阿富滷飄香");
		lblNewLabel.setFont(new Font("微软雅黑", Font.BOLD, 30));
		lblNewLabel.setBounds(129, 10, 157, 38);
		panel.add(lblNewLabel);

		JPanel panel_1 = new JPanel();
		panel_1.setBounds(10, 78, 416, 499);
		contentPane.add(panel_1);
		panel_1.setLayout(null);

		JSpinner beefTripe = new JSpinner();
		beefTripe.setModel(new SpinnerNumberModel(0, 0, 100, 1));
		beefTripe.setFont(new Font("微软雅黑", Font.BOLD, 25));
		beefTripe.setBounds(295, 133, 111, 62);
		panel_1.add(beefTripe);

		JSpinner beefShank = new JSpinner();
		beefShank.setModel(new SpinnerNumberModel(0, 0, 100, 1));
		beefShank.setFont(new Font("微软雅黑", Font.BOLD, 25));
		beefShank.setBounds(295, 228, 111, 62);
		panel_1.add(beefShank);

		JSpinner driedTofu = new JSpinner();
		driedTofu.setModel(new SpinnerNumberModel(0, 0, 100, 1));
		driedTofu.setFont(new Font("微软雅黑", Font.BOLD, 25));
		driedTofu.setBounds(295, 323, 111, 62);
		panel_1.add(driedTofu);

		JLabel lblNewLabel_1 = new JLabel("牛肚50");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("微软雅黑", Font.BOLD, 25));
		lblNewLabel_1.setBounds(10, 138, 92, 52);
		panel_1.add(lblNewLabel_1);

		JLabel lblNewLabel_1_1 = new JLabel("牛腱50");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setFont(new Font("微软雅黑", Font.BOLD, 25));
		lblNewLabel_1_1.setBounds(10, 238, 92, 42);
		panel_1.add(lblNewLabel_1_1);

		JLabel lblNewLabel_1_2 = new JLabel("豆干45");
		lblNewLabel_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2.setFont(new Font("微软雅黑", Font.BOLD, 25));
		lblNewLabel_1_2.setBounds(10, 343, 92, 42);
		panel_1.add(lblNewLabel_1_2);

		JLabel beefTripepng = new JLabel("");
		beefTripepng.setIcon(new ImageIcon(customerOrderUI.class.getResource("/image/123.gif")));
		beefTripepng.setBounds(144, 110, 120, 85);
		panel_1.add(beefTripepng);

		JLabel driedTofujpg = new JLabel("");
		driedTofujpg.setIcon(new ImageIcon(customerOrderUI.class.getResource("/image/driedTofu.png")));
		driedTofujpg.setBounds(144, 300, 120, 85);
		panel_1.add(driedTofujpg);

		JLabel beefShankjpg = new JLabel("");
		beefShankjpg.setIcon(new ImageIcon(customerOrderUI.class.getResource("/image/beefShank.png")));
		beefShankjpg.setBounds(144, 205, 120, 85);
		panel_1.add(beefShankjpg);

		JLabel lblNewLabel_2 = new JLabel("付款金額:");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("微软雅黑", Font.BOLD, 25));
		lblNewLabel_2.setBounds(10, 451, 111, 38);
		panel_1.add(lblNewLabel_2);

		JTextArea output2 = new JTextArea();
		output2.setFont(new Font("微软雅黑", Font.BOLD, 20));
		output2.setBounds(436, 288, 290, 289);
		contentPane.add(output2);

		cash = new JTextField();
		cash.setHorizontalAlignment(SwingConstants.CENTER);
		cash.setFont(new Font("微软雅黑", Font.BOLD, 20));
		cash.setBounds(147, 453, 262, 38);
		panel_1.add(cash);
		cash.setColumns(10);

		JTextArea output = new JTextArea();
		output.setFont(new Font("微软雅黑", Font.BOLD, 15));
		output.setBounds(436, 10, 290, 268);
		contentPane.add(output);

		JRadioButton member = new JRadioButton("一般會員");
		member.setSelected(true);
		buttonGroup.add(member);
		member.setFont(new Font("微软雅黑", Font.BOLD, 25));
		member.setBounds(10, 397, 130, 48);
		panel_1.add(member);

		JRadioButton vip = new JRadioButton("VIP會員");
		buttonGroup.add(vip);
		vip.setFont(new Font("微软雅黑", Font.BOLD, 25));
		vip.setBounds(144, 397, 130, 48);
		panel_1.add(vip);

		JLabel lblNewLabel_3 = new JLabel("姓名:");
		lblNewLabel_3.setFont(new Font("微软雅黑", Font.BOLD, 40));
		lblNewLabel_3.setBounds(10, 32, 111, 52);
		panel_1.add(lblNewLabel_3);

		name = new JTextField();
		name.setBounds(144, 32, 262, 52);
		panel_1.add(name);
		name.setFont(new Font("微软雅黑", Font.BOLD, 40));
		name.setHorizontalAlignment(SwingConstants.CENTER);
		name.setColumns(10);

		JLabel time = new JLabel("");
		time.setBackground(new Color(255, 255, 255));
		time.setHorizontalAlignment(SwingConstants.RIGHT);
		time.setFont(new Font("微软雅黑", Font.BOLD, 15));
		time.setBounds(448, 587, 290, 46);

		time.setHorizontalAlignment(JLabel.CENTER);
		Timer timer = new Timer(1000, e -> {
			SimpleDateFormat dateFormat = new SimpleDateFormat("YYYY/MM/dd HH:mm:ss");
			String formattedTime = dateFormat.format(new Date());
			time.setText("現在時間: " + formattedTime);
		});
		timer.start();
		contentPane.add(time);

		JButton enter = new JButton("確認");
		enter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});

		enter.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				String Name = name.getText();
				Integer BeefTripe = (int) beefTripe.getValue();
				Integer BeefShank = (int) beefShank.getValue();
				Integer DriedTofu = (int) driedTofu.getValue();

				c = new customer(Name, BeefTripe, BeefShank, DriedTofu);

				m = new member(c);
				m.memberDiscount(c);
				m.memberVipDiscount(c);

				output.setText((member.isSelected()) ? (c.detail() + m.memberDiscount(c))
						: (vip.isSelected()) ? (c.detail() + m.memberVipDiscount(c)) : "");
			}
		});
		enter.setFont(new Font("微软雅黑", Font.BOLD, 25));
		enter.setBounds(295, 395, 111, 48);
		panel_1.add(enter);

		JButton pay = new JButton("結帳");
		pay.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				try {
				    String cashText = cash.getText();
				    Integer Cash = Integer.parseInt(cashText);
				    c.setCash(Cash);
				    System.out.println(Cash);
				} catch (NumberFormatException ex) {
				   
				    ex.printStackTrace();
				}
				
			   
				m = new member(c);
				m.memberDiscount(c);
				m.memberVipDiscount(c);

				output2.setText((member.isSelected()) ? (m.payBack(c)) : (vip.isSelected()) ? (m.VipPayback(c)) : "");
			}

			private Integer parseInt(String text) {
				// TODO Auto-generated method stub
				return null;
			}
		});
		pay.setFont(new Font("微软雅黑", Font.BOLD, 25));
		pay.setBounds(10, 585, 111, 48);
		contentPane.add(pay);

		JButton clear = new JButton("重填");
		clear.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				beefTripe.setValue(0);
				beefShank.setValue(0);
				driedTofu.setValue(0);
				name.setText("");
				cash.setText("");
				output.setText("");
				output2.setText("");
				buttonGroup.clearSelection();

			}
		});
		clear.setFont(new Font("微软雅黑", Font.BOLD, 25));
		clear.setBounds(167, 585, 111, 48);
		contentPane.add(clear);

		JButton checkList = new JButton("清單");
		checkList.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				try {
		            // 將 output2.getText() 的內容寫入檔案
		            cal.addFile("c:/ABC/order.txt").writeObject(output.getText());
		        } catch (IOException ex) {
		            ex.printStackTrace();
		        }
				
				checkListUI order = new checkListUI();
		        order.setVisible(true);
		        dispose();
			
			}
		});
		checkList.setFont(new Font("微软雅黑", Font.BOLD, 25));
		checkList.setBounds(315, 585, 111, 48);
		contentPane.add(checkList);

	}
}
