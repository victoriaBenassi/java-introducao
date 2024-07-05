import java.util.concurrent.ThreadLocalRandom;
public class While {
    public static void main(String[] args) {
        /*
           O laço while, testa a condição antes de executar o código, logo, caso a condição seja inválida no primeiro teste o bloco nem será executado.
           estrutura do controle de fluxo while:
           while (expressão booleana de validação)
           {
            -comando que será executado até que a 
            -expressão de validação torne-se falsa 
           }
        */
        
        //Joãozinho recebeu R$ 50,00 de mesada e foi em uma loja de doces gastar todo o seu dinheiro, logo, enquanto o valor dos doces não igualar a R$ 50,00 ele foi adicionando itens no carrinho.
        double mesada = 50.0;
        while(mesada>0) {
            Double valorDoce = valorAleatorio();
            if(valorDoce > mesada)
                valorDoce = mesada;

            System.out.println("Doce do valor: " + valorDoce + " Adicionado no carrinho");
            mesada = mesada - valorDoce;
        }
        System.out.println("Mesada:" + mesada);
        System.out.println("Joãozinho gastou toda a sua mesada em doces");
    }
    private static double valorAleatorio() {
	return ThreadLocalRandom.current().nextDouble(2, 8);
    }
}
