import java.util.Scanner;

public class TestaEmocoes {
    public static void main(String[] args) {
        String nome;
        Scanner entrada = new Scanner(System.in);
        String frase;
        int divertido = 0;
        int chateado = 0;

        System.out.println("Qual seu nome?");
        nome = entrada.nextLine();

        System.out.println("Olá " + nome + ", escreva sua frase para testar suas emoções");
        frase = entrada.nextLine();

        boolean feliz = frase.contains(":-)");
        boolean triste = frase.contains(":-(");

        if (feliz) {
            divertido++;
        }
        if (triste) {
            chateado++;
        }

        if (divertido > chateado) {
            System.out.println("Resultado: Divertido! :-)");
        } else if (divertido < chateado) {
            System.out.println("Resultado: Chateado. :-(");
        } else if (divertido == chateado) {
            System.out.println("Resultado: Neutro.");
        }
    }
}

