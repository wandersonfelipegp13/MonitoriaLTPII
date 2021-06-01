package matriz;

import java.util.Scanner;

public class Ex03 {

	public static int conta(int a[], int n, int x) {

		int s = 0;

		for (int i = 0; i < n; i++) {
			if (x == a[i]) {
				s++;
			}
		}

		return s;
	}

	public static void main(String arg[]) {
		Scanner ent = new Scanner(System.in);

		System.out.print("n: ");
		int n = ent.nextInt();

		int a[] = new int[n];

		System.out.print("x: ");
		int x = ent.nextInt();

		for (int i = 0; i < n; i++) {
			System.out.print("a[" + (i + 1) + "]: ");
			a[i] = ent.nextInt();
		}

		System.out.println("Soma: "+ conta(a, n, x));

		ent.close();

	}

}
