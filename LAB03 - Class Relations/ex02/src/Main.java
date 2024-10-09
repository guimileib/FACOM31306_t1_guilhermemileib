public class Main {
    public static void main(String[] args) {
        Professor professor1 = new Professor("Marcus");
        //Professor professor2 = new Professor("Paula");

        Escola escola = new Escola("Escola Central");

        escola.adicionarProfessores(professor1);
      //  escola.adicionarProfessores(professor2);

        escola.exibirEscola();
    }
}