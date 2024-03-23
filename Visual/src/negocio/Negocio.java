package negocio;
public class Negocio {
	private static boolean[][] tablero;
	private static int numRandon;

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
			System.out.println("Estoy aqui");

			if (tablero[numero1][numero2] != true) {
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
	                }
	            }
	        }
	    }
	}
	public static void moverDerecha() {
	    for (int i = 0; i < tablero.length; i++) {
	        for (int j = tablero.length - 2; j >= 0; j--) {
	            if (tablero[i][j]) {
	                    tablero[i][j + 1] = true;
	                    tablero[i][j] = false;
	                }
	            }
	        }
	    }
	
	public static void moverArriba() {
	    for (int j = 0; j < tablero.length; j++) {
	        for (int i = 1; i < tablero.length; i++) {
	            if (tablero[i][j]) {
	                // Verificar si la posición hacia arriba está vacía
	                    // Mover la ficha hacia arriba
	                    tablero[i - 1][j] = true;
	                    tablero[i][j] = false;
	                
	            }
	        }
	    }
	}
	public static void moverAbajo() {
	    for (int i = tablero.length - 2; i >= 0; i--) {
	        for (int j = 0; j < tablero.length; j++) {
	            if (tablero[i][j]) {             
	                    tablero[i + 1][j] = true;
	                    tablero[i][j] = false;	                
	            }
	        }
	    }
	}
	
	
	
	
	public  static String generarRandom() {
		numRandon =(int) (Math.random() * 100);
		return numRandon % 2 == 0 ? "2" : "4";
					
	}

	
}
