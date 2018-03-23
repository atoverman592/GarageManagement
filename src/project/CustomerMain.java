package project;

import java.awt.EventQueue;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JTabbedPane;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.util.Calendar;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.border.BevelBorder;
import javax.swing.JTextPane;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent; 

public class CustomerMain {

	private JFrame frame;
	private JTable table;


	public CustomerMain() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(245, 236, 85));
		frame.getContentPane().setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBackground(new Color(135, 206, 250));
		tabbedPane.setBounds(281, 46, 1201, 806);
		frame.getContentPane().add(tabbedPane);
		
		JPanel panel = new JPanel();
		panel.setForeground(new Color(135, 206, 250));
		panel.setBackground(new Color(135, 206, 250));
		tabbedPane.addTab("Ashley's Car", null, panel, null);
		panel.setLayout(null);
		
		table = new JTable();
		table.setFont(new Font("Tahoma", Font.PLAIN, 16));
		table.setBackground(new Color(135, 206, 235));
		table.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		table.setRowHeight(50);
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"   Year", "   Make", "   Model"},
				{" 2009", " BMW", " 325i"},
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
		table.getColumnModel().getColumn(0).setResizable(false);
		table.getColumnModel().getColumn(0).setPreferredWidth(100); 
		table.getColumnModel().getColumn(0).setMinWidth(100);
		table.getColumnModel().getColumn(1).setPreferredWidth(100); 
		table.getColumnModel().getColumn(1).setMinWidth(100);
		table.getColumnModel().getColumn(2).setPreferredWidth(100); 
		table.getColumnModel().getColumn(2).setMinWidth(100);
		table.setBounds(26, 26, 600, 100);
		panel.add(table);
		
		JLabel lblNewLabel_6 = new JLabel("<html> Oil Type: 10w-40\n <br>\r\nTires: 225/50-16 All Season <br>\r\nOBDII Compliant: Yes <br>\r\n\nSmog Check Required: Yes");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_6.setBounds(26, 139, 272, 131);
		panel.add(lblNewLabel_6);
		
		JLabel lblNewLabel_5 = new JLabel("New label");
		lblNewLabel_5.setIcon(new ImageIcon(CustomerMain.class.getResource("/project/car.png")));
		lblNewLabel_5.setBounds(664, 26, 504, 296);
		panel.add(lblNewLabel_5);
		
		JTextPane txtpnSendMessageTo = new JTextPane();
		txtpnSendMessageTo.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtpnSendMessageTo.setText("Send Message to Mechanic");
		txtpnSendMessageTo.setBounds(820, 335, 347, 123);
		panel.add(txtpnSendMessageTo);
		
		JButton btnNewButton_1 = new JButton("Send");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtpnSendMessageTo.setText("Send Message to Mechanic");
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton_1.setBackground(new Color(70, 130, 180));
		btnNewButton_1.setBounds(1071, 471, 97, 25);
		panel.add(btnNewButton_1);
		
		JLabel lblOilChange = new JLabel("Oil Change");
		lblOilChange.setIcon(new ImageIcon(CustomerMain.class.getResource("/project/unstartedImage.png")));
		lblOilChange.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblOilChange.setBounds(26, 315, 240, 58);
		panel.add(lblOilChange);
		
		JLabel lblChangeWiperBlades = new JLabel("Check Wiper Blades");
		lblChangeWiperBlades.setIcon(new ImageIcon(CustomerMain.class.getResource("/project/finishedImage.png")));
		lblChangeWiperBlades.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblChangeWiperBlades.setBounds(26, 378, 315, 70);
		panel.add(lblChangeWiperBlades);
		
		JLabel lblCheckBrakePads = new JLabel("Check Brake Pads");
		lblCheckBrakePads.setIcon(new ImageIcon(CustomerMain.class.getResource("/project/startedImage.png")));
		lblCheckBrakePads.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblCheckBrakePads.setBounds(26, 457, 327, 52);
		panel.add(lblCheckBrakePads);
		
		JLabel lblPerformStateInspection = new JLabel("Rotate Tires");
		lblPerformStateInspection.setIcon(new ImageIcon(CustomerMain.class.getResource("/project/unstartedImage.png")));
		lblPerformStateInspection.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblPerformStateInspection.setBounds(26, 522, 447, 58);
		panel.add(lblPerformStateInspection);
		
		JLabel lblNewLabel_7 = new JLabel("<html><div align=\"right\">Time Waiting: 22 minutes <br>\r\nTime Since Work Began: 15 minutes");
		lblNewLabel_7.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_7.setHorizontalAlignment(SwingConstants.TRAILING);
		lblNewLabel_7.setBounds(734, 579, 432, 52);
		panel.add(lblNewLabel_7);
		
		JButton btnNewButton_2 = new JButton("Receive Bill");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new ReceiveBillScreen();
				frame.dispose();
			}
		});
		btnNewButton_2.setBackground(new Color(70, 130, 180));
		btnNewButton_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNewButton_2.setBounds(501, 705, 217, 58);
		panel.add(btnNewButton_2);
		tabbedPane.setBackgroundAt(0, new Color(135, 206, 250));
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(CustomerMain.class.getResource("/project/logo_small.png")));
		lblNewLabel.setBounds(12, 13, 257, 130);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_2 = new JLabel("<html><center> Service Has Not <br> Started ");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_2.setIcon(new ImageIcon(CustomerMain.class.getResource("/project/unstartedImage.png")));
		lblNewLabel_2.setBounds(12, 250, 240, 58);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("<html><center>Service In Progress");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_3.setIcon(new ImageIcon(CustomerMain.class.getResource("/project/startedImage.png")));
		lblNewLabel_3.setBounds(12, 356, 240, 52);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("<html><center> Service Complete");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_4.setIcon(new ImageIcon(CustomerMain.class.getResource("/project/finishedImage.png")));
		lblNewLabel_4.setBounds(12, 444, 240, 70);
		frame.getContentPane().add(lblNewLabel_4);
		
		JButton btnNewButton = new JButton("Sign Out");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new Welcome_Screen(); 
				frame.dispose();
			}
		});
		btnNewButton.setBackground(new Color(135, 206, 250));
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNewButton.setBounds(25, 792, 227, 60);
		frame.getContentPane().add(btnNewButton);
		frame.setBounds(100, 100, 450, 300);
		
		
		frame.setBounds(0, 0, 1500, 900);
		frame.setVisible(true);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
