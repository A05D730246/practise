package controller;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import dao.impl.memberDaoImpl;
import model.member;
import util.button;

import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class LoginUI extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JPasswordField password;
	private JTextField username;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginUI frame = new LoginUI();
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
	public LoginUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 456, 247);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		password = new JPasswordField();
		password.setFont(new Font("微软雅黑", Font.BOLD, 20));
		password.setBounds(145, 97, 254, 33);
		contentPane.add(password);
		
		username = new JTextField();
		username.setFont(new Font("微软雅黑", Font.BOLD, 20));
		username.setBounds(145, 31, 254, 33);
		contentPane.add(username);
		username.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("帳號:");
		lblNewLabel.setFont(new Font("微软雅黑", Font.BOLD, 30));
		lblNewLabel.setBounds(51, 28, 84, 33);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("密碼:");
		lblNewLabel_1.setFont(new Font("微软雅黑", Font.BOLD, 30));
		lblNewLabel_1.setBounds(51, 94, 84, 33);
		contentPane.add(lblNewLabel_1);
		
		JButton addMember = new JButton("註冊");
		addMember.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				button.addMemberUI();
				dispose();
				
			}
		});
		addMember.setFont(new Font("微软雅黑", Font.BOLD, 35));
		addMember.setBounds(31, 154, 120, 44);
		contentPane.add(addMember);
		
		JButton Login = new JButton("登入");
		Login.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				/*
				 * 1.擷取 username , password
				 * 2.執行－－＞queryMember
				 * 3.!null-->loginSuccessUi			 * 
				 */
				String USERNAME=username.getText();
				String PASSWORD=password.getText();
				
				member m=new memberDaoImpl().queryMember(USERNAME, PASSWORD);
				
				if(m!=null)
				{
					LoginSuccessUI success=new LoginSuccessUI();
					success.setVisible(true);
					dispose();
				}
				else
				{
					LoginErrorUI error=new LoginErrorUI();
					error.setVisible(true);
					dispose();
				}
				
				
				
				
			}
		});
		Login.setFont(new Font("微软雅黑", Font.BOLD, 35));
		Login.setBounds(279, 154, 120, 44);
		contentPane.add(Login);
	}
}
