# Ex02

**Enunciado do Problema: Divisão Segura com Tratamento de Exceções** - 

Você está desenvolvendo um sistema que precisa realizar operações matemáticas básicas. Em particular, você deve implementar uma operação de divisão, mas precisa garantir que a divisão por zero não ocorra, pois isso geraria um erro. Crie uma classe de exceção chamada `DivisaoPorZeroException`, que estenda a classe `Exception`. Esta exceção deve ser lançada quando uma tentativa de divisão por zero for detectada.

Implemente uma classe chamada `Operacao` que contenha os seguintes métodos:
   - **`iniciarOperacao(int numerador, int denominador)`**: Este método deve iniciar o processo de divisão. Ele deve chamar outro método para realizar o cálculo e tratar qualquer exceção que possa ser lançada.
   - **`calcular(int numerador, int denominador)`**: Este método deve ser responsável por chamar um método que realiza a divisão.
   - **`dividir(int numerador, int denominador)`**: Este método deve executar a operação de divisão. Se o denominador for zero, ele deve lançar a exceção;

No `main`, crie uma instância da classe `Operacao` e teste as operações de divisão com um caso que funcione corretamente e outro que cause a exceção de divisão por zero. As mensagens de erro devem ser claras e informativas.