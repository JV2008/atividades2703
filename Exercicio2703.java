package exercicios2703;

import java.util.Scanner;

public class Exercicio2703 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner ler = new Scanner (System.in);
		
		int valor;
		
		System.out.println("digite um valor corrrespondente à um mês");
		valor = ler.nextInt();
		
		if (valor ==1 ) {
			System.out.println("O mês definido é Janeiro");
		}
		else if (valor ==2 ) {
			System.out.println("O mês definido é Fevereiro");
		}
		else if (valor ==3 ) {
			System.out.println("O mês definido é Março");
		}
		else if (valor ==4 ) {
			System.out.println("O mês definido é Abril");
		}
		else if (valor ==5 ) {
			System.out.println("O mês definido é Maio");
		}
		else if (valor ==6 ) {
			System.out.println("O mês definido é Junho");
		}
		else if (valor ==7 ) {
			System.out.println("O mês definido é Julho");
		}
		else if (valor ==8 ) {
			System.out.println("O mês definido é Agosto");
		}
		else if (valor ==9 ) {
			System.out.println("O mês definido é Setembro");
		}
		else if (valor ==10) {
			System.out.println("O mês definido é Outubro");
		}
		else if (valor ==11 ) {
			System.out.println("O mês definido é Novembro");
		}
		else if (valor ==12 ) {
			System.out.println("O mês definido é Dezembro");
		}
		else if (valor >13 ) {
			System.out.println("Mês inválido");
	
		}
		
        
	   ler.close();
		
	}




}
