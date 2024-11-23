public class Marcha {
    private int marchaAtual;
    private int numMaximo;
    private String fabricante;

    public Marcha(int numMaximo, String fabricante) {
        this.marchaAtual = 1;
        if(numMaximo < 1)
            numMaximo = 1;
        this.numMaximo = numMaximo;
        this.fabricante = fabricante;
    }

    public void incrementa() {
        if (marchaAtual < numMaximo) {
            marchaAtual++;

        } else{
            throw new VerificaExceptionMarcha("Marcha atual é maior que o máximo.");
        }
    }

    public void decrementa() {
        if (marchaAtual > 1) {
            marchaAtual--;
        }else {
            throw new VerificaExceptionMarcha("Marcha atual é menor que 1.");
        }
    }  
    
    public int getNumMaximo() {
        return numMaximo;
    }

    public int getMarchaAtual() {
        return marchaAtual;
    }

    public String getFabricante() {
        return fabricante;
    }

    @Override
    public String toString() {
        return "Marcha atual: " + marchaAtual + ", Fabricante: " + fabricante;
    }
}
