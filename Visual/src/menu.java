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
import javax.swing.JPanel;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import java.awt.Canvas;
import java.awt.Label;
import javax.swing.border.TitledBorder;
import javax.swing.JSplitPane;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;

import java.awt.CardLayout;
import java.awt.Component;
import java.awt.Toolkit;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class menu {
	private visual visualInstance;

	private JFrame frame;

	private JLabel jugar;

	private JLabel salir;

	private JLabel    punaje;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					menu window = new menu();
					window.frame.setVisible(true);
					window.frame.setLocationRelativeTo(null);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
	}
	
	
	
	private void inicializarcomponentes () {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.BLACK);
		frame.setForeground(new Color(240, 240, 240));
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\cncow\\eclipse-workspace\\Visual\\imagenes\\fondo.png"));
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(639, 377);
		frame.setResizable(false);
		frame.getContentPane().setLayout(null);
		
		jugar = new JLabel("");
		 

    	frame.getContentPane().setLayout(null);
		 
		jugar.setIcon(new ImageIcon(menu.class.getResource("/imagenes/jugar1.png")));
		jugar.setBounds(138, 40, 391, 149);
		frame.getContentPane().add(jugar);
		
		salir = new JLabel("");
		
		salir.setIcon(new ImageIcon(menu.class.getResource("/imagenes/salir1.png")));
		salir.setBounds(307, 195, 53, 51);
		frame.getContentPane().add(salir);
		
	    punaje = new JLabel("");
	    
        frame.getContentPane().add(punaje);
	    
		punaje.setIcon(new ImageIcon(menu.class.getResource("/imagenes/puntaje1.png")));
		punaje.setBounds(214, 180, 92, 66);
		frame.getContentPane().add(punaje);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(menu.class.getResource("/imagenes/fondo1.png")));
		lblNewLabel.setBounds(0, -267, 1332, 885);
		frame.getContentPane().add(lblNewLabel);

	    
		
	}

	private void escucharBotones () {
		jugar.addMouseListener(new MouseAdapter() {
		 	@Override
		 	public void mouseClicked(MouseEvent e) {
		 		visual.main(null);
		 		frame.dispose();
		 	
		 	 }
		 });
		 
		salir.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				 System.exit(0);
			}
		});
		
	    punaje.addMouseListener(new MouseAdapter() {
	    	@Override
	    	public void mouseClicked(MouseEvent e) {
	    		// Cuando se hace clic en el botón "JUGAR", se instancia y muestra la clase Visual
               puntajes.main(null);
               frame.dispose();
            }
        });
		
	}
	
		
	
	
	/**
	 * 
	 * Create the application.
	 */
	public menu() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		inicializarcomponentes ();
		escucharBotones () ;
		
	   
		
	}
}
