import java.awt.EventQueue;
import negocio.Negocio;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.Menu;
import java.awt.Point;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import javax.swing.border.BevelBorder;
import javax.swing.border.Border;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.HashSet;
import java.util.Set;
import javax.swing.JTextArea;
import javax.swing.JToolBar;
import javax.swing.JInternalFrame;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
public class visual {

	private static JFrame frame;
	private static JPanel encabezado = new JPanel();
	private static JPanel body = new JPanel();
	private static JPanel[][] tab2048 = new JPanel[4][4];
	private static JLabel[][] lab2048 = new JLabel[4][4];
	private final JLabel txt_puntuacion = new JLabel("PUNTUACION: 0");
	private static boolean perdio = false;
	
	
	private final static JLabel lblNewLabel = new JLabel("New label");
	private final JLabel lblNewLabel_1 = new JLabel("New label");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					visual.frame.setVisible(true);
					visual.frame.setLocationRelativeTo(null);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public visual() {
		initialize();
	}

	public static void iniciarTablero() {
		Negocio.inciarTablero();
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.BLACK);
		frame.setTitle("2048");
		frame.setBounds(100, 100, 499, 356);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		encabezado.setBounds(-10, 0, 786, 120);
		//*frame.getContentPane().setLayout(new GridLayout(4, 4, 0, 0));		
		frame.getContentPane().add(encabezado);
		body.setBounds(191, 162, 345, 344);
		
		frame.getContentPane().add(body);
		frame.setSize(782, 698);
		frame.setResizable(false);

		body.setLayout(new GridLayout(4, 4, 0, 0));
		body.setBackground(Color.BLACK);
		encabezado.setBackground(Color.BLACK);
		lblNewLabel.setIcon(new ImageIcon(visual.class.getResource("/imagenes/fondo grande.png")));
		lblNewLabel.setBounds(-10, 113, 776, 553);
		
