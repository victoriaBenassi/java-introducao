import java.util.Locale;
import java.util.Scanner;

public class PlanoOperadora {
    public static void main(String[] args) {
        /*
         * Imagina que fomos requisitados a criar um sistema de plano telefônico onde:
        O sistema terá 03 planos: BASIC, MIDIA , TURBO;
        BASIC: 100 minutos de ligação;
        MÍDIA: 100 minutos de ligação + WhatsApp e Instagram grátis;
        TURBO: 100 minutos de ligação + WhatsApp e Instagram grátis + 5 GB Youtube.
         */

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Planos da Operadora : ");
        System.out.println("BASIC  MÌDIA  TURBO");
        System.out.println("Digite o plano que deseja : (B = Basic, M = MÌDIA, T = TURBO)");
        String opcao = scanner.nextLine();

        switch ( opcao) {
            case "t","T":{
                System.out.println("5 GB Youtube.");
            }
            case "m","M":{
                System.out.println("WhatsApp e Instagram grátis.");
            }
            case "b","B":{
                System.out.println("100 minutos de ligação.");
                break;
            }
            default:
                System.out.println("Plano invalido");
                break;
        }
    }
}
