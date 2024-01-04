package controller;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import util.button;
import util.calculate;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.Timer;
import javax.swing.JTextArea;
import javax.swing.ImageIcon;
import javax.swing.JSpinner;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.SpinnerNumberModel;

public class orderSystemUI extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
    private JSpinner trip;
    private JSpinner chestnutPorkRibs;
    private JSpinner spicyPorkKnuckle;
    private JTextArea output;
    private static String Username;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					orderSystemUI frame = new orderSystemUI(Username);
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
	public orderSystemUI(String Username) {
		this.Username = Username;
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 756, 528);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setLocationRelativeTo(null);

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 740, 489);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon(orderSystemUI.class.getResource("/controller/images/點擊GIF 100.gif")));
		lblNewLabel_3.setBounds(268, 409, 87, 70);
		panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel = new JLabel("歡迎選購滿兩千免運費(180)");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("微软雅黑", Font.BOLD, 30));
		lblNewLabel.setBounds(10, 10, 700, 52);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("麻辣牛肚 160 元");
		lblNewLabel_1.setFont(new Font("微软雅黑", Font.BOLD, 23));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(10, 72, 199, 34);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("栗子排骨 450 元");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setFont(new Font("微软雅黑", Font.BOLD, 23));
		lblNewLabel_1_1.setBounds(10, 188, 199, 34);
		panel.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("麻辣豬肘子 530 元");
		lblNewLabel_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2.setFont(new Font("微软雅黑", Font.BOLD, 23));
		lblNewLabel_1_2.setBounds(10, 300, 199, 34);
		panel.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon(orderSystemUI.class.getResource("/controller/images/牛肚.jpg")));
		lblNewLabel_2.setBounds(219, 72, 135, 100);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("");
		lblNewLabel_2_1.setIcon(new ImageIcon(orderSystemUI.class.getResource("/controller/images/栗子排骨.jpg")));
		lblNewLabel_2_1.setBounds(219, 189, 135, 100);
		panel.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_2 = new JLabel("");
		lblNewLabel_2_2.setIcon(new ImageIcon(orderSystemUI.class.getResource("/controller/images/麻辣豬肘子.jpg")));
		lblNewLabel_2_2.setBounds(219, 305, 135, 100);
		panel.add(lblNewLabel_2_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("120g/包");
		lblNewLabel_1_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_3.setFont(new Font("微软雅黑", Font.BOLD, 23));
		lblNewLabel_1_3.setBounds(10, 116, 199, 34);
		panel.add(lblNewLabel_1_3);
		
		JLabel lblNewLabel_1_4 = new JLabel("500g/包");
		lblNewLabel_1_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_4.setFont(new Font("微软雅黑", Font.BOLD, 23));
		lblNewLabel_1_4.setBounds(10, 232, 199, 34);
		panel.add(lblNewLabel_1_4);
		
		JLabel lblNewLabel_1_5 = new JLabel("1000g/包");
		lblNewLabel_1_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_5.setFont(new Font("微软雅黑", Font.BOLD, 23));
		lblNewLabel_1_5.setBounds(10, 344, 199, 34);
		panel.add(lblNewLabel_1_5);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(364, 72, 346, 333);
		panel.add(scrollPane);
		
        trip = new JSpinner();
        trip.setModel(new SpinnerNumberModel(0, 0, 100, 1));
        trip.setBounds(10, 156, 199, 22);
        panel.add(trip);
        trip.setFont(new Font("微软雅黑", Font.BOLD, 20));
        
        chestnutPorkRibs = new JSpinner();
        chestnutPorkRibs.setModel(new SpinnerNumberModel(0, 0, 100, 1));
        chestnutPorkRibs.setBounds(10, 276, 199, 22);
        panel.add(chestnutPorkRibs);
        chestnutPorkRibs.setFont(new Font("微软雅黑", Font.BOLD, 20));
        
        spicyPorkKnuckle = new JSpinner();
        spicyPorkKnuckle.setModel(new SpinnerNumberModel(0, 0, 100, 1));
        spicyPorkKnuckle.setBounds(10, 383, 199, 22);
        panel.add(spicyPorkKnuckle);
        spicyPorkKnuckle.setFont(new Font("微软雅黑", Font.BOLD, 20));
        
        trip.addChangeListener(new SpinnerChangeListener());
        chestnutPorkRibs.addChangeListener(new SpinnerChangeListener());
        spicyPorkKnuckle.addChangeListener(new SpinnerChangeListener());
        
		
		output = new JTextArea();
		output.setFont(new Font("微软雅黑", Font.BOLD, 20));
		scrollPane.setViewportView(output);
		
		JButton btnNewButton = new JButton("重填");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
                trip.setValue(0);
                chestnutPorkRibs.setValue(0);
                spicyPorkKnuckle.setValue(0);
                output.setText("");
			}
		});
		btnNewButton.setFont(new Font("微软雅黑", Font.BOLD, 25));
		btnNewButton.setBounds(10, 415, 121, 43);
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("前往結帳");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
	            int tripValue = (int) trip.getValue();
	            int chestnutPorkRibsValue = (int) chestnutPorkRibs.getValue();
	            int spicyPorkKnuckleValue = (int) spicyPorkKnuckle.getValue();
	            
	            orderSettlement settlement = new orderSettlement(tripValue, chestnutPorkRibsValue, spicyPorkKnuckleValue,Username);
	            
	            settlement.setVisible(true);
	            
	            dispose();
	                        
			}
		});
		btnNewButton_1.setFont(new Font("微软雅黑", Font.BOLD, 25));
		btnNewButton_1.setBounds(141, 415, 187, 43);
		panel.add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("返回會員介面");
		btnNewButton_1_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
                button.menuUI(Username);
                dispose();
			}
		});
		btnNewButton_1_1.setFont(new Font("微软雅黑", Font.BOLD, 25));
		btnNewButton_1_1.setBounds(338, 415, 187, 43);
		panel.add(btnNewButton_1_1);
		
		JLabel time = new JLabel("");
		time.setForeground(new Color(255, 0, 0));
		time.setFont(new Font("微软雅黑", Font.BOLD, 12));
		time.setHorizontalAlignment(SwingConstants.LEFT);
		time.setBounds(533, 415, 187, 43);
		panel.add(time);
		util.clock timeUpdater = new util.clock(time);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setIcon(new ImageIcon(orderSystemUI.class.getResource("/controller/images/背景圖4.gif")));
		lblNewLabel_4.setBounds(0, 0, 740, 489);
		panel.add(lblNewLabel_4);
		timeUpdater.startTimer();
	}
    public void USERNAME()
	{
		this.Username = Username;
	}
    private class SpinnerChangeListener implements ChangeListener {
        @Override
        public void stateChanged(ChangeEvent e) {
            int tripValue = (int) trip.getValue();
            int chestnutPorkRibsValue = (int) chestnutPorkRibs.getValue();
            int spicyPorkKnuckleValue = (int) spicyPorkKnuckle.getValue();

            if (calculate.Sum(tripValue, chestnutPorkRibsValue, spicyPorkKnuckleValue) >= 2000) {
                String outputText = calculate.detalls(tripValue, chestnutPorkRibsValue, spicyPorkKnuckleValue)
                        + calculate.discountsum(tripValue, chestnutPorkRibsValue, spicyPorkKnuckleValue)
                        + "元";
                output.setText(outputText);
            } else {
                String outputText = calculate.detalls(tripValue, chestnutPorkRibsValue, spicyPorkKnuckleValue)
                        + calculate.sum(tripValue, chestnutPorkRibsValue, spicyPorkKnuckleValue)
                        + "元";
                output.setText(outputText);
            }
        }
    }
}
