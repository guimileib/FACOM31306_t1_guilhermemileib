public class Banco {
    public static void main(String[] args) {
        ContaComum contaComum = new ContaComum(500.0f, 1234, 5678);
        ContaEspecial contaEspecial = new ContaEspecial(1000.0f, 4321, 1234, 500.0f);
        
        contaComum.debitaValor(200, 5678);
        System.out.println("Saldo Conta Comum: " + contaComum.getSaldo(5678));

        contaEspecial.debitaValor(1300, 1234);
        System.out.println("Saldo Conta Especial: " + contaEspecial.getSaldo(1234));

        contaEspecial.setLimite(0);
        contaEspecial.debitaValor(1, 1234);
    }
}
