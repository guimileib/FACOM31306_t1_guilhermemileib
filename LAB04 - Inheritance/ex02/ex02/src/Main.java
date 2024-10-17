public class Main {
    public static void main(String[] args) {
        CandidatoPrefeito cp1 = new CandidatoPrefeito("João Silva", "10/05/1980", "Masculino", 500000.00, true, 45,
                "Pedro Santos", "Partido da União");
        CandidatoVereador cv1 = new CandidatoVereador("Maria Oliveira", "15/08/1990", "Feminino", 150000.00, false, 33,
                "123", "Centro");

        System.out.println("<< Informações do Candidato a Prefeito >>");
        System.out.println(cp1);
        System.out.println("<< Informações do Candidato a Vereador >>");
        System.out.println(cv1);
    
    }
}
