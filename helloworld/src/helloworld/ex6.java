package helloworld;

import java.util.Scanner;

public class ex6 {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[][] notas = new double[10][4]; // Matriz com as notas
        double[] medias = new double[10];     // Vetor com as médias

        // Entrada de dados: preenchendo a matriz
        for (int i = 0; i < 10; i++) {
            System.out.println("Digite as 4 notas do participante " + (i + 1) + ":");
            for (int j = 0; j < 4; j++) {
                System.out.print("Nota " + (j + 1) + ": ");
                notas[i][j] = scanner.nextDouble();
            }
        }

        // Cálculo das médias
        for (int i = 0; i < 10; i++) {
            double soma = 0;
            for (int j = 0; j < 4; j++) {
                soma += notas[i][j];
            }
            medias[i] = soma / 4;
        }

        // Saída de dados: exibindo as médias com uma casa decimal
        System.out.println("\nMédias dos participantes:");
        for (int i = 0; i < 10; i++) {
            System.out.printf("%.1f ", medias[i]);
        }

        scanner.close();
    }

}
