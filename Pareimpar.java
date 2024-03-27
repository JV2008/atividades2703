package exercicios2703;

import java.util.Scanner;

public class Pareimpar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner (System.in);
		int valor;
		
		System.out.println("digite um valor que será classificado como Par ou impar");
		valor = ler.nextInt();
		
		if (valor % 2 ==1) {
			System.out.println("O Valor inserido é impar");
		}
		
		else  {
			System.out.println("O Valor inserido é par");
		}
		ler.close();

	}

}
