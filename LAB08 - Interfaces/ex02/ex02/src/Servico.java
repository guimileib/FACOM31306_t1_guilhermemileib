public class Servico implements Classificavel{
    private double preco;

    public Servico(double preco){
        this.preco = preco;
    }

    public double getPreco(){
        return preco;
    }

    @Override
    public int compareTo(Classificavel obj) {
       if(obj instanceof Servico){
            Servico servicos = (Servico) obj;
            return Double.compare(this.preco, servicos.getPreco());
       }
       throw new IllegalArgumentException("Objeto não é do tipo Servico");
    }


}