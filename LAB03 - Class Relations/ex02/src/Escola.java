

public class Escola{
    private String nome;
    private Professor[] professores;
    private int contador;

    public Escola(String nome, int tamanho){
        professores = new Professor[tamanho];
        contador = 0;
        this.nome = nome;
    }

    public void adicionarProfessores(Professor professor){
        if(contador < professores.length){
            professores[contador] = professor;
            contador++;
        }else{
            System.out.println("Lista está cheia.");
        }
    }

    public void exibirEscola(){
        System.out.println(" ");
        System.out.println("Escola: " + this.nome);
        System.out.println("Professores:");
        for(int i = 0; i < contador; i++){
            professores[i].exibirProfessor();
        }
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }
}