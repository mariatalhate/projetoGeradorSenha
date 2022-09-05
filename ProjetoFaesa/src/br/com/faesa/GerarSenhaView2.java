package br.com.faesa;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Font;

public class GerarSenhaView2 extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtSenha;
	private JTextField txtInseriraqui;
	String nome;
	String senha;
	
	public GerarSenhaView2() {
		
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GerarSenhaView2 frame = new GerarSenhaView2();
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
	public GerarSenhaView2(String nome, int senha) {
		this.nome = nome;
		this.senha = String.valueOf(senha);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtSenha = new JTextField();
		txtSenha.setEditable(false);
		txtSenha.setFont(new Font("Tahoma", Font.PLAIN, 18));
		txtSenha.setText("Senha:");
		txtSenha.setHorizontalAlignment(SwingConstants.CENTER);
		txtSenha.setBounds(39, 35, 354, 31);
		contentPane.add(txtSenha);
		txtSenha.setColumns(10);
		
		txtInseriraqui = new JTextField();
		txtInseriraqui.setHorizontalAlignment(SwingConstants.CENTER);
		txtInseriraqui.setText(String.valueOf(senha));
		txtInseriraqui.setBounds(39, 110, 354, 125);
		contentPane.add(txtInseriraqui);
		txtInseriraqui.setColumns(10);
	}

}
