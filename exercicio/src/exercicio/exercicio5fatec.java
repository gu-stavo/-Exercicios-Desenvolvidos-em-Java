package exercicio;

import java.util.Scanner;

public class exercicio5fatec {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Dados da primeira charrete:");
        System.out.print("Número da charrete: ");
        int numeroCharrete1 = scanner.nextInt();
        System.out.print("Distância à linha de chegada (metros): ");
        double distanciaCharrete1 = scanner.nextDouble();
        System.out.print("Velocidade (km/h): ");
        double velocidadeCharrete1 = scanner.nextDouble();
        System.out.println("-------------------------------");
        System.out.println("Dados da segunda charrete:");
        System.out.print("Número da charrete: ");
        int numeroCharrete2 = scanner.nextInt();
        System.out.print("Distância à linha de chegada (metros): ");
        double distanciaCharrete2 = scanner.nextDouble();
        System.out.print("Velocidade (km/h): ");
        double velocidadeCharrete2 = scanner.nextDouble();

        double tempoCharrete1 = distanciaCharrete1 / velocidadeCharrete1;
        double tempoCharrete2 = distanciaCharrete2 / velocidadeCharrete2;

        if (tempoCharrete1 < tempoCharrete2) {
            System.out.println("-------------------------------");
            System.out.println("A charrete vencedora é o número " + numeroCharrete1);
        } else if (tempoCharrete2 < tempoCharrete1) {
            System.out.println("-------------------------------");
            System.out.println("A charrete vencedora é o número " + numeroCharrete2);
        } else {
            System.out.println("-------------------------------");
            System.out.println("As charretes empataram!");
        }
    }

}
