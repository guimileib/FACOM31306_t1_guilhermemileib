public class Professor{
    private String nome;

    public Professor(String nome){
        this.nome = nome;
    }

    public void exibirProfessor(){
        System.out.println(this.nome);
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }


}