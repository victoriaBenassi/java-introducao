public class OperadoresRelacionais {
    public static void main(String[] args) {
        
        // == igual 
        // != diferente de
        // >  maior que 
        // >= maior ou igual
        // <  menor que 
        // <= menor ou igual

         int numero1 = 1;
         int numero2 = 2;

         boolean simNão = numero1 == numero2;
         System.out.println("Numero1 é igual a numero2 ? " + simNão);
         
         simNão = numero1 != numero2;
         System.out.println("Numero1 é diferente de numero2 ? " + simNão);
        
         simNão = numero1 > numero2;
         System.out.println("Numero1 é maior que numero2 ? " + simNão);

         simNão = numero1 >= numero2;
         System.out.println("Numero1 é maior ou igual ao numero2 ? " + simNão);

         simNão = numero1 < numero2;
         System.out.println("Numero1 é menor que numero2 ? " + simNão);

         simNão = numero1 <= numero2;
         System.out.println("Numero1 é menor ou igual ao numero2 ? " + simNão);

         //comparação avançada
         // a forma mais recomendada de comparar objetos é usar equals
         String nomeUm =  "Java";
         String nomeDois = "Java";

         System.out.println(nomeUm == nomeDois);

         String nomeTres = new String("Java");

         System.out.println(nomeUm.equals(nomeTres));

    }
}
