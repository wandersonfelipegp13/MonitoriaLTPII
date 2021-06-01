package matriz;

import java.util.Scanner;

public class Ex05 {
	
	public static void junta(int a[], int b[], int n, int c[][]) {
				
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < 2; j++) {
				if ( j == 0 ) {
					c[i][0] = a[i];
				} else {
					c[i][1] = b[i];
				} 
			}
			
		}
	}
	
	public static void main(String arg[]) {
		
		Scanner ent = new Scanner(System.in);

		System.out.print("n: ");
		int n = ent.nextInt();

		int a[] = new int[n];
		int b[] = new int[n];

		for (int i = 0; i < n; i++) {
			System.out.print("a[" + i + "]: ");
			a[i] = ent.nextInt();
		}
		for (int i = 0; i < n; i++) {
			System.out.print("b[" + i + "]: ");
			b[i] = ent.nextInt();
		}
		
		int c[][] = new int[n][2];
		
		junta(a, b, n, c);
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < 2; j++) {
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}

		ent.close();
		
	}
	
	
}

/**

a [1 2 4 5]
b [3 4 6 7]

c

1 3
2 4
4 6
5 7
 
 ij  ij
a00 a01
a10 a11
a20 a21
a30 a31

 * */
