package porder;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import dao.impl.porderDaoImpl;
import model.porder;
import util.button;

import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.List;

public class queryPorderUI extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField name;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					queryPorderUI frame = new queryPorderUI();
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
	public queryPorderUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 464);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextArea output = new JTextArea();
		output.setBounds(10, 89, 414, 262);
		contentPane.add(output);
		
		name = new JTextField();
		name.setBounds(137, 36, 160, 43);
		contentPane.add(name);
		name.setColumns(10);
		
		JButton btnNewButton = new JButton("查詢(全)");
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
		btnNewButton.setFont(new Font("微软雅黑", Font.BOLD, 20));
		btnNewButton.setBounds(10, 36, 117, 43);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("返回");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				button.porderManager();
				dispose();
			}
		});
		btnNewButton_1.setFont(new Font("微软雅黑", Font.BOLD, 30));
		btnNewButton_1.setBounds(10, 360, 117, 43);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("姓名查詢");
		btnNewButton_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				List<porder> l = new porderDaoImpl().queryName(name.getText());
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
		btnNewButton_2.setFont(new Font("微软雅黑", Font.BOLD, 20));
		btnNewButton_2.setBounds(307, 36, 117, 43);
		contentPane.add(btnNewButton_2);
	}

}
