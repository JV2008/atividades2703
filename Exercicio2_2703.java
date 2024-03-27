package exercicios2703;

import java.util.Scanner;

public class Exercicio2_2703 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner ler = new Scanner (System.in);
		
		int valor;
		
		System.out.println("digite um valor que será classificado como positivo ou negativo");
		valor = ler.nextInt();
		
		if (valor >0 ) {
			System.out.println("O Valor inserido é positivo");
		}
		else if (valor ==0 ) {
			System.out.println("O Valor inserido é 0 ");
		}
		else  {
			System.out.println("O Valor inserido é negativo");
		}
		ler.close();
	}

}
