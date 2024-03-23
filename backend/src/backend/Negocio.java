package backend;


public class Negocio {
	private static boolean[][] tablero;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hola");
	}

	public static void inciarTablero() {
		tablero = new boolean[4][4]; 
		agregarRandom();
	}
	public static void agregarRandom() {
		for (int i = 0; i < tablero.length; i++) {
	        for (int j = 0; j < tablero.length; j++) {
	            if (((int)(Math.random() * 100) + 1) % 2 == 0) {
	            	tablero[i][j] = true;
	            } else {
	            	tablero[i][j] = false;
	            }
	        }
	    }

	}
}
