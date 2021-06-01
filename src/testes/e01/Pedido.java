package testes.e01;

import java.util.Scanner;

public class Pedido {
	private String produtos[];

	Scanner n = new Scanner(System.in);

	public void setProdutos(String[] produtos) {
		this.produtos = produtos;
	}

	public String[] getProdutos() {
		return produtos;

	}

	public void iniciar() {
		int tamanho = 10;
		produtos = new String[tamanho];
	}

	public void adicionarProduto() {
		String nome = "";

		while (!nome.equals("fim")) {
			System.out.print("\n Informe um produto: ");
			nome = n.next();

			for (int i = 0; i < produtos.length; i++) {
				if (produtos[i] == null) {
					produtos[i] = nome;
					break;
				}
			}
		}

	}

	public void calculaValor() {
		int cont = 0;
		for (int i = 0; i < produtos.length; i++) {
			if (produtos[i] != null) {
				cont++;
			}

		}
		System.out.print("\n A contagem : " + cont);
	}

	public static void main(String args[]) {
		Pedido p = new Pedido();

		p.iniciar();

		p.adicionarProduto();

		p.calculaValor();

	}

}