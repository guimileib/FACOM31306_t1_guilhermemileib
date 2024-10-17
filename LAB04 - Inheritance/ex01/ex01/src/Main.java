public class Main {
    public static void main(String[] args) {
        CandidatoPrefeito candidatoPrefeito = new CandidatoPrefeito("João Silva", "10/05/1980", "Masculino", 500000.00, true, 45,"Pedro Santos", "Partido da União");
        CandidatoVereador candidatoVereador = new CandidatoVereador("Maria Oliveira", "15/08/1990", "Feminino", 150000.00, false, 33,"123", "Centro");
        System.out.println(candidatoPrefeito);
        System.out.println(candidatoVereador);
    }
    
}
