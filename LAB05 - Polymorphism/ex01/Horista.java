public class Horista extends Funcionario {
    private double horasTrabalhadas;
    private double valorPorHora;

    public Horista(String nome, String dataNascimento, double horasTrabalhadas, double valorPorHora){
        super(nome, dataNascimento);
        this.horasTrabalhadas = horasTrabalhadas;
        this.valorPorHora = valorPorHora;
    }
    @Override
    public void calcularSalario(){
        setSalario(valorPorHora * horasTrabalhadas);
    }
   
}
