package m1.e2;

import java.util.Scanner;

public class ExercicioDeFixacaoMetodosEVetores {

	public static void main(String[] args) {
		// Peça para o usuário informar 7 números e armazene-os em um vetor.
		int n[] = new int[7];
		// Crie métodos que recebam um vetor passado como parâmetro, e:
		lerArmazenar(n);
		imprimir(n);
		System.out.println("\nSOMA 	= " + soma(n));
		System.out.println("MEDIA 	= " + media(n));
		System.out.println("<MEDIA	= " + abaixoDaMedia(n));
	}

	// 1) Leia e armazene valores no vetor.
	public static void lerArmazenar(int[] n) {
		Scanner leitura = new Scanner(System.in);
		for (int i = 0; i < 7; i++) {
			System.out.print("n[" + i + "]: ");
			n[i] = leitura.nextInt();
		}
		leitura.close();
	}

	// 2) Imprima os valores armazenados no vetor.
	public static void imprimir(int[] n) {
		for (int i = 0; i < 7; i++) {
			System.out.print("[" + n[i] + "] ");
		}
	}

	// 3) Retorne o valor da soma dos números armazenados no vetor.
	public static int soma(int[] n) {
		int s = 0;
		for (int i = 0; i < 7; i++)
			s += n[i];
		return s;
	}

	// 4) Retorne a média aritmética dos valores armazenados no vetor.
	public static double media(int[] n) {
		return (soma(n) / n.length);
	}

	// 5) Retorne quantos valores estão abaixo do valor da média aritmética.*/
	public static double abaixoDaMedia(int[] n) {
		int v = 0;
		double m = media(n);
		for (int i = 0; i < n.length; i++)
			if (n[i] < m)
				v++;
		return v;
	}
}
