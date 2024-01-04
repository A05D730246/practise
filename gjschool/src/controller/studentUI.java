package controller;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import dao.impl.studentDaoImpl;
import model.student;

import javax.swing.JTextArea;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.List;


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
		setBounds(100, 100, 573, 407);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(43, 10, 464, 65);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("學生管理系統");
		lblNewLabel.setFont(new Font("微软雅黑", Font.BOLD, 30));
		lblNewLabel.setBounds(117, 10, 212, 45);
		panel.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(22, 85, 511, 143);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		name = new JTextField();
		name.setFont(new Font("微软雅黑", Font.BOLD, 25));
		name.setBounds(259, 10, 217, 35);
		panel_1.add(name);
		name.setColumns(10);
		
		chi = new JTextField();
		chi.setFont(new Font("微软雅黑", Font.BOLD, 25));
		chi.setColumns(10);
		chi.setBounds(259, 55, 217, 35);
		panel_1.add(chi);
		
		eng = new JTextField();
		eng.setFont(new Font("微软雅黑", Font.BOLD, 25));
		eng.setColumns(10);
		eng.setBounds(259, 100, 217, 35);
		panel_1.add(eng);
		
		JLabel lblNewLabel_1 = new JLabel("姓名:");
		lblNewLabel_1.setFont(new Font("微软雅黑", Font.BOLD, 25));
		lblNewLabel_1.setBounds(10, 10, 182, 35);
		panel_1.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("國文:");
		lblNewLabel_1_1.setFont(new Font("微软雅黑", Font.BOLD, 25));
		lblNewLabel_1_1.setBounds(10, 55, 182, 35);
		panel_1.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("英文:");
		lblNewLabel_1_2.setFont(new Font("微软雅黑", Font.BOLD, 25));
		lblNewLabel_1_2.setBounds(10, 100, 182, 35);
		panel_1.add(lblNewLabel_1_2);
		
		JTextArea output = new JTextArea();
		output.setBounds(22, 270, 511, 88);
		contentPane.add(output);
		
		JButton adddd = new JButton("新增");
		adddd.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) 
			{
				/*
				 * 1.擷取 name,chi,eng getText()
				 * 2.name,chi-->轉整數
				 * 3.new student(name,chi,eng);
				 * 4.add(s);
				 */
				String Name=name.getText();
				int CHI=Integer.parseInt(chi.getText());
				int ENG=Integer.parseInt(eng.getText());
				
				student s=new student(Name,CHI,ENG);
				
				new studentDaoImpl().add(s);
			}
			
			
		});
		adddd.setFont(new Font("微软雅黑", Font.BOLD, 20));
		adddd.setBounds(22, 238, 102, 22);
		contentPane.add(adddd);
		
		JButton select = new JButton("新增String");
		select.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) 
			{
				/*
				 * 1.queryAll2()--->List
				 * 2.String show="";
				 */
				output.setText(new studentDaoImpl().queryAll1());
			}
		});
		select.setFont(new Font("微软雅黑", Font.BOLD, 20));
		select.setBounds(191, 238, 152, 22);
		contentPane.add(select);
		
		JButton btnlist = new JButton("新增List");
		btnlist.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				/*
				 * 1.List-->queryAll2();
				 * 2.show:String;
				 * 
				 */
				List<student> l=new studentDaoImpl().queryAll2();
				String show="";
				int sum=0;
				int i=0;
				for(student o:l)
				{
					i++;
					sum+=(o.getChi()+o.getEng());
					
					
					
					show+="id:"+o.getId()+
							"\t名:"+o.getName()+
							"\t國文:"+o.getChi()+
							"\t英文:"+o.getEng()+
							"\t總分:"+(o.getChi()+o.getEng())+"\n";
					
				}
				
				
				show+="總分合計="+sum+"\t平均="+(sum/i);
				
				
				output.setText(show);
				
				
			}
		});
		btnlist.setFont(new Font("微软雅黑", Font.BOLD, 20));
		btnlist.setBounds(371, 238, 152, 22);
		contentPane.add(btnlist);
	}
}
