public class Edificio {
	private String nome;
	private String endereco;
	private int totalAptos; //numero de aptos no predio
	private Apartamento[] condominio; // array de aptos do predio
	private int totalAdult;
	private int totalCria;

	// construtor
	public Edificio(String nome, String endereco, int totalAptos) {
		this.nome = nome;
		this.endereco = endereco;
		this.totalAptos = totalAptos;
		condominio = new Apartamento[totalAptos];	
		totalAdult = 0;
		totalCria = 0;
	}
	
	// metodos
	// adiciona apartamentos em um edificio
	public void adicionarApartamento(int nAdult, int nCria, int nApto, String dono) {
		Apartamento apAdd = new Apartamento(nAdult, nCria, nApto, dono);
		condominio[totalAptos - 1] = apAdd;
		totalAdult += nAdult;
		totalCria += nCria;
		}
	
	// retorna total de apartamentos no edificio criado
	public int getTotalApartamentos() {
		return totalAptos;
	}

	public int getTotalAdult(){
		return totalAdult;
	}

	public int getTotalCria(){
		return totalCria;
	}

	public String consultarProprietarioPorNumero(int nApto) {
		for (int i = 0; i < condominio.length; i++) { // percorre o array de aptos
			Apartamento apartamento = condominio[i]; 
			if (apartamento != null && apartamento.getnApto() == nApto) { // se há apto no predio e se o nro do apto especifico existe no condominio				
				return apartamento.getDono(); // retorna o nome do proprietario
			}
		}
		return "Apartamento nao encontrado"; // se o apto nao existe, retorna apto nao encontrado
	}

    public int consultarNumeroPorProprietario(String dono) {
        for (int i = 0; i < condominio.length; i++) {
            Apartamento apartamento = condominio[i];
            if (apartamento != null && apartamento.getDono().equals(dono)) { //se apto tem proprietario (todos tem, verificaçao extra)
																		  	 // se o nome é igual ao nome do proprietario
                return apartamento.getnApto(); // retorna o numero do apartamento
            }
        }
        return -1; // retorna -1, indicando que o dono nao foi encontrado
    }

	// consulta porcentagem de aptos desocupados
	public double taxaDesocupados(){
		int count = 0; // conta desocupados
		for (int i = 0; i < condominio.length; i++) {
			if (condominio[i] != null && condominio[i].getnCria() == 0 && condominio[i].getnAdult() ==0 ){ // percorre array aptos procurando os sem adultos e sem criancas
				count++;
			}
		}	
		double disponiveis = ((double)count/condominio.length)*100; //calcula taxa de desocupados
		return disponiveis;
	}
}
