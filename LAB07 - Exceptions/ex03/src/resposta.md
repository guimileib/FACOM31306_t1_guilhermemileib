# Ex03
 
1- Qual a diferença entre o throw e throws ? Justifique explicado o que cada comando faz

2- Indique a diferença entre checked e uncheked exceptions

Respostas:

1. Throw é usado quando deseja-se mostrar de forma explícita que há um erro em uma condição, em um método ou bloco de código. Já o throws é utilizado na assinatura do método para declarar que o método pode lançar uma ou mais exceções verificadas, isso vai mostrar ao compilador que o método *pode* gerar essas execeções

2. Checked Exceptions, são exceções que o compilador obriga a tratar ou declarar com throws. Elas geralmente indicam condições excepcionais que podem ser previstas ou que podem ser controladas. Esse tipo de exceção devem ser declaradas ou tratadas. As Unchecked Exceptions são as excessões que não precisam ser declaradas com throws ou ser tratadas, isso significa que se ocorrer o código continuar sua execução, ocorre por erro do desenvolvedor.

