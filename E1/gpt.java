public class gpt {
    
    class Apartamento {
        private int numero;
        private String nomeProprietario;
        private int adultos;
        private int criancas;
    
        public Apartamento(int numero, String nomeProprietario, int adultos, int criancas) {
            this.numero = numero;
            this.nomeProprietario = nomeProprietario;
            this.adultos = adultos;
            this.criancas = criancas;
        }
    
        public int getNumero() {
            return numero;
        }
    
        public String getNomeProprietario() {
            return nomeProprietario;
        }
    
        public int getAdultos() {
            return adultos;
        }
    
        public int getCriancas() {
            return criancas;
        }
    }
    
    class Predio {
        private String nome;
        private String endereco;
        private int totalApartamentos;
        private Apartamento[] apartamentos;
        private int totalAdultos;
        private int totalCriancas;
    
        public Predio(String nome, String endereco, int totalApartamentos) {
            this.nome = nome;
            this.endereco = endereco;
            this.totalApartamentos = totalApartamentos;
            this.apartamentos = new Apartamento[totalApartamentos];
            this.totalAdultos = 0;
            this.totalCriancas = 0;
        }
    
        public void adicionarApartamento(int numero, String nomeProprietario, int adultos, int criancas) {
            Apartamento apartamento = new Apartamento(numero, nomeProprietario, adultos, criancas);
            apartamentos[numero - 1] = apartamento;
            totalAdultos += adultos;
            totalCriancas += criancas;
        }
    
        public int getTotalApartamentos() {
            return totalApartamentos;
        }
    
        public String consultarProprietarioPorNumero(int numeroApartamento) {
            for (Apartamento apartamento : apartamentos) {
                if (apartamento != null && apartamento.getNumero() == numeroApartamento) {
                    return apartamento.getNomeProprietario();
                }
            }
            return "Apartamento não encontrado";
        }
    
        public int consultarNumeroPorProprietario(String nomeProprietario) {
            for (Apartamento apartamento : apartamentos) {
                if (apartamento != null && apartamento.getNomeProprietario().equals(nomeProprietario)) {
                    return apartamento.getNumero();
                }
            }
            return -1; // Proprietário não encontrado
        }
    
        public int getTotalAdultos() {
            return totalAdultos;
        }
    
        public int getTotalCriancas() {
            return totalCriancas;
        }
    
        public double calcularPercentualApartamentosVazios() {
            int apartamentosOcupados = 0;
            for (Apartamento apartamento : apartamentos) {
                if (apartamento != null) {
                    apartamentosOcupados++;
                }
            }
            int apartamentosVazios = totalApartamentos - apartamentosOcupados;
            return ((double) apartamentosVazios / totalApartamentos) * 100;
        }
    }
    
    public class Main {
        public static void main(String[] args) {
            Predio predio = new Predio("Solarium", "Av. Ipiranga, 1000", 26);
    
            predio.adicionarApartamento(203, "João Carlos", 2, 2);
            predio.adicionarApartamento(204, "Maria Silva", 1, 1);
            // Adicionar mais apartamentos se necessário
    
            System.out.println("Total de apartamentos disponíveis: " + predio.getTotalApartamentos());
            System.out.println("Proprietário do apartamento 203: " + predio.consultarProprietarioPorNumero(203));
            System.out.println("Número do apartamento do proprietário João Carlos: " + predio.consultarNumeroPorProprietario("João Carlos"));
            System.out.println("Total de adultos no prédio: " + predio.getTotalAdultos());
            System.out.println("Total de crianças no prédio: " + predio.getTotalCriancas());
            System.out.println("Percentual de apartamentos desocupados: " + predio.calcularPercentualApartamentosVazios() + "%");
        }
    }
    
}
