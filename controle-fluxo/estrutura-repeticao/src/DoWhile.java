import java.util.Random;
public class DoWhile {
        public static void main(String[] args) {
        // no primeiro teste o bloco será executado pelo menos uma vez.
        //Joãozinho resolveu ligar para o seu amigo, dizendo que hoje se entupiu de comer docinhos:
        System.out.println("Discando ... ");

        do {
            //executando repetidas vezes até alguem atender
            System.out.println("Telefone tocando ");
        }while(tocando());
        System.out.println("Alô !!!");
    }
    private static boolean tocando() {
		boolean atendeu = new Random().nextInt(3)==1;
		System.out.println("Atendeu? " + atendeu);
		//negando o ato de continuar tocando
		return ! atendeu;
	}
}
