package jogovelha;

import java.util.Random;
import java.util.Scanner;

public class JogoDaVelha {
    private static char[][] tabuleiro = new char[3][3];
    private static char jogadorAtual;
    private static boolean jogoEmAndamento = true;

    public static void main(String[] args) {
        inicializarTabuleiro();
        escolherJogadorInicial();
        imprimirTabuleiro();

        while (jogoEmAndamento) {
            realizarJogada();
            imprimirTabuleiro();
            verificarResultado();
            trocarJogador();
        }
    }

    private static void inicializarTabuleiro() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                tabuleiro[i][j] = '-';
            }
        }
    }

    private static void escolherJogadorInicial() {
        Scanner scanner = new Scanner(System.in);
        char escolha;

        do {
            System.out.print("Quem quer começar a jogar? (X ou O): ");
            escolha = Character.toUpperCase(scanner.next().charAt(0));
        } while (escolha != 'X' && escolha != 'O');

        jogadorAtual = escolha;
    }

    private static void imprimirTabuleiro() {
        System.out.println();
        System.out.println("Tabuleiro:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(tabuleiro[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static void realizarJogada() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int linha, coluna;
        do {
            System.out.println();
            System.out.print("Jogador " + jogadorAtual + ", digite o seu valor (X ou O): ");
            char valorEscolhido = Character.toUpperCase(scanner.next().charAt(0));
            if ((jogadorAtual == 'X' && (valorEscolhido == 'X' || valorEscolhido == 'x')) ||
                (jogadorAtual == 'O' && (valorEscolhido == 'O' || valorEscolhido == 'o'))) {
                linha = random.nextInt(3);
                coluna = random.nextInt(3);
                if (tabuleiro[linha][coluna] == '-') {
                    tabuleiro[linha][coluna] = valorEscolhido;
                    return;
                }
            } else {
                System.out.println("Opção inválida para o jogador " + jogadorAtual + ", tente novamente.");
                System.out.println();
            }
        } while (true);
    }

    private static void verificarResultado() {
        if (verificarVitoria()) {
            System.out.println("Jogador " + jogadorAtual + " venceu!");
            System.out.println();
            jogoEmAndamento = false;
        } else if (verificarEmpate()) {
            System.out.println("Empate!");
            System.out.println();
            jogoEmAndamento = false;
        }
    }

    private static boolean verificarVitoria() {
        for (int i = 0; i < 3; i++) {
            if (tabuleiro[i][0] == jogadorAtual && tabuleiro[i][1] == jogadorAtual && tabuleiro[i][2] == jogadorAtual) {
                return true;
            }
            if (tabuleiro[0][i] == jogadorAtual && tabuleiro[1][i] == jogadorAtual && tabuleiro[2][i] == jogadorAtual) {
                return true;
            }
        }
        if (tabuleiro[0][0] == jogadorAtual && tabuleiro[1][1] == jogadorAtual && tabuleiro[2][2] == jogadorAtual) {
            return true;
        }
        return tabuleiro[0][2] == jogadorAtual && tabuleiro[1][1] == jogadorAtual && tabuleiro[2][0] == jogadorAtual;
    }

    private static boolean verificarEmpate() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (tabuleiro[i][j] == '-') {
                    return false;
                }
            }
        }
        return true;
    }

    private static void trocarJogador() {
        jogadorAtual = (jogadorAtual == 'X') ? 'O' : 'X';
    }
}