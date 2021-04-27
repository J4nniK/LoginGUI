package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.FlowLayout;
import java.awt.Insets;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LoginFrame extends JFrame {

	private JPanel contentPane;
	private JTextField mailTextField;
	private JPasswordField passwordField;
	//definiert eine Instanz des Navigationsmenüs
	private MainMenu mainMenu;
	//diese Variable wird benötigt um zu überprüfen ob der Button anmelden gedrückt worden ist
	private boolean buttonClicked;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginFrame frame = new LoginFrame();
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
	public LoginFrame() {
		
		buttonClicked = false;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel northPanel = new JPanel();
		contentPane.add(northPanel, BorderLayout.NORTH);
		
		JLabel titleLabel = new JLabel("Anmeldebildschirm");
		northPanel.add(titleLabel);
		
		JPanel southPanel = new JPanel();
		contentPane.add(southPanel, BorderLayout.SOUTH);
		southPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JButton loginButton = new JButton("Anmelden");
		loginButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//sobald der Button Anmelden geklickt wird, und noch keine Instanz des Hauptfensters geöffnet ist, wird dieses geöffnet
				if(e.getSource() == loginButton && buttonClicked == false ) {
					mainMenu = new MainMenu();
					mainMenu.setVisible(true);
					//Die Variable nimmt immer den Sichtbarkeitswert des Hauptmenüs an
					buttonClicked = mainMenu.isVisible();			
					}
				
				
			}
		});
		loginButton.setHorizontalAlignment(SwingConstants.RIGHT);
		southPanel.add(loginButton);
		
		JPanel centerPanel = new JPanel();
		contentPane.add(centerPanel, BorderLayout.WEST);
		GridBagLayout gbl_centerPanel = new GridBagLayout();
		gbl_centerPanel.columnWidths = new int[]{133, 289, 0};
		gbl_centerPanel.rowHeights = new int[]{27, 0, 0, 0};
		gbl_centerPanel.columnWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
		gbl_centerPanel.rowWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
		centerPanel.setLayout(gbl_centerPanel);
		
		JLabel emailLabel = new JLabel("E-Mail: ");
		GridBagConstraints gbc_emailLabel = new GridBagConstraints();
		gbc_emailLabel.insets = new Insets(0, 0, 5, 5);
		gbc_emailLabel.anchor = GridBagConstraints.EAST;
		gbc_emailLabel.gridx = 0;
		gbc_emailLabel.gridy = 0;
		centerPanel.add(emailLabel, gbc_emailLabel);
		
		mailTextField = new JTextField();
		GridBagConstraints gbc_mailTextField = new GridBagConstraints();
		gbc_mailTextField.insets = new Insets(0, 0, 5, 0);
		gbc_mailTextField.anchor = GridBagConstraints.WEST;
		gbc_mailTextField.gridx = 1;
		gbc_mailTextField.gridy = 0;
		centerPanel.add(mailTextField, gbc_mailTextField);
		mailTextField.setColumns(25);
		
		JLabel passwortLabel = new JLabel("Passwort: ");
		GridBagConstraints gbc_passwortLabel = new GridBagConstraints();
		gbc_passwortLabel.anchor = GridBagConstraints.EAST;
		gbc_passwortLabel.insets = new Insets(0, 0, 0, 5);
		gbc_passwortLabel.gridx = 0;
		gbc_passwortLabel.gridy = 2;
		centerPanel.add(passwortLabel, gbc_passwortLabel);
		
		passwordField = new JPasswordField();
		passwordField.setColumns(25);
		GridBagConstraints gbc_passwordField = new GridBagConstraints();
		gbc_passwordField.anchor = GridBagConstraints.WEST;
		gbc_passwordField.gridx = 1;
		gbc_passwordField.gridy = 2;
		centerPanel.add(passwordField, gbc_passwordField);
	}

}
