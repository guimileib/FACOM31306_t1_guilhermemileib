public class ContaEspecial extends ContaCorrente {
    private float limite;
    public ContaEspecial( float saldoInicial, int num,  int pwd, float limite){
        super(saldoInicial, num , pwd);
        this.limite = limite;
    }

    @Override
    public boolean debitaValor( float val, int pwd){
         if(isSenha(pwd) && val <= (getSaldo(pwd) + limite)){
            super.debitaValor(val);
            if(getSaldo(pwd) == 0 && limite == 0) {
                System.out.println("Conta Especial com limite 0, convertendo para Conta Comum.");
                ContaComum novaConta = new ContaComum(getSaldo(pwd), getNumConta(), pwd);
            }
            return true;
        }
        return false;
    }
    
    public float getLimite(){
        return limite;
    }

    public void setLimite(float limite){
        this.limite = limite;
    }

}
