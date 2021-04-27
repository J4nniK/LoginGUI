package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import java.awt.GridBagLayout;
import javax.swing.JList;
import java.awt.GridBagConstraints;
import java.awt.GridLayout;
import javax.swing.JButton;
import java.awt.CardLayout;
import java.awt.Insets;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class MainMenu extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainMenu frame = new MainMenu();
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
	public MainMenu() {
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setBounds(100, 100, 810, 577);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 50));
		setContentPane(contentPane);
		
		JPanel westPanel = new JPanel();
		contentPane.add(westPanel, BorderLayout.WEST);
		GridBagLayout gbl_westPanel = new GridBagLayout();
		gbl_westPanel.columnWidths = new int[]{0, 0};
		gbl_westPanel.rowHeights = new int[]{0, 0, 0, 0};
		gbl_westPanel.columnWeights = new double[]{1.0, Double.MIN_VALUE};
		gbl_westPanel.rowWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
		westPanel.setLayout(gbl_westPanel);
		
		JLabel menuLabel = new JLabel("Navigation");
		GridBagConstraints gbc_menuLabel = new GridBagConstraints();
		gbc_menuLabel.insets = new Insets(0, 0, 5, 0);
		gbc_menuLabel.gridx = 0;
		gbc_menuLabel.gridy = 1;
		westPanel.add(menuLabel, gbc_menuLabel);
		
		JPanel westGridLayoutPanel = new JPanel();
		GridBagConstraints gbc_westGridLayoutPanel = new GridBagConstraints();
		gbc_westGridLayoutPanel.gridx = 0;
		gbc_westGridLayoutPanel.gridy = 2;
		westPanel.add(westGridLayoutPanel, gbc_westGridLayoutPanel);
		westGridLayoutPanel.setLayout(new GridLayout(4, 0, 0, 8));
		
		JButton datenverwaltungButton = new JButton("Datenverwaltung");
		westGridLayoutPanel.add(datenverwaltungButton);
		
		JButton datenAnzeigenButton = new JButton("Daten anzeigen");
		westGridLayoutPanel.add(datenAnzeigenButton);
		
		JButton benutzerverwaltungButton = new JButton("Benutzerverwaltung");
		westGridLayoutPanel.add(benutzerverwaltungButton);
		
		JButton btnNewButton_4 = new JButton("New button");
		westGridLayoutPanel.add(btnNewButton_4);
		
		JPanel centerPanel = new JPanel();
		contentPane.add(centerPanel, BorderLayout.CENTER);
		centerPanel.setLayout(new CardLayout(0, 0));
	}

}
