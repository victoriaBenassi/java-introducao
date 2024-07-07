package canditatura;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class processoSeletivo {
    public static void main(String[] args) {
        System.out.println("Processo seletivo");
        imprimirSelecionados();
        String [] candidatos = {"FELIPE","MÁRCIA","JULIA","PAULO","AUGUSTO"};
        for (String candidato : candidatos) {
            LigarCandidato(candidato);
        }

    }

    static void LigarCandidato(String candidato){
        int tentativasRealiazadas = 1;
        boolean continuarTentando =true;
        boolean atendeu = false;

        do{
            atendeu = atender();
            continuarTentando = !atendeu;
            if(continuarTentando)
                tentativasRealiazadas++;
            else
                System.out.println("Contato realizado com sucesso");
        }while(continuarTentando && tentativasRealiazadas < 3);

        if(atendeu)
            System.out.println("Conseguimos contato com "+ candidato + " na "+ tentativasRealiazadas);
        else
            System.out.println("Não conseguimos contato com "+candidato+", número maximo de tentativas "+ tentativasRealiazadas);
        }

    //metodo que simula atravez de uma expressao randomica que o valor for entre 1 e 3 for igual a 1 quer dizer que ele atendeu.
    static boolean atender(){
        return new Random().nextInt(3)==1;
    }
    
    static void imprimirSelecionados(){
        String [] candidatos = {"FELIPE","MÁRCIA","JULIA","PAULO","AUGUSTO"};
        System.out.println("Imprimindo a lista de candidatos informando o indice do elemento ");

        for ( int indice = 0; indice < candidatos.length ; indice++){
            System.out.println("O candidato de n° "+ (indice+1) +" é "+ candidatos[indice]);
        }
        System.out.println("Forma abreviada de interação for each");
        for (String candidato : candidatos) {
            System.out.println("O candidato selecionado foi "+ candidato);
        }
        
    }

    static void selecionarCandidatos(){
        String [] candidatos = {"FELIPE","MÁRCIA","JULIA","PAULO","AUGUSTO","MÔNICA","FABRÍCIO","MIRELA","DANIELA","JORGE"};

        int candidatosSelecionados = 0;
        int candidatosAtual = 0;
        double salarioBase = 2000.0;

        while (candidatosSelecionados < 5 && candidatosAtual < candidatos.length){
            String candidato = candidatos[candidatosAtual];
            double salarioPretendido = valorPretendido();

            System.out.println("O candidato "+ candidato +" solicitou este valor de salario " + salarioPretendido);
            if(salarioBase >= salarioPretendido){
                System.out.println("o candidato "+ candidato +" foi selecionado para a vaga");
                candidatosSelecionados ++;
            }
            candidatosAtual ++;
        }
    }

    static double valorPretendido() {
     return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }

    static void analisarCandidato(double salarioPretendido){
        double salarioBase = 2000.0;
        if (salarioBase > salarioPretendido){
            System.out.println("LIGAR PARA O CANDIDATO");
        } else if (salarioBase == salarioPretendido){
            System.out.println("LIGAR PARA O CANDIDATO, COM CONTRA PROPOSTA");
        } else{
            System.out.println("AGUARDANDO RESULTADO DOS DEMAIS CANDIDATOS");
        }
    }
}
