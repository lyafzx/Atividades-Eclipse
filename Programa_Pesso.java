package Aplica��es;

import java.util.Scanner;

import entidade.Pessoa; //declara dois imports porque s�o pacotes diferentes e serve para ligar os dois

public class Programa_Pesso {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Quantas pessoas ser�o?"); // estamos pedindo a quantidade de pessoas 
		int qtd = in.nextInt(); // declarando um n�mero indetermin�vel de pessoas que o usu�rio ir� digitar
		
		Pessoa []p1 = new Pessoa[qtd];
		for(int i = 0; i < p1.length; i++) {
			System.out.println("Qual o nome da pessoa?");// estamos pedindo o nome do usu�rio
			c// declarando a string
			System.out.println("Qual a idade?"); // pedindo a idade do usu�rio
			int idade = in.nextInt(); // declarando a vari�vel int
			p1[i] = new Pessoa (nome, idade); // criando o objeto na posi��o "i"
		}
		for(int i = 0; i < p1.length; i++) { // for para percorrer vetor pessoa
			if (p1[i].getIdade()<18) { // verificar se a pessoa � menor de idade ou n�o
				System.out.println("O(a) " + p1[i].getNome() +" n�o pode beber, pois tem: " + p1[i].getIdade() +" anos"); // declarando a idade
		}
	}
		in.close();
}

}
