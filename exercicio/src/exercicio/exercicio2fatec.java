
package exercicio;

import java.util.Scanner;

public class exercicio2fatec {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int vitorias = 0;

        for (int i = 0; i < 6; i++) {
            System.out.print("O participante venceu o jogo " + (i + 1) + "? (V/P): ");
            String resposta = scanner.nextLine();

            if (resposta.equalsIgnoreCase("V")) {
                vitorias++;
            }
        }

        if (vitorias >= 5) {
            System.out.println("O participante está no Grupo 1");
        } else if (vitorias >= 3) {
            System.out.println("O participante está no Grupo 2");
        } else if (vitorias >= 1) {
            System.out.println("O participante está no Grupo 3");
        } else {
            System.out.println("O participante não está em nenhum grupo (-1)");
        }
    }
    
}
