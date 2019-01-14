package cap10.Lab;

public class Apostila implements Vendavel {
	private String materia;

	Apostila(String materia){
		setMateria(materia);
	}
	
	public String toString() {
		return "Apostila [materia=" + materia + "]";
	}

	public String getMateria() {
		return materia;
	}

	public void setMateria(String materia) {
		this.materia = materia;
	}

	public double getPreco(int modalidade) {
		if (modalidade == 1)
			return 50;
		else
			return 90;
	}

}
