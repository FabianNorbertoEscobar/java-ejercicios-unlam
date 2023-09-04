package miPackage;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

@SuppressWarnings("serial")
public class Contador extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Contador frame = new Contador();
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
	public Contador() {
		setResizable(false);
		setTitle("Contador");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 300, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(148, 0, 211));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		this.setLocationRelativeTo(null);
		
		JLabel lblContador = new JLabel("CONTADOR");
		lblContador.setForeground(new Color(255, 255, 0));
		lblContador.setHorizontalAlignment(SwingConstants.CENTER);
		lblContador.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblContador.setBounds(90, 26, 103, 35);
		contentPane.add(lblContador);
		
		textField = new JTextField();
		textField.setBackground(Color.WHITE);
		textField.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField.setEditable(false);
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setBounds(56, 108, 179, 35);
		contentPane.add(textField);
		textField.setColumns(10);
		textField.setText("0");
		
		JButton btnContar = new JButton("Contar");
		btnContar.setBackground(new Color(255, 255, 0));
		btnContar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textField.setText(String.valueOf(Integer.parseInt(textField.getText()) + 1));
			}
		});
		btnContar.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnContar.setBounds(86, 187, 123, 41);
		contentPane.add(btnContar);
	}
}
