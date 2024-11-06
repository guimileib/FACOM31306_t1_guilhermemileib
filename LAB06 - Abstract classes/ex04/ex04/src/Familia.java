public class Familia extends Contato {
    private String parentesco;

    public Familia(String apelido, String nome, String aniversario, String email, String parentesco){
        super(apelido,nome,aniversario,email);
        this.parentesco = parentesco;
    }


    @Override
    public void imprimirContato(){
        System.out.println(super.imprimirBasico());
        System.out.println("Parentesco: " + parentesco);
    }

}
