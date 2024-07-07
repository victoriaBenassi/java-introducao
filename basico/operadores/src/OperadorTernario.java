public class OperadorTernario {
    public static void main(String[] args) {
        //<Expressão Condicional> ? <Caso condição seja true>:<Caso condição seja false>

        int a ,b ;
        a = 6;
        b = 6;
        String resultado ;

        //usando o if else
        if (a==b){
            resultado = "São iguais";
        } else{
                resultado = "Não são iguais";
        }
        System.out.println(resultado);

        // abreviando a condicional de if e else com o operador ternario
        String resultado_ternario = a ==b ? "São iguais" : "Não são iguais" ;
        System.out.println(resultado_ternario);
    }
}
