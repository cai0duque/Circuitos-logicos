package decodificador.Decodificadores;

public abstract class Decodificador {
    public abstract void realizarOperacao();

    //Resultado
    protected void exibirResultado(int saida, String valoresLogicos) {
        System.out.println("> Resultado:");
        System.out.println("- Saída " + (saida + 1) + ", Y" + saida);
        System.out.println("- Valor lógico: " + valoresLogicos);
    }
}
