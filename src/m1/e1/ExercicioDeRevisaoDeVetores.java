package m1.e1;

import java.util.Scanner;

public class ExercicioDeRevisaoDeVetores {

	public static void main(String[] args) {

		// Pe�a para o usu�rio informar 7 n�meros e armazene-os em um vetor.

		int n[] = new int[7];

		Scanner leitura = new Scanner(System.in);

		for (int i = 0; i < 7; i++) {
			System.out.print("n[" + i + "]: ");
			n[i] = leitura.nextInt();
		}

		for (int i = 0; i < 7; i++) {
			System.out.print("[" + n[i] + "] ");
		}

		// 2) Mostre o valor da multiplica��o do �ndice pelo seu valor.

		System.out.println("\n");
		for (int i = 0; i < 7; i++) {
			System.out.println(i + " * " + n[i] + " = " + (i * n[i]));
		}

		// 3) Calcule a m�dia aritm�tica dos valores.

		double s = 0, m;

		for (int i = 0; i < 7; i++) {
			s += n[i];
		}

		m = s / 7;

		System.out.println(m);

		// 4) Mostre as posi��es dos valores que est�o acima do valor da m�dia
		// aritm�tica.

		for (int i = 0; i < 7; i++) {
			if (n[i] > m)
				System.out.print("[" + i + "] ");
		}

		// 5) Conte quantos valores est�o abaixo do valor da m�dia aritm�tica.

		s = 0;
		for (int i = 0; i < 7; i++) {
			if (n[i] < m)
				s++;
		}
		System.out.println("\n" + s);
		
		leitura.close();

	}

}
