import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ContaBancaria conta1 = new ContaBancaria("Jão", 1000.0);
        ContaBancaria conta2 = new ContaBancaria("Maria", 500.0);

        Scanner scanner = new Scanner(System.in);

            System.out.println("Bem-vindo ao sistema bancário!");
            System.out.println("Escolha uma conta para acessar:");
            System.out.println("1. " + conta1.getTitular());
            System.out.println("2. " + conta2.getTitular());
            int escolha = scanner.nextInt();

            ContaBancaria contaSelecionada;
            if (escolha == 1) {
                contaSelecionada = conta1;
                System.out.println("Você selecionou a conta de " + contaSelecionada.getTitular());
                System.out.println("Saldo atual: " + contaSelecionada.getSaldo());
            } else if (escolha == 2) {
                contaSelecionada = conta2;
                System.out.println("Você selecionou a conta de " + contaSelecionada.getTitular());
                System.out.println("Saldo atual: " + contaSelecionada.getSaldo());
            } else {
                System.out.println("Opção inválida. Encerrando o programa.");
                scanner.close();
                return;
            }

            while (true) {
            System.out.println("Escolha uma operação:");
            System.out.println("1. Depositar");
            System.out.println("2. Sacar");
            System.out.println("3. Consultar Saldo");
            System.out.println("4. Sair");
            double operacao = scanner.nextDouble();

            if (operacao == 1) {
                System.out.println("Digite o valor a depositar:");
                double valorDeposito = scanner.nextDouble();
                contaSelecionada.depositar(valorDeposito);
                System.out.println("Depósito realizado. Saldo atual: " + contaSelecionada.getSaldo());
            } else if (operacao == 2) {
                System.out.println("Digite o valor a sacar:");
                double valorSaque = scanner.nextDouble();
                contaSelecionada.sacar(valorSaque);
                System.out.println("Operação de saque realizada. Saldo atual: " + contaSelecionada.getSaldo());
            } else if (operacao == 3) {
                contaSelecionada.consultarSaldo();
            } else if (operacao == 4) {
                System.out.println("Encerrando o programa. Obrigado por usar nosso sistema bancário!");
                break;
            }  else {
                System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
}