public class Chefe extends Funcionario{
    private double salarioFixo;

    public Chefe(String nome, String dataNascimento, double salarioFixo) {
        super(nome, dataNascimento);
        this.salarioFixo = salarioFixo;
       
    }

    public void calcularSalario(){
        setSalario(salarioFixo);
    }
}