public class Apartamento {
	// atributos
	private int nAdult;
	private int nCria;
	private int nApto;
	private String dono;

	// construtor
	public Apartamento(int nAdult, int nCria, int nApto, String dono) {
		this.nAdult = nAdult;
		this.nCria = nCria;
		this.nApto = nApto;
		this.dono = dono;
	}

	//getters
	public int getnAdult() {
		return nAdult;
	}

	public int getnCria() {
		return nCria;
	}

	public String getDono() {
		return dono;
	}

	public int getnApto() {
		return nApto;
	}
}
	

