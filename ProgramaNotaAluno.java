package Aplicações;

import java.util.Scanner;

import entidade.NotaAluno;


public class ProgramaNotaAluno {

	public static void main(String[] args) {
		NotaAluno aluno = new NotaAluno();
		
		/*aluno.setNome("Maria");
		aluno.setMatricula(1020);
				
		aluno.setN1(5);
		aluno.setN2(9);
		aluno.setN3(4);
		aluno.setN4(8);
		
		double m1 = aluno.calculoMedia();
		System.out.println(m1);
		System.out.println(aluno.calculoMedia());
		System.out.println (aluno);*/
		
		Scanner in = new Scanner(System.in); //para receber informações do usuário
		
		/*NotaAluno aluno1; 
		aluno1 = new NotaAluno();
		//declarando uma variável
		//aluno =  new NotaAluno(); mesma coisa
		
		System.out.println("Olá, qual o seu nome?");
		aluno1.setNome(in.next()); //o Scanner já está dentro, não precisa criar de novo
		System.out.println("Qual sua matrícula?");
		aluno1.setMatricula(in.nextInt());
		System.out.println("Qual sua nota N1?");
		aluno1.setN1(in.nextDouble());
		System.out.println("Qual sua nota N2?");
		aluno1.setN2(in.nextDouble());
		System.out.println("Qual sua nota N3?");
		aluno1.setN3(in.nextDouble());
		System.out.println("Qual sua nota N4?");
		aluno1.setN4(in.nextDouble());
		
		System.out.println(aluno1);*/
		
		/*System.out.println(System.in);
		NotaAluno []alunos = new NotaAluno[2]; 
		
		alunos[0] = new NotaAluno();
		alunos[0].setNome("José");
		alunos[0].setMatricula(1030);
		alunos[0].setN1(8);
		alunos[0].setN2(7);
		alunos[0].setN3(9);
		alunos[0].setN4(8);
		
		alunos[1] = new NotaAluno("Maria", 1020, 5, 9, 4, 8);*/
		
		System.out.println("Quantos alunos serão cadastrados?");
		int qtd = in.nextInt();
		
		NotaAluno []alunos = new NotaAluno[qtd];
		
		for(int i = 0; i < alunos.length; i++) {
			alunos[i] = new NotaAluno();
			System.out.println("Olá, qual o seu nome?");
			alunos[i].setNome(in.next());
			System.out.println("Qual sua matrícula?");
			alunos[i].setMatricula(in.nextInt());
			System.out.println("Qual sua nota N1?");
			alunos[i].setN1(in.nextDouble());
			System.out.println("Qual sua nota N2?");
			alunos[i].setN2(in.nextDouble());
			System.out.println("Qual sua nota N3?");
			alunos[i].setN3(in.nextDouble());
			System.out.println("Qual sua nota N4?");
			alunos[i].setN4(in.nextDouble());
			
		}
		
		for(int i = 0; i < alunos.length; i++) {
			System.out.println("Olá, qual o seu nome?");
			String nome = in.next();
			System.out.println("Qual sua matrícula?");
			int matricula = in.nextInt();
			System.out.println("Qual sua nota N1?");
			double n1 = in.nextDouble();
			System.out.println("Qual sua nota N2?");
			double n2 = in.nextDouble();
			System.out.println("Qual sua nota N3?");
			double n3 = in.nextDouble();
			System.out.println("Qual sua nota N4?");
			double n4 = in.nextDouble();
			alunos[1] = new NotaAluno(nome, matricula, n1, n2, n3, n4);
			
		}
		
		for(int i = 0; i < alunos.length; i++) {
			System.out.println(alunos[1]);
		}
			
			
		System.out.println(alunos[0]);
		System.out.println(alunos[1]);
		
	
		
		in.close();
	}

}
