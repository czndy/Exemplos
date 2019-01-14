package exercicioSegundoSemestre2;

public class CalculaTempo {
	public void calcula(int tempo){
	int horas, minutos, segundos;
	segundos = tempo % 60;
	minutos = (tempo / 60);
	horas = minutos/60;
	minutos = minutos % 60;
	System.out.print("O tempo em horas é: "+horas+":"+minutos+":"+segundos);
	}
}
