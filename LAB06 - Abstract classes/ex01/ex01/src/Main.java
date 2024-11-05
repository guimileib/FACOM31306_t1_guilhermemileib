public class Main {
    public static void main(String[] args) {
        ContaCorrente  c1 = new ContaCorrente(10000, 01234567, 1233);
        c1.debitaValor(200, 1233);
        System.out.println("Saldo após o débito: " + c1.getSaldo(1233));
    }
}
