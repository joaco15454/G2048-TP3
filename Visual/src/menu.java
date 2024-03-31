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

public class menu {

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
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("2048");
		lblNewLabel.setBounds(179, 37, 100, 34);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 28));
		frame.getContentPane().add(lblNewLabel);
		
		JButton btnNewButton = new JButton("JUGAR");
		btnNewButton.setBounds(104, 100, 222, 23);
		btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Cuando se hace clic en el botón "JUGAR", se instancia y muestra la clase Visual
                visual visual = new visual();
                visual.cambiarVisible();
            }
        });
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("PUNTUACIONES HISTORICAS");
		btnNewButton_1.setBackground(new Color(128, 64, 0));
		btnNewButton_1.setBounds(104, 159, 222, 23);
		frame.getContentPane().add(btnNewButton_1);
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
	}
        
}
