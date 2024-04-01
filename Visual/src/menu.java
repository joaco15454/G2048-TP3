import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import java.awt.GridLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.BoxLayout;

public class menu {
	private visual visualInstance;

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					menu window = new menu();
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
	public menu() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(210, 120, 66));
		
		JButton btnNewButton = new JButton("JUGAR");
		btnNewButton.setBounds(304, 201, 175, 61);
		btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	if (visualInstance == null) {
                    visualInstance = new visual();
                } else {
                    visualInstance.reiniciar();
                }
                // Muestra el visual
                visualInstance.cambiarVisible();
            }
            
        });
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("2048");
		lblNewLabel.setBounds(352, 93, 60, 34);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 28));
		frame.getContentPane().add(lblNewLabel);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("PUNTUACIONES HISTORICAS");
		btnNewButton_1.setBounds(304, 318, 175, 61);
		btnNewButton_1.setBackground(new Color(128, 64, 0));
		btnNewButton_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Cuando se hace clic en el botón "JUGAR", se instancia y muestra la clase Visual
                puntajes puntaje = new puntajes();
                puntaje.cambiarVisibilidad();
            }
        });
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("SALIR");
		btnNewButton_2.setBounds(304, 441, 175, 55);
		btnNewButton_2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
              System.exit(0);
            }
        });
		frame.getContentPane().add(btnNewButton_2);
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(800, 600);
		frame.setResizable(false);

		
	}
        
}