		frame.getContentPane().add(lblNewLabel);
		
		
		

				
        
	}
	
	private void cargarTablero() {
		for (int i = 0; i < 4; i++) {
	        for (int j = 0; j < 4; j++) {	        
	           tab2048[i][j] = new JPanel();
	           Border lineBorder = BorderFactory.createLineBorder(Color.WHITE);
	           tab2048[i][j].setBorder(lineBorder);
	           body.add(tab2048[i][j]);
	           tab2048[i][j].setLayout(null);
				lab2048[i][j] = new JLabel(""); 
	           comprobarEstadoLabel(i, j);	           
	           definirLabel(lab2048[i][j],tab2048[i][j]);	           
	        }
		}
	}
	private void actualizarTablero() {
		for (int i = 0; i < 4; i++) {
	        for (int j = 0; j < 4; j++) {	
	        	//System.out.println("La posicion: [" + i + ", " + j + "]");
	      
	        	//System.out.println(("Es una posicion nueva? : " + Negocio.esNuevo(i, j)));
	        	//System.out.println("El tablero como lo esta tomando? : " + Negocio.comprobarPosicion(i, j));
		        comprobarEstadoLabel(i, j);
		        actualizarPuntuacion();
	        	
	        }
		}
	}


	
	private void definirLabel(JLabel label, JPanel panel) {
		
		label.setFont(new Font("Pixeled", Font.PLAIN, 35));
		label.setForeground(Color.white);
		label.setBounds((panel.getWidth()+60) / 2, (panel.getHeight()+50 ) / 2, 80, 43);
		

		panel.add(label);
	}
	
	private void comprobarEstadoLabel(int i, int j) {
	    if (Negocio.comprobarPosicion(i, j)) {
	        int valor = Integer.parseInt(Negocio.devolverEnString(i, j));
	        lab2048[i][j].setText(Negocio.devolverEnString(i, j));
	        switch (valor) {
	            case 2:
	                tab2048[i][j].setBackground(new Color(91, 154, 160));
	                break;
	            case 4:
	                tab2048[i][j].setBackground(new Color(91, 160, 129));
	                break;
	            case 8:
	                tab2048[i][j].setBackground(new Color(91, 160, 108));
	                break;
	            case 16:
	                tab2048[i][j].setBackground(new Color(141, 91, 160));
	                break;
	            case 32:
	                tab2048[i][j].setBackground(new Color(98, 37, 54));
	                break;
	            case 64:
	                tab2048[i][j].setBackground(new Color(54, 37, 98));
	                break;
	            case 128:
	                tab2048[i][j].setBackground(new Color(144, 114, 66));
	                break;
	            case 256:
	                tab2048[i][j].setBackground(new Color(144, 95, 66));
	                break;
	            case 512:
	                tab2048[i][j].setBackground(new Color(120, 33, 21));
	                break;
	            case 1024:
	                tab2048[i][j].setBackground(new Color(75, 86, 41));
	                break;
	            case 2048:
	                tab2048[i][j].setBackground(new Color(59, 41, 86));
	                break;
	            default:
	                tab2048[i][j].setBackground(Color.black);
	                break;
	        }
	    } else {
	        lab2048[i][j].setText("");
	        tab2048[i][j].setBackground(Color.black);
	    }
	}


	
	private void estructurarHeader() {
			encabezado.setLayout(null);
			
			txt_puntuacion.setBounds(224, 10, 393, 68);
			txt_puntuacion.setForeground(Color.WHITE);

			txt_puntuacion.setFont(new Font("Pixeled", Font.PLAIN, 24));		
			encabezado.add(txt_puntuacion);
			lblNewLabel_1.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {			
						System.out.println("Le diste click aca");
						// Cuando se hace clic en el botón "JUGAR", se instancia y muestra la clase Visual
						reiniciar();
						frame.dispose();
						frame.setVisible(false);
						
						
						menu.frame.setVisible(true);
				}
			});
			
			lblNewLabel_1.setIcon(new ImageIcon(visual.class.getResource("/imagenes/volver.png")));
			lblNewLabel_1.setBounds(0, 10, 146, 68);
			
			encabezado.add(lblNewLabel_1);

	}
	private void actualizarPuntuacion() {
		txt_puntuacion.setText("PUNTUACION: " + Negocio.devolverPuntuacionString());
	}
	public void cambiarVisible() {
		frame.setVisible(true);
	}
	private void comprobarPerdio() {
		 if (Negocio.haPerdido()) {
			 JOptionPane.showMessageDialog(null, "Perdiste");
			 frame.setVisible(false);}
	}
	public void reiniciar() {
	    // Restablecer el tablero y la puntuación
	    Negocio.inciarTablero();
	    Negocio.reiniciarPuntuacion();
	    // Actualizar el tablero y la puntuación en la interfaz gráfica
	    actualizarTablero();
	    actualizarPuntuacion();
	    // Mostrar nuevamente el frame del juego
	    frame.setVisible(true);
	}
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {	
		estructurarHeader();
		iniciarTablero();
		cargarTablero();
		
    	System.out.println("Entre aca");
		frame.addKeyListener(new KeyListener() {
            @Override
            public void keyPressed(KeyEvent e) {
                // Manejar la tecla presionada
                switch (e.getKeyCode()) {
                    case KeyEvent.VK_LEFT:
                        Negocio.moverIzquierda();
                        comprobarPerdio();
                        actualizarTablero();
                        break;
                    case KeyEvent.VK_RIGHT:
                    	Negocio.moverDerecha();
                        comprobarPerdio();
                        actualizarTablero();
                        break;
                    case KeyEvent.VK_UP:
                    	Negocio.moverArriba();
                        comprobarPerdio();
                        actualizarTablero();
                        break;
                    case KeyEvent.VK_DOWN:
                    	Negocio.moverAbajo();
                        comprobarPerdio();
                        actualizarTablero();
                        break;
                    default:
                        break;
                }
            }

            @Override
            public void keyReleased(KeyEvent e) {
                // No necesitamos implementar este método, pero debe estar presente debido a KeyListener
            }

            @Override
            public void keyTyped(KeyEvent e) {
                // No necesitamos implementar este método, pero debe estar presente debido a KeyListener
            }
        });
		
		
	}
}