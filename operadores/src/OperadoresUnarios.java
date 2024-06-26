import java.net.Socket;

public class OperadoresUnarios {
    public static void main(String[] args) {
        /*
        são aplicados juntamente com um outro operador aritmético. Eles realizam 
        alguns trabalhos básicos como incrementar, decrementar, inverter valores 
        numéricos e booleanos.
        */

        int numero = 5; // números são positivos sem esse (+) operador explicitamente
		
        //mudando numero para negativo
        numero = - numero;
        System.out.println( numero);

        //mudando numero negativo para positivo
        numero = numero * -1;
        System.out.println(numero);

        //incrementação -  incrementa o valor em 1 unidade
        numero = numero + 1; //abreviando essa expressão usando o operdaor de atribuiçÕ
        numero ++;

        numero += 2; // incrementando de dois em dois

        System.out.println(++ numero); //vai primeiro incrementar 'numero' e depois imprimir seu valor

        //decremento - decrementa o valor em 1 unidade
        numero = numero - 1; // abreviando essa expressão usando o operador de subtração
        numero --;
        System.out.println(-- numero);//vai primeiro decrementar o 'numero' e depois imprimir seu valor
        
        //Operador de negação - nega o valor de uma expressão booleana
        boolean variavel = false;
        
        System.out.println(!variavel);//inverte o valor da variavel

        //reatribuindo a variavel com operador negação
        variavel = !variavel;
        System.out.println(variavel);
    }
}
