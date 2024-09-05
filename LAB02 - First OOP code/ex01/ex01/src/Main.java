import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Candidato c1 = new Candidato("JUNINHO PROFESSOR", "03/06/1974",  "Masculino", "80.000,00", false, 55, "Prefeito");
        Candidato c2 = new Candidato("PABLO HENRIQUE COSTA MARÇAL", "18/04/1987", "Cisgênero",  "169.503.058,17", false, 28, "Prefeito");
        Candidato c3 = new Candidato("GLEIDSON GONTIJO AZEVEDO", "15/04/1982", "Masculino", "743.894,96", true, 30, "Prefeito");
        
        
        c1.mostrarInformações();
        c2.mostrarInformações();
        c3.mostrarInformações();
    }

    
    
}
