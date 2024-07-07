public class BreakContinue {
    public static void main(String[] args) {
        //o comando break interrempe o laço
        //o comando continue interrompe somente a interação atual

        //exemplo break
        for (int numero = 1; numero <= 5; numero++){
            if(numero == 3){
                break;
            }
            System.out.println(numero);
        }

        //exemplo continue
        for (int numero = 1; numero <= 5; numero++){
            if(numero == 3){
                continue;
            }
            System.out.println(numero);
        }
    }
}
