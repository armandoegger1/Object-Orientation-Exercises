import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class SchermataPrincipale extends JFrame {

	private JPanel contentPane;
	private JTextField TestoDaCopiareTextField;
	private JTextField TestoCopiatoTextField;
	private JButton btnClose;
	private JButton btnNuovaFinestra;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SchermataPrincipale frame = new SchermataPrincipale();
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
	public SchermataPrincipale() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		TestoDaCopiareTextField = new JTextField();
		TestoDaCopiareTextField.setBounds(159, 11, 113, 20);
		contentPane.add(TestoDaCopiareTextField);
		TestoDaCopiareTextField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Inserisci del testo");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setBounds(25, 14, 126, 14);
		contentPane.add(lblNewLabel);
		
		JButton btnCopia = new JButton("Copia");
		btnCopia.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				contentPane.setBackground(Color.orange);
				btnCopia.setBackground(Color.RED);
			}
		});
		btnCopia.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TestoCopiatoTextField.setText(TestoDaCopiareTextField.getText());
				TestoDaCopiareTextField.setText("");
			}
		});
		btnCopia.setBounds(171, 85, 89, 23);
		contentPane.add(btnCopia);
		
		TestoCopiatoTextField = new JTextField();
		TestoCopiatoTextField.setToolTipText("Testo non editabile");
		TestoCopiatoTextField.setEditable(false);
		TestoCopiatoTextField.setBounds(126, 131, 178, 57);
		contentPane.add(TestoCopiatoTextField);
		TestoCopiatoTextField.setColumns(10);
		
		btnClose = new JButton("Esci");
		btnClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(NORMAL);
			}
		});
		btnClose.setBounds(313, 212, 89, 38);
		contentPane.add(btnClose);
		
		btnNuovaFinestra = new JButton("Finestra 2");
		btnNuovaFinestra.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FinestraDue f2 = new FinestraDue();
				f2.setVisible(true);
			}
		});
		btnNuovaFinestra.setBounds(197, 220, 89, 23);
		contentPane.add(btnNuovaFinestra);
	}
}
