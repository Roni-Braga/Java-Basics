public class TiposVariaveis {
    public static void main(String[] args) {

        // declarando variavel do tipo SHORT
        short numeroCurto = 1;
        // declarando variável do tipo INT e recebendo variável do tipo SHORT
        int numeroNormal = numeroCurto;
        // declarando variavel do tipo SHORT e transformando a variavel do tipo INT em
        // SHORT
        short novoNumero = (short) numeroNormal;

        System.out.println(novoNumero);

        int numero = 5;
        numero = 10;

        System.out.println(numero);
        // utilizando constante
        final double VALOR_DE_PI = 3.14;

    }
}
