package miPackage;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.Color;

@SuppressWarnings("serial")
public class Chat extends JFrame {

	private JPanel contentPane;
	private JTextField textMensaje;
	private JScrollPane scrollPane;
	private JTextArea textChat;
	private JButton btnEnviar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Chat frame = new Chat();
					frame.setVisible(true);
					frame.textMensaje.requestFocus();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Chat() {
		setTitle("Chat");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 215, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setLocationRelativeTo(null);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 11, 424, 203);
		contentPane.add(scrollPane);
		
		textChat = new JTextArea();
		textChat.setFont(new Font("Monospaced", Font.PLAIN, 14));
		textChat.setEditable(false);
		scrollPane.setViewportView(textChat);
		
		textMensaje = new JTextField();
		textMensaje.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if (e.getKeyCode() == 10) {
					btnEnviar.doClick();
				}
			}
		});
		textMensaje.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textMensaje.setBounds(10, 225, 321, 36);
		contentPane.add(textMensaje);
		textMensaje.setColumns(10);
		textMensaje.requestFocus();
		
		btnEnviar = new JButton("Enviar");
		btnEnviar.setForeground(new Color(255, 255, 255));
		btnEnviar.setBackground(new Color(255, 69, 0));
		btnEnviar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (!textMensaje.getText().isEmpty()) {
					textChat.setText(textChat.getText().concat(textMensaje.getText() + '\n'));
					textMensaje.setText("");
				}
				textMensaje.requestFocus();
			}
		});
		btnEnviar.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnEnviar.setBounds(341, 225, 93, 36);
		contentPane.add(btnEnviar);
	}
}
