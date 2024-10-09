public class Main {
    public static void main(String[] args) {
        Professor professor1 = new Professor("Marcus");
        Professor professor2 = new Professor("Paula");

        Escola escola = new Escola("Escola Central", 2);
        Escola escola1 = new Escola("Livreto", 1);
        escola.adicionarProfessores(professor1);
        escola1.adicionarProfessores(professor2);

        escola.exibirEscola();
        escola1.exibirEscola();
    }
}