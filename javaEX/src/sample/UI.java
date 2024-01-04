package sample;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class UI extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField nu1;
	private JTextField nu2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UI frame = new UI();
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
	public UI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(500, 400, 500, 500);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(128, 255, 128));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 0, 0));
		panel.setBounds(37, 20, 414, 113);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("群組一");
		lblNewLabel.setFont(new Font("標楷體", Font.BOLD, 35));
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setBounds(155, 10, 144, 78);
		panel.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 255, 0));
		panel_1.setBounds(37, 156, 414, 113);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("項目一");
		lblNewLabel_1.setFont(new Font("標楷體", Font.BOLD, 20));
		lblNewLabel_1.setForeground(new Color(0, 0, 255));
		lblNewLabel_1.setBounds(10, 10, 69, 46);
		panel_1.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("項目二");
		lblNewLabel_1_1.setForeground(Color.BLUE);
		lblNewLabel_1_1.setFont(new Font("標楷體", Font.BOLD, 20));
		lblNewLabel_1_1.setBounds(10, 57, 69, 46);
		panel_1.add(lblNewLabel_1_1);
		
		nu1 = new JTextField();
		nu1.setBounds(101, 24, 193, 21);
		panel_1.add(nu1);
		nu1.setColumns(10);
		
		nu2 = new JTextField();
		nu2.setBounds(101, 71, 193, 21);
		panel_1.add(nu2);
		nu2.setColumns(10);
		
		
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(0, 0, 255));
		panel_2.setBounds(37, 295, 414, 113);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(60, 10, 294, 93);
		panel_2.add(scrollPane);
		
		JTextArea output = new JTextArea();
		scrollPane.setViewportView(output);
		
		JButton btnNewButton = new JButton("Enter");
		btnNewButton.setBackground(new Color(255, 0, 0));
		btnNewButton.setForeground(new Color(0, 0, 0));
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				//System.out.println("hello java!");
				//System.out.println(nu1.getText());
				/*System.out.println("你的資料為:"+
						"\n項目一:"+nu1.getText()+
						"\n項目二:"+nu2.getText());*/
				//output.setText("hello java!");
				output.setText("你的資料為:"+
						"\n項目一:"+nu1.getText()+
						"\n項目二:"+nu2.getText());
			}
		});
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setFont(new Font("標楷體", Font.BOLD, 13));
		btnNewButton.setBounds(317, 71, 87, 21);
		panel_1.add(btnNewButton);
	}
}
