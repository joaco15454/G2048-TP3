package negocio;

import java.awt.Point;
import java.util.HashSet;
import java.util.Set;

public class Negocio {
	
	private static int[][] tablero;
	private static int numRandon;
	private static Set<Point> posicionesAsignadas = new HashSet<>(); //POR AHORA BORRABLE, lo dejo por las dudas

	public static void inciarTablero() {
		tablero = new int[4][4]; 
		int agregados = 0;
		while (agregados !=2) {   //primeros dos numeros agregados
			elegirPosRandom();
			agregados+=1;
		}
		
	}
	/*public static void setearPosiciones() {
		System.out.println("Entre a setear posiciones");
		for (int i = 0; i < tablero.length; i++) {
	        for (int j = 0; j < tablero.length; j++) {

	            if (tablero[i][j] != null) {
	            	tablero[i][j] = 0;
	            }

	        }
	    }


	}*/
	public static void elegirPosRandom() {
		boolean posLibre = false;
		while (!posLibre) {
			int numero1 = (int) (Math.random() * 4);
			int numero2 = (int) (Math.random() * 4);

			if (tablero[numero1][numero2] == 0) {
				tablero[numero1][numero2] = generarRandom();
				posLibre=true;
			}
		}
		
	}
	public static boolean comprobarPosicion(int x, int y) {
		return tablero[x][y] != 0;
	}
	
	 public static void moverIzquierda() {
	        for (int i = 0; i < tablero.length; i++) {
	            for (int j = 1; j < tablero[i].length; j++) {
	                if (tablero[i][j] != 0) { // Verificar si la posición contiene un número distinto de cero
	                    int k = j - 1;
	                    while (k >= 0 && tablero[i][k] == 0) {
	                        // Mover el número hacia la izquierda mientras haya espacios vacíos (0)
	                        tablero[i][k] = tablero[i][k + 1];
	                        tablero[i][k + 1] = 0;
	                        k--;
	                    }
	                    // Si el número a la izquierda es igual, llamar al método sumar
	                    if (k >= 0 && tablero[i][k] == tablero[i][k + 1]) {
	                    	System.out.print("ES ACA");
	                        tablero[i][k] *= 2; // Duplicar el valor
	                        tablero[i][k + 1] = 0; // Vaciar la posición derecha
	                        // Aquí podrías llamar al método sumar si lo tienes implementado
	                        // sumar(tablero[i][k]);
	                    }
	                }
	            }
	        }
	    }
	public static void moverDerecha() {
        for (int i = 0; i < tablero.length; i++) {
            for (int j = tablero[i].length - 2; j >= 0; j--) {
                if (tablero[i][j] != 0) { // Verificar si la posición contiene un número distinto de cero
                    int k = j + 1;
                    while (k < tablero[i].length && tablero[i][k] == 0) {
                        // Mover el número hacia la derecha mientras haya espacios vacíos (0)
                        tablero[i][k] = tablero[i][k - 1];
                        tablero[i][k - 1] = 0;
                        k++;
                    }
                }
            }
        }
    }
	
	public static void moverArriba() {
        for (int j = 0; j < tablero[0].length; j++) {
            for (int i = 1; i < tablero.length; i++) {
                if (tablero[i][j] != 0) { // Verificar si la posición contiene un número distinto de cero
                    int k = i - 1;
                    while (k >= 0 && tablero[k][j] == 0) {
                        // Mover el número hacia arriba mientras haya espacios vacíos (0)
                        tablero[k][j] = tablero[k + 1][j];
                        tablero[k + 1][j] = 0;
                        k--;
                    }
                }
            }
        }
    }

	public static void moverAbajo() {
        for (int i = tablero.length - 2; i >= 0; i--) {
            for (int j = 0; j < tablero[0].length; j++) {
                if (tablero[i][j] != 0) { // Verificar si la posición contiene un número distinto de cero
                    int k = i + 1;
                    while (k < tablero.length && tablero[k][j] == 0) {
                        // Mover el número hacia abajo mientras haya espacios vacíos (0)
                        tablero[k][j] = tablero[k - 1][j];
                        tablero[k - 1][j] = 0;
                        k++;
                    }
                }
            }
        }
    }
	public static String devolverEnString(int i, int j) {
		return "" + tablero[i][j];
	}
	public static void actualizarPosicion(int i, int j) {
		tablero[i][j] = 0;
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
	
	
	public  static int generarRandom() {
		numRandon =(int) (Math.random() * 100);
		return numRandon % 2 == 0 ? 2 : 4;
					
	}

	
}
