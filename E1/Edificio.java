public class Edificio {

	private String nome;
	private String endereco;
	private int totalAptos; //numero de aptos no predio
	private Apartamento[] condominio; // array de aptos do predio
	private int totalAdult; 
	private int totalCria; 

	// fazer metodo para settar o total de adultos conforme aptos sao adicionados no array condominio depois getter para pegar o numero de adultos
	public void setTotalAdult(int totalAdult) {
		this.totalAdult = totalAdult;
		for (int i=0; i<condominio.length; i++){
		totalAdult = condominio.contaMoradores(condominio[i])
		}
	}

	public void setTotalCria(int totalCria) {
		this.totalCria = totalCria;
	}

	// construtor
	public Edificio(String nome, String endereco, int totalAptos, Apartamento[] condominio, int totalAdult, int totalCria) {
		this.nome = nome;
		this.endereco = endereco;
		this.totalAptos = totalAptos;
		this.condominio = condominio;
		this.totalAdult = totalAdult;
		this.totalCria = totalCria;
	}

	// metodos
	// adiciona apartamentos em um edificio
	public void adicionarApartamento(int nAdult, int nCria, int nApto, String dono, boolean ocup) {
		Apartamento apAdd = new Apartamento(nAdult, nCria, nApto, dono, ocup);
		condominio[nApto - 1] = apAdd;
		totalAdult += nAdult;
		totalCria += nCria;
		}
	
	// retorna total de apartamentos no edificio criado
	public int getTotalApartamentos() {
		return totalAptos;
	}

	//public String consultarProprietarioPorNumero(int nApto) {
      //  for (int i = 0; i < condominio.length; i++) { //percorre o array de aptos
        //    Apartamento apartamento = condominio[i]; 
          //  if (apartamento != null && apartamento.getnApto() == nApto) { //se ha apto no predio
			//															 //e se o nro do apto especifico existe no condominio				
			//	return apartamento.getdono(apartamento); //retorna o nome do proprietario
			//}

			//else return "Apartamento nao encontrado"; // se o apto nao existe, retorna apto nao encontrado
		//}
    //}

    public int consultarNumeroPorProprietario(String dono) {
        for (int i = 0; i < condominio.length; i++) {
            Apartamento apartamento = condominio[i];
            if (apartamento != null && apartamento.getdono(apartamento).equals(dono)) { //se apto tem proprietario (todos tem, verificaçao extra)
																						// se o nome é iguala o nome do proprietario
                return apartamento.getnApto(); // retorna o numero do apartamento
            }
        }
        return 0; // retorna 0, necessario criar um metado para converter para string esse retorno numerico
    }

	// consulta porcentagem de aptos desocupados
	public double taxaDesocupados(boolean ocup){
		int count = 0; // conta ocupados
		int desoc = 0; //conta desocupados
		for (int i = 0; i < condominio.length; i++) {
			if (ocup == true){
				count++;
			}
			else {
				desoc++;
			}
		}
		int total = count + desoc; // soma numero de aptos
		double disponiveis = (desoc/total)*100;
		return disponiveis;
	}

}
