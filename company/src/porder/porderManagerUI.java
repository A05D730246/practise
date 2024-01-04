package porder;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controller.addMemberUI;

import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class porderManagerUI extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					porderManagerUI frame = new porderManagerUI();
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
	public porderManagerUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 468);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("新增");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				addPorderUI add=new addPorderUI();
				add.setVisible(true);
				dispose();
				
			}
		});
		btnNewButton.setFont(new Font("微软雅黑", Font.PLAIN, 34));
		btnNewButton.setBounds(97, 52, 224, 63);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("查詢");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				queryPorderUI add=new queryPorderUI();
				add.setVisible(true);
				dispose();
			}
		});
		btnNewButton_1.setFont(new Font("微软雅黑", Font.PLAIN, 34));
		btnNewButton_1.setBounds(97, 146, 224, 63);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("修改");
		btnNewButton_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				updatePorderUI add=new updatePorderUI();
				add.setVisible(true);
				dispose();
			}
		});
		btnNewButton_2.setFont(new Font("微软雅黑", Font.PLAIN, 34));
		btnNewButton_2.setBounds(97, 238, 224, 63);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("刪除");
		btnNewButton_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				deletePorderUI add=new deletePorderUI();
				add.setVisible(true);
				dispose();
			}
		});
		btnNewButton_3.setFont(new Font("微软雅黑", Font.PLAIN, 34));
		btnNewButton_3.setBounds(97, 327, 224, 63);
		contentPane.add(btnNewButton_3);
	}
}
