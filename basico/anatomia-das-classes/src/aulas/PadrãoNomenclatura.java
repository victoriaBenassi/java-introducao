package aulas;
public class PadrãoNomenclatura {
    //nome do arquivo em PascalCase
    //a classe deve ter o mesmo nome do arquivo
    public static void main (String [] args){
        
        /* 
        Declaração de variáveis
        -Deve conter apenas letras, _ (underline), $ ou os números de 0 a 9;
        -Deve obrigatoriamente se iniciar por uma letra (preferencialmente), _ ou $, jamais com número;
        -Deve iniciar com uma letra minúscula (boa prática – ver abaixo);
        -Não pode conter espaços;
        -Não podemos usar palavras-chave da linguagem;
        -O nome deve ser único dentro de um escopo.
        */

        //variaveis deve ser escritas em camelCase
        String nomeUsuario = "Victoria"; 

        //para não sofre alterações no valor da variavel, escrevemos toda variavel em maiuscula
        //ou usamos a palavra reservada 'final'
        String PAIS_BR = "Brasil";
        final String USA = "Estado Unidos";

        System.out.println(nomeUsuario);
        System.out.println(PAIS_BR);
        System.out.println(USA);
        
    }
}
