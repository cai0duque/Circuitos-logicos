package decodificador.main;
import decodificador.Decodificadores.*;
import decodificador.Exceptions.EntradaInvalidaException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                System.out.println("--------Selecione:---------");
                System.out.println("1- Decodificador 2x4");
                System.out.println("2- Decodificador 3x8");
                System.out.println("3- Decodificador 4x16");
                System.out.println("4- Decodificador 5x32");
                System.out.println("5- Decodificador 6x64");
                System.out.println("6- Sair");
                System.out.println("----------------------------");

                int opcao = Integer.parseInt(scanner.nextLine());

                Decodificador decodificador;

                switch (opcao) {
                    case 1:
                        decodificador = new Decodificador2x4();
                        decodificador.realizarOperacao();
                        break;
                    case 2:
                        decodificador = new Decodificador3x8();
                        decodificador.realizarOperacao();
                        break;
                    case 3:
                        decodificador = new Decodificador4x16();
                        decodificador.realizarOperacao();
                        break;
                    case 4:
                        decodificador = new Decodificador5x32();
                        decodificador.realizarOperacao();
                        break;
                    case 5:
                        decodificador = new Decodificador6x64();
                        decodificador.realizarOperacao();
                        break;
                    case 6:
                        System.out.println("Saindo...");
                        return;
                    default:
                        throw new EntradaInvalidaException("Opção inválida. Tente novamente.");
                }
            } catch (EntradaInvalidaException | NumberFormatException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
