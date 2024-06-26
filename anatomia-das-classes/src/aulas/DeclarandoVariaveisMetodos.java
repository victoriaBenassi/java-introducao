package aulas;
public class DeclarandoVariaveisMetodos{

    public static void main(String[] args) {
        //declarando variaveis
        // Tipo nomeBemDefinido = Atribuicao (opcional em alguns casos)
    
        String primeiroNome = "Victoria";
        String segundoNome = "Rocha";
        //manipulação (alteração) da variavel
        segundoNome = "Benassi";

        String nomeCompleto = nomeCompleto (primeiroNome,segundoNome);
        System.out.println(nomeCompleto);
        }
        //Declarando metodos - estrutura
        //TipoRetorno NomeObjetivoNoInfinitivo Parametro(s)

        public static String nomeCompleto (String primeiroNome, String segundoNome){
            return "Resultado do metodo : " + primeiroNome.concat(" ").concat(segundoNome);
    }
}