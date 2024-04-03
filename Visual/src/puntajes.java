import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.table.DefaultTableModel;

import negocio.Negocio;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.util.TreeSet;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JMenu;
import java.awt.Label;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class puntajes {
	private JFrame frame;
	private JTextArea res = new JTextArea();
	private String cadena;
	private static JLabel lblNewLabel = new JLabel("Puntajes ");
	private static JScrollPane scrollPane = new JScrollPane();
	private final JLabel volver = new JLabel("");


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					puntajes window = new puntajes();
					window.frame.setVisible(true);
					window.frame.setLocationRelativeTo(null);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	
	private void inicializarPanel() {
		frame = new JFrame();
		frame.setBackground(Color.BLACK);
		frame.getContentPane().setBackground(Color.BLACK);
		frame.setBounds(100, 100, 348, 610);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		scrollPane.setBounds(0, 243, 338, 134);
		scrollPane.setToolTipText("");
		scrollPane.setBackground(Color.black);
		frame.getContentPane().add(scrollPane);
		scrollPane.setViewportView(res);
		res.setEditable(false);
		res.setForeground(Color.WHITE);
		
		res.setTabSize(0);
		res.setFont(new Font("Pixeled", Font.PLAIN, 10));
		res.setBackground(Color.BLACK);
		lblNewLabel.setBounds(95, 93, 150, 75);
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setBackground(new Color(240, 240, 240));
		lblNewLabel.setFont(new Font("Pixeled", Font.PLAIN, 18));
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1_1 = new JLabel();
		lblNewLabel_1_1.setBounds(130, 27, 85, 103);
		lblNewLabel_1_1.setIcon(new ImageIcon(puntajes.class.getResource("/imagenes/estrella.png")));
		frame.getContentPane().add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1 = new JLabel();
		lblNewLabel_1.setBounds(189, 68, 85, 65);
		lblNewLabel_1.setIcon(new ImageIcon(puntajes.class.getResource("/imagenes/estrella.png")));
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel();
		lblNewLabel_2.setBounds(73, 71, 62, 59);
		lblNewLabel_2.setIcon(new ImageIcon(puntajes.class.getResource("/imagenes/estrella.png")));
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Historicos\r\n");
		lblNewLabel_3.setBounds(36, 142, 282, 65);
		lblNewLabel_3.setFont(new Font("Pixeled", Font.PLAIN, 32));
		lblNewLabel_3.setForeground(Color.WHITE);
		frame.getContentPane().add(lblNewLabel_3);
		
		volver.setIcon(new ImageIcon(puntajes.class.getResource("/imagenes/volver.png")));
		volver.setBounds(101, 417, 144, 65);
		
		frame.getContentPane().add(volver);
		
		JLabel fondo = new JLabel("");
		fondo.setForeground(Color.DARK_GRAY);
		fondo.setIcon(new ImageIcon(puntajes.class.getResource("/imagenes/fondo1.png")));
		fondo.setBounds(-20, 139, 743, 593);
		frame.getContentPane().add(fondo);
		
		JLabel fondo2 = new JLabel("");
		fondo2.setIcon(new ImageIcon(puntajes.class.getResource("/imagenes/fondo1.png")));
		fondo2.setBounds(0, 46, 505, 361);
		frame.getContentPane().add(fondo2);
	}

	private void repuesta() {
		TreeSet<Integer> lista = Negocio.devolverPuntajes();
	    cadena = "Los puntajes son \n";
	 	    	 for (Integer num : lista) {
	            cadena += num;   
	           cadena += "\n";
	        }  
	        
	        res.setText(cadena);
	    }	    

	private void escucharBotonVolver() {
		volver.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				try {	
					menu.main(null);						
					frame.dispose();

					}
				catch (Exception e1) {JOptionPane.showMessageDialog(null, "ERROR");}		
			}	
				
			
		});
		
		
		
		
		
	}


	
	public puntajes() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		inicializarPanel();
		repuesta();
		escucharBotonVolver();

	}
	public void cambiarVisibilidad() {
		frame.setVisible(true);
	}
}
