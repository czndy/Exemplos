package exercicioSegundoSemestre2;
import java.util.Scanner;
public class Calculadora {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		
		Operacoes a = new Operacoes();
		double x, y;
		String escolha;
		double resultado;
		do{
		System.out.println("Digite o primeiro valor");
		x = scn.nextDouble();
		System.out.println("Digite o segundo valor");
		y = scn.nextDouble();
		System.out.println("Escolha uma opção: \n1 : Soma\n2 : Subtração\n3 : Multiplicação\n4 : Divisão");
		escolha = scn.next();
		
		do{
		if(escolha.equals("1")){
			resultado = a.soma(x, y);
			System.out.println("O resultado é igual a: " + resultado);
		}
		else if(escolha.equals("2")){
			resultado = a.subtracao(x, y);
			System.out.println("O resultado é igual a: " + resultado);
		}
		else if(escolha.equals("3")){
			resultado = a.multiplicacao(x, y);
			System.out.println("O resultado é igual a: " + resultado);
		}
		else if(escolha.equals("4")){
			resultado = a.divisao(x, y);
			System.out.println("O resultado é igual a: " + resultado);
		}else{
			System.out.println("Opção inválida, tente novamente");
		}
		break;
		}while(escolha.equals("1")||escolha.equals("2")||escolha.equals("3")||escolha.equals("4"));
	
			System.out.println("\nDeseja continuar? (y/n)");
			escolha = scn.next();
		}while(escolha.equals("y"));
		scn.close();
	}
}
