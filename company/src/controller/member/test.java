package controller.member;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.ButtonGroup;
import javax.swing.JFormattedTextField;
import javax.swing.JTextField;
import javax.swing.JPasswordField;

public class test extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JPasswordField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					test frame = new test();
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
	public test() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 585, 444);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JRadioButton Option2 = new JRadioButton("Option 2");
		buttonGroup.add(Option2);
		Option2.setBounds(43, 44, 107, 23);
		contentPane.add(Option2);
		
		JRadioButton Option1 = new JRadioButton("Option 1");
		buttonGroup.add(Option1);
		Option1.setBounds(235, 44, 107, 23);
		contentPane.add(Option1);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(65, 125, 371, 214);
		contentPane.add(scrollPane);
		
		JTextArea output = new JTextArea();
		scrollPane.setViewportView(output);
		
		textField = new JPasswordField();
		textField.setBounds(359, 70, 96, 21);
		contentPane.add(textField);
		textField.setColumns(10);
		
		ActionListener actionListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	
            	output.setText(((JRadioButton) e.getSource()).getText() + " selected");
            }    
        };
        Option2.addActionListener(actionListener);
        Option1.addActionListener(actionListener);
		
		
	}
}
