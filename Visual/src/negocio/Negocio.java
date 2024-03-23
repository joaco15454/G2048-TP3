package negocio;
public class Negocio {
	private static boolean[][] tablero;
	private int numRandon;

	public static void inciarTablero() {
		tablero = new boolean[4][4]; 
		int agregados = 0;
		while (agregados !=2) {   //primeros dos numeros agregados
			elegirPosRandom();
			agregados+=1;
		}
		
	}
	public static void setearPosiciones() {
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
	
	public static void main(String[] args) {
		inciarTablero();
		setearPosiciones();
		System.out.println(tablero[3][2]);
	}
}
