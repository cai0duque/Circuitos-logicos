package decodificador.Decodificadores;
import java.util.Scanner;

public class Decodificador4x16 extends Decodificador implements OperacoesDecodificador {
    private int A, B, C, D;
    private final Scanner scanner = new Scanner(System.in);

    @Override
    public void calcularSaida() {
        int saida = (A << 3) | (B << 2) | (C << 1) | D;
        String valoresLogicos = "A" + A + ", B" + B + ", C" + C + ", D" + D;
        exibirResultado(saida, valoresLogicos);
    }

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

                System.out.println("> Insira o valor da entrada 3 (0 ou 1):");
                C = Integer.parseInt(scanner.nextLine());
                if (C != 0 && C != 1) throw new NumberFormatException();

                System.out.println("> Insira o valor da entrada 4 (0 ou 1):");
                D = Integer.parseInt(scanner.nextLine());
                if (D != 0 && D != 1) throw new NumberFormatException();

                calcularSaida();

                System.out.println("\nDeseja refazer a operação com Decodificador 4x16?");
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
