public class Produto implements Classificavel {
    private int codigo;
    
    public Produto(int codigo){
        this.codigo = codigo;
    }
    
    public int getCodigo(){
        return codigo;
    }

    @Override
    public int compareTo(Classificavel o) {
        if(o instanceof Produto){
            Produto produtos = (Produto) o;
            return Integer.compare(this.codigo, produtos.getCodigo());
        }
        throw new IllegalArgumentException("O objeto não é do tipo Produto");
    }
}
    

