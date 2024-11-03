public class Operario extends Funcionario{
    private double valorProducao;
    private int qntProduzida;

    public Operario(String nome, String dataNascimento, double valorProducao, int qntProduzida){
        super(nome, dataNascimento);
        this.valorProducao = valorProducao;
        this.qntProduzida = qntProduzida;
    }

    @Override
    public void calcularSalario(){
        setSalario(valorProducao * qntProduzida);
    }
}
