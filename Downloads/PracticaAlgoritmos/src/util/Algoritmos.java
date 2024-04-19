package util;

public abstract class Algoritmos {
	/**
	 * 
	 * @param n
	 * @return devuelve el número de fibonacci de n.
	 */
	public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            int a = 0;
            int b = 1;
            int temp;
        for (int i = 2; i <= n; i++) {
                temp = a + b;
                a = b;
                b = temp;
            }
            return b;
        }
        }
	/**
	 * 
	 * @param numero
	 * @return devuelve el factorial de numero.
	 */
	public static int factorial(int numero) {
		int factorial = 1;
		for(int i=1;i<=numero;i++) {
			factorial*=i;		
		}
		return factorial;		
	}
	/**
	 * 
	 * @param numero
	 * @return 	devuelve true o false en función de si es primo o no.
	 */
	public static boolean esPrimo(int numero) {
		if (numero <= 1) {
            return false;
        }
        if (numero == 2) {
            return true;
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }
}
