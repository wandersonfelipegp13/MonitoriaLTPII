package testes.e02;

import java.util.Scanner;

public class SetorPessoal {
	Funcionario vetor[];
	public int tam = 0;

	Scanner n = new Scanner(System.in);

	public SetorPessoal(int tamanho) {
		vetor = new Funcionario[tam];
		vetor = new Funcionario[tamanho];
	}

	public void adiciona(Funcionario a) {
		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i] == null) {
				vetor[i] = a;
				break;
			}
		}
	}

	public void imprimir_folha() {
		System.out.println("FOLHA DE PAGAMENTO: ");
		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i] != null) {
				System.out.println("O nome é: " + vetor[i].getNome() + " e o salário é: " + vetor[i].getSalario());
			}
		}
	}

	public static void main(String args[]) {
		Scanner d = new Scanner(System.in);

		System.out.println("\n Informe um tamanho para o vetor: ");
		int num = d.nextInt();
		SetorPessoal s = new SetorPessoal(num);

		for (int i = 0; i < num; i++) {
			
			Funcionario a = new Funcionario();
			
			System.out.println("Informe a matricula do empregado: ");
			a.setMatricula(d.nextInt());
			System.out.println("Informe o nome do empregado: ");
			a.setNome(d.next());
			System.out.println("Informe o numero do departamento: ");
			a.setDepartamento(d.nextInt());
			System.out.println("Informe o salário do mesmo: ");
			a.setSalario(d.nextFloat());
			System.out.println("Informe a função: ");
			a.setFuncao(d.next());
			System.out.println("******************************");
			s.adiciona(a);
		}
		
		s.imprimir_folha();
		
		d.close();

	}

}
