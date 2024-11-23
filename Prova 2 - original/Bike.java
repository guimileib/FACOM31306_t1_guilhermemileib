public class Bike extends VeiculosDuasRodas{
    protected double velocidadeInicial;
    protected Marcha marcha;
    protected double vmax;

    public Bike(double velocidadeInicial, int numMaximo, 
    int numeroIdentificacao, String nomeFabricante, double velocidade) {
        super(numeroIdentificacao, nomeFabricante, velocidade); // co
        marcha = new Marcha(numMaximo, nomeFabricante);
        velocidade = velocidadeInicial;
    }

    public void setMarcha(int novoValor) {
        int marcha_atual = marcha.getMarchaAtual();
        int dif = novoValor - marcha_atual;
        if (dif > 0) {
            while (dif != 0) {
                marcha.incrementa();
                dif--;
            }
        } else {
            while (dif != 0) {
                marcha.decrementa();
                dif++;
            }
        }
    }

    public void frear(double decremento) {
        velocidadeInicial -= decremento;
    }

    public void acelerar(double incremento) {
        velocidadeInicial += incremento;
    }
    
    @Override
    public void imprimirDados() {
        System.out.println("\nBike está na marcha " + this.marcha.getMarchaAtual() +
                " e com velocidade de " + this.velocidadeInicial + " km/h.");
    }

}
