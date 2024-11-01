public class Chefe extends Funcionario{
    private double salarioPredefinido;

    public Chefe(String nome, String dataNascimento, double salarioPredefinido){
        super(nome, dataNascimento);
        this.salarioPredefinido = salarioPredefinido;
    }


    @Override
    public void calcularSalario(){
        setSalario(salarioPredefinido);
    }
}
