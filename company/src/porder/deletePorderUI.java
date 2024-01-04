package porder;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import dao.impl.porderDaoImpl;
import model.porder;
import util.button;

import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.List;
import javax.swing.JScrollPane;

public class deletePorderUI extends JFrame {

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
					deletePorderUI frame = new deletePorderUI();
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
	public deletePorderUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 463);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 106, 414, 236);
		contentPane.add(scrollPane);
		
		JTextArea output = new JTextArea();
		scrollPane.setViewportView(output);
		
		id = new JTextField();
		id.setBounds(118, 60, 183, 36);
		contentPane.add(id);
		id.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("ID");
		lblNewLabel.setFont(new Font("微软雅黑", Font.BOLD, 30));
		lblNewLabel.setBounds(48, 60, 60, 36);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("查詢");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				List<porder> l = new porderDaoImpl().queryAll();
				String show = "";
				for(porder p:l) 
				{
					show=show+"id:"+p.getId()+
							"\t姓名:"+p.getName()+
							"\tlcd:"+p.getLcd()+
							"\tram:"+p.getRam()+
							"\tmouse:"+p.getMouse()+"\n";
				}
				output.setText(show);
			}
		});
		btnNewButton.setFont(new Font("微软雅黑", Font.BOLD, 25));
		btnNewButton.setBounds(21, 10, 87, 40);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("刪除");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				
		     new porderDaoImpl().delete(Integer.parseInt(id.getText()));
		
			}
		});
		btnNewButton_1.setFont(new Font("微软雅黑", Font.BOLD, 25));
		btnNewButton_1.setBounds(337, 60, 87, 40);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("返回");
		btnNewButton_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				button.porderManager();
				dispose();
			}
		});
		btnNewButton_2.setFont(new Font("微软雅黑", Font.BOLD, 25));
		btnNewButton_2.setBounds(337, 362, 87, 40);
		contentPane.add(btnNewButton_2);
	}

}
