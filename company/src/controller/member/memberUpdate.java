package controller.member;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import dao.impl.memberDaoImpl;
import model.member;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;

public class memberUpdate extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField address;
	private JTextField mobile;
	private JTextField username;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					memberUpdate frame = new memberUpdate();
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
	public memberUpdate() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 715, 492);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("修改會員資料");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("微软雅黑", Font.BOLD, 35));
		lblNewLabel.setBounds(126, 10, 389, 62);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("修改地址:");
		lblNewLabel_1.setFont(new Font("微软雅黑", Font.BOLD, 30));
		lblNewLabel_1.setBounds(10, 206, 132, 47);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("修改手機:");
		lblNewLabel_2.setFont(new Font("微软雅黑", Font.BOLD, 30));
		lblNewLabel_2.setBounds(10, 284, 132, 47);
		contentPane.add(lblNewLabel_2);
		
		address = new JTextField();
		address.setBounds(152, 206, 169, 43);
		contentPane.add(address);
		address.setColumns(10);
		
		mobile = new JTextField();
		mobile.setColumns(10);
		mobile.setBounds(152, 288, 169, 43);
		contentPane.add(mobile);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(331, 82, 342, 249);
		contentPane.add(scrollPane);
		
		JTextArea output = new JTextArea();
		scrollPane.setViewportView(output);
		output.setFont(new Font("微软雅黑", Font.BOLD, 15));
		
		JLabel lblNewLabel_1_1 = new JLabel("輸入帳號:");
		lblNewLabel_1_1.setFont(new Font("微软雅黑", Font.BOLD, 30));
		lblNewLabel_1_1.setBounds(10, 82, 132, 47);
		contentPane.add(lblNewLabel_1_1);
		
		username = new JTextField();
		username.setColumns(10);
		username.setBounds(152, 86, 169, 43);
		contentPane.add(username);
		
		JButton btnNewButton = new JButton("開始查詢");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				List<member> l = new memberDaoImpl().queryAll();
				String show = "";
				for(member m:l) 
				{
					show=show+"id:"+m.getId()+
							"\t名:"+m.getName()+
							"\t帳號:"+m.getUsername()+
							"\t密碼:"+m.getPassword()+
							"\t地址:"+m.getAddress()+
							"\t行動:"+m.getMobile()+
							"\temail:"+m.getEmail()+"\n";
				}
				
				output.setText(show);				
			}
		});
		btnNewButton.setFont(new Font("微软雅黑", Font.BOLD, 30));
		btnNewButton.setBounds(152, 141, 169, 44);
		contentPane.add(btnNewButton);
		
		JButton enter = new JButton("確認修改");
		enter.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String ADDress = address.getText();
				String MObile = mobile.getText();
				String USername = username.getText();
				
				member m = new memberDaoImpl().queryUser(USername);
				m.setAddress(ADDress);
				m.setMobile(MObile);
				
				new memberDaoImpl().update(m);
				
			}
		});
		enter.setFont(new Font("微软雅黑", Font.BOLD, 30));
		enter.setBounds(152, 370, 169, 44);
		contentPane.add(enter);
		
		JButton btnNewButton_2 = new JButton("返回管理頁面");
		btnNewButton_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				memberManager add=new memberManager();
				add.setVisible(true); 
				
				dispose();
			}
		});
		btnNewButton_2.setFont(new Font("微软雅黑", Font.BOLD, 30));
		btnNewButton_2.setBounds(445, 370, 228, 44);
		contentPane.add(btnNewButton_2);
	}
}
