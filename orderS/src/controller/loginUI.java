package controller;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import model.login;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.Timer;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.SimpleDateFormat;
import java.util.Date;

public class loginUI extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField u;
	private JTextField p;
	private login g;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					loginUI frame = new loginUI();
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
	public loginUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 795, 533);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 10, 761, 107);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("會員登入");
		lblNewLabel.setFont(new Font("微软雅黑", Font.BOLD, 50));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(204, 10, 371, 87);
		panel.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(10, 137, 761, 343);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("帳號:");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("微软雅黑", Font.BOLD, 40));
		lblNewLabel_1.setBounds(10, 10, 310, 87);
		panel_1.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("密碼:");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("微软雅黑", Font.BOLD, 40));
		lblNewLabel_2.setBounds(10, 107, 310, 87);
		panel_1.add(lblNewLabel_2);
		
		u = new JTextField();
		u.setText("Teacher");
		u.setToolTipText("");
		u.setForeground(new Color(192, 192, 192));
		u.setFont(new Font("微软雅黑", Font.BOLD, 40));
		u.setHorizontalAlignment(SwingConstants.CENTER);
		u.setBounds(330, 10, 421, 87);
		panel_1.add(u);
		u.setColumns(10);
		
		p = new JTextField();
		p.setText("0000");
		p.setToolTipText("");
		p.setForeground(new Color(192, 192, 192));
		p.setFont(new Font("微软雅黑", Font.BOLD, 40));
		p.setHorizontalAlignment(SwingConstants.CENTER);
		p.setColumns(10);
		p.setBounds(330, 107, 421, 87);
		panel_1.add(p);
		
		
		
		JButton leave = new JButton("離開");
		leave.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
			}
		});
		leave.setFont(new Font("微软雅黑", Font.BOLD, 40));
		leave.setBounds(541, 235, 210, 74);
		panel_1.add(leave);
		
		JButton ok = new JButton("登入");
		ok.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String user = u.getText();
				String password = p.getText();
				login g = new login();
				String[] options = {"確定"};
				JOptionPane.showOptionDialog(contentPane,g.message(user, password),"會員登入",JOptionPane.YES_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, "確定");				
				Boolean b = g.checkuser(user,password);
				if(b==true)
				{
					dispose();
					customerOrderUI o = new customerOrderUI ();
					o.setVisible(true);
				}				
			}

		});
		ok.setFont(new Font("微软雅黑", Font.BOLD, 40));
		ok.setBounds(10, 235, 210, 74);
		panel_1.add(ok);
		
		JLabel time = new JLabel("");
		time.setBounds(241, 263, 290, 46);
		panel_1.add(time);
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
