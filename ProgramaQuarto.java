 package Aplicações;

import java.util.Scanner;


import entidade.Quarto;


public class ProgramaQuarto {
public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	System.out.println("Quantos quartos vocês irão alocar?");
	int qtd = in.nextInt();
	
	Quarto []q1 = new Quarto[10];
	for(int i = 0; i < qtd; i++) {
		System.out.println("Qual quarto você vai escolher?");
		int quarto = in.nextInt();
		System.out.println("Qual o seu nome?");
		String nome = in.next();
		System.out.println("Qual o seu email?");
		String email = in.next();
		q1[quarto] = new Quarto (nome, email);
		
	}
		for(int i = 0; i < q1.length; i++) {
			if (q1[i] != null){
				System.out.println("Quarto " + i +", Nome: " +q1[i].getNome() +", email: " +q1[i].getEmail ());
			}
		}
	

	
	

	}

}
