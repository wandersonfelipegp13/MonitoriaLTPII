package ex01;

// 1. Faça um método que recebe uma matriz de dimensões n×n (no máximo 100×100), 
// e retorna a soma dos elementos da diagonal principal da matriz.

public class Ex01 {

	public static int soma(int m[][]) {
		int soma = 0;

		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m.length; j++) {
				if (i == j) {
					soma = soma + m[i][j];
				}
			}
		}

		return soma;
	}

	public static void main(String args[]) {

		int m[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		System.out.println(soma(m));

	}

}
/*

1 2 3
4 5 6
7 8 9

a11 a12 a13
a21 a22 a23
a31 a32 a33
  
*/
