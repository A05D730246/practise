package com;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class OuderUI extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField name;
	private JTextField ruler;
	private JTextField pen;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					OuderUI frame = new OuderUI();
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
	public OuderUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 440);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 0, 0));
		panel.setForeground(new Color(0, 0, 0));
		panel.setBounds(31, 10, 366, 75);
		contentPane.add(panel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(0, 0, 255));
		panel_1.setBounds(31, 113, 366, 159);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		name = new JTextField();
		name.setBounds(157, 10, 182, 36);
		panel_1.add(name);
		name.setColumns(10);
		
		ruler = new JTextField();
		ruler.setBounds(157, 56, 182, 39);
		panel_1.add(ruler);
		ruler.setColumns(10);
		
		pen = new JTextField();
		pen.setBounds(157, 105, 182, 36);
		panel_1.add(pen);
		pen.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("姓名");
		lblNewLabel.setBounds(10, 15, 135, 25);
		panel_1.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("尺");
		lblNewLabel_1.setBounds(10, 68, 135, 25);
		panel_1.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("筆");
		lblNewLabel_1_1.setBounds(10, 115, 135, 25);
		panel_1.add(lblNewLabel_1_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(255, 255, 0));
		panel_2.setBounds(31, 296, 366, 95);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		JTextArea output = new JTextArea();
		output.setBounds(21, 10, 322, 50);
		panel_2.add(output);
		
		JButton ggg = new JButton("Enter");
		ggg.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				/*
				 * 1.讀取 name,ruler,pen的內容-->getText():String
				 * 2.ruler,pen-->轉型-->String-->int
				 * 3.Order o=new Order(名,尺,筆);
				 * 4.輸出--->output-->名,尺,筆,金額
				 */
				String Name=name.getText();
				String Ruler=ruler.getText();
				String Pen=pen.getText();
				
				//Integer R=new Integer(Ruler);
				//Integer P=new Integer(Pen);
				
				int R=Integer.parseInt(Ruler);
				int P=Integer.parseInt(Pen);
				
                Order o=new Order(Name,R,P);
				
				output.setText("姓名:"+o.getName()+
						"\n尺:"+o.getRuler()+
						"\n筆:"+o.getPen()+
						"\n金額:"+o.getSum()+"元");
				
				
				
				
				
			}
		});
		ggg.setBounds(122, 62, 87, 23);
		panel_2.add(ggg);
	}

}
