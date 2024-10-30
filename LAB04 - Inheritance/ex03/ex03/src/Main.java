public class Main {
    public static void main(String[] args) {
        CandidatoPrefeito cp1 = new CandidatoPrefeito("João Silva", "10/05/1980", "Masculino", 500000.00, true, 45,
                "Pedro Santos", "Partido da União");
        Candidato candidato = new Candidato("Carlos Silva", "1980-05-10", "Masculino", 250000.50, true, 15);
        CandidatoVereador vereador = new CandidatoVereador(candidato, "Centro","180");
        
        //System.out.println("<< Informações do Candidato a Prefeito >>");
        //System.out.println(cp1);
        System.out.println("<< Informações do Candidato a Vereador >>");
        System.out.println(vereador.toString());
        
    //"Maria Oliveira", "15/08/1990", "Feminino", 150000.00, false, 33,"123", "Centro"
                
    }
}
