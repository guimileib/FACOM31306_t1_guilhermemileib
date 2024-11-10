public class Cliente implements Classificavel{
    private String nome;

    public Cliente (String nome){
        this.nome = nome;
    }

    public String getNome(){
        return nome;
    }



    @Override 
    public int compareTo(Classificavel o){
        if(o instanceof Cliente){
            Cliente clientes = (Cliente) o;
            return this.nome.compareTo(clientes.getNome());
        }
        throw new IllegalArgumentException("O obejto não é do tipo cliente");
    }


}