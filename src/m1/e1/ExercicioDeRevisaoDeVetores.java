package m1.e1;

import java.util.Scanner;

public class ExercicioDeRevisaoDeVetores {

	public static void main(String[] args) {

		// Peça para o usuário informar 7 números e armazene-os em um vetor.

		int n[] = new int[7];

		Scanner leitura = new Scanner(System.in);

		for (int i = 0; i < 7; i++) {
			System.out.print("n[" + i + "]: ");
			n[i] = leitura.nextInt();
		}

		for (int i = 0; i < 7; i++) {
			System.out.print("[" + n[i] + "] ");
		}

		// 2) Mostre o valor da multiplicação do índice pelo seu valor.

		System.out.println("\n");
		for (int i = 0; i < 7; i++) {
			System.out.println(i + " * " + n[i] + " = " + (i * n[i]));
		}

		// 3) Calcule a média aritmética dos valores.

		double s = 0, m;

		for (int i = 0; i < 7; i++) {
			s += n[i];
		}

		m = s / 7;

		System.out.println(m);

		// 4) Mostre as posições dos valores que estão acima do valor da média
		// aritmética.

		for (int i = 0; i < 7; i++) {
			if (n[i] > m)
				System.out.print("[" + i + "] ");
		}

		// 5) Conte quantos valores estão abaixo do valor da média aritmética.

		s = 0;
		for (int i = 0; i < 7; i++) {
			if (n[i] < m)
				s++;
		}
		System.out.println("\n" + s);
		
		leitura.close();

	}

}
