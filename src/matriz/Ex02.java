package matriz;

import java.util.Scanner;

public class Ex02 {
	
	public static void quadrado(int n) {
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i == j) {
					System.out.print("+");
				} else {
					System.out.print("x");
				}
			}
			System.out.println();
		}
	} 
	
	public static void main(String arg[]) {
		
		Scanner ent = new Scanner(System.in);

		System.out.print("n: ");
		int n = ent.nextInt();
		quadrado(n);

		ent.close();
	}


}
