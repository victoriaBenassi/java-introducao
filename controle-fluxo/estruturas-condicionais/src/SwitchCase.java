public class SwitchCase {
    public static void main(String[] args) {
        //sistema de medida
        String sigla = "a";

        switch (sigla) {
            case "P", "p":{
                System.out.println("Pequeno");
                break;
            }
            case "M","m":{
                System.out.println("Medio");
                break;
            }
            case "G","g":{
                System.out.println("Grande");
                break;
            }
            default:
                System.out.println("Indefinido");
        }
    }
}
