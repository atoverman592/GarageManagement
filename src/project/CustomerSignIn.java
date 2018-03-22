package project;

import java.awt.EventQueue;
import javax.swing.JOptionPane; 

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CustomerSignIn {

	private JFrame frame;
	
	private String logo = "/src/logo.png"; 
	private JTextField textField;


	public CustomerSignIn() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(135, 206, 250));
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(CustomerSignIn.class.getResource("/project/logo.png")));
		lblNewLabel.setBounds(540, 105, 400, 206); 
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblWelcomePleaseEnter = new JLabel("<html><center> Welcome! <br> Please enter your Customer Code: </center></html>");
		lblWelcomePleaseEnter.setFont(new Font("Tahoma", Font.PLAIN, 28));
		lblWelcomePleaseEnter.setBounds(540, 391, 401, 113);
		frame.getContentPane().add(lblWelcomePleaseEnter);
		
		textField = new JTextField();
		textField.setBounds(623, 613, 227, 37);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblCustomerCode = new JLabel("Customer Code:");
		lblCustomerCode.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblCustomerCode.setBounds(666, 584, 151, 16);
		frame.getContentPane().add(lblCustomerCode);
		
		JButton btnNewButton = new JButton("Log In");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int login = Integer.parseInt(textField.getText()); 
					if (login == 1234) {
						new CustomerMain();
						frame.dispose();
					}
					else {
						JOptionPane.showMessageDialog(frame, "Invalid Customer Code.", "Login Error", JOptionPane.WARNING_MESSAGE);
					}
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 28));
		btnNewButton.setBackground(new Color(245, 236, 85));
		btnNewButton.setBounds(437, 721, 210, 81);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Welcome_Screen();
				frame.dispose();
			}
		});
		btnCancel.setFont(new Font("Tahoma", Font.PLAIN, 28));
		btnCancel.setBackground(new Color(245, 236, 85));
		btnCancel.setBounds(802, 721, 210, 81);
		frame.getContentPane().add(btnCancel);

		frame.setBounds(0, 0, 1500, 900);
		frame.setVisible(true);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
