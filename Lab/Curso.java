package cap10.Lab;

public class Curso {
	private String nomeCurso;
	private int cargaHoraria;

	public String toString() {
		return "Curso [nomeTreinamento=" + nomeCurso + ", cargaHoraria=" + cargaHoraria + "]";
	}
	
//	public Curso(){}     - construtor default
	
	public Curso(String nomeCurso, int cargaHoraria) {
		setNomeCurso(nomeCurso);
		setCargaHoraria(cargaHoraria);
	}

	public String getNomeCurso() {
		return nomeCurso;
	}

	public void setNomeCurso(String nomeCurso) {
		this.nomeCurso = nomeCurso;
	}

	public int getCargaHoraria() {
		return cargaHoraria;
	}

	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}

}






