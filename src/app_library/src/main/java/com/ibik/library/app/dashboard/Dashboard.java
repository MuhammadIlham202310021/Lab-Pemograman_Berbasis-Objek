package com.ibik.library.app.dashboard;


import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.border.TitledBorder;
import javax.swing.JTextField;
import javax.swing.JTextArea;

import com.ibik.library.app.model.User;
import com.ibik.library.app.login.LoginDao;
import com.ibik.library.app.login.LoginController;
import javax.swing.SwingConstants;

public class Dashboard extends JFrame {
	private JTextField textNIK;
	private JTextField textFullname;
	private JTextField textPlaceBirth;
	private JTextField textBirthdate;
	private JTextField textGender;
	private JTextArea textAddress;
	private JTextField textEmail;
	private JPasswordField textPassword;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Dashboard frame = new Dashboard(null);
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
	public Dashboard(User users) {
		LoginController lc  = new LoginController();
		LoginDao ld = new LoginDao();
	
		
		try {
			User u = ld.checkLogin(users);
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setBounds(100, 100, 440, 600);
			getContentPane().setForeground(SystemColor.textHighlight);
			setTitle("Dashboard");
			getContentPane().setLayout(null);
			
			JLabel labelIcon = new JLabel("");
			labelIcon.setIcon(new ImageIcon("C:\\\\Users\\\\ASUS\\\\Pictures\\\\logo-ibik-web.png"));
			labelIcon.setBounds(149, 0, 109, 121);
			getContentPane().add(labelIcon);
			
			JLabel labelTitle = new JLabel("Welcome to Sistem Informasi Perpustakaan ");
			labelTitle.setHorizontalAlignment(SwingConstants.CENTER);
			labelTitle.setForeground(Color.BLACK);
			labelTitle.setFont(new Font("Tahoma", Font.BOLD, 15));
			labelTitle.setBounds(10, 129, 391, 44);
			getContentPane().add(labelTitle);
			
			JPanel panel = new JPanel();
			panel.setBorder(new TitledBorder(null, "Profile", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			panel.setBounds(10, 184, 391, 370);
			getContentPane().add(panel);
			panel.setLayout(null);
			
			JLabel labelPassword = new JLabel("Password");
			labelPassword.setBounds(206, 283, 70, 14);
			panel.add(labelPassword);
			
			textPassword = new JPasswordField(u.getPassword());
			textPassword.setBounds(206, 308, 138, 20);
			panel.add(textPassword);

			JLabel labelNIK = new JLabel("NIK");
			labelNIK.setBounds(27, 26, 70, 14);
			panel.add(labelNIK);
			
			textNIK = new JTextField(String.valueOf(u.getNIK()));
			textNIK.setBounds(27, 50, 138, 20);
			panel.add(textNIK);
			textNIK.setColumns(10);

			JLabel labelFullname = new JLabel("Fullname");
			labelFullname.setBounds(206, 26, 70, 14);
			panel.add(labelFullname);
			
			textFullname = new JTextField(u.getFullname());
			textFullname.setBounds(206, 50, 138, 20);
			panel.add(textFullname);
			textFullname.setColumns(10);

			JLabel labelPlaceBirth = new JLabel("PlaceBirth");
			labelPlaceBirth.setBounds(27, 94, 70, 14);
			panel.add(labelPlaceBirth);
			
			textPlaceBirth = new JTextField(u.getPlaceBirth());
			textPlaceBirth.setBounds(27, 118, 86, 20);
			panel.add(textPlaceBirth);
			textPlaceBirth.setColumns(10);

			JLabel labelBirthdate = new JLabel("Birthdate");
			labelBirthdate.setBounds(126, 94, 70, 14);
			panel.add(labelBirthdate);
			
			textBirthdate = new JTextField(u.getBirthdate());
			textBirthdate.setBounds(123, 118, 105, 20);
			panel.add(textBirthdate);
			textBirthdate.setColumns(10);

			JLabel labelGender = new JLabel("Gender");
			labelGender.setBounds(247, 94, 70, 14);
			panel.add(labelGender);
			
			textGender = new JTextField(u.getGender());
			textGender.setBounds(238, 118, 106, 20);
			panel.add(textGender);
			textGender.setColumns(10);

			JLabel labelAddress = new JLabel("Address");
			labelAddress.setBounds(27, 160, 70, 14);
			panel.add(labelAddress);
			
			textAddress = new JTextArea(u.getAddress());
			textAddress.setBounds(27, 184, 317, 88);
			panel.add(textAddress);
			textAddress.setColumns(10);

			JLabel labelEmail = new JLabel("Email");
			labelEmail.setBounds(27, 283, 70, 14);
			panel.add(labelEmail);
			
			textEmail = new JTextField(u.getEmail());
			textEmail.setBounds(27, 308, 138, 20);
			panel.add(textEmail);
			textEmail.setColumns(10);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
}