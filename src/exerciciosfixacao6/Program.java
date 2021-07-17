package exerciciosfixacao6;

import java.util.Scanner;

import entities.Quartos;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Quantos quartos serão alugados?");
				
		Quartos[] vect = new Quartos[9];// INFORMADO QUE SERIAM 10 QUARTOS
		
		int rented = sc.nextInt(); //QUANTOS QUARTOS SERAO ALUGADOS
		
		for (int i = 0 ; i<rented; i++) //CODIGO PARA PREENCHER OS 3 QUARTOS
		{
			sc.nextLine();
			String name = sc.nextLine();
			String email = sc.nextLine();
			int room = sc.nextInt();//QUAIS QUARTOS/NUMERO DE ARRANJO SERA PREENCHIDO
					
			vect[room] = new Quartos(name, email, room);
			// AQUI FIZ COM Q A INFROMAÇÃO FOSSE GUARDADA NO QUARTO ESPECIFICO,
			// POR ISSO O VECT ROOM, LOGO SE ESCOLHI O 4 QUARTO ELE ARMAZENA 
			//NA QUARTA VARIAVEL CRIADA PELO ARRANJO
			
		}		
		
		System.out.println("quer exibir qual quarto?");
		int numeroquarto = sc.nextInt();
		System.out.println(vect[numeroquarto].getName());
		
		for (int i=0; i<vect.length; i++) { // AQUI A VERIFICAÇÃO PRA PASSAR POR CADA ARRANJO
			
			if (vect[i] != null) { // AQUI FOI O IF PRA EXIBIR APENAS AQELES Q O ARRANJO CONTEM ALGO
				System.out.println(vect[i].toString());
				
			}
		
		}
		
		
		
		
		
		
		
		
		
		
		sc.close();

	}

}
