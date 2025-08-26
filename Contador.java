import java.util.Scanner;

public class Contador {
    public static class ParametrosInvalidosException extends Exception {
        public ParametrosInvalidosException(String mensagem) {
            super(mensagem);
        }
    }

    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
        System.out.println("Digite o primeiro parâmetro");
        int parametroUm = terminal.nextInt();
        System.out.println("Digite o segundo parâmetro");
        int parametroDois = terminal.nextInt();

        try {
            // Chamando o método contendo a lógica de contagem
            contar(parametroDois, parametroUm);
        } catch (ParametrosInvalidosException e) {
            // Imprimir a mensagem: segundo parâmetro deve ser maior que o primeiro
            System.out.println("segundo parâmetro deve ser maior que o primeiro: " + e.getMessage());
        } finally {
            terminal.close();
        }
    }

    static void contar(int parametroDois, int parametroUm) throws ParametrosInvalidosException {
        // Validar se parametroUm é MAIOR que parametroDois e lançar a exceção
        if (parametroDois <= parametroUm) {
            throw new ParametrosInvalidosException("O segundo número deve ser maior que o primeiro");
        }

        int contagem = parametroDois - parametroUm;
        for (int i = 0; i < contagem; i++) {
            System.out.printf("Imprimindo o número: %d\n", (parametroUm + i + 1)); // +1 para imprimir o próximo número
        }
    }
}
