public class Operacao {
    
    public void iniciarOperacao(int numerador, int denominador) {
        try {
            if(denominador == 0){
                throw new DivisaoPorZeroException("Não é possível dividir se o seu denominador for 0.");
            }
            calcular(numerador, denominador);

        } catch (DivisaoPorZeroException e){
            System.out.println(e.getMessage());
        }  

    }

    public void calcular(int numerador, int denominador) throws DivisaoPorZeroException{
        dividir(numerador, denominador);
    }

    public void dividir(int numerador, int denominador) throws DivisaoPorZeroException{
       if(denominador == 0){
        throw new DivisaoPorZeroException("Não é possível dividir por zero.");
       }
       
        int resultado = numerador / denominador;
        System.out.println("O resultado da divisão: " + resultado);
    }
}
