package testeExercicioE1M2;

public class Principal {
	//variáveis globais
	//static Pessoa[] vet = new Pessoa[100];
	//static int cont = 0; // quantidade de pessoas no vetor
	
	/*public static void main(String[] args) {
		Pessoa[] vet = new Pessoa[100];
		int cont = 0;
		int opcao = 1;
		while (opcao != 0) {
			opcao = showMenu();
			switch (opcao) {
			case 1:
				adicionaPessoa(vet, cont);
				break;
			case 2:
				listaPessoas();
				break;
			case 3:
				listaPessoasAposAno();
				break;
			}
		}
	}*/

	/*static int showMenu() {
		String resp = JOptionPane.showInputDialog(
				"Menu:\n" + "1: Inserir nova pessoa\n" + "2: Listar\n" + "3: Listar após ano:\n" + "0: Encerrar\n");
		return Integer.parseInt(resp);
	}*/

	/*static void adicionaPessoa(Pessoa [] vet, int cont) {
		String resp, nome;
		int anoNasc;
		double altura;
		nome = JOptionPane.showInputDialog("Nome: ");
		resp = JOptionPane.showInputDialog("Altura: ");
		altura = Double.parseDouble(resp);
		resp = JOptionPane.showInputDialog("Ano de Nascimento: ");
		anoNasc = Integer.parseInt(resp);
		vet[cont] = new Pessoa(nome, altura, anoNasc);
		cont++;
	}
	/*static void listaPessoas() {
		for (int i = 0; i < cont; i++) {
			System.out.println(vet[i].nome + ", altura: " + vet[i].altura);
		}
	}
	/**
	 * listar os nomes das pessoas que nasceram depois de um certo ano.
	 */
	/*static void listaPessoasAposAno() {
		int ano;
		String resp = JOptionPane.showInputDialog("Ano: ");
		ano = Integer.parseInt(resp);
		for (int i = 0; i < cont; i++) {
			if (vet[i].anoNasc > ano )
				System.out.println(vet[i].nome + ", altura: " + vet[i].altura);
		}
	}*/
}