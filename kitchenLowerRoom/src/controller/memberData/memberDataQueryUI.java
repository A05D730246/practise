package controller.memberData;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

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
import javax.swing.ImageIcon;

public class memberDataQueryUI extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField username;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					memberDataQueryUI frame = new memberDataQueryUI();
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
	public memberDataQueryUI() {
		this.username = username;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 639, 781);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setLocationRelativeTo(null);

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon(memberDataQueryUI.class.getResource("/controller/images/點擊GIF 100.gif")));
		lblNewLabel_3.setBounds(177, 79, 105, 86);
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
		username.setBounds(249, 16, 355, 53);
		contentPane.add(username);
		
		getContentPane().add(username);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 159, 605, 487);
		contentPane.add(scrollPane);
		
		JTextArea output = new JTextArea();
		scrollPane.setViewportView(output);
		output.setFont(new Font("微软雅黑", Font.BOLD, 30));
		
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
							"\n麻辣牛肚數量 : "+m.getTrip()+
							"\n栗子排骨數量 : "+m.getChestnutPorkRibs()+
							"\n麻辣豬肘子數量 : "+m.getSpicyPorkKnuckle()+"\n";
				}				
				output.setText(show);							
			}
		});
		btnNewButton.setFont(new Font("微软雅黑", Font.BOLD, 40));
		btnNewButton.setBounds(20, 79, 219, 70);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("返回會員介面");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String Username = username.getText();
				button.menuUI(Username);
				dispose();
			}
		});
		btnNewButton_1.setFont(new Font("微软雅黑", Font.BOLD, 40));
		btnNewButton_1.setBounds(10, 656, 312, 70);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("離開");
		btnNewButton_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
			}
		});
		btnNewButton_2.setFont(new Font("微软雅黑", Font.BOLD, 40));
		btnNewButton_2.setBounds(396, 656, 219, 70);
		contentPane.add(btnNewButton_2);
		
		getContentPane().add(username);
		
		JLabel time = new JLabel("");
		time.setForeground(new Color(255, 0, 0));
		time.setFont(new Font("微软雅黑", Font.BOLD, 20));
		time.setVerticalAlignment(SwingConstants.BOTTOM);
		time.setHorizontalAlignment(SwingConstants.LEFT);
		time.setBounds(286, 107, 329, 42);
		contentPane.add(time);
		util.clock timeUpdater = new util.clock(time);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(memberDataQueryUI.class.getResource("/controller/images/背景圖3 改.gif")));
		lblNewLabel_1.setBounds(0, 0, 620, 740);
		contentPane.add(lblNewLabel_1);
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
