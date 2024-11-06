public class Trabalho extends Contato{
    private String tipo;
    public Trabalho(String apelido, String nome, String aniversario, String email, String tipo){
        super(apelido,nome,aniversario,email);
        this.tipo = tipo;
    }


    @Override
    public void imprimirContato(){
        System.out.println(super.imprimirBasico());
        System.out.println("Tipo: " + tipo);
    }
}
