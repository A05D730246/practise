package controller.member;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import dao.impl.memberDaoImpl;
import model.member;

import javax.swing.JTextArea;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.List;
import javax.swing.JScrollPane;

public class memberDeleteUI extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField id;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					memberDeleteUI frame = new memberDeleteUI();
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
	public memberDeleteUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 565, 454);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 110, 529, 248);
		contentPane.add(scrollPane);
		
		JTextArea output = new JTextArea();
		scrollPane.setViewportView(output);
		
		JLabel lblNewLabel_1 = new JLabel("刪除:");
		lblNewLabel_1.setFont(new Font("微软雅黑", Font.BOLD, 30));
		lblNewLabel_1.setBounds(22, 60, 179, 40);
		contentPane.add(lblNewLabel_1);
		
		id = new JTextField();
		id.setColumns(10);
		id.setBounds(211, 60, 161, 40);
		contentPane.add(id);
		
		JButton btnNewButton = new JButton("查詢");
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
		btnNewButton.setBounds(10, 10, 149, 38);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("確認");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				new memberDaoImpl().delete(Integer.parseInt(id.getText()));
			}
		});
		btnNewButton_1.setFont(new Font("微软雅黑", Font.BOLD, 30));
		btnNewButton_1.setBounds(390, 61, 149, 38);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("返回");
		btnNewButton_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				memberManager add=new memberManager();
				add.setVisible(true); 
				
				dispose();
			}
		});
		btnNewButton_2.setFont(new Font("微软雅黑", Font.BOLD, 30));
		btnNewButton_2.setBounds(390, 367, 149, 38);
		contentPane.add(btnNewButton_2);
	}

}
