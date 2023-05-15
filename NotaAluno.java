package entidade;

public class NotaAluno {
	private String nome;
	private int matricula;
	
	double n1;
	double n2;
	double n3;
	double n4;
	
	
    public NotaAluno() {
		
	}

	
	public NotaAluno(String nome, int matricula, double n1, double n2, double n3, double n4) {
		super();
		this.nome = nome;
		this.matricula = matricula;
		this.n1 = n1;
		this.n2 = n2;
		this.n3 = n3;
		this.n4 = n4;
	}
	

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getMatricula() {
		return matricula;
	}
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	public double getN1() {
		return n1;
	}
	public void setN1(double n1) {
		this.n1 = n1;
	}
	public double getN2() {
		return n2;
	}
	public void setN2(double n2) {
		this.n2 = n2;
	}
	public double getN3() {
		return n3;
	}
	public void setN3(double n3) {
		this.n3 = n3;
	}
	public double getN4() {
		return n4;
	}
	public void setN4(double n4) {
		this.n4 = n4;
	}
	
	public double calculoMedia() {
		double media;
	    media = (n1 + n2 + n3 + n4)/4;
		return media;
	}
    
	public String verificaAprovado() {
		String aprovado = "Aprovado";
		String reprovado = "Reprovado";
		
		if (calculoMedia() >= 6) {
			return aprovado ;
			}else {
				
			return reprovado;
		}

		}


	@Override
	public String toString() {
		return "O Aluno: " + nome
				+ "Matr�cula: " + matricula
				+ "\n Notas: N1 => "+n1
				+"\n Notas: N2 => "+n2
				+"\n Notas: N3 => "+n3
				+"\n Notas: N4 => "+n4
				+"\n Media: " + calculoMedia()
				+"\n Aprova��o: " + verificaAprovado();
				
				
	}
	
	}

