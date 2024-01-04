package controller;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import dao.impl.memberDaoImpl;
import model.member;

import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class addMemberUI extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField name;
	private JTextField username;
	private JTextField password;
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
		setBounds(100, 100, 450, 437);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel a = new JLabel("請輸入姓名:");
		a.setFont(new Font("微软雅黑", Font.BOLD, 20));
		a.setHorizontalAlignment(SwingConstants.LEFT);
		a.setBounds(10, 4, 184, 42);
		contentPane.add(a);
		
		JLabel b = new JLabel("請輸入使用者名稱:");
		b.setHorizontalAlignment(SwingConstants.LEFT);
		b.setFont(new Font("微软雅黑", Font.BOLD, 20));
		b.setBounds(10, 60, 184, 41);
		contentPane.add(b);
		
		name = new JTextField();
		name.setText("");
		name.setBounds(204, 10, 221, 41);
		contentPane.add(name);
		name.setColumns(10);
		
		username = new JTextField();
		username.setText("");
		username.setColumns(10);
		username.setBounds(204, 65, 221, 41);
		contentPane.add(username);
		
		
		
		JLabel c = new JLabel("請輸入密碼:");
		c.setHorizontalAlignment(SwingConstants.LEFT);
		c.setFont(new Font("微软雅黑", Font.BOLD, 20));
		c.setBounds(10, 117, 184, 41);
		contentPane.add(c);
		
		JLabel d = new JLabel("請輸入地址:");
		d.setHorizontalAlignment(SwingConstants.LEFT);
		d.setFont(new Font("微软雅黑", Font.BOLD, 20));
		d.setBounds(10, 178, 184, 41);
		contentPane.add(d);
		
		JLabel e = new JLabel("請輸入手機:");
		e.setHorizontalAlignment(SwingConstants.LEFT);
		e.setFont(new Font("微软雅黑", Font.BOLD, 20));
		e.setBounds(10, 235, 184, 41);
		contentPane.add(e);
		
		password = new JTextField();
		password.setText("");
		password.setColumns(10);
		password.setBounds(204, 122, 221, 41);
		contentPane.add(password);
		
		address = new JTextField();
		address.setText("");
		address.setColumns(10);
		address.setBounds(204, 183, 221, 41);
		contentPane.add(address);
		
		mobile = new JTextField();
		mobile.setText("");
		mobile.setColumns(10);
		mobile.setBounds(204, 240, 221, 41);
		contentPane.add(mobile);
		
		JLabel f = new JLabel("請輸入email:");
		f.setHorizontalAlignment(SwingConstants.LEFT);
		f.setFont(new Font("微软雅黑", Font.BOLD, 20));
		f.setBounds(10, 291, 184, 41);
		contentPane.add(f);
		
		email = new JTextField();
		email.setText("");
		email.setColumns(10);
		email.setBounds(204, 296, 221, 41);
		contentPane.add(email);
		
		JButton enter = new JButton("確認新增");
		enter.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				/*
				 * 1.擷取-->username
				 * 2.是否重複--->queryUsername
				 * 3.true(帳號重複)-->addMemberErrorUI
				 * 4.false-->擷取其他項目
				 * -->new member
				 * -->add
				 * -->addMemberSuccessUi
				 */
                
                String Username=username.getText();
				
				if(new memberDaoImpl().queryUsername(Username))
				{
					addMemberErrorUI error=new addMemberErrorUI();
					error.setVisible(true);//帳號重複
					dispose();
				}
				else
				{
					String Name=name.getText();
					String Password=password.getText();
					String Address=address.getText();
					String Mobile=mobile.getText();
					String Email=email.getText();
					
					member m=new member(Name,Username,Password,Address,Mobile,Email);
					
					new memberDaoImpl().add(m);//登入資料
				
				
				addMemberSuccessUI add=new addMemberSuccessUI();
				add.setVisible(true);
				dispose();
				}
			}
		});
		enter.setFont(new Font("微软雅黑", Font.BOLD, 35));
		enter.setBounds(125, 347, 184, 41);
		contentPane.add(enter);
	}

}
