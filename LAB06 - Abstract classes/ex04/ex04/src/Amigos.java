public class Amigos extends Contato {
    private String grau;

    public Amigos(String apelido, String nome, String aniversario, String email, String grau){
        super(apelido,nome,aniversario,email);
        this.grau = grau;
    }

    @Override
    public void imprimirContato(){
        System.out.println(super.imprimirBasico());
        System.out.println("Grau de amizade: " + grau);
    }
}
