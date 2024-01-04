package porder;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import dao.impl.porderDaoImpl;
import model.porder;
import util.button;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.List;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;

public class updatePorderUI extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField id;
	private JTextField name;
	private JTextField lcd;
	private JTextField ram;
	private JTextField mouse;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					updatePorderUI frame = new updatePorderUI();
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
	public updatePorderUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 462);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("id:");
		lblNewLabel.setFont(new Font("微软雅黑", Font.BOLD, 25));
		lblNewLabel.setBounds(24, 10, 100, 34);
		contentPane.add(lblNewLabel);
		
		JLabel lblVu = new JLabel("姓名:");
		lblVu.setFont(new Font("微软雅黑", Font.BOLD, 25));
		lblVu.setBounds(24, 54, 100, 34);
		contentPane.add(lblVu);
		
		JLabel lblL = new JLabel("Lcd:");
		lblL.setFont(new Font("微软雅黑", Font.BOLD, 25));
		lblL.setBounds(24, 98, 100, 34);
		contentPane.add(lblL);
		
		JLabel lblRam = new JLabel("Ram:");
		lblRam.setFont(new Font("微软雅黑", Font.BOLD, 25));
		lblRam.setBounds(24, 142, 100, 34);
		contentPane.add(lblRam);
		
		JLabel lblMouse = new JLabel("Mouse:");
		lblMouse.setFont(new Font("微软雅黑", Font.BOLD, 25));
		lblMouse.setBounds(24, 186, 100, 34);
		contentPane.add(lblMouse);
		
		id = new JTextField();
		id.setBounds(134, 10, 161, 34);
		contentPane.add(id);
		id.setColumns(10);
		
		name = new JTextField();
		name.setColumns(10);
		name.setBounds(134, 54, 161, 34);
		contentPane.add(name);
		
		lcd = new JTextField();
		lcd.setColumns(10);
		lcd.setBounds(134, 98, 161, 34);
		contentPane.add(lcd);
		
		ram = new JTextField();
		ram.setColumns(10);
		ram.setBounds(134, 142, 161, 34);
		contentPane.add(ram);
		
		mouse = new JTextField();
		mouse.setColumns(10);
		mouse.setBounds(134, 186, 161, 34);
		contentPane.add(mouse);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(24, 230, 400, 133);
		contentPane.add(scrollPane);
		
		JTextArea output = new JTextArea();
		scrollPane.setViewportView(output);
		
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
		btnNewButton.setBounds(324, 10, 100, 34);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("修改");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				porder p = new porderDaoImpl().queryId(Integer.parseInt(id.getText()));
				p.setName(name.getName());
				p.setLcd(Integer.parseInt(lcd.getText()));
				p.setRam(Integer.parseInt(ram.getText()));
				p.setMouse(Integer.parseInt(mouse.getText()));
				
				new porderDaoImpl().update(p);
			}
		});
		btnNewButton_1.setFont(new Font("微软雅黑", Font.BOLD, 25));
		btnNewButton_1.setBounds(24, 379, 100, 34);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("返回");
		btnNewButton_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				button.porderManager();
				dispose();
			}
		});
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_2.setFont(new Font("微软雅黑", Font.BOLD, 25));
		btnNewButton_2.setBounds(324, 379, 100, 34);
		contentPane.add(btnNewButton_2);
	}

}
