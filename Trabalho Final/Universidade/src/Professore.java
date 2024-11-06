import java.time.LocalDate;

public class Professore {
    private String cpf;
    private String nome;
    private LocalDate dataNascimento;
    private LocalDate inicioContrato;
    private String departamentoVinculado;

    public Professore(String cpf, String nome, LocalDate dataNascimento, 
    LocalDate inicioContrato, String departamentoVinculado){
        this.cpf = cpf;
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.inicioContrato = inicioContrato;
        this.departamentoVinculado = departamentoVinculado;
    }
}
