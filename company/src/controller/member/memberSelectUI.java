package controller.member;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import dao.impl.memberDaoImpl;
import model.member;

import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.List;

public class memberSelectUI extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField startId;
	private JTextField endId;
	private JTextField address;
	private JTextField username;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					memberSelectUI frame = new memberSelectUI();
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
	public memberSelectUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 489, 455);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("ID  從:");
		lblNewLabel.setFont(new Font("微软雅黑", Font.BOLD, 30));
		lblNewLabel.setBounds(10, 10, 103, 38);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("到:");
		lblNewLabel_1.setFont(new Font("微软雅黑", Font.BOLD, 30));
		lblNewLabel_1.setBounds(202, 10, 47, 38);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("地址:");
		lblNewLabel_2.setFont(new Font("微软雅黑", Font.BOLD, 30));
		lblNewLabel_2.setBounds(10, 68, 103, 38);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("帳號:");
		lblNewLabel_3.setFont(new Font("微软雅黑", Font.BOLD, 30));
		lblNewLabel_3.setBounds(10, 126, 103, 38);
		contentPane.add(lblNewLabel_3);
		
		startId = new JTextField();
		startId.setBounds(106, 10, 86, 39);
		contentPane.add(startId);
		startId.setColumns(10);
		
		endId = new JTextField();
		endId.setColumns(10);
		endId.setBounds(248, 10, 103, 39);
		contentPane.add(endId);
		
		address = new JTextField();
		address.setColumns(10);
		address.setBounds(106, 68, 245, 39);
		contentPane.add(address);
		
		username = new JTextField();
		username.setColumns(10);
		username.setBounds(106, 125, 245, 39);
		contentPane.add(username);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 188, 453, 158);
		contentPane.add(scrollPane);
		
		JTextArea output = new JTextArea();
		scrollPane.setViewportView(output);
		
		JButton btnNewButton = new JButton("確認");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				/*
				 * 1.擷取 startId , endId-->轉型int
				 * 2.List<member>-->queryId-->?
				 * 3.show="-->for
				 * 4.output
				 */
				
				int S = Integer.parseInt(startId.getText());
				int E = Integer.parseInt(endId.getText());
				
				List<member> l = new memberDaoImpl().queryId(S , E);
				
				String show = "";
				
				for(member m:l) 
				{
					show = show+"ID:"+m.getId()+
							"\t姓名:"+m.getName()+
							"\t帳號:"+m.getUsername()+
							"\t密碼:"+m.getPassword()+
							"\t地址:"+m.getAddress()+
							"\t行動:"+m.getMobile()+
							"\temail:"+m.getEmail()+"\n";
				}
				output.setText(show);
				
				
			}
		});
		btnNewButton.setFont(new Font("微软雅黑", Font.BOLD, 20));
		btnNewButton.setBounds(361, 10, 97, 40);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("確認");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				/*
				 * 1.擷取
				 * 2.List<member>-->queryId-->?
				 * 3.show="-->for
				 * 4.output
				 */
				String Address = address.getText();
				List<member> l = new memberDaoImpl().queryAddress(Address);
				
				String show = "";
				
				for(member m:l) 
				{
					show = show+"ID:"+m.getId()+
							"\t姓名:"+m.getName()+
							"\t帳號:"+m.getUsername()+
							"\t密碼:"+m.getPassword()+
							"\t地址:"+m.getAddress()+
							"\t行動:"+m.getMobile()+
							"\temail:"+m.getEmail()+"\n";
				}
				output.setText(show);
				
			}
		});
		btnNewButton_1.setFont(new Font("微软雅黑", Font.BOLD, 20));
		btnNewButton_1.setBounds(361, 66, 97, 40);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("確認");
		btnNewButton_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				/*
				 * 1.擷取username
				 * 2.member-->queryUser
				 * 3.output
				 */
				
				String Username = username.getText();
				member m = new memberDaoImpl().queryUser(Username);
				
				String show = "查無此帳號";
				if(m!=null) 
				{
					show = "ID:"+m.getId()+
							"\t姓名:"+m.getName()+
							"\t帳號:"+m.getUsername()+
							"\t密碼:"+m.getPassword()+
							"\t地址:"+m.getAddress()+
							"\t行動:"+m.getMobile()+
							"\temail:"+m.getEmail()+"\n";
				}
				output.setText(show);
			}
		});
		btnNewButton_2.setFont(new Font("微软雅黑", Font.BOLD, 20));
		btnNewButton_2.setBounds(361, 126, 97, 40);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("返回");
		btnNewButton_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				memberManager add=new memberManager();
				add.setVisible(true); 
				
				dispose();
				
			}
		});
		btnNewButton_3.setFont(new Font("微软雅黑", Font.BOLD, 20));
		btnNewButton_3.setBounds(308, 358, 150, 48);
		contentPane.add(btnNewButton_3);
	}
}
