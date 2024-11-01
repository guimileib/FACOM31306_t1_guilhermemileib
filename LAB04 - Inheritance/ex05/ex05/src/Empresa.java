public class Empresa {
    public static void main(String[] args) {

        Chefe[] chefes = {
            new Chefe("Joaquin Archivaldo", "16/02/2004", 10000000000.00),
            new Chefe("El Chapo", "04/04/1957", 10000000000.00)
        };

        Vendedor[] vendedores = {
            new Vendedor("Renato Alejandro", "01/11/2024", 100, 2, 1447.90),
            new Vendedor("Garrincha", "01/11/2024", 200, 90, 1447.90)
        };

        Operario[] operarios = {
            new Operario("Benzemar", "09/02/2009", 10000, 1),
            new Operario("Vinicius Junior", "01/01/1890", 200, 2)
        };

        Horista[] horistas = { 
            new Horista("Kelvin", "09/12/1909", 90, -10),
            new Horista("Gabriel Queiroga", "12/09/204", 178, 78)
        };

        System.out.println("\n<< Salários Chefes: >>");
        for(Chefe chefe : chefes){
            chefe.calcularSalario();
            System.out.println(chefe.getNome() + " | Salário: " + chefe.getSalario());
        }

        System.out.println("\n<< Salários Vendedores: ");
        for(Vendedor vendedor : vendedores){
            vendedor.calcularSalario();
            System.out.println(vendedor.getNome() + " | Salário: " + vendedor.getSalario());
        }

        System.out.println("\n<< Salários Operarios: >>");
        for(Operario operario : operarios){
            operario.calcularSalario();
            System.out.println(operario.getNome() + " | Salário: " + operario.getSalario());
        }

        System.out.println("\n<< Salários Horistas: >>");
        for(Horista horista : horistas){
            horista.calcularSalario();
            System.out.println(horista.getNome() + " | Salário: " + horista.getSalario());
        }





    }
}
