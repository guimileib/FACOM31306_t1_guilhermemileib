public class ContaEspecial extends ContaCorrente {
    private float limite;
    public ContaEspecial( float saldoInicial, int num,  int pwd, float limite){
        super(saldoInicial, num , pwd);
        this.limite = limite;
    }


    public float getLimite(){
        return limite;
    }

    public void setLimite(float limite){
        this.limite = limite;
    }

    @Override
    public boolean debitaValor( float val, int pwd){
        if(limite > 0){
            if(getSaldo(pwd) == 0){
                setEstado(pwd, 1);
            }
        }
        
        if(limite == 0) {
            System.out.println("Conta Especial com limite 0, convertendo para Conta Comum.");
            ContaComum novaConta = new ContaComum(getSaldo(pwd), getNumConta(), pwd);
            System.out.println("Sua conta, agora do tipo Comum, está com Saldo de: " + novaConta.getSaldo(pwd));
        }

        if(isSenha(pwd) && val <= (getSaldo(pwd) + limite)){
            float resto = getSaldo(pwd) - val;
            if(resto < 0){
                limite = resto + limite;
            }
            super.debitaValor(val);
            
            return true;
        }
        
        return false;
    }
    


}
