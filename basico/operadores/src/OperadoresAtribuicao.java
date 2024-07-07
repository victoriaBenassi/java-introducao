public class OperadoresAtribuicao {
    public static void main(String[] args) {
        /*
         O operador aritmético, é utilizado para realizar operações matemáticas
          entre valores numéricos, podendo se tornar ou não uma expressão mais complexa.
         */
        double soma = 10.5 + 15.7;
        int subtração = 113 - 25;
        int multiplicacao = 20 * 7;
        int divisao = 15 / 3;
        int modulo = 18 % 3;  //resto da divisão
        double resultado = (10 * 7) + (20/4);

        System.out.println(resultado);

        /*
           O operador de adição (+), quando utilizado em variáveis do 
           tipo texto, realizará a “concatenação de textos”.
         */

        String nomeCompleto = "LINGUAGEM " + "JAVA";
        System.out.println(nomeCompleto);

        String concatenacao ="?"; 

        concatenacao = 1+1+1+"1";
        System.out.println(concatenacao);

        //apartir do momento que ele detecta um caracter, ele realiza a concatenação e deixa de realizar a soma
        concatenacao = 1+"1"+1+1;
        System.out.println(concatenacao);

        concatenacao = 1+"1"+1+"1";
        System.out.println(concatenacao);

        concatenacao = "1"+1+1+1;
        System.out.println(concatenacao);

        concatenacao = "1"+(1+1+1);
        System.out.println(concatenacao); 
        // 1* realizou a soma das evidencias, pegou o resultado e viu que era um caracter
        // e entao realizou a concatenação
    }
}
