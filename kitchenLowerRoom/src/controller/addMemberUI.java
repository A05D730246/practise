package controller;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import dao.impl.memberDaoImpl;
import model.member;
import util.button;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;

public class addMemberUI extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField username;
	private JTextField Password;
	private JTextField address;
	private JTextField mobile;
	private JTextField email;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					addMemberUI frame = new addMemberUI();
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
	public addMemberUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 613, 667);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setLocationRelativeTo(null);

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("註冊系統");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("微软雅黑", Font.BOLD, 40));
		lblNewLabel.setBounds(10, 10, 589, 60);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("使用者名稱:");
		lblNewLabel_1.setFont(new Font("微软雅黑", Font.BOLD, 35));
		lblNewLabel_1.setBounds(10, 93, 238, 54);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("使用者密碼:");
		lblNewLabel_1_1.setFont(new Font("微软雅黑", Font.BOLD, 35));
		lblNewLabel_1_1.setBounds(10, 184, 238, 54);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("通訊地址:");
		lblNewLabel_1_2.setFont(new Font("微软雅黑", Font.BOLD, 35));
		lblNewLabel_1_2.setBounds(10, 271, 238, 54);
		contentPane.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("手機號碼:");
		lblNewLabel_1_3.setFont(new Font("微软雅黑", Font.BOLD, 35));
		lblNewLabel_1_3.setBounds(10, 358, 238, 54);
		contentPane.add(lblNewLabel_1_3);
		
		JLabel lblNewLabel_1_4 = new JLabel("Email:");
		lblNewLabel_1_4.setFont(new Font("微软雅黑", Font.BOLD, 35));
		lblNewLabel_1_4.setBounds(10, 444, 238, 54);
		contentPane.add(lblNewLabel_1_4);
		
		username = new JTextField();
		username.setFont(new Font("微软雅黑", Font.BOLD, 30));
		username.setBounds(261, 93, 328, 49);
		contentPane.add(username);
		username.setColumns(10);
		
		Password = new JTextField();
		Password.setFont(new Font("微软雅黑", Font.BOLD, 30));
		Password.setColumns(10);
		Password.setBounds(258, 184, 328, 49);
		contentPane.add(Password);
		
		address = new JTextField();
		address.setFont(new Font("微软雅黑", Font.BOLD, 30));
		address.setColumns(10);
		address.setBounds(258, 271, 328, 49);
		contentPane.add(address);
		
		mobile = new JTextField();
		mobile.setFont(new Font("微软雅黑", Font.BOLD, 30));
		mobile.setColumns(10);
		mobile.setBounds(258, 358, 328, 49);
		contentPane.add(mobile);
		
		email = new JTextField();
		email.setFont(new Font("微软雅黑", Font.BOLD, 30));
		email.setColumns(10);
		email.setBounds(258, 437, 328, 49);
		contentPane.add(email);
		
		JButton btnNewButton = new JButton("註冊");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
            String Username=username.getText();
				
				if(new memberDaoImpl().queryUsername(Username))
				{
					addMemberErrorUI error=new addMemberErrorUI();
					error.setVisible(true);//帳號重複
					dispose();
				}
				else
				{
					String PAssword = Password.getText();
					String Address = address.getText();
					String Mobile = mobile.getText();
					String Email = email.getText();
					Integer Trip = 0;
					Integer ChestnutPorkRibs = 0;
					Integer SpicyPorkKnuckle = 0;
					
					member m = new member(Username,PAssword,Address,Mobile,Email,Trip,ChestnutPorkRibs,SpicyPorkKnuckle);
				
					new memberDaoImpl().add(m);//登入資料
					
					addMemberSuccessUI success=new addMemberSuccessUI();
					success.setVisible(true);
					dispose();
				}
			}
		});
		btnNewButton.setFont(new Font("微软雅黑", Font.BOLD, 35));
		btnNewButton.setBounds(52, 541, 196, 60);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("返回登入頁面");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				button.loginUI(username.getText());
				dispose();
			}
		});
		btnNewButton_1.setFont(new Font("微软雅黑", Font.BOLD, 35));
		btnNewButton_1.setBounds(319, 541, 270, 60);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setIcon(new ImageIcon(addMemberUI.class.getResource("/controller/images/背景圖3 改.gif")));
		lblNewLabel_2.setBounds(0, 0, 595, 630);
		contentPane.add(lblNewLabel_2);
	}

}
