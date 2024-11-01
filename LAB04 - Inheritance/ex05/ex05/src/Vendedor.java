public class Vendedor extends Funcionario{
    private double comissao;
    private int vendas;
    private double salarioBase;

    public Vendedor(String nome, String dataNascimento, double comissao, int vendas, double salarioBase){
        super(nome, dataNascimento);
        this.comissao = comissao;
        this.vendas = vendas; 
        this.salarioBase = salarioBase;
    }

    @Override
    public void calcularSalario(){
        setSalario(salarioBase + (vendas * comissao));
    }
}
