package br.com.faesa;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextPane;
import javax.swing.JFormattedTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

public class Atendimento extends JFrame {

	private JPanel contentPane;
	private JTextField txtPrximaSenha;
	int senhaGeral;
	private JTextField txtAquiaqui;
	
	public Atendimento() {
		
	}
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Atendimento frame = new Atendimento();
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
	public Atendimento(int senhaGeral) {
		this.senhaGeral = senhaGeral;
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtPrximaSenha = new JTextField();
		txtPrximaSenha.setEditable(false);
		txtPrximaSenha.setFont(new Font("Tahoma", Font.PLAIN, 18));
		txtPrximaSenha.setText("Próxima senha:");
		txtPrximaSenha.setHorizontalAlignment(SwingConstants.CENTER);
		txtPrximaSenha.setBounds(39, 35, 354, 31);
		contentPane.add(txtPrximaSenha);
		txtPrximaSenha.setColumns(10);
		
		txtAquiaqui = new JTextField();
		txtAquiaqui.setHorizontalAlignment(SwingConstants.CENTER);
		txtAquiaqui.setText(String.valueOf(senhaGeral));
		txtAquiaqui.setBounds(39, 110, 354, 125);
		contentPane.add(txtAquiaqui);
		txtAquiaqui.setColumns(10);
	}

}
