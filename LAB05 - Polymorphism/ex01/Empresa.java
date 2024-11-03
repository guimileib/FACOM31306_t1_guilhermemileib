public class Empresa {
    public static void main(String[] args) {
        Funcionario[] funcionarios = new Funcionario[4];

        funcionarios[0] = new Chefe("Carlos", "12/05/1980", 8000.00);
        funcionarios[1] = new Vendedor("Marcos", "22/02/1990", 2000.00, 10, 150);
        funcionarios[2] = new Operario("João", "14/03/1992", 20, 300);
        funcionarios[3] = new Horista("Paulo", "10/01/1987", 15, 160);

        FolhaPagamento folhaPg = new FolhaPagamento(funcionarios);
        folhaPg.mostrarFolharPagamento();
        
    }
}
