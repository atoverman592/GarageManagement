package project;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class ReceiveBillScreen {

	private JFrame frame;


	/**
	 * Create the application.
	 */
	public ReceiveBillScreen() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 * @wbp.parser.entryPoint
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(135, 206, 250));
		frame.getContentPane().setLayout(null);
		
		JLabel logoLable = new JLabel("");
		logoLable.setIcon(new ImageIcon(Welcome_Screen.class.getResource("/project/logo.png")));
		logoLable.setBounds(550, 100, 400, 200);
		frame.getContentPane().add(logoLable);
		
		JLabel lblNewLabel = new JLabel("<html><center> Thank you for choosing Gary's Garage! <br> Your total today is $65.27. <br> Please pay at the front desk.");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 28));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel.setBounds(550, 364, 400, 150);
		frame.getContentPane().add(lblNewLabel);
		
		JButton btnMechanic = new JButton("Done");
		btnMechanic.setFont(new Font("Tahoma", Font.PLAIN, 28));
		btnMechanic.setBackground(new Color(245, 236, 86));
		btnMechanic.setBounds(597, 649, 300, 150);
		
		btnMechanic.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				new Welcome_Screen();
				frame.dispose(); 
			}
			
		});
		frame.getContentPane().add(btnMechanic);
		
		frame.setBounds(0, 0, 1500, 900);
		frame.setVisible(true);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
	}
}
