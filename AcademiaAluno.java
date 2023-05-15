package Aplicações;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AcademiaAluno {

	public static void main(String[] args) {
		List<AcademiaAluno> aluno = new ArrayList<>();
		Scanner in = new Scanner(System.in);
		
		   do {
			   System.out.println("1- cadastrar aluno"
			   +"\n 2 - listar o nome    );
		   }
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  case 2:
			  for(int i = 0; i < aluno.size(); i++) {
				  System.out.println(aluno.get(i).getNome());			  }
		
	}

}
