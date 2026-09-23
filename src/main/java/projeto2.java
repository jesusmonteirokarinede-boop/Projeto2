import java.util.Scanner;

class CaixaEletronico {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double saldo = 0.0;
        int opcao = 0;

        do {
            System.out.println("==== CAIXA ELETRONICO ====");
            System.out.println("1 - Consultar Saldo");
            System.out.println("2 - Realizar Depósito");
            System.out.println("3 - Realizar Saque");
            System.out.println("4 - Sair");
            System.out.print("Escolha uma opção: ");

            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.printf("Seu saldo atual é de: R$ %.2f\n", saldo);
                    break;

                case 2:
                    System.out.print("Digite o valor do depósito: R$ ");
                    double valordeposito = scanner.nextDouble();

                    if (valordeposito > 0) {
                        saldo += valordeposito;
                        System.out.printf("Depósito realizado com sucesso! Saldo atual: R$ %.2f\n", saldo);
                    } else {
                        System.out.println("Valor inválido.");
                    }
                    break;

                case 3:
                    System.out.print("Digite o valor do saque: R$ ");
                    double valorsaque = scanner.nextDouble();

                    if (valorsaque <= 0) {
                        System.out.println("Valor inválido.");
                    } else if (valorsaque <= saldo) {
                        saldo -= valorsaque;
                        System.out.printf("Saque realizado com sucesso! Saldo atual: R$ %.2f\n", saldo);
                    } else {
                        System.out.println("Saldo insuficiente.");
                    }
                    break;

                case 4:
                    System.out.println("Sessão encerrada. Agradecemos por utilizar nosso caixa eletrônico!");
                    break;

                default:
                    System.out.println("Opção Inválida.");
                    break;
            }
        } while (opcao != 4);


    }
}