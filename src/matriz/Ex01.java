package matriz;

import java.util.Scanner;

public class Ex01 {

	public static int soma(int m[][]) {

		int soma = 0;

		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m.length; j++) {
				if (i == j) {
					soma += m[i][j];
				}
			}
		}

		return soma;

	}

	public static void main(String arg[]) {

		Scanner ent = new Scanner(System.in);
		int n;
		int m[][];

		System.out.print("n: ");
		n = ent.nextInt();

		// int m[][] = {{1, 2}, {3, 4}, {5, 6}};

		if (n <= 100) {

			m = new int[n][n];

			for (int i = 0; i < m.length; i++) {
				for (int j = 0; j < m.length; j++) {
					System.out.print("a[" + (i + 1) + "][" + (j + 1) + "]: ");
					m[i][j] = ent.nextInt();
				}
			}

			System.out.println("Soma: " + soma(m));

		} else {
			System.out.println("Numeros invalidos!");
		}

		ent.close();

	}

}

/**
 * 1 2 3 4 5 6 7 8 9
 * 
 * a11 a12 a21 a22
 * 
 * 5
 */
