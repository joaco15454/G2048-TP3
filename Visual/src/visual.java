import java.awt.EventQueue;
import negocio.Negocio;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.border.BevelBorder;
import java.awt.Font;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
public class visual {

	private JFrame frame;
	private static JPanel[][] tab2048 = new JPanel[4][4];
	private static JLabel[][] lab2048 = new JLabel[4][4];
	private static int primerInicio = 0;

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
		frame.getContentPane().setLayout(new GridLayout(4, 4, 0, 0));
        

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
	           comprobarEstadoLabel(i, j);	           
	        }
		}
	}
	private void comprobarEstadoLabel(int i, int j) { //HORRIBLE pero ya estoy quemado, hay que mejorar esta funcion jeje
		if (Negocio.comprobarPosicion(i, j)) {
				if (primerInicio  < 2 ) {
					lab2048[i][j].setText("2"); 
					primerInicio+=1;
				}else {
					lab2048[i][j].setText(Negocio.generarRandom());
				}	           
     } else {
         lab2048[i][j].setText("");
     }
	}
	private void definirPanel(JPanel panel) {
			panel.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(0, 0, 255), new Color(0, 0, 255), new Color(0, 0, 255), new Color(0, 0, 255)));
			panel.setBackground(new Color(255, 128, 192));
			frame.getContentPane().add(panel);
			panel.setLayout(null);
	}
	
	private void definirLabel(JLabel label, JPanel panel) {
		
		label.setFont(new Font("Tahoma", Font.PLAIN, 35));
		label.setBounds(40, 25, 80, 43);
		panel.add(label);
	}
	
	
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		iniciarTablero();
		cargarTablero();
		
		frame.addKeyListener(new KeyListener() {
            @Override
            public void keyPressed(KeyEvent e) {
                // Manejar la tecla presionada
                switch (e.getKeyCode()) {
                    case KeyEvent.VK_LEFT:
                        System.out.println("Flecha izquierda presionada");
                        Negocio.moverIzquierda();
                        actualizarTablero();
                        break;
                    case KeyEvent.VK_RIGHT:
                    	Negocio.moverDerecha();
                        actualizarTablero();
                        break;
                    case KeyEvent.VK_UP:
                    	Negocio.moverArriba();
                        actualizarTablero();
                        break;
                    case KeyEvent.VK_DOWN:
                    	Negocio.moverAbajo();
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
