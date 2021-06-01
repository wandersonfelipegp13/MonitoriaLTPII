package matriz;

import java.util.Scanner;

public class Ex04 {
	
	public static int busca(double a[], int n, double x) {
		
		int pos = -1;
		
		for (int i = 0; i < n; i++) {
			if(a[i] == x)
				return i;
		}
		
		return pos;
		
	}
	
	public static void main(String arg[]) {
		
		Scanner ent = new Scanner(System.in);

		System.out.print("n: ");
		int n = ent.nextInt();

		double a[] = new double[n];

		System.out.print("x: ");
		double x = ent.nextInt();

		for (int i = 0; i < n; i++) {
			System.out.print("a[" + i + "]: ");
			a[i] = ent.nextDouble();
		}

		System.out.println("Posicao: "+ busca(a, n, x));

		ent.close();
		
	}
	

}
