package Tarefa_4_M1;

import java.util.Scanner;

public class SetorPessoal {
	Funcionario vetor[];
	public int tam = 0;

	Scanner n = new Scanner(System.in);

	public SetorPessoal(int tamanho) {
		tam = tamanho;
		vetor = new Funcionario[0];
		vetor = new Funcionario[tam];
	}

	// letra a
	public void adiciona(Funcionario a) {
		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i] == null) {
				vetor[i] = a;
				break;
			}
		}
	}

	// letra b
	public void imprimir_folha() {
		System.out.println("FOLHA DE PAGAMENTO: ");
		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i] != null) {
				System.out.println("O nome é: " + vetor[i].getNome() + " e o salário é: " + vetor[i].getSalario());
			}
		}
	}

	// letra c.
	public float total_salario() {
		float total = 0;
		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i] != null) {
				total += vetor[i].getSalario();
			}
		}
		return total;
	}

	// letra d.
	public String nomes() {
		String nome = "";
		float maior = 0;
		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i].getSalario() > maior) {
				maior = vetor[i].getSalario();
				nome = vetor[i].getNome();
			}
		}
		return nome;
	}

	// letra e
	public void departamento(int numero) {
		String nome = "", cargo = "";
		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i].getDepartamento() == numero) {
				nome = vetor[i].getNome();
				cargo = vetor[i].getFuncao();
				System.out.println("O nome da pessoa é: " + nome + "e o cargo é: " + cargo);
			}
		}
	}

	// letra f
	public void funcao(String funcao) {
		String nome = "";
		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i].getFuncao().equals(funcao)) {
				nome = vetor[i].getNome();
				System.out.print("\n O nome da pessoa exerce esse cargo é: " + nome);
			}
		}
	}

	// letra g
	public void folha_de_pagamento() {

		Funcionario b[] = new Funcionario[this.vetor.length];
		for (int i = 0; i < this.vetor.length; i++) {
			b[i] = this.vetor[i];
		}

		for (int i = 0; i < b.length - 1; i++) {
			int min = i;
			for (int j = i + 1; j < b.length; j++) {
				if (b[j].getSalario() < b[min].getSalario())
					min = j;
			}
			Funcionario aux = b[min];
			b[min] = b[i];
			b[i] = aux;
		}

		for (int i = 0; i < b.length; i++) {
			System.out.println("\n" + b[i].getNome() + ", " + b[i].getSalario());
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

		System.out.print("\n O total de salários é: " + s.total_salario());

		System.out.print("\n O funcionario com maior salario é: " + s.nomes());

		System.out.print("\n Informe um numero de departamento: ");
		int numero = d.nextInt();
		s.departamento(numero);

		System.out.print("\n Informe uma função:");
		String cargo = d.next();
		s.funcao(cargo);

		s.folha_de_pagamento();

		d.close();

	}

}
