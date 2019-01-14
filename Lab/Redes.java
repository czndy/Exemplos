package cap10.Lab;

public class Redes extends Curso implements Vendavel {
	private String sistemaOperacional;
	
	
	public Redes(String nomeCurso, int cargaHoraria, String sistemaOperacional) {
		super(nomeCurso, cargaHoraria);
		setSistemaOperacional(sistemaOperacional);
	}

	public String getSistemaOperacional() {
		return sistemaOperacional;
	}

	public void setSistemaOperacional(String sistemaOperacional) {
		this.sistemaOperacional = sistemaOperacional;
	}

	public String toString() {
		return "Nome do Curso: " + getNomeCurso() + 
			   "\nCarga Horária: " + getCargaHoraria() + 
			   "\nSistema Operacional: " + getSistemaOperacional() + "\n";
	}

	public double getPreco(int modalidade) {
		if (modalidade == 1)
			return 620;
		else
			return 1190;
	}

}