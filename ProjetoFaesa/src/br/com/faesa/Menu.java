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

public class Menu extends JFrame {

	private JPanel contentPane;
	private JTextField txtMenu;
	int senhaGeral = 1;
	
	public void proximo () {
		if (senhaGeral < 999) {
			senhaGeral++;
		} else {
			senhaGeral = 1;
		}
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Menu frame = new Menu();
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
	public Menu() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtMenu = new JTextField();
		txtMenu.setHorizontalAlignment(SwingConstants.CENTER);
		txtMenu.setEditable(false);
		txtMenu.setText("Menu:");
		txtMenu.setFont(new Font("Tahoma", Font.PLAIN, 18));
		txtMenu.setBounds(164, 27, 86, 20);
		contentPane.add(txtMenu);
		txtMenu.setColumns(10);
		
		JButton btnNewButton_1 = new JButton("Atendimento");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Atendimento atendimento = new Atendimento(senhaGeral);
				atendimento.setVisible(true);
				dispose();
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton_1.setBounds(275, 99, 134, 62);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Sair");
		btnNewButton_2.setBounds(164, 205, 89, 23);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_1_1 = new JButton("Gerar Senha");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				proximo ();
				GerarSenha gerarSenhaJanela1 = new GerarSenha();
				gerarSenhaJanela1.setVisible(true);
				dispose();
				
			}
		});
		btnNewButton_1_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton_1_1.setBounds(28, 99, 134, 62);
		contentPane.add(btnNewButton_1_1);
	}

}
