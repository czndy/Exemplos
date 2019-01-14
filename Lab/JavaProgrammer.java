package cap10.Lab;

public class JavaProgrammer extends Curso implements Vendavel {
public int versaoDaLinguagem;
	
	public void setVersaoDaLinguagem(int versaoDaLinguagem){
		this.versaoDaLinguagem = versaoDaLinguagem;
	}
	
	public int getVersaoDaLinguagem(){
		return versaoDaLinguagem;
	}
	
	public JavaProgrammer(String nomeCurso, int cargaHoraria, int versaoDaLinguagem){
		super(nomeCurso, cargaHoraria);
		setVersaoDaLinguagem(versaoDaLinguagem);
	}
	
	public String toString() {
		return "Nome do Curso: " + getNomeCurso() + 
			   "\nCarga Horária: " + getCargaHoraria() + 
			   "\nSistema Operacional: " + getVersaoDaLinguagem() + "\n";
	}

	public double getPreco(int modalidade) {
		if (modalidade == 1)
			return 780;
		else
			return 1320;
	}
	
}
