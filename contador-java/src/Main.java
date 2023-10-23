public class Main {
    public static void main(String[] args) {
        try {
            int numero1 = Integer.parseInt(args[0]);
            int numero2 = Integer.parseInt(args[1]);
            int iteracoes = Integer.parseInt(args[2]);

            if (numero1 >= numero2) {
                throw new NumerosForaDeOrdemException("O segundo número deve ser maior que o primeiro");
            }

            for (int i = numero1; i <= numero2; i += iteracoes) {
                System.out.println(i);
            }
        } catch (NumberFormatException e) {
            System.err.println("Certifique-se de que todos os parâmetros são números inteiros válidos.");
        } catch (NumerosForaDeOrdemException e) {
            System.err.println(e.getMessage());
        }
    }
}

class NumerosForaDeOrdemException extends Exception {
    public NumerosForaDeOrdemException(String mensagem) {
        super(mensagem);
    }
}