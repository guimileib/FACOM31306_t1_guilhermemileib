public class Main{
    public static void main(String[] args) {
        Classificador classificador = new Classificador();

        Produto[] produtos ={
            new Produto(101),
            new Produto(102),
            new Produto(369)
        };
        System.out.println("\nOrdenação Produtos: ");
        classificador.ordena(produtos);
        for(Produto p : produtos){
            System.out.println("Código do produto: " + p.getCodigo());
            
        }
        System.out.println("");
        Servico[] servicos = {
            new Servico(300.00),
            new Servico(550.00),
            new Servico(670.00)
        };
        System.out.println("\nOrdenação Serviços: ");
        classificador.ordena(servicos);
        for(Servico s : servicos){
            System.out.println("Preços dos serviços: " + s.getPreco());
           
        }
        System.out.println("");
        Cliente[] clientes = {
            new Cliente("Anderson"),
            new Cliente("Daniel"),
            new Cliente("João Gabriel")
        };
        System.out.println("\nOrdenação Clientes: ");
        classificador.ordena(clientes);
        for(Cliente c : clientes){
            System.out.println("Nome dos clientes: " + c.getNome());
            
        }

        
        

    }
}