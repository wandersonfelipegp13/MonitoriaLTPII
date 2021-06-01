package ex01;

public class Ex04 {
	
	public static int busca(double a[], int n, double x) {

		int posicao = -1;
		
		for (int i = 0; i < n; i++) {
			if (a[i] == x) {
				return i;
			}
		}

		return posicao;

	}
	
	public static void main(String args[]) {

		double v[] = { 3.1, 5.45, 7, 2, 8, 9.8, 2, 7.1, 2 };
		
		System.out.println(busca(v, 9, 9.8));
		
	}

}

/*
4. Escreva um método int busca (double a[], int n, double x),
 que procura x no vetor a de n elementos, devolvendo como
 resultado o índice do elemento que é igual a x ou -1 caso
não encontre. Embora possa existir mais de um elemento 
igual a x, devolva o índice do primeiro
encontrado
*/
