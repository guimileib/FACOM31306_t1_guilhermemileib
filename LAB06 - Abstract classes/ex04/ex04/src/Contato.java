abstract class Contato {
    private String apelido;
    private String nome;
    private String email;
    private String aniversario;

    public Contato(String apelido, String nome, String aniversario, String email){
        this.apelido = apelido;
        this.nome = nome;
        this.email = email;
        this.aniversario = aniversario;
    }   

    public String imprimirBasico(){
        return "Dados do Contato: " +
                "\nApelido: " + apelido +
                "\nNome: " + nome + 
                "\nEmail: " + email +
                "\nAniversário: " + aniversario;
    }
    
    public void imprimirContato(){
        imprimirBasico();
    }


}
