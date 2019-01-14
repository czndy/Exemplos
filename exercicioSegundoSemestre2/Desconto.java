package exercicioSegundoSemestre2;
import java.util.Scanner;
public class Desconto {

	public static void main(String[] args) {
			
		Scanner scn = new Scanner(System.in);
		float antigo;
		float novo;
		float resultado;
		
		System.out.print("Digite o valor antigo: ");
		antigo=scn.nextFloat();
		
		System.out.print("Digite o valor novo: ");
		novo=scn.nextFloat();
		
		resultado = calcula(antigo,novo);
		if(resultado<0)
		{
		resultado *= -1;
		System.out.print("Resultado: "+resultado+" % de desconto.");
		}
		else
		{
		System.out.print("Resultado: "+resultado+" % de acréscimo.");
		}
		

	}
	public static float calcula(float antigo, float novo)
	{
		float resultado;
		resultado = novo-antigo;
		resultado = resultado / antigo;
		resultado = resultado * 100;
		return resultado;
		}
	
	
	
}