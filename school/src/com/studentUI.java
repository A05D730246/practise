package com;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JToolBar;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class studentUI extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField name;
	private JTextField chi;
	private JTextField eng;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					studentUI frame = new studentUI();
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
	public studentUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 448);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(128, 255, 255));
		panel.setBounds(10, 10, 414, 48);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("學生");
		lblNewLabel.setFont(new Font("標楷體", Font.PLAIN, 30));
		lblNewLabel.setBounds(172, 10, 77, 28);
		panel.add(lblNewLabel);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(128, 255, 255));
		panel_2.setBounds(10, 68, 414, 198);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		name = new JTextField();
		name.setFont(new Font("標楷體", Font.BOLD, 20));
		name.setBounds(119, 10, 285, 42);
		panel_2.add(name);
		name.setColumns(10);
		
		chi = new JTextField();
		chi.setFont(new Font("標楷體", Font.BOLD, 20));
		chi.setColumns(10);
		chi.setBounds(119, 77, 285, 42);
		panel_2.add(chi);
		
		eng = new JTextField();
		eng.setFont(new Font("標楷體", Font.BOLD, 20));
		eng.setColumns(10);
		eng.setBounds(119, 146, 285, 42);
		panel_2.add(eng);
		
		JLabel lblNewLabel_1 = new JLabel("姓名");
		lblNewLabel_1.setFont(new Font("標楷體", Font.PLAIN, 30));
		lblNewLabel_1.setBounds(10, 10, 99, 42);
		panel_2.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("國文");
		lblNewLabel_1_1.setFont(new Font("標楷體", Font.PLAIN, 30));
		lblNewLabel_1_1.setBounds(10, 77, 99, 42);
		panel_2.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("英文");
		lblNewLabel_1_1_1.setFont(new Font("標楷體", Font.PLAIN, 30));
		lblNewLabel_1_1_1.setBounds(10, 146, 99, 42);
		panel_2.add(lblNewLabel_1_1_1);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(128, 255, 255));
		panel_1.setBounds(10, 276, 414, 123);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JTextArea output = new JTextArea();
		output.setBounds(10, 10, 394, 64);
		panel_1.add(output);
		
		JButton Enter = new JButton("Enter");
		Enter.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				/*
				 * 1.擷取 name , chi , eng-->getText():String
				 * 2.chi , eng-->轉 int-->Integer
				 * 3.new sctudent(名,國文,英文)
				 * 4.顯示結果-->output-->setText(""):void
				 */
				String NAME=name.getText();
				int CHI=Integer.parseInt(chi.getText());
				
				int ENG=Integer.parseInt(eng.getText());
				
				
				if(( CHI<0 || CHI>100)||(ENG<0 || ENG>100))
				{
					output.setText("請重新輸入");
				}
				else 
				{
					student s=new student(NAME,CHI,ENG);
					output.setText("姓名:"+s.getName()
					+"\n國文:"+s.getChi()
					+"\n英文:"+s.getEng()
					+"\n總分:"+s.getSum());
				}
				
				
			}
		
		});
		Enter.setFont(new Font("標楷體", Font.PLAIN, 25));
		Enter.setBounds(134, 84, 147, 29);
		panel_1.add(Enter);
	}
	
}
