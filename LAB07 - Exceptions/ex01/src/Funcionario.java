public class Funcionario {
    private String cpf;
    private String nome;
    private double salario;
    private double tetoSalario = 40000.00;


    public Funcionario(String cpf, String nome, double salario){
        this.cpf = cpf;
        this.nome = nome;
        setSalario(salario); // vai setar o valor so se passar pela validacao
    }   

    public void setCpf(String cpf){
        this.cpf = cpf;
    }

    public String getCpf(){
        return cpf;
    }

    public void setNome(String nome){
        this.nome = nome;
    }
    
    public double getTetoSalario(){
        return tetoSalario;
    }

    public void setTetoSalario(double tetoSalario){
        this.tetoSalario = tetoSalario;
    }

    // Criei uma validacao do salario para nao criar um salario errado
    public void setSalario(double salario){
        if(salario < 0){
            throw new ValorInvalido("O salário não pode ser negativo.");
        }
        if(salario > tetoSalario){
            throw new ValorInvalido("O salário não pode ter valor maior que o teto");
        }
        this.salario = salario;
    }

    public void aumentarSalario(double porcento){
        double novoSalario = salario * (1 + porcento/100);
        if(novoSalario < 0){
            throw new ValorInvalido("Valor inválido de salário!");

        }
        if(novoSalario > tetoSalario){
            throw new ValorInvalido("Valor do salário ultrapassa o teto!");
        } 
            this.salario = novoSalario;
           System.out.println("Salário é de: " + salario);
        
    }

}   

