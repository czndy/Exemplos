package exercicioSegundoSemestre;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		float valorUn [] = new float [10];
		int qtdVendida[] = new int [10];
		double valorTotalObj[] = new double [10];
		
		for(int i = 0; i<10; i++){
			System.out.println("Digite o valor do produto " + (i+1));
			
			valorUn[i] = scn.nextFloat();
			if(valorUn[i]<=0){
			{System.out.println("Não é possível digitar um valor de produto igual ou menor que zero.");
			i--;}
			}
		}
		for(int i = 0; i<10; i++){
			System.out.println("Quantos produtos do tipo " + (i+1) + " foram vendidos?");
			qtdVendida[i] = scn.nextInt();
			if(qtdVendida[i]<0){
				{System.out.println("Não é aceitável uma quantidade vendida menor que zero.");
				i--;}
				}
		}
		for(int i = 0; i<10; i++){
			valorTotalObj[i] = valorUn[i]*qtdVendida[i];
		}
		
		System.out.println("RELATÓRIO\n");
		
		for(int i = 0; i<10; i++){
			System.out.println("Quantidade vendida do produto " + (i+1) + " = " + qtdVendida[i]);
			System.out.println("Valor unitario do produto " + (i+1) + " = " + valorUn[i]);
			System.out.println("Valor total vendido do produto " + (i+1) + " = " + valorTotalObj[i]);
			System.out.println("------------------------------------------");
		}
		
		
		
	}
	 	
	
}
