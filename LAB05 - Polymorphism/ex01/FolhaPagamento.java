public class FolhaPagamento {
    private Funcionario[] funcionarios;
    
    public FolhaPagamento(Funcionario[] funcionarios){
        this.funcionarios = funcionarios;

    }

    public void mostrarFolharPagamento(){
        double totalSalarios = 0;
        System.out.println("Folha de Pagamento da Empresa: ");

        for(Funcionario funcionario : funcionarios){
            funcionario.calcularSalario();

            System.out.println("Nome: " + funcionario.getNome() + " | Salário: " + funcionario.getSalario());
            totalSalarios += funcionario.getSalario();
        }

        System.out.println("Total de salários pagos: " + totalSalarios);
    }
    


}
