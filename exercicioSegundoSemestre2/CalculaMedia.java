package exercicioSegundoSemestre2;
import java.util.Scanner;
public class CalculaMedia {

	public static void main(String[] args) {
		
		double nota1,nota2,nota3,resultado;
		String escolha;
		
		Scanner scn = new Scanner (System.in);
		
		do {
			System.out.println("Digite a primeira nota ");
			nota1=scn.nextDouble();
			
			System.out.println("Digite a segunda nota");
			nota2=scn.nextDouble();
			
			System.out.println("Digite a terceira nota");
			nota3=scn.nextDouble();
			
		System.out.println("Escolha a média que você deseja calcular:\nA: Aritimetica\nP: Ponderada\nou digite S para sair");
		escolha=scn.next();
		
		if(escolha.equals("a")) {
			resultado=aritmetico(nota1,nota2,nota3);
			System.out.println(resultado);
			
		}else if(escolha.equals("p")) {
			resultado=ponderado(nota1,nota2,nota3);
			System.out.println(resultado);
			
		}else {
			System.out.println("Opção Invalida !!");
		}
		}while(escolha.equals("s"));
		
	}
	

	public static double aritmetico(double nota1, double nota2, double nota3) {
		double resultado;
		resultado=(nota1+nota2+nota3)/3;
		return resultado;
	}
	
	public static double ponderado(double nota1, double nota2, double nota3) {
		double resultado;
		resultado=nota1*0.2+nota2*0.3+nota3*0.5;
		return resultado;
	}
	
}
