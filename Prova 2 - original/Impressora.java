import javax.print.PrintException;

public class Impressora  {
    private String modelo;
    
    public Impressora(String modelo){
        this.modelo = modelo;
    }

    public String getModelo(){
        return modelo;
    }
    public void imprimir(Object obj) throws PrintException{
        if (obj == null) {
            throw new PrintException("Nenhum documento para imprimir!");
        }
        System.out.println("Imprimindo: " + obj.toString());
    }
    
}
