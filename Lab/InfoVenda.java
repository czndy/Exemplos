package cap10.Lab;

public class InfoVenda {
	
	static void cursoInfo(Vendavel v, int modalidade){
		System.out.println("Nome da Escola: " + Vendavel.escola);
		System.out.println("Número o telefone: " + Vendavel.telefone);
		System.out.println("Preço do curso: " + v.getPreco(modalidade));
		System.out.println(v);
//		System.out.println(v.getPreco(modalidade));
	}
	
	
public static void main(String[] args) {
	
	Vendavel j = new JavaProgrammer("JavaProgrammer", 40, 8);
	Redes cursoRedes = new Redes("Redes", 60, "2.3");

	
	cursoInfo(j, 2);
	cursoInfo(cursoRedes, 1);

}
}
