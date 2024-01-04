package controller;

import java.awt.EventQueue;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controller.memberData.memberDataEditUI;
import controller.memberData.memberDataQueryUI;
import util.button;

import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.ImageIcon;

public class menuUI extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField Username;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					menuUI frame = new menuUI();
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
	public menuUI() {
		this.Username = Username;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 628, 678);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setLocationRelativeTo(null);

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon(menuUI.class.getResource("/controller/images/點擊GIF 100.gif")));
		lblNewLabel_3.setBounds(377, 111, 76, 62);
		contentPane.add(lblNewLabel_3);
		
		Username = new JTextField();
		Username.setBounds(249, 15, 355, 53);
		Username.setBackground(new Color(255, 255, 255));
		Username.setHorizontalAlignment(SwingConstants.CENTER);
		Username.setFont(new Font("微软雅黑", Font.BOLD, 35));
		contentPane.add(Username);
		Username.setColumns(10);

		JButton btnNewButton = new JButton("會員資料查詢");
		btnNewButton.setBounds(107, 199, 387, 78);
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				memberDataQueryUI add=new memberDataQueryUI();
				add.setUsername(Username.getText());
				add.setVisible(true);
				dispose();
			}
		});
		btnNewButton.setFont(new Font("微软雅黑", Font.BOLD, 40));
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("會員資料修改");
		btnNewButton_1.setBounds(107, 305, 387, 78);
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				memberDataEditUI add=new memberDataEditUI();
				add.setUsername(Username.getText());
				add.setVisible(true);
				dispose();
				
			}
		});
		btnNewButton_1.setFont(new Font("微软雅黑", Font.BOLD, 40));
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("返回登入頁面");
		btnNewButton_1_1.setBounds(107, 409, 387, 78);
		btnNewButton_1_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				button.loginUI(Username.getText());
				dispose();
			}
		});
		btnNewButton_1_1.setFont(new Font("微软雅黑", Font.BOLD, 40));
		contentPane.add(btnNewButton_1_1);
		
		JButton btnNewButton_1_2 = new JButton("離開");
		btnNewButton_1_2.setBounds(107, 521, 387, 78);
		btnNewButton_1_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
			}
		});
		btnNewButton_1_2.setFont(new Font("微软雅黑", Font.BOLD, 40));
		contentPane.add(btnNewButton_1_2);
		
		JButton btnNewButton_2 = new JButton("開始點餐");
		btnNewButton_2.setBounds(107, 95, 387, 78);
		btnNewButton_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				orderSystemUI add=new orderSystemUI(Username.getText());
				add.setVisible(true);
				dispose();
			}
		});
		btnNewButton_2.setFont(new Font("微软雅黑", Font.BOLD, 40));
		contentPane.add(btnNewButton_2);
		
		JLabel lblNewLabel = new JLabel("使用者帳號:");
		lblNewLabel.setBounds(10, 10, 229, 59);
		lblNewLabel.setFont(new Font("微软雅黑", Font.BOLD, 40));
		contentPane.add(lblNewLabel);

        getContentPane().add(Username);
        
        JLabel time = new JLabel("");
        time.setForeground(new Color(255, 0, 0));
        time.setFont(new Font("微软雅黑", Font.BOLD, 15));
        time.setHorizontalAlignment(SwingConstants.LEFT);
        time.setBounds(377, 600, 243, 35);
        contentPane.add(time);
        util.clock timeUpdater = new util.clock(time);
        
        JLabel lblNewLabel_1 = new JLabel("");
        lblNewLabel_1.setIcon(new ImageIcon(menuUI.class.getResource("/controller/images/背景圖3 改.gif")));
        lblNewLabel_1.setBounds(0, 0, 620, 635);
        contentPane.add(lblNewLabel_1);
		timeUpdater.startTimer();
	}
		
		public void setUsername(String Username) 
		{
			 this.Username.setText(Username);
			 this.Username.setEditable(false);
		}
		
		 public JTextField getUsernameTextField() {
		        return Username;
		    }
	}

