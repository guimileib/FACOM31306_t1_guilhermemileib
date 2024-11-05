public class Graduacao extends Estudante {

    public Graduacao(String nome, String endereco){
        super(nome,endereco);

    }

    @Override
    public void print(boolean mesmaLinha) {
        if (mesmaLinha) {
            System.out.println("Nome: " + getNome() + "; Endereco: " + getEndereco());
        } else {
            super.print();
        }
    }
}
