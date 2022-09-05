package br.com.faesa;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GerarSenha extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtInsiraSeuNome;
	String nome;
	int senha;
	private JTextField nomeInserido;
	private JButton btnNewButton;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GerarSenha frame = new GerarSenha();
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
	public GerarSenha() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtInsiraSeuNome = new JTextField();
		txtInsiraSeuNome.setEditable(false);
		txtInsiraSeuNome.setHorizontalAlignment(SwingConstants.CENTER);
		txtInsiraSeuNome.setText("Insira seu nome:");
		txtInsiraSeuNome.setFont(new Font("Tahoma", Font.PLAIN, 18));
		txtInsiraSeuNome.setBounds(68, 36, 300, 42);
		contentPane.add(txtInsiraSeuNome);
		txtInsiraSeuNome.setColumns(10);
		
		nomeInserido = new JTextField();
		nomeInserido.setHorizontalAlignment(SwingConstants.CENTER);
		nomeInserido.setBounds(29, 108, 375, 84);
		contentPane.add(nomeInserido);
		nomeInserido.setColumns(10);
		
		btnNewButton = new JButton("OK");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Cliente cliente = new Cliente (nomeInserido.toString());
				nome = cliente.nome;
				senha = cliente.senha;
				GerarSenhaView2 janela2 = new GerarSenhaView2(nome, senha);
				janela2.setVisible(true);
				dispose();
				
			}
		});
		btnNewButton.setBounds(169, 212, 89, 23);
		contentPane.add(btnNewButton);
		
	}

}
