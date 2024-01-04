package sample;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class memberUI extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	FileInputStream fis=null;
	ObjectInputStream ois=null;
	private JTextField pay;
	user u=null;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					memberUI frame = new memberUI();
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
	public memberUI() {
		
		
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("姓名");
		lblNewLabel.setBounds(55, 39, 46, 15);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("地址");
		lblNewLabel_1.setBounds(55, 75, 46, 15);
		contentPane.add(lblNewLabel_1);
		
		JLabel name = new JLabel("");
		name.setBounds(98, 39, 46, 15);
		contentPane.add(name);
		
		JLabel address = new JLabel("");
		address.setBounds(111, 75, 46, 15);
		contentPane.add(address);
		
		try {
			fis=new FileInputStream("user.txt");
			 ois=new ObjectInputStream(fis);
			 u=(user) ois.readObject();
			
			name.setText(u.getName());
			address.setText(u.getAddress());
			
			pay = new JTextField();
			pay.setBounds(248, 52, 96, 21);
			contentPane.add(pay);
			pay.setColumns(10);
			
			
			
			
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		JTextArea output = new JTextArea();
		output.setBounds(207, 130, 173, 87);
		contentPane.add(output);
		
		/**以下寫button*/
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int PAY=Integer.parseInt(pay.getText());
				
				output.setText(""+PAY+" ,"+u.getName());
				
			}
		});
		btnNewButton.setBounds(243, 83, 87, 23);
		contentPane.add(btnNewButton);
		
	}
}