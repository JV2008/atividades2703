package exercicios2703;

import java.util.Scanner;

public class Caixaeletronico {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner (System.in);
		long cpf;
		int cpfc,senhac;
		long senha;
		double saldo, saque = 0, sfnl =0;
                                                       
		System.out.println("Digite o seu CPF");
		cpf = ler.nextLong();
		System.out.println("Digite a sua senha");
		senha = ler.nextLong();
		
		cpfc = 478088078;
		senhac = 1011;
		saldo = 100000;
		
	
		
				
		if (cpf == cpfc && senha == senhac) {
			System.out.println("Quanto você quer sacar?");
			saque = ler.nextDouble();
	
			if (saque <=saldo){
				sfnl = saldo-saque;
				System.out.println("Saque concluido");
				System.out.println("Seu saldo atual é de " +sfnl);
				System.out.println("Transação finalizada!!!");
			}			
			else  {
				System.out.println("Saldo insuficiente");
			}
		}
		else  {
			
			System.out.println("Volte mais tarde. ou tente novamente");
			
		}
			
			
		
		
		ler.close();
	}
	
	}


