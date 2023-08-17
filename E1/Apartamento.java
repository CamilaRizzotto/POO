public class Apartamento {
	// atributos
	private int nAdult;
	private int nCria;
	private int nApto;
	private String dono;
	private boolean ocup;

	// construtor
	public Apartamento(int nAdult, int nCria, int nApto, String dono, boolean ocup) {
		this.nAdult = nAdult;
		this.nCria = nCria;
		this.nApto = nApto;
		this.dono = dono;
		this.ocup = ocup;
	}

	public int getnApto() {
		return nApto;
	}

	public String getdono (Apartamento apartamento){
		return dono;
	}

	// conta total de moradores
	public int contaMoradores (int nCria, int nAdult){
		int adultos = 0;
		int criancas = 0;
		int total= 0;

		if (nCria > 0){
			criancas++;
		}

		if (nAdult >0){
			adultos++;
		}

		total = criancas + adultos;
		return total;
	}

	// conta numero de criancas
	public int contaCria (int nCria){
		int criancas = 0;
		if (nCria >0){
			criancas++;
		}

		return criancas;
	}

	// conta numero de adultos
	public int contaAdulto (int nAdult){
		int adultos = 0;

		if (nAdult >0){
			adultos++;
		}

		return adultos;
	}
}
