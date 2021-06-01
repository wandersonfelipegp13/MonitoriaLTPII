package testes.e01;

import java.util.Scanner;

public class Nome {

	public String produtos[] = new String[10];

	public void adicionaProduto() {

		Scanner leitura = new Scanner(System.in);

		String nome = "";

		while (!nome.equals("fim")) {

			System.out.print("\nProduto: ");
			nome = leitura.next();

			for (int i = 0; i < produtos.length; i++) {
				if (produtos[i] == null) {
					produtos[i] = nome;
					break;
				}
			}

		}
		
		leitura.close();
	}

	public static void main(String[] args) {

		Nome t = new Nome();
		
		t.adicionaProduto();
		
		for (int j = 0; j < t.produtos.length; j++) {
			System.out.println(t.produtos[j]);
		}

	}

}
