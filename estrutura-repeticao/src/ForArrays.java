public class ForArrays {
    public static void main(String[] args) {
        //Também usamos o controle de fluxo for, para interagir sobre arrays e coleções:
        
        //em arrays o indice inicia em zero
        String alunos[] = {"Felipe","Jonas","Julia","Marcos"};

        for (int x = 0; x < alunos.length; x++){
            System.out.println("O aluno no indice x = "+ x + " é " + alunos[x]);

        }
    }
}
