/**
 * @author Jorge 
 *
 * */
public class PrimeraClase {

	public static void main(String ars[]) {
		
		// numeros enteros
		byte numero = 0;
		short numero2 = 0;
		int numero3 = 0;
		long numero4 = 0;


		// decimales
		float numero5  = 10.0f;
		double numero6 = 10.0;

		//literales
		char letra1 = '$';
		String letra = "Hello world";
		
		// booleano
		boolean estaVivo = true;


		// constantes
		final int CONEXIONES_ADMINTIDAS = 10;




		// Casting Implicito y explicito
		


		int vidas = 3;
		long vidasConCrack = vidas;


		long planetas = 8;
	        short conVida = (short) planetas;

		// operadores aritmeticos + - * / %

	       // ()
	       // * / %
	       // + -
	       
		// estructuras de control 
		
		boolean expr = false;
		
		if(expr){
			System.out.println("Hello world");
		} else if (1 > 2) {
			System.out.println("Adios");
		} else if ( 20 == 20) {
			System.out.println("Adios 2");
		} else {
			System.out.println("Adios 3");
		}

		// a == b
		// a > b
		// a < b
		// a >= b
		// a <= b
		// a != b
		
		int a = 10, b = 20, c = 45;
		if(a == b) {	
			System.out.println("Si");
		}

		if(a > b) {
                        System.out.println("Si");
                }

		if(a < b) {
                        System.out.println("Si");
                }

		
		//operadores relacionales
		// && - & -- and
		// || - | -- or
		// ! -- nor

		String param = null;
                System.out.println(!(param == null));


	}

}
