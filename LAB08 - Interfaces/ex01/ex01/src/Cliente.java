public class Cliente implements Classificavel{
    private String nome;

    public Cliente (String nome){
        this.nome = nome;
    }

    public String getNome(){
        return nome;
    }


    @Override
    public boolean eMenorQue( Classificavel o){
        if(o instanceof Cliente){
            return this.nome.compareTo(((Cliente) o).getNome()) < 0;
        }
        return false;
    }


}