package exercicioSegundoSemestre2;

public class TesteNumeroo {
	private int soma=0;
	
	public void soma(int num1, int num2)
	{
	
	soma = num1+ num2;
	if (soma > 0) {
		System.out.println("Valor positivo");
	}
	else if (soma < 0){
		System.out.println("Valor negativo");
	}
	else if (soma == 0){
		System.out.println("Valor Nulo");
	}
	}
	
	public boolean positivo(float num) {
		if (num > 0) {
			return true;
		}
		else {
			return false;
		}
	}
	
}