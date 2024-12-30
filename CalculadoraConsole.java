import java.util.Scanner;

public class CalculadoraConsole {
    public static void main(String[] args) {

        boolean continuar = true;

        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Digite o primeiro numero: ");
            int primeiroNumero = scanner.nextInt();

            System.out.println("Digite o segundo numero: ");
            int segundoNumero = scanner.nextInt();

            System.out.println("Escolha uma operação:\n 1 - Adição\n 2 - Subtração\n 3 - Multiplicação\n 4 - Divisão ");
            int operacao = scanner.nextInt();

            switch (operacao) {
                case 1:
                    System.out.println("Você escolheu ADIÇÃO!\n Resultado:" + (primeiroNumero + segundoNumero));
                    break;
                case 2:
                    System.out.println("Você escolheu SUBTRAÇÃO!\n Resultado:" + (primeiroNumero - segundoNumero));
                    break;
                case 3:
                    System.out.println("Você escolheu MULTIPLICAÇÃO!\n Resultado: " + (primeiroNumero * segundoNumero));
                    break;
                case 4:
                    if (segundoNumero != 0) {
                        System.out.println("Você escolheu DIVISÃO!\n Resultado " + (primeiroNumero / segundoNumero));
                    } else {
                        System.out.println("Erro: Divisão por zero não é permitida.");
                    }
                    break;
                default:
                    System.out.println("Operação inválida.");
            }

            System.out.println("Deseja realizar outro cálculo? (s/n): ");
            char resposta = scanner.next().charAt(0);
            if (resposta == 'n' || resposta == 'N') {
                continuar = false;
            }

        } while (continuar);

        System.out.println("Programa encerrado.");
        scanner.close();
    }
}