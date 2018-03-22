package project;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;

public class Mechanic_Login {

	private JFrame frame;
	private JTextField txtUsername;
	private JPasswordField passwordField;
	/**
	 * Create the application.
	 */
	public Mechanic_Login() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(135, 206, 250));
		frame.getContentPane().setLayout(null);
		
		JLabel logoLable = new JLabel("");
		logoLable.setIcon(new ImageIcon(Welcome_Screen.class.getResource("/project/logo.png")));
		logoLable.setBounds(550, 100, 400, 200);
		frame.getContentPane().add(logoLable);
		
		JLabel lblNewLabel = new JLabel("<html> <center>If you are a returning mechanic, please sign in below:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 28));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel.setBounds(550, 350, 400, 225);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblUsername = new JLabel("Username:");
		lblUsername.setFont(new Font("Tahoma", Font.PLAIN, 28));
		lblUsername.setBounds(550, 475, 150, 45);
		frame.getContentPane().add(lblUsername);
		
		JLabel lblPassword = new JLabel("Password:");
		lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 28));
		lblPassword.setBounds(550, 550, 150, 45);
		frame.getContentPane().add(lblPassword);
		
		txtUsername = new JTextField();
		txtUsername.setToolTipText("Enter Username here");
		txtUsername.setBounds(710, 475, 240, 45);
		frame.getContentPane().add(txtUsername);
		txtUsername.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(710, 550, 240, 45);
		frame.getContentPane().add(passwordField);
		
		JButton btnLogIn = new JButton("Log In");
		btnLogIn.setFont(new Font("Tahoma", Font.PLAIN, 28));
		btnLogIn.setBackground(new Color(245, 236, 85));
		btnLogIn.setBounds(400, 650, 300, 150);
		
		btnLogIn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String username = txtUsername.getText();
				String password = new String(passwordField.getPassword());
				int numPassword = Integer.parseInt(password); 
					if (username.equals("Gary") && numPassword == 1234) {
						new Mechanic_Main_Screen();
						frame.dispose();
					}
					else {
						JOptionPane.showMessageDialog(frame, "Invalid Username/Password.", "Login Error", JOptionPane.WARNING_MESSAGE);
					}

			}
			
		});
		
		frame.getContentPane().add(btnLogIn);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.setFont(new Font("Tahoma", Font.PLAIN, 28));
		btnCancel.setBackground(new Color(245, 236, 85));
		btnCancel.setBounds(835, 650, 300, 150);
		
		btnCancel.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				new Welcome_Screen();
				frame.dispose();
			}
			
		});
		
		frame.getContentPane().add(btnCancel);
		
		
		frame.setBounds(0, 0, 1500, 900);
		frame.setVisible(true);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}