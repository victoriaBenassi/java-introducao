public class CondicionalEncadeada {
    public static void main(String[] args) {
        //sistema de resultado escolar
        int nota = 7;

        if (nota >= 7 )
         System.out.println("Aprovado");

        else if( nota >= 5 && nota < 7)
         System.out.println("Recuperação");

        else
         System.out.println("Reprovado");
    }
}
