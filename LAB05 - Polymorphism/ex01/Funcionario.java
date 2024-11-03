public class Funcionario {
    private String nome;
    private String dataNascimento;
    private double salario;

    public Funcionario(String nome, String dataNascimento){
        this.nome = nome;
        this.dataNascimento = dataNascimento;
    }

    public void calcularSalario(){
        this.salario = 0;
    }

    public double getSalario(){
        return salario;
    }

    public String getNome(){
        return nome;
    }

    public String getDataNascimento(){
        return dataNascimento;
    }

    public void setSalario(double salario){
        this.salario = salario;
    }
}
