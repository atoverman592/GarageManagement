package project;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.UIManager;
import javax.swing.border.BevelBorder;
import javax.swing.JTabbedPane;
import javax.swing.JPanel;
import javax.swing.JTextPane;

public class Mechanic_Main_Screen {

	private JFrame frame;
	private JTable table;

	/**
	 * Create the application.
	 */
	public Mechanic_Main_Screen() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(245, 236, 85));
		frame.getContentPane().setLayout(null);
		
		JLabel lblLogo = new JLabel("");
		lblLogo.setIcon(new ImageIcon(Mechanic_Main_Screen.class.getResource("/project/logo_small.png")));
		lblLogo.setBounds(10, 10, 260, 130);
		frame.getContentPane().add(lblLogo);
		
		JLabel lblCustomersInWaiting = new JLabel("<html> <center>Customers in Waiting Room <br> <b><u> 5");
		lblCustomersInWaiting.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblCustomersInWaiting.setHorizontalAlignment(SwingConstants.CENTER);
		lblCustomersInWaiting.setVerticalAlignment(SwingConstants.TOP);
		lblCustomersInWaiting.setBounds(20, 151, 240, 50);
		frame.getContentPane().add(lblCustomersInWaiting);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(Mechanic_Main_Screen.class.getResource("/project/unstartedImage.png")));
		label.setBounds(20, 250, 70, 70);
		frame.getContentPane().add(label);
		
		JLabel lblNewLabel = new JLabel("<html><center>Service Has Not <br>Started");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel.setBounds(100, 250, 170, 70);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblinProgress = new JLabel("<html><center>Service In Progress");
		lblinProgress.setHorizontalAlignment(SwingConstants.CENTER);
		lblinProgress.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblinProgress.setBounds(100, 331, 170, 70);
		frame.getContentPane().add(lblinProgress);
		
		JLabel label_2 = new JLabel("");
		label_2.setIcon(new ImageIcon(Mechanic_Main_Screen.class.getResource("/project/startedImage.png")));
		label_2.setBounds(20, 331, 70, 70);
		frame.getContentPane().add(label_2);
		
		JLabel lblserviceComplete = new JLabel("<html><center>Service Complete");
		lblserviceComplete.setHorizontalAlignment(SwingConstants.CENTER);
		lblserviceComplete.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblserviceComplete.setBounds(100, 412, 170, 70);
		frame.getContentPane().add(lblserviceComplete);
		
		JLabel label_4 = new JLabel("");
		label_4.setIcon(new ImageIcon(Mechanic_Main_Screen.class.getResource("/project/finishedImage.png")));
		label_4.setBounds(20, 412, 70, 70);
		frame.getContentPane().add(label_4);
		
		JButton btnNewButton = new JButton("Add New Vehicle");
		btnNewButton.setBackground(new Color(135, 206, 250));
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 28));
		btnNewButton.setBounds(20, 530, 240, 120);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnSignOut = new JButton("Sign Out");
		btnSignOut.setBackground(new Color(135, 206, 250));
		btnSignOut.setFont(new Font("Tahoma", Font.PLAIN, 28));
		btnSignOut.setBounds(20, 800, 240, 50);
		frame.getContentPane().add(btnSignOut);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(290, 44, 1190, 810);
		frame.getContentPane().add(tabbedPane);
		DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
		centerRenderer.setHorizontalAlignment(SwingConstants.CENTER);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(135, 206, 250));
		tabbedPane.addTab("Ashley's Car", null, panel, null);
		panel.setLayout(null);
		
		table = new JTable();
		table.setBounds(35, 35, 600, 100);
		panel.add(table);
		table.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		table.setBackground(new Color(135, 206, 235));
		table.setFont(new Font("Tahoma", Font.PLAIN, 16));
		table.setDefaultRenderer(String.class, centerRenderer);
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"   Year", "   Make", "   Model"},
				{"   2009", "   BMW", "   325i"},
			},
			new String[] {
				"New column", "New column", "New column"
			}
		) {
			boolean[] columnEditables = new boolean[] {
				false, true, true
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		table.getColumnModel().getColumn(0).setPreferredWidth(100);
		table.getColumnModel().getColumn(0).setMinWidth(100);
		table.getColumnModel().getColumn(1).setPreferredWidth(100);
		table.getColumnModel().getColumn(1).setMinWidth(100);
		table.getColumnModel().getColumn(2).setResizable(false);
		table.getColumnModel().getColumn(2).setPreferredWidth(100);
		table.getColumnModel().getColumn(2).setMinWidth(100);
		table.setRowHeight(50);
		
		JLabel lbloilTypewtires = new JLabel("<html>Oil Type: 10w-40<br>Tires: 225/50-16 All Season<br>OBDII Compliant: Yes<br>Smog Check Required: Yes");
		lbloilTypewtires.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lbloilTypewtires.setBounds(60, 146, 551, 150);
		panel.add(lbloilTypewtires);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon(Mechanic_Main_Screen.class.getResource("/project/car.png")));
		lblNewLabel_1.setBounds(655, 35, 475, 275);
		panel.add(lblNewLabel_1);
		
		JLabel label_1 = new JLabel("");
		label_1.setIcon(new ImageIcon(Mechanic_Main_Screen.class.getResource("/project/unstartedImage.png")));
		label_1.setBounds(35, 300, 70, 70);
		panel.add(label_1);
		
		JLabel lblNewLabel_2 = new JLabel("Oil Change");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblNewLabel_2.setBounds(115, 300, 300, 70);
		panel.add(lblNewLabel_2);
		
		JButton btnBegin = new JButton("Begin");
		btnBegin.setFont(new Font("Tahoma", Font.PLAIN, 24));
		btnBegin.setBackground(new Color(70, 130, 180));
		btnBegin.setBounds(425, 310, 150, 50);
		panel.add(btnBegin);
		
		JLabel label_3 = new JLabel("");
		label_3.setIcon(new ImageIcon(Mechanic_Main_Screen.class.getResource("/project/finishedImage.png")));
		label_3.setBounds(35, 381, 70, 70);
		panel.add(label_3);
		
		JLabel lblChangeWiperBlades = new JLabel("Check Wiper Blades");
		lblChangeWiperBlades.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblChangeWiperBlades.setBounds(115, 381, 300, 70);
		panel.add(lblChangeWiperBlades);
		
		JButton btnDone = new JButton("Done!");
		btnDone.setFont(new Font("Tahoma", Font.PLAIN, 24));
		btnDone.setEnabled(false);
		btnDone.setBackground(new Color(192, 192, 192));
		btnDone.setBounds(425, 391, 150, 50);
		panel.add(btnDone);
		
		JLabel label_6 = new JLabel("");
		label_6.setIcon(new ImageIcon(Mechanic_Main_Screen.class.getResource("/project/startedImage.png")));
		label_6.setBounds(35, 462, 70, 70);
		panel.add(label_6);
		
		JLabel lblChangeBrakePads = new JLabel("Check Brake Pads");
		lblChangeBrakePads.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblChangeBrakePads.setBounds(115, 462, 300, 70);
		panel.add(lblChangeBrakePads);
		
		JButton btnComplete = new JButton("Complete");
		btnComplete.setFont(new Font("Tahoma", Font.PLAIN, 24));
		btnComplete.setBackground(new Color(0, 191, 255));
		btnComplete.setBounds(425, 472, 150, 50);
		panel.add(btnComplete);
		
		JLabel label_8 = new JLabel("");
		label_8.setIcon(new ImageIcon(Mechanic_Main_Screen.class.getResource("/project/unstartedImage.png")));
		label_8.setBounds(35, 543, 70, 70);
		panel.add(label_8);
		
		JLabel lblPerformStateInspection = new JLabel("Rotate Tires");
		lblPerformStateInspection.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblPerformStateInspection.setBounds(115, 543, 300, 70);
		panel.add(lblPerformStateInspection);
		
		JButton button_2 = new JButton("Begin");
		button_2.setFont(new Font("Tahoma", Font.PLAIN, 24));
		button_2.setBackground(new Color(70, 130, 180));
		button_2.setBounds(425, 553, 150, 50);
		panel.add(button_2);
		
		JTextPane txtpnSendMessageTo = new JTextPane();
		txtpnSendMessageTo.setText("Send Message to Customer");
		txtpnSendMessageTo.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtpnSendMessageTo.setBounds(700, 325, 430, 129);
		panel.add(txtpnSendMessageTo);
		
		JButton btnNewButton_1 = new JButton("Send");
		btnNewButton_1.setBackground(new Color(135, 206, 235));
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton_1.setBounds(1025, 462, 110, 30);
		btnNewButton_1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				txtpnSendMessageTo.setText("Send Message to Customer");
			}
			
		});
		panel.add(btnNewButton_1);
		
		JLabel lblCustomerIsIn = new JLabel("<html><div align=\"right\">Customer is in Waiting Room<br><br><br>Time Waiting: 22 minutes<br>Time Since Work Began: 15 minutes");
		lblCustomerIsIn.setHorizontalAlignment(SwingConstants.TRAILING);
		lblCustomerIsIn.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblCustomerIsIn.setBounds(700, 518, 430, 155);
		panel.add(lblCustomerIsIn);
		
		JLabel lblEstimatedTotal = new JLabel("Estimated Total: $ 65.27");
		lblEstimatedTotal.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblEstimatedTotal.setBounds(115, 631, 300, 30);
		panel.add(lblEstimatedTotal);
		
		JButton btnSendBill = new JButton("Send bill");
		btnSendBill.setBackground(new Color(135, 206, 235));
		btnSendBill.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnSendBill.setBounds(125, 672, 155, 50);
		panel.add(btnSendBill);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(135, 206, 250));
		tabbedPane.addTab("Curtis's Car", null, panel_1, null);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(135, 206, 250));
		tabbedPane.addTab("Nancy's Car", null, panel_2, null);
		frame.setBounds(0, 0, 1500, 900);
		frame.setVisible(true);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
