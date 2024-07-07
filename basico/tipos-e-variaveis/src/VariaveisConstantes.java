public class VariaveisConstantes{
    public static void main(String[] args) {
        /*
		 * esta linha é considerada como declaração de variável iniciamos a existência
		 * variavel numero com valor 5 regra: tipo + nome + valor
		 */
        int numero = 10;
       
        /*
		 * na linha abaixo iremos alterar o valor do varíavel para 10 observe que o tipo
		 * não é mais necessário, pois a variável já foi declarada anteriormente
		 */

		numero = 10;
        System.out.println(numero);

        //em java as constantes são representadas pela palavra final, seguida do tipo
        //por convenção, constantes são sempre escritas em CAIXA ALTA
        final double VALOR_DE_PI = 3.14;
        System.out.println(VALOR_DE_PI);
        
    }
}
