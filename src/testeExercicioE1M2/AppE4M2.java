package testeExercicioE1M2;

import javax.swing.JOptionPane;

public class AppE4M2 {
	//variaveis globais
	static Pessoa [] vet = new Pessoa[100];
	static int cont = 0;
	
	public static void main(String [] args) {
		//loop: mostra o menu, le opção escolhida, executa opcção e repete
		int opcao = -1;
		while ( opcao != 0 ) {
			//mostrar menu para opções
			opcao = showMenu();
			switch (opcao) {
			case 1:
				//adicionar: lê valores nome, altura e anoNasc
				String nome = JOptionPane.showInputDialog("Nome: ");
				double altura = Double.parseDouble(JOptionPane.showInputDialog("Altura:"));
				int anoNasc = Integer.parseInt(JOptionPane.showInputDialog("Ano de nascimento:"));
				vet[cont] = new Pessoa(nome, altura, anoNasc);
				cont++; //incrementa a quantidade de elementos no vetor
				break;
			case 2:
				//listar
				for (int i = 0; i < cont; i++) {
					System.out.println(vet[i].nome + " " + vet[i].altura + " " + vet[i].anoNasc);
				}
				System.out.println();
				break;
			case 3:
				//listar apos ano
				int ano = Integer.parseInt(JOptionPane.showInputDialog("Listar a partir do ano: "));
				for (int i = 0; i < cont; i++) {
					if (vet[i].anoNasc >= ano) {
						System.out.println(vet[i].nome + " " + vet[i].altura + " " + vet[i].anoNasc);
					}
				}
				System.out.println();
				break;
			case 0:
				System.out.println("Fim");
				return;
			default:
				System.out.println("Opção inválida");
				break;
			}
		}
		System.out.println("Fim");
	}
	//metodos
	static int showMenu() {
		int resp = Integer.parseInt(JOptionPane.showInputDialog("1: Inserir nova pessoa\n" +
	"2: Listar pessoas\n3:Listar após ano\n0: Encerrar"));
		return resp;
	}
	
}