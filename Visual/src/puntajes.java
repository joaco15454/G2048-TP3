import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;

import negocio.Negocio;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import java.util.TreeSet;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class puntajes {

	private static JFrame frame;
	private JLabel labels;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					puntajes window = new puntajes();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public puntajes() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 784, 561);
		panel.setBackground(new Color(0, 64, 0));
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("TOP 10 PUNTUACIONES");
		lblNewLabel.setBounds(301, 76, 180, 21);
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 17));
		panel.add(lblNewLabel);
		
		
		agregarPuntajes(panel);
		
		JButton btnNewButton = new JButton("Volver");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
			}
		});
		btnNewButton.setBounds(10, 527, 89, 23);
		panel.add(btnNewButton);
		frame.setSize(800, 600);
		frame.setResizable(false);
	}
	private void agregarPuntajes(JPanel panel) {
		TreeSet<Integer> lista = Negocio.devolverPuntajes();

		int altura = 138;
		 for (Integer num : lista) {
			 	JLabel labels = new JLabel("Puntaje nro: " + num);
			 	labels.setForeground(new Color(255, 255, 255));
			 	labels.setFont(new Font("Tahoma", Font.PLAIN, 17));
			 	labels.setBounds(300, altura, 170, 21);
				panel.add(labels);
				altura+=30;
	        }
	}
	public void cambiarVisibilidad() {
		frame.setVisible(true);
	}
}
