import java.awt.EventQueue;
import negocio.Negocio;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.Point;

import javax.swing.JLabel;
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
public class visual {

	private JFrame frame;
	private static JPanel encabezado = new JPanel();
	private static JPanel body = new JPanel();
	private static JPanel[][] tab2048 = new JPanel[4][4];
	private static JLabel[][] lab2048 = new JLabel[4][4];
	private final JLabel txt_puntuacion = new JLabel("PUNTUACION: 0");
	private static boolean perdio = false;
	private Color colorFondo = new Color(93, 93, 95);
	private final JButton btnNewButton = new JButton("VOLVER");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					visual window = new visual();
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
	public visual() {
		initialize();
	}

	private void iniciarTablero() {
		Negocio.inciarTablero();
		frame = new JFrame();
		frame.setTitle("2048");
		frame.setBounds(100, 100, 499, 356);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new BorderLayout(0, 0));
		//*frame.getContentPane().setLayout(new GridLayout(4, 4, 0, 0));		
		frame.getContentPane().add(encabezado,BorderLayout.NORTH);
		
		frame.getContentPane().add(body);
		frame.setSize(800, 600);
		frame.setResizable(false);

		body.setLayout(new GridLayout(4, 4, 0, 0));
		body.setBackground(new Color(235,206,188));
		encabezado.setBackground(new Color(235,206,188));

				
        
	}
	
	private void cargarTablero() {
		for (int i = 0; i < 4; i++) {
	        for (int j = 0; j < 4; j++) {	        
	           tab2048[i][j] = new JPanel();
	           definirPanel(tab2048[i][j]);	
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
//	private void comprobarEstadoLabel(int i, int j) { //HORRIBLE pero ya estoy quemado, hay que mejorar esta funcion jej
//			//System.out.println(lab2048[i][j]);
//			if (Negocio.comprobarPosicion(i, j)) {			
//				
//				lab2048[i][j].setText(Negocio.devolverEnString(i,j));								
//			} else  {
//				lab2048[i][j].setText("");   //EL PROBLEMA ES QUE ESTA TOMANDO LA NUEVA POSICION QUE ES VACIA EN EL MAYOR DE LOS CASOS, HAY QUE PASARLE EL VALOR DEL LABEL ANTERIUOR
//		
//			}		
//	}
	private void definirPanel(JPanel panel) {
			Border lineBorder = BorderFactory.createLineBorder(new Color(235,206,188), 2);
			panel.setBorder(lineBorder);
			panel.setBackground(new Color(235, 160, 110));
			body.add(panel);
			panel.setLayout(null);
	}
	
	private void definirLabel(JLabel label, JPanel panel) {
		
		label.setFont(new Font("Tahoma", Font.PLAIN, 55));
		label.setBounds((panel.getWidth()+163) / 2, (panel.getHeight() + 87) / 2, 80, 43);

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
	                tab2048[i][j].setBackground(colorFondo);
	                break;
	        }
	    } else {
	        lab2048[i][j].setText("");
	        tab2048[i][j].setBackground(colorFondo);
	    }
	}


	
	private void estructurarHeader() {
			FlowLayout fl_encabezado = new FlowLayout(FlowLayout.LEFT, 100, 10);
			encabezado.setLayout(fl_encabezado);
			encabezado.add(btnNewButton);
			btnNewButton.setFocusable(false);
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					// Cuando se hace clic en el botón "JUGAR", se instancia y muestra la clase Visual
					frame.setVisible(false);
				}
			});

			txt_puntuacion.setFont(new Font("Tahoma", Font.PLAIN, 24));		
			encabezado.add(txt_puntuacion);

	}
	private void actualizarPuntuacion() {
		txt_puntuacion.setText("PUNTUACION: " + Negocio.devolverPuntuacionString());
	}
	public void cambiarVisible() {
		frame.setVisible(true);
	}
	private void comprobarPerdio() {
		 if (Negocio.haPerdido())
			 frame.setVisible(false);
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
            	System.out.println("HOLAA");
                switch (e.getKeyCode()) {
                    case KeyEvent.VK_LEFT:
                        Negocio.moverIzquierda();
                        Negocio.elegirPosRandom();
                        comprobarPerdio();
                        actualizarTablero();
                        break;
                    case KeyEvent.VK_RIGHT:
                    	Negocio.moverDerecha();

                    	Negocio.elegirPosRandom();
                        comprobarPerdio();
                        actualizarTablero();
                        break;
                    case KeyEvent.VK_UP:
                    	Negocio.moverArriba();
                    	Negocio.elegirPosRandom();
                        comprobarPerdio();
                        actualizarTablero();
                        break;
                    case KeyEvent.VK_DOWN:
                    	Negocio.moverAbajo();
                    	Negocio.elegirPosRandom();
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
