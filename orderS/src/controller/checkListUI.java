package controller;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import model.customer;
import model.member;
import util.bringIn;
import util.cal;

import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.Timer;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.print.PrinterException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JLabel;

public class checkListUI extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	FileInputStream fis=null;
	ObjectInputStream ois=null;
	customerOrderUI u=null;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					checkListUI frame = new checkListUI();
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
	public checkListUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 705, 710);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 10, 671, 653);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JTextArea checkList = new JTextArea();
		checkList.setBounds(10, 10, 651, 514);
		panel.add(checkList);
		
		JButton output = new JButton("列印");
		output.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				try {
					checkList.print();
				} catch (PrinterException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
		});
		output.setFont(new Font("微软雅黑", Font.BOLD, 30));
		output.setBounds(233, 534, 159, 61);
		panel.add(output);
		
		JButton out = new JButton("離開");
		out.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
			}
		});
		out.setFont(new Font("微软雅黑", Font.BOLD, 30));
		out.setBounds(448, 534, 196, 61);
		panel.add(out);
		
		JButton put = new JButton("輸出");
		put.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Object o;
				try {
	                 o = cal.read("c:/ABC/order.txt").readObject();
	                String o2 = (String) o;
	                checkList.setText(o2);
	            } catch (ClassNotFoundException | IOException e1) {
	                e1.printStackTrace();
	            }
	   
			} 
		});
		put.setFont(new Font("微软雅黑", Font.BOLD, 30));
		put.setBounds(10, 534, 159, 61);
		panel.add(put);
		
		JLabel time = new JLabel("");
		time.setBounds(371, 597, 290, 46);
		panel.add(time);
		time.setBackground(new Color(255, 255, 255));
		time.setHorizontalAlignment(SwingConstants.RIGHT);
		time.setFont(new Font("微软雅黑", Font.BOLD, 15));

        time.setHorizontalAlignment(JLabel.CENTER);
        Timer timer = new Timer(1000, e -> {
            SimpleDateFormat dateFormat = new SimpleDateFormat("YYYY/MM/dd HH:mm:ss");
            String formattedTime = dateFormat.format(new Date());
            time.setText("現在時間: " + formattedTime);
        });
        timer.start();

	}
}
