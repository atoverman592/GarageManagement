package project;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AddVehicleScreen {

	private JFrame frame;
	private JTextField custName;
	private JTextField vehicleYear;
	private JTextField vehicleMake;
	private JTextField vehicleModel;
	/**
	 * Create the application.
	 */
	public AddVehicleScreen() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(135, 206, 250));
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(AddVehicleScreen.class.getResource("/project/logo.png")));
		lblNewLabel.setBounds(550, 100, 400, 200);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Customer Name:");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1.setBounds(461, 467, 183, 16);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Vehicle Year:");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_2.setBounds(461, 530, 183, 16);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Vehicle Make:");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_3.setBounds(461, 599, 183, 16);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Vehicle Model:");
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_4.setBounds(461, 659, 183, 16);
		frame.getContentPane().add(lblNewLabel_4);
		
		custName = new JTextField();
		custName.setBounds(725, 466, 225, 22);
		frame.getContentPane().add(custName);
		custName.setColumns(10);
		
		vehicleYear = new JTextField();
		vehicleYear.setColumns(10);
		vehicleYear.setBounds(725, 529, 225, 22);
		frame.getContentPane().add(vehicleYear);
		
		vehicleMake = new JTextField();
		vehicleMake.setColumns(10);
		vehicleMake.setBounds(725, 593, 225, 22);
		frame.getContentPane().add(vehicleMake);
		
		vehicleModel = new JTextField();
		vehicleModel.setColumns(10);
		vehicleModel.setBounds(725, 658, 225, 22);
		frame.getContentPane().add(vehicleModel);
		
		JButton btnNewButton = new JButton("Save");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				custName.setText(""); 
				vehicleYear.setText("");
				vehicleMake.setText("");
				vehicleModel.setText("");
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNewButton.setBackground(new Color(245, 236, 85));
		btnNewButton.setBounds(445, 746, 209, 79);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Mechanic_Main_Screen();
				frame.dispose();
			}
		});
		btnCancel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnCancel.setBackground(new Color(245, 236, 85));
		btnCancel.setBounds(805, 746, 209, 79);
		frame.getContentPane().add(btnCancel);
		
		JLabel lblNewLabel_5 = new JLabel("<html><center>Fill out the following fields <br> to register a new vehicle into<br> the Gary's Garage system.");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5.setBounds(550, 343, 400, 87);
		frame.getContentPane().add(lblNewLabel_5);
		
		
		frame.setBounds(0, 0, 1500, 900);
		frame.setVisible(true);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
}
