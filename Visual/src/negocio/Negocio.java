package negocio;

import java.awt.Point;
import java.util.HashSet;
import java.util.Set;

public class Negocio {
	private static int puntuacion = 0;
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
	//******MOVIMIENTOS TABLERO ***********************    
	
	public static void moverIzquierda() {
	    for (int i = 0; i < tablero.length; i++) {
	        for (int j = 1; j < tablero[i].length; j++) {
	            if (tablero[i][j] != 0) {
	                moverNumeroIzquierda(tablero, i, j);
	            }
	        }
	    }
	}
	private static void moverNumeroIzquierda(int[][] tablero, int fila, int columna) {
	    int k = columna;
	    while (k > 0 && tablero[fila][k - 1] == 0) {
	        tablero[fila][k - 1] = tablero[fila][k];
	        tablero[fila][k] = 0;
	        k--;
	    }
	    if (k > 0 && tablero[fila][k - 1] == tablero[fila][k]) {
	        tablero[fila][k - 1] *= 2;
	        tablero[fila][k] = 0;
	        actualizarPuntuacion(tablero[fila][k - 1]);
	    }
	}
	public static void moverDerecha() {
	    for (int i = 0; i < tablero.length; i++) {
	        for (int j = 0; j < tablero[i].length - 1; j++) {
	            if (tablero[i][j] != 0) {
	                moverNumeroDerecha(tablero, i, j);
	            }
	        }
	    }
	}

	
	private static void moverNumeroDerecha(int[][] tablero, int fila, int columna) {
	    int k = columna;
	    while (k < tablero[fila].length - 1 && (tablero[fila][k + 1] == 0)) {
	        tablero[fila][k + 1] = tablero[fila][k];
	        tablero[fila][k] = 0;
	        k++;
	    }
	    if (k < tablero[fila].length - 1 && tablero[fila][k + 1] == tablero[fila][k]) {
	        tablero[fila][k + 1] *= 2;
	        tablero[fila][k] = 0;
	        actualizarPuntuacion(tablero[fila][k + 1]);
	    }
	}


	public static void moverArriba() {
	    for (int j = 0; j < tablero[0].length; j++) {
	        for (int i = 1; i < tablero.length; i++) {
	            if (tablero[i][j] != 0) {
	                moverNumeroArriba(tablero, i, j);
	            }
	        }
	    }
	}
	private static void moverNumeroArriba(int[][] tablero, int fila, int columna) {
	    int k = fila;
	    while (k > 0 && (tablero[k - 1][columna] == 0)) {
	        tablero[k - 1][columna] = tablero[k][columna];
	        tablero[k][columna] = 0;
	        k--;
	    }
	    if (k > 0 && tablero[k - 1][columna] == tablero[k][columna]) {
	        tablero[k - 1][columna] *= 2;
	        tablero[k][columna] = 0;
	        actualizarPuntuacion(tablero[k - 1][columna]);
	    }
	}


	public static void moverAbajo() {
	    for (int j = 0; j < tablero[0].length; j++) {
	        for (int i = tablero.length - 2; i >= 0; i--) {
	            if (tablero[i][j] != 0) {
	                moverNumeroAbajo(tablero, i, j);
	            }
	        }
	    }
	}

	private static void moverNumeroAbajo(int[][] tablero, int fila, int columna) {
	    int k = fila;
	    while (k < tablero.length - 1 && (tablero[k + 1][columna] == 0)) {
	        tablero[k + 1][columna] = tablero[k][columna];
	        tablero[k][columna] = 0;
	        k++;
	    }
	    if (k < tablero.length - 1 && tablero[k + 1][columna] == tablero[k][columna]) {
	        tablero[k + 1][columna] *= 2;
	        tablero[k][columna] = 0;
	        actualizarPuntuacion(tablero[k + 1][columna]);

	    }
	}
	//****** FIN MOVIMIENTOS TABLERO ***********************    

	public static String devolverEnString(int i, int j) {
		return "" + tablero[i][j];
	}
	public static void actualizarPosicion(int i, int j) {
		tablero[i][j] = 0;
	}
	public static void actualizarPuntuacion(int sumatoria) {
		puntuacion += sumatoria;
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
