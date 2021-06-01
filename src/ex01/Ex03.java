package ex01;

public class Ex03 {

	public static int conta(int a[], int n, int x) {
		int conta = 0;

		for (int i = 0; i < n; i++) {
			if (a[i] == x) {
				conta = conta + 1;
			}
		}

		return conta;

	}

	public static void main(String args[]) {

		int v[] = { 3, 5, 7, 2, 8, 9, 2, 7, 2 };
		
		System.out.println(conta(v, 9, 7));
		
		
	}

}

/*
 * 3. Escreva um método int conta (a, n, x) que devolve como resultado, o número
 * de elementos iguais a x que aparecem no vetor a de n elementos
 */