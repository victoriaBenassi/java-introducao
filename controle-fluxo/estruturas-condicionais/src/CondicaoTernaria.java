public class CondicaoTernaria {
    public static void main(String[] args) {
        int nota = 6;
        // Cenário 1 - if else
        String resultado = nota >= 7 ? "Aprovado " : "Reprovado";
        System.out.println(resultado);

        // Cenário 2 - if else if else
        String resultado2 = nota >= 7 ? "Aprovado " : nota >=5 && nota < 7 ? "Recuperação" : "Reprovado";
        System.out.println(resultado2);

    }
}
