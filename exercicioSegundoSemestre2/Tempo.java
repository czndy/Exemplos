package exercicioSegundoSemestre2;
import java.util.Scanner;
public class Tempo {

	public static void main(String[] args) {
		
		CalculaTempo a = new CalculaTempo();

		Scanner scn = new Scanner(System.in);
		int tempo;
		System.out.print("Entre o tempo em segundos: ");
		tempo=scn.nextInt();
		a.calcula(tempo);
		}


	}