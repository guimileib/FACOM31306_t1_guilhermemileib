public class UsaBanco {
    public static void main(String[] args) {
        ContaComum contaComum = new ContaComum(500.0f, 1234, 5678);
        ContaEspecial contaEspecial = new ContaEspecial(1000.0f, 4321, 1234, 500.0f);
        ContaEspecial contaEspecial2 = new ContaEspecial(1500.0f, 54321, 12345, 200.0f);
        
        contaComum.debitaValor(200, 5678);
        System.out.println("Saldo Conta Comum: " + contaComum.getSaldo(5678));

        System.out.println("\n Conta Especial dados:");
        contaEspecial.debitaValor(1300, 1234);
        System.out.println("Saldo Conta Especial: " + contaEspecial.getSaldo(1234) + " | O seu Limite:  " + contaEspecial.getLimite());
        System.out.println("Estado da sua Conta Especial é: "+ contaEspecial.getEstado(1234));

        System.out.println("\n Conta Especial 2 dados:");
        // conta especial 2
        contaEspecial2.debitaValor(1700, 12345);
        System.out.println("Saldo Conta Especial 2: " + contaEspecial2.getSaldo(12345) + " | O seu Limite: " + contaEspecial2.getLimite());

        contaEspecial.setLimite(0);
        contaEspecial.debitaValor(1, 1234);
    }
}
