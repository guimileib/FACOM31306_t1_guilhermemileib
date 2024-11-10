public class Produto implements Classificavel {
    private int codigo;
    
    public Produto(int codigo){
        this.codigo = codigo;
    }
    
    public int getCodigo(){
        return codigo;
    }

    @Override
    public boolean eMenorQue(Classificavel o) {
        if(o instanceof Produto){
            return this.codigo < ((Produto) o).getCodigo();
        }
        return false;
    }
}
    

