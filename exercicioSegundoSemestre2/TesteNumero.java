package exercicioSegundoSemestre2;
import java.util.Scanner;
public class TesteNumero{

	public static void main(String[] args) {
		
Scanner scn = new Scanner(System.in);

System.out.print("Digite um n�mero: ");
				int num1 = scn.nextInt();
				TesteNumeroo ex1 = new TesteNumeroo();
				if (ex1.positivo(num1)) {
					System.out.println("� positivo");
				}
				else {
					System.out.println("� negativo");
				}
				
			}

	}
