public class App {

public static void main(String[] args) {
    
    // instancia um edificio
    Edificio condominio = new Edificio("Ed1", "Av ipiranga, 1000", 4, null, 0, 0);

    // instancia apartamentos do edificio   
    condominio.adicionarApartamento(1, 1, 101, "Marcos Silva", true));    
    condominio.adicionarApartamento(2, 2, 102, "Joao Carlos", true) ;
    condominio.adicionarApartamento(2, 0, 201, "Marcia Azambuja", true);
    condominio.adicionarApartamento(0, 0, 202, "Maria Fernandes", false);

    // prints para checar resultados
    System.out.println("Total de apartamentos disponíveis: " + condominio.getTotalApartamentos());           
    System.out.println("Proprietário do apartamento 203: " + condominio.consultarProprietarioPorNumero(203));        System.out.println("Número do apartamento do proprietário João Carlos: " + condominio.consultarNumeroPorProprietario("João Carlos"));
    System.out.println("Total de adultos no prédio: " + condominio.getTotalAdultos());
    System.out.println("Total de crianças no prédio: " + condominio.getTotalCriancas());
    System.out.println("Percentual de apartamentos desocupados: " + condominio.taxaDesocupados() + "%");
    }   
}