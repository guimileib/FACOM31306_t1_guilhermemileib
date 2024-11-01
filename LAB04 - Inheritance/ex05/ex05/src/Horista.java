public class Horista extends Funcionario {
    private double valorPorHora;
    private int horasTrabalhadas;

    public Horista(String nome, String dataNascimemto, double valorPorHora, int horasTrabalhadas ){
        super(nome, dataNascimemto);
        this.valorPorHora = valorPorHora;
        this.horasTrabalhadas = horasTrabalhadas;
    }   

    @Override
    public void calcularSalario(){
        setSalario(valorPorHora * horasTrabalhadas);
    }
    
}
