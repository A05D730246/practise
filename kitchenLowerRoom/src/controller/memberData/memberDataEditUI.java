package controller.memberData;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controller.editSuccessUI;
import dao.impl.memberDaoImpl;
import model.member;
import util.button;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.Timer;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.swing.JScrollPane;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;

public class memberDataEditUI extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField username;
	private JTextField address;
	private JTextField mobile;
	private JTextField email;
	private JTextField Password;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					memberDataEditUI frame = new memberDataEditUI();
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
	public memberDataEditUI() {
		this.username = username;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1146, 677);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setLocationRelativeTo(null);

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon(memberDataEditUI.class.getResource("/controller/images/點擊GIF 100.gif")));
		lblNewLabel_3.setBounds(184, 102, 105, 86);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel = new JLabel("使用者帳號:");
		lblNewLabel.setFont(new Font("微软雅黑", Font.BOLD, 40));
		lblNewLabel.setBounds(10, 10, 229, 59);
		contentPane.add(lblNewLabel);
		
		username = new JTextField();
		username.setHorizontalAlignment(SwingConstants.CENTER);
		username.setFont(new Font("微软雅黑", Font.BOLD, 35));
		username.setColumns(10);
		username.setBackground(Color.WHITE);
		username.setBounds(238, 16, 355, 53);
		contentPane.add(username);
		
		getContentPane().add(username);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(603, 10, 519, 532);
		contentPane.add(scrollPane);
		
		JTextArea output = new JTextArea();
		scrollPane.setViewportView(output);
		output.setFont(new Font("微软雅黑", Font.BOLD, 30));
		
		JLabel lblNewLabel_1 = new JLabel("修改地址 :");
		lblNewLabel_1.setForeground(new Color(0, 0, 0));
		lblNewLabel_1.setFont(new Font("微软雅黑", Font.BOLD, 35));
		lblNewLabel_1.setBounds(10, 270, 229, 59);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("修改電話 :");
		lblNewLabel_2.setForeground(new Color(0, 0, 0));
		lblNewLabel_2.setFont(new Font("微软雅黑", Font.BOLD, 35));
		lblNewLabel_2.setBounds(10, 339, 229, 59);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblemail = new JLabel("修改email :");
		lblemail.setForeground(new Color(0, 0, 0));
		lblemail.setFont(new Font("微软雅黑", Font.BOLD, 35));
		lblemail.setBounds(10, 408, 229, 59);
		contentPane.add(lblemail);
		
		Password = new JTextField();
		Password.setHorizontalAlignment(SwingConstants.CENTER);
		Password.setFont(new Font("微软雅黑", Font.BOLD, 35));
		Password.setColumns(10);
		Password.setBackground(Color.WHITE);
		Password.setBounds(238, 206, 355, 53);
		contentPane.add(Password);
		
		address = new JTextField();
		address.setHorizontalAlignment(SwingConstants.CENTER);
		address.setFont(new Font("微软雅黑", Font.BOLD, 35));
		address.setColumns(10);
		address.setBackground(Color.WHITE);
		address.setBounds(238, 275, 355, 53);
		contentPane.add(address);
		
		mobile = new JTextField();
		mobile.setHorizontalAlignment(SwingConstants.CENTER);
		mobile.setFont(new Font("微软雅黑", Font.BOLD, 35));
		mobile.setColumns(10);
		mobile.setBackground(Color.WHITE);
		mobile.setBounds(238, 344, 355, 53);
		contentPane.add(mobile);
		
		email = new JTextField();
		email.setHorizontalAlignment(SwingConstants.CENTER);
		email.setFont(new Font("微软雅黑", Font.BOLD, 35));
		email.setColumns(10);
		email.setBackground(Color.WHITE);
		email.setBounds(238, 413, 355, 53);
		contentPane.add(email);
		
		JButton btnNewButton_1 = new JButton("確認修改");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				String PAssword = Password.getText();
				String ADDress = address.getText();
				String Mobile = mobile.getText();
				String Email = email.getText();
				String Username = username.getText();
					
				member m = new memberDaoImpl().queryUser(Username);
				m.setPassword(PAssword);
				m.setAddress(ADDress);
				m.setMobile(Mobile);
				m.setEmail(Email);
					
				new memberDaoImpl().update(m);
				
				editSuccessUI success=new editSuccessUI();
				success.setVisible(true);
			}
		});
		btnNewButton_1.setFont(new Font("微软雅黑", Font.BOLD, 40));
		btnNewButton_1.setBounds(10, 477, 229, 70);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton = new JButton("查詢");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
            String Username = username.getText();
				
				List<member> l = new memberDaoImpl().queryUSERNAME(Username);
				
				String show = "";
				
				for(member m:l) 
				{
					show=show+"id : "+m.getId()+
							"\n帳號 : "+m.getUsername()+
							"\n密碼 : "+m.getPassword()+
							"\n地址 : "+m.getAddress()+
							"\n行動電話 : "+m.getMobile()+
							"\nemail : "+m.getEmail()+
							"\ntrip數量 : "+m.getTrip()+
							"\nchestnutPorkRibs數量 : "+m.getChestnutPorkRibs()+
							"\nspicyPorkKnuckle數量 : "+m.getSpicyPorkKnuckle()+"\n";
				}				
				output.setText(show);				
			}
		});
		btnNewButton.setFont(new Font("微软雅黑", Font.BOLD, 40));
		btnNewButton.setBounds(10, 97, 219, 70);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1_1 = new JButton("修改結果");
		btnNewButton_1_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
	            String Username = username.getText();
				
					List<member> l = new memberDaoImpl().queryUSERNAME(Username);
					
					String show = "";
					
					for(member m:l) 
					{
						show=show+"id : "+m.getId()+
								"\n帳號 : "+m.getUsername()+
								"\n密碼 : "+m.getPassword()+
								"\n地址 : "+m.getAddress()+
								"\n行動電話 : "+m.getMobile()+
								"\nemail : "+m.getEmail()+
								"\ntrip數量 : "+m.getTrip()+
								"\nchestnutPorkRibs數量 : "+m.getChestnutPorkRibs()+
								"\nspicyPorkKnuckle數量 : "+m.getSpicyPorkKnuckle()+"\n";
					}				
					output.setText(show);				
				}
		});
		btnNewButton_1_1.setFont(new Font("微软雅黑", Font.BOLD, 40));
		btnNewButton_1_1.setBounds(343, 477, 250, 70);
		contentPane.add(btnNewButton_1_1);
		
		JButton btnNewButton_1_2 = new JButton("返回會員頁面");
		btnNewButton_1_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String Username = username.getText();
				button.menuUI(Username);
				dispose();
			}
		});
		btnNewButton_1_2.setFont(new Font("微软雅黑", Font.BOLD, 40));
		btnNewButton_1_2.setBounds(10, 560, 317, 70);
		contentPane.add(btnNewButton_1_2);
		
		JLabel lblNewLabel_1_1 = new JLabel("修改密碼 :");
		lblNewLabel_1_1.setForeground(new Color(0, 0, 0));
		lblNewLabel_1_1.setFont(new Font("微软雅黑", Font.BOLD, 35));
		lblNewLabel_1_1.setBounds(10, 201, 229, 59);
		contentPane.add(lblNewLabel_1_1);
		
		JButton btnNewButton_1_1_1 = new JButton("離開");
		btnNewButton_1_1_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
			}
		});
		btnNewButton_1_1_1.setFont(new Font("微软雅黑", Font.BOLD, 40));
		btnNewButton_1_1_1.setBounds(343, 560, 250, 70);
		contentPane.add(btnNewButton_1_1_1);
		
		JLabel time = new JLabel("");
		time.setForeground(new Color(255, 0, 0));
		time.setFont(new Font("微软雅黑", Font.BOLD, 20));
		time.setHorizontalAlignment(SwingConstants.LEFT);
		time.setVerticalAlignment(SwingConstants.BOTTOM);
		time.setBounds(780, 580, 350, 50);
		contentPane.add(time);
		util.clock timeUpdater = new util.clock(time);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setIcon(new ImageIcon(memberDataEditUI.class.getResource("/controller/images/背景.gif")));
		lblNewLabel_4.setBounds(0, 0, 1130, 640);
		contentPane.add(lblNewLabel_4);
		timeUpdater.startTimer();
	}
	public void setUsername(String username) 
	{
		 this.username.setText(username);
		 this.username.setEditable(false);
	}
	
	 public JTextField getUsernameTextField() 
	 {
	        return username;
	 }
}
