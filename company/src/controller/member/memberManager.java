package controller.member;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class memberManager extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					memberManager frame = new memberManager();
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
	public memberManager() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("修改");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				memberUpdate add=new memberUpdate();
				add.setVisible(true); 
				
				dispose();
			}
		});
		btnNewButton.setFont(new Font("微软雅黑", Font.BOLD, 35));
		btnNewButton.setBounds(128, 34, 142, 52);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("查詢");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				memberSelectUI add=new memberSelectUI();
				add.setVisible(true); 
				
				dispose();
			}
		});
		btnNewButton_1.setFont(new Font("微软雅黑", Font.BOLD, 35));
		btnNewButton_1.setBounds(128, 111, 142, 52);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("刪除");
		btnNewButton_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				memberDeleteUI add=new memberDeleteUI();
				add.setVisible(true); 
				
				dispose();
			}
		});
		btnNewButton_2.setFont(new Font("微软雅黑", Font.BOLD, 35));
		btnNewButton_2.setBounds(128, 185, 142, 52);
		contentPane.add(btnNewButton_2);
	}

}
