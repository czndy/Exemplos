package exercicioSegundoSemestre2;

public class Inverteeee {
int w, x, y, z;
String resultado;

public String inversor(int w){
	if(w/100<1){
		System.out.println("Este n�mero possui menos de tr�s d�gitos");
	}
	else{
		x=w/100;
		y=(w%100)/10;
		z=(w%100)%10;
	}
	return z + "" + "" + y + "" + x;
}



}
