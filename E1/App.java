public class App {

public static void main(String[] args) {
    
    // instancia um edificio
    Edificio condominio = new Edificio("Ed1", "Av ipiranga, 1000", 10);

    // instancia apartamentos do edificio   
    condominio.adicionarApartamento(1, 1, 101, "Marcos Silva");    
    condominio.adicionarApartamento(5, 2, 102, "Joao Carlos") ;
    condominio.adicionarApartamento(0, 0, 201, "Carolina Machado");
    condominio.adicionarApartamento(2, 2, 202, "Maria Fernandes");
    condominio.adicionarApartamento(2, 1, 301, "Marcela Araújo");
    condominio.adicionarApartamento(2, 0, 302, "Paulo Rodrigues");
    condominio.adicionarApartamento(0, 0, 401, "Jose Albuquerque");
    condominio.adicionarApartamento(0, 0, 402, "Angelica Cifuentes");
    condominio.adicionarApartamento(0, 0, 501, "Isabel Alves");
    condominio.adicionarApartamento(0, 0, 502, "Catarina Dias");

    // prints para checar resultados
    System.out.println("Total de apartamentos disponíveis: " + condominio.getTotalApartamentos());           
    System.out.println("Proprietário do apartamento 1002: " + condominio.consultarProprietarioPorNumero(1002));        
    System.out.println("Número do apartamento do proprietário ZZZZZ: " + condominio.consultarNumeroPorProprietario("ZZZZZ"));
    System.out.println("Número do apartamento do proprietário Maria Fernandes: " + condominio.consultarNumeroPorProprietario("Maria Fernandes"));
    System.out.println("Total de adultos no prédio: " + condominio.getTotalAdult());
    System.out.println("Total de crianças no prédio: " + condominio.getTotalCria());
    System.out.printf("Percentual de apartamentos desocupados: %.2f ", condominio.taxaDesocupados());
    }   
}