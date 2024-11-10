public class Servico implements Classificavel{
    private double preco;

    public Servico(double preco){
        this.preco = preco;
    }

    public double getPreco(){
        return preco;
    }

    @Override
    public boolean eMenorQue(Classificavel obj) {
       if(obj instanceof Servico){
            return this.preco < ((Servico) obj).getPreco();
       }
       return false;
    }


}