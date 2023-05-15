package Aplicações;

import java.util.Scanner;

import entidade.Pessoa; //declara dois imports porque são pacotes diferentes e serve para ligar os dois

public class Programa_Pesso {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Quantas pessoas serão?"); // estamos pedindo a quantidade de pessoas 
		int qtd = in.nextInt(); // declarando um número indeterminável de pessoas que o usuário irá digitar
		
		Pessoa []p1 = new Pessoa[qtd];
		for(int i = 0; i < p1.length; i++) {
			System.out.println("Qual o nome da pessoa?");// estamos pedindo o nome do usuário
			c// declarando a string
			System.out.println("Qual a idade?"); // pedindo a idade do usuário
			int idade = in.nextInt(); // declarando a variável int
			p1[i] = new Pessoa (nome, idade); // criando o objeto na posição "i"
		}
		for(int i = 0; i < p1.length; i++) { // for para percorrer vetor pessoa
			if (p1[i].getIdade()<18) { // verificar se a pessoa é menor de idade ou não
				System.out.println("O(a) " + p1[i].getNome() +" não pode beber, pois tem: " + p1[i].getIdade() +" anos"); // declarando a idade
		}
	}
		in.close();
}

}
