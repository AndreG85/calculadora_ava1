import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean cond = false;

        while (!cond) {
            System.out.println("**CALCULADORA**");
            System.out.print("Digite o primeiro número: ");
            double numero1 = scanner.nextDouble();
            System.out.print("Digite o operador (+, -, *, /): ");
            char operador = scanner.next().charAt(0);
            System.out.print("Digite o segundo número: ");
            double numero2 = scanner.nextDouble();

            double resultado = 0.0;

            switch (operador) {
                case '+':
                    resultado = numero1 + numero2;
                    break;
                case '-':
                    resultado = numero1 - numero2;
                    break;
                case '*':
                    resultado = numero1 * numero2;
                    break;
                case '/':
                    if (numero2 != 0) {
                        resultado = numero1 / numero2;
                    } else {
                        System.out.println("Erro: Divisão por zero não é permitida.");
                        return;
                    }
                    break;
                default:
                    System.out.println("Operador inválido.");
                    return;
            }

            System.out.println("Resultado: " + resultado);
            System.out.println();
            System.out.print("Deseja continuar? [S / N]: ");
            String op = scanner.next();

            if (op.equalsIgnoreCase("N")) {
                cond = true;
            } else if (op.equalsIgnoreCase("S")) {
                cond = false;
            } else {
                System.out.println("Entrada inválida. A calculadora continuará.");
            }
        }
        System.out.println();
        System.out.println("Calculadora finalizada!");
        scanner.close();
    }
}
