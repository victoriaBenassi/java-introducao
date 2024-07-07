public class OperadoresLogicos {
    public static void main(String[] args) {
        // && - e 
        // || - ou

        boolean condicao1 = true;
        boolean condicao2 = true;

        if(condicao1 && condicao2){
            System.out.println("As duas condições são verdadeiras ! ");
        }
        else{
            System.out.println("uma das condições é falsa. ");
        }
        if( condicao1 || condicao2 ){
            System.out.println("Uma das condições é verdadeira ! ");    
        }
        else{
            System.out.println("As duas condições são falsas. ");
        }
        // usando uma expressão relacional
        if(condicao1 && ( 7 > 4 )){
            System.out.println("As duas condições são verdadeiras ! ");
        }

    }
}
