package ex01;

public class Ex05 {
	
	public static void junta (int a[], int b[], int n, int c[][]) {
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < 2; j++) {
				if (j==0) {
					c[i][j] = a[i];
				} else {
					c[i][j] = b[i];
				}
			}
		}
	}
	
	public static void main(String arg[]) {
		
		int a[] = {1, 2, 4, 5};
		int b[] = {3, 4, 6, 7};
		
		int c[][] = new int[4][2];
		
		junta(a, b, 4, c);
		
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 2; j++) {
				System.out.print(c[i][j]+ " ");
			}
			System.out.print("\n");
		}
		
	}

}
/*

5. Escreva um programa com a seguinte função:
void junta (int a[], int b[], int n, int c[] [2]) 
que recebe os vetores a e b de n elementos e devolve
a matriz c de n linhas e 2 colunas elementos contendo a junção de a e b,
ou seja, os elementos que estão em a e b formarão as 
colunas 1 e 2 da matriz.

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

*/