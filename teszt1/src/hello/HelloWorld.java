package hello;

public class HelloWorld {

	public static void main(String[] args) {
		System.out.println("Hello There");
		// sysout ctrl space kiir utasitas
		// ctrl shift f rendez

		// leibniz feladat

		int numerator = 1;
		int denomintor = 1;
		double pi = 0;

		for (int i = 1; i <= 1000; i++) {
			if (i % 2 == 1) {
				pi += (double) numerator / denomintor;

			}

			else {
				pi -= (double) numerator / denomintor;
			}
			denomintor = denomintor + 2;

		}

		System.out.println("A pi kozelitett erteke: " + (4 * pi));
		System.out.println();

		// ikerprim feladat
		int db = 0;

		for (int i = 1; i <= 100; i++) {
			for (int j = i + 1; j < 100; j++) {
				System.out.println(i + " " + j);

				if (ikerPrim(i, j)) {
					System.out.println(i + " " + j);
					db++;
				}

			}
		}

		System.out.println("1-100 iker primek szama: " + db);

	}

	private static boolean ikerPrim(int a, int b) {
		if (prim(a) && prim(b) && difference(a, b) == 2) {
			return true;
		}
		return false;
	}

	private static prim(int a) {
		for (int i = 2; i <=a/2; i++) {
			if(a%i ==0) {
				return false;
			}
		}
		return true;
	}

	private static int difference(int a int b) {
		return Math.abs(a-b);
	}
