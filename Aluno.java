package entidade;

public class Aluno {
	private int id;
	private String nome;
	private int peso;
	private double altura;
	private int idade;
	
	public Aluno() {
	
	}
	
	public Aluno(int id, String nome, int peso, double altura, int idade) {
		super();
		this.id = id;
		this.nome = nome;
		this.peso = peso;
		this.altura = altura;
		this.idade = idade;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	public int getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public double calcularIMC() {
		return peso / (altura * altura);
	}

	@Override
	public String toString() {
		return "Aluno [id=" + id + ", nome=" + nome + ", peso=" + peso + ", altura=" + altura + ", idade=" + idade
				+ ", calcularIMC()=" + calcularIMC() + "]";
	}
	
	public String toString() {
	
}
	
	