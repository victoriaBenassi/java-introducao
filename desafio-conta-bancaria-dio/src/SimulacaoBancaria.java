import java.util.Scanner;

public class SimulacaoBancaria {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double saldo = 0;
        boolean continuar = true;

        System.out.println("Seja bem-vindo(a) ao sistema de simulação bancario");

        while (continuar) {
            System.out.println("Digite a opção desejada: ");
            System.out.println(" 1 - Depositar \n 2 - Sacar \n 3 - Consultar Saldo \n 0 - Encerrar");
            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    // TODO: Ler o valor a ser depositado e atualizar/imprimir o saldo.
                    System.out.println("Insira o valor a ser depositado : ");
                    double valorDepositado = scanner.nextDouble();
                    saldo +=valorDepositado;
                    System.out.println("Atualizando seu saldo...");
                    System.out.println("Saldo : "+ saldo);
                    break;
                case 2:
                    // TODO: Ler o valor a ser sacado e verificar/imprimir se há saldo suficiente.
                    System.out.println("Saldo : "+ saldo);
                    System.out.println("Insira o valor que deseja sacar : ");
                    double valorSacar = scanner.nextDouble(); 
                    if (valorSacar <= saldo ) {
                        saldo -= valorSacar;
                        System.out.println("Saldo após o saque " + valorSacar + " é : " + saldo);
                    } else {
                        System.out.println("Saldo insulficiente para saque ");
                    }
                    break;
                case 3:
                    // TODO: Exibir o saldo atual da conta.
                    System.out.println("O seu saldo atual é de :" + saldo);
                    break;
                case 0:
                    System.out.println("Programa encerrado.");
                    continuar = false;  // Atualiza a variável de controle para encerrar o loop
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
        scanner.close();
    }
}