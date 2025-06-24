import java.util.Scanner;

public class App {
    public static Conta criarConta(Scanner scanner) {
        System.out.println("Informe o número da conta:");
        int numero = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Informe a agência:");
        String agencia = scanner.nextLine();
        System.out.println("Informe o nome do titular da conta:");
        String titular = scanner.nextLine();
        Conta conta = new Conta(numero, agencia, titular);
        System.out.println(conta.getResumo());
        return conta;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Conta conta = criarConta(scanner);

        while (true) {
            System.out.println("Escolha uma opção: 1 - Depositar | 2 - Sacar | 0 - Sair");
            int escolha = scanner.nextInt();

            if (escolha == 1) {
                System.out.println("Informe o valor a depositar:");
                float valorDeposito = scanner.nextFloat();
                conta.depositar(valorDeposito);
            } else if (escolha == 2) {
                System.out.println("Informe o valor a sacar:");
                float valorSaque = scanner.nextFloat();
                conta.sacar(valorSaque);
            } else if (escolha == 0) {
                System.out.println("Encerrando o sistema. Obrigado!");
                break;
            } else {
                System.out.println("Opção inválida. Tente novamente.");
            }
        }

        scanner.close();
    }
}
