package decodificador.Decodificadores;
import java.util.Scanner;

public class Decodificador2x4 extends Decodificador implements OperacoesDecodificador {
    private int A, B;
    private final Scanner scanner = new Scanner(System.in);

    //Calcular saída
    @Override
    public void calcularSaida() {
        int saida = (A << 1) | B;
        String valoresLogicos = "A" + A + ", B" + B;
        exibirResultado(saida, valoresLogicos);
    }

    //Realizar operações
    @Override
    public void realizarOperacao() {
        while (true) {
            try {
                System.out.println("> Insira o valor da entrada 1 (0 ou 1):");
                A = Integer.parseInt(scanner.nextLine());
                if (A != 0 && A != 1) throw new NumberFormatException();

                System.out.println("> Insira o valor da entrada 2 (0 ou 1):");
                B = Integer.parseInt(scanner.nextLine());
                if (B != 0 && B != 1) throw new NumberFormatException();

                calcularSaida();

                System.out.println("\nDeseja refazer a operação com Decodificador 2x4?");
                System.out.println("1- Sim");
                System.out.println("2- Não");
                int escolha = Integer.parseInt(scanner.nextLine());

                if (escolha == 2) break;
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida! Apenas valores 0 ou 1 são permitidos.");
            }
        }
    }
}