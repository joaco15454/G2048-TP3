package negocio;

import java.awt.Point;
import java.util.HashSet;
import java.util.Set;

public class Negocio {
	
	private static boolean[][] tablero;
	private static int numRandon;
	private static Set<Point> posicionesAsignadas = new HashSet<>(); //POR AHORA BORRABLE, lo dejo por las dudas

	public static void inciarTablero() {
		tablero = new boolean[4][4]; 
		int agregados = 0;
		while (agregados !=2) {   //primeros dos numeros agregados
			elegirPosRandom();
			agregados+=1;
		}
		setearPosiciones();
		
	}
	public static void setearPosiciones() {
		System.out.println("Entre a setear posiciones");
		for (int i = 0; i < tablero.length; i++) {
	        for (int j = 0; j < tablero.length; j++) {

	            if (tablero[i][j] != true) {
	            	tablero[i][j] = false;
	            }

	        }
	    }


	}
	public static void elegirPosRandom() {
		boolean posLibre = false;
		while (!posLibre) {
			int numero1 = (int) (Math.random() * 4);
			int numero2 = (int) (Math.random() * 4);

			if (!tablero[numero1][numero2]) {
				tablero[numero1][numero2] = true;
				posLibre=true;
			}
		}
		
	}
	public static boolean comprobarPosicion(int x, int y) {
		return tablero[x][y];
	}
	
	public static void moverIzquierda() {
	    for (int i = 0; i < tablero.length; i++) {
	        for (int j = 1; j < tablero.length; j++) {
	            if (tablero[i][j]) {
	                // Verificar si la posición hacia la izquierda está vacía
	                if (!tablero[i][j - 1]) {
	                    // Mover la ficha hacia la izquierda
	                    tablero[i][j - 1] = true;
	                    tablero[i][j] = false;
	                    posicionesAsignadas.add(new Point(i, j-1));
	                    posicionesAsignadas.remove(new Point(i,j));

	                }
	            }
	        }
	    }
	}
	public static void moverDerecha() {
	    for (int i = 0; i < tablero.length; i++) {
	        for (int j = tablero.length - 2; j >= 0; j--) {
	            if (tablero[i][j]) {
	            	if (!tablero[i][j + 1]) {
	            		tablero[i][j + 1] = true;
	                    tablero[i][j] = false;
	                    posicionesAsignadas.add(new Point(i, j+1));
	                    posicionesAsignadas.remove(new Point(i,j));

	            	}
	                    
	                }
	            }
	        }
	    }
	
	public static void moverArriba() {
	    for (int j = 0; j < tablero.length; j++) {
	        for (int i = 1; i < tablero.length; i++) {
	            if (tablero[i][j]) {
	                // Verificar si la posición hacia arriba está vacía
	            	if (!tablero[i - 1][j]) {
	            		// Mover la ficha hacia arriba
	                    tablero[i - 1][j] = true;
	                    tablero[i][j] = false;
	                    posicionesAsignadas.add(new Point(i-1, j));
	                    posicionesAsignadas.remove(new Point(i,j));

	                
	            	}
	                    
	            }
	        }
	    }
	}
	public static void moverAbajo() {
	    for (int i = tablero.length - 2; i >= 0; i--) {
	        for (int j = 0; j < tablero.length; j++) {
	            if (tablero[i][j]) {  
	            	if (!tablero[i + 1][j]) {
	            		tablero[i + 1][j] = true;
	                    tablero[i][j] = false;	
	                    posicionesAsignadas.add(new Point(i+1, j));
	                    posicionesAsignadas.remove(new Point(i,j));
	            	}
	                                    
	            }
	        }
	    }
	    
	}
	public static void actualizarPosicion(int i, int j) {
		tablero[i][j] = false;
	}
	public static String sumaTablero(String i) {
		int numeroInt = Integer.parseInt(i);
		System.out.println(numeroInt);
		return "" + numeroInt * 2;
	}
	public static boolean sonIguales(String i, String j) {
		return i.trim().equals(j.trim());
	}
	public static boolean esNuevo(int i, int j) {
		return !posicionesAsignadas.contains(new Point(i,j));
	}
	
	
	public  static String generarRandom() {
		numRandon =(int) (Math.random() * 100);
		return numRandon % 2 == 0 ? "2" : "4";
					
	}

	
}
