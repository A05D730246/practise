package controller;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;
import java.awt.Color;

public class addMemberErrorUI extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					addMemberErrorUI frame = new addMemberErrorUI();
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
	public addMemberErrorUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 796, 567);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setLocationRelativeTo(null);

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon(addMemberErrorUI.class.getResource("/controller/images/點擊GIF 100.gif")));
		lblNewLabel_3.setBounds(493, 275, 80, 67);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel = new JLabel("註冊失敗帳號已有人使用");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("微软雅黑", Font.BOLD, 50));
		lblNewLabel.setBounds(10, 75, 765, 128);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("重新註冊");
		btnNewButton.setForeground(new Color(255, 0, 0));
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				addMemberUI success=new addMemberUI();
				success.setVisible(true);
				dispose();
			}
		});
		btnNewButton.setFont(new Font("微软雅黑", Font.BOLD, 50));
		btnNewButton.setBounds(217, 252, 356, 90);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("離開");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
			}
		});
		btnNewButton_1.setFont(new Font("微软雅黑", Font.BOLD, 50));
		btnNewButton_1.setBounds(217, 381, 356, 90);
		contentPane.add(btnNewButton_1);
	}

}
