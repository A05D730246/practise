package OS;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JLabel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Open extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Open frame = new Open();
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
	public Open() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton open = new JButton("開始點餐");
		open.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) 
			{
				Order order = new Order();
		        order.setVisible(true);
		        dispose();
			}
		});
		open.setFont(new Font("微软雅黑", Font.BOLD, 30));
		open.setBounds(117, 181, 180, 49);
		contentPane.add(open);
		
		JLabel lblNewLabel = new JLabel("歡迎光臨\r\n\r\n");
		lblNewLabel.setFont(new Font("微软雅黑", Font.BOLD, 30));
		lblNewLabel.setBounds(149, 59, 127, 79);
		contentPane.add(lblNewLabel);
	}

}
