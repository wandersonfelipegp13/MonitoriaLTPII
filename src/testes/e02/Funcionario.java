package testes.e02;

public class Funcionario {
	
	private int matricula;
	private String nome;
	private int departamento;
	private float salario;
	private String funcao;

	public Funcionario(int departamento, int matricula, String nome, float salario, String funcao) {
		this.departamento = departamento;
		this.matricula = matricula;
		this.nome = nome;
		this.salario = salario;
		this.funcao = funcao;

	}

	public Funcionario() {

	}

	public void setDepartamento(int departamento) {
		this.departamento = departamento;
	}

	public int getDepartamento() {
		return departamento;
	}

	public void setFuncao(String funcao) {
		this.funcao = funcao;
	}

	public String getFuncao() {
		return funcao;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setSalario(float salario) {
		this.salario = salario;
	}

	public float getSalario() {
		return salario;
	}

}
