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
		System.out.println("Escolha uma op��o: \n1 : Soma\n2 : Subtra��o\n3 : Multiplica��o\n4 : Divis�o");
		escolha = scn.next();
		
		do{
		if(escolha.equals("1")){
			resultado = a.soma(x, y);
			System.out.println("O resultado � igual a: " + resultado);
		}
		else if(escolha.equals("2")){
			resultado = a.subtracao(x, y);
			System.out.println("O resultado � igual a: " + resultado);
		}
		else if(escolha.equals("3")){
			resultado = a.multiplicacao(x, y);
			System.out.println("O resultado � igual a: " + resultado);
		}
		else if(escolha.equals("4")){
			resultado = a.divisao(x, y);
			System.out.println("O resultado � igual a: " + resultado);
		}else{
			System.out.println("Op��o inv�lida, tente novamente");
		}
		break;
		}while(escolha.equals("1")||escolha.equals("2")||escolha.equals("3")||escolha.equals("4"));
	
			System.out.println("\nDeseja continuar? (y/n)");
			escolha = scn.next();
		}while(escolha.equals("y"));
		scn.close();
	}
}
