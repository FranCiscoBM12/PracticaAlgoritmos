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
}
