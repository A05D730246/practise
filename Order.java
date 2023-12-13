package OS;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SpinnerNumberModel;

import java.awt.Font;
import javax.swing.JSpinner;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.print.PrinterException;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Order extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField name;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JTextField cash;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Order frame = new Order();
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
	public Order() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 724, 667);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(230, 252, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(251, 217, 251));
		panel.setBounds(10, 10, 688, 81);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("人間有味是清歡");
		lblNewLabel.setFont(new Font("微软雅黑", Font.BOLD, 30));
		lblNewLabel.setBounds(233, 10, 225, 61);
		panel.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(204, 203, 254));
		panel_1.setBounds(10, 104, 345, 497);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		name = new JTextField();
		name.setFont(new Font("微软雅黑", Font.BOLD, 20));
		name.setBackground(new Color(245, 254, 209));
		name.setBounds(173, 10, 162, 42);
		panel_1.add(name);
		name.setColumns(10);
		
		JSpinner number1 = new JSpinner(new SpinnerNumberModel(0, 0, 100, 1));
		number1.setFont(new Font("微软雅黑", Font.BOLD, 20));
		number1.setBackground(new Color(245, 254, 209));
		number1.setBounds(253, 115, 82, 42);
		panel_1.add(number1);
		
		JSpinner number2 = new JSpinner(new SpinnerNumberModel(0, 0, 100, 1));
		number2.setFont(new Font("微软雅黑", Font.BOLD, 20));
		number2.setBackground(new Color(245, 254, 209));
		number2.setBounds(253, 178, 82, 42);
		panel_1.add(number2);
		
		JSpinner number3 = new JSpinner(new SpinnerNumberModel(0, 0, 100, 1));
		number3.setFont(new Font("微软雅黑", Font.BOLD, 20));
		number3.setBackground(new Color(245, 254, 209));
		number3.setBounds(253, 244, 82, 42);
		panel_1.add(number3);
		
		JSpinner number4 = new JSpinner(new SpinnerNumberModel(0, 0, 100, 1));
		number4.setFont(new Font("微软雅黑", Font.BOLD, 20));
		number4.setBackground(new Color(245, 254, 209));
		number4.setBounds(253, 316, 82, 42);
		panel_1.add(number4);
		
		JRadioButton member = new JRadioButton("一般會員");
		buttonGroup.add(member);
		member.setBackground(new Color(245, 254, 209));
		member.setFont(new Font("微软雅黑", Font.BOLD, 20));
		member.setBounds(0, 381, 162, 37);
		panel_1.add(member);
		
		JRadioButton Vip = new JRadioButton("VIP會員");
		buttonGroup.add(Vip);
		Vip.setFont(new Font("微软雅黑", Font.BOLD, 20));
		Vip.setBackground(new Color(245, 254, 209));
		Vip.setBounds(173, 381, 162, 37);
		panel_1.add(Vip);
		
		JLabel lblNewLabel_1 = new JLabel("笑問客名");
		lblNewLabel_1.setForeground(new Color(0, 0, 0));
		lblNewLabel_1.setBackground(new Color(245, 254, 209));
		lblNewLabel_1.setFont(new Font("微软雅黑", Font.BOLD, 30));
		lblNewLabel_1.setBounds(10, 10, 133, 42);
		panel_1.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("品名");
		lblNewLabel_1_1.setForeground(Color.BLACK);
		lblNewLabel_1_1.setFont(new Font("微软雅黑", Font.BOLD, 25));
		lblNewLabel_1_1.setBackground(new Color(245, 254, 209));
		lblNewLabel_1_1.setBounds(6, 62, 133, 42);
		panel_1.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("數量");
		lblNewLabel_1_2.setForeground(Color.BLACK);
		lblNewLabel_1_2.setFont(new Font("微软雅黑", Font.BOLD, 25));
		lblNewLabel_1_2.setBackground(new Color(245, 254, 209));
		lblNewLabel_1_2.setBounds(262, 62, 73, 42);
		panel_1.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("乾煸溜肥腸 : 350");
		lblNewLabel_1_3.setForeground(Color.BLACK);
		lblNewLabel_1_3.setFont(new Font("微软雅黑", Font.BOLD, 25));
		lblNewLabel_1_3.setBackground(new Color(245, 254, 209));
		lblNewLabel_1_3.setBounds(6, 115, 207, 42);
		panel_1.add(lblNewLabel_1_3);
		
		JLabel lblNewLabel_1_4 = new JLabel("炒松子乳鴿 : 400");
		lblNewLabel_1_4.setForeground(Color.BLACK);
		lblNewLabel_1_4.setFont(new Font("微软雅黑", Font.BOLD, 25));
		lblNewLabel_1_4.setBackground(new Color(245, 254, 209));
		lblNewLabel_1_4.setBounds(6, 178, 207, 42);
		panel_1.add(lblNewLabel_1_4);
		
		JLabel lblNewLabel_1_5 = new JLabel("燒茄油悶雞 : 450");
		lblNewLabel_1_5.setForeground(Color.BLACK);
		lblNewLabel_1_5.setFont(new Font("微软雅黑", Font.BOLD, 25));
		lblNewLabel_1_5.setBackground(new Color(245, 254, 209));
		lblNewLabel_1_5.setBounds(6, 242, 207, 42);
		panel_1.add(lblNewLabel_1_5);
		
		JLabel lblNewLabel_1_6 = new JLabel("菇拔娃娃菜 : 250");
		lblNewLabel_1_6.setForeground(Color.BLACK);
		lblNewLabel_1_6.setFont(new Font("微软雅黑", Font.BOLD, 25));
		lblNewLabel_1_6.setBackground(new Color(245, 254, 209));
		lblNewLabel_1_6.setBounds(6, 316, 207, 42);
		panel_1.add(lblNewLabel_1_6);
		
		JTextArea output1 = new JTextArea();
		output1.setBounds(365, 101, 333, 141);
		contentPane.add(output1);
		
		JButton enter = new JButton("訂單確認");
		enter.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) 
			{
				int Number1 = (int) number1.getValue();
		        int Number2 = (int) number2.getValue();
		        int Number3 = (int) number3.getValue();
		        int Number4 = (int) number4.getValue();
		        
		        PNP order = new PNP(name.getText(), Number1, Number2, Number3, Number4);
		        output1.setText(
		        	    (member.isSelected()) ? (order.detall() + "\n一般會員享95折\n總金額：" + (int)(order.getSum()*0.95)):
		        	    (Vip.isSelected()) ? (order.detall() + "\nVIP會員享7折\n總金額：" + (int)(order.getSum()*0.7)):
		        	    (order.detall() + "\n總金額：" + order.getSum())
		        	);
			}
		});
		enter.setBounds(83, 437, 164, 50);
		panel_1.add(enter);
		enter.setBackground(new Color(253, 228, 130));
		enter.setFont(new Font("微软雅黑", Font.BOLD, 25));
		
		JLabel lblNewLabel_1_5_1 = new JLabel("付款金額 : ");
		lblNewLabel_1_5_1.setForeground(Color.BLACK);
		lblNewLabel_1_5_1.setFont(new Font("微软雅黑", Font.BOLD, 25));
		lblNewLabel_1_5_1.setBackground(new Color(245, 254, 209));
		lblNewLabel_1_5_1.setBounds(362, 252, 137, 50);
		contentPane.add(lblNewLabel_1_5_1);
		
		cash = new JTextField();
		cash.setFont(new Font("微软雅黑", Font.BOLD, 20));
		cash.setColumns(10);
		cash.setBackground(new Color(245, 254, 209));
		cash.setBounds(501, 252, 197, 48);
		contentPane.add(cash);
		
		JTextArea output2 = new JTextArea();
		output2.setBounds(365, 377, 333, 155);
		contentPane.add(output2);
		
		JButton pay = new JButton("確認付款");
		pay.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) 
			{
				int Number1 = (int) number1.getValue();
		        int Number2 = (int) number2.getValue();
		        int Number3 = (int) number3.getValue();
		        int Number4 = (int) number4.getValue();
		        
		        PNP order = new PNP(cash.getText(), Number1, Number2, Number3, Number4);
		        if(member.isSelected())
		        {
		        	int Msum=(int)(order.getSum()*0.95);
		        	
		        	int Cash=Integer.parseInt(cash.getText());
		        	
		        	int change=(Msum>0)?(Cash-Msum):0; 
		        		output2.setText((change<0)?order.XXX()
		        		        :"找零金額:"+change
		        		        +"\n千元鈔張數:"+change/1000
				    	        +"\n百元鈔張數:"+(change%1000)/100
				    	        +"\n50元個數:"+((change%1000)%100)/50
				    	        +"\n10元個數:"+(((change%1000)%100)%50)/10
				    	        +"\n5元個數:"+((((change%1000)%100)%50)%100)/5
				                +"\n1元個數:"+((((change%1000)%100)%50)%10)%5);
		        		
		        		
		         }
		        else if(Vip.isSelected())
		        {
		        	int Mvip=(int)(order.getSum()*0.7);
		        	
		        	int Cash=Integer.parseInt(cash.getText());
		        	
		        	int change=(Mvip>0)?(Cash-Mvip):0; 
		        	output2.setText((change<0)?order.XXX()
	        		        :"找零金額:"+change
	        		        +"\n千元鈔張數:"+change/1000
			    	        +"\n百元鈔張數:"+(change%1000)/100
			    	        +"\n50元個數:"+((change%1000)%100)/50
			    	        +"\n10元個數:"+(((change%1000)%100)%50)/10
			    	        +"\n5元個數:"+((((change%1000)%100)%50)%100)/5
			                +"\n1元個數:"+((((change%1000)%100)%50)%10)%5);
		        }
		        
		        else 
		        {
		        	int Cash=Integer.parseInt(cash.getText());
		        	int change=(order.getSum()>0)?(Cash-order.getSum()):0; 
	        		output2.setText((change<0)?order.XXX()
	        		        :"找零金額:"+change
	        		        +"\n千元鈔張數:"+change/1000
			    	        +"\n百元鈔張數:"+(change%1000)/100
			    	        +"\n50元個數:"+((change%1000)%100)/50
			    	        +"\n10元個數:"+(((change%1000)%100)%50)/10
			    	        +"\n5元個數:"+((((change%1000)%100)%50)%100)/5
			                +"\n1元個數:"+((((change%1000)%100)%50)%10)%5);
		        }
		       
			}
		});
		pay.setFont(new Font("微软雅黑", Font.BOLD, 25));
		pay.setBackground(new Color(253, 228, 130));
		pay.setBounds(424, 317, 164, 50);
		contentPane.add(pay);
		
		JButton out = new JButton("離開");
		out.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) 
			{
				System.exit(0);
			}
		});
		out.setFont(new Font("微软雅黑", Font.BOLD, 25));
		out.setBackground(new Color(253, 228, 130));
		out.setBounds(534, 551, 164, 50);
		contentPane.add(out);
		
		JButton Print = new JButton("列印資料");
		Print.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) 
			{
				try 
				{
					output1.print();
				} 
				catch (PrinterException e1) 
				{
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
				
		});
		Print.setFont(new Font("微软雅黑", Font.BOLD, 25));
		Print.setBackground(new Color(253, 228, 130));
		Print.setBounds(365, 551, 164, 50);
		contentPane.add(Print);
	}
}
