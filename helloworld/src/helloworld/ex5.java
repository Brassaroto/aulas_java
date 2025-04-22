package helloworld;

import java.util.Scanner;

public class ex5 {


    public static void main(String[] args) {
        // Vetor com 10 números inteiros não ordenados e não repetidos
        int[] vetor = {2, 5, 1, 3, 4, 9, 7, 8, 10, 6};

        Scanner scanner = new Scanner(System.in);

        // Saída de dados
        System.out.print("Digite o número que você deseja encontrar: ");
        int numero = scanner.nextInt();

        // Variável para saber se o número foi encontrado
        boolean encontrado = false;

        // Laço de repetição para buscar no vetor
        for (int i = 0; i < vetor.length; i++) {
            // Laço condicional para verificar se é o número procurado
            if (vetor[i] == numero) {
                System.out.println("O número " + numero + " está localizado na posição: " + i);
                encontrado = true;
                break; // encerra o laço ao encontrar
            }
        }

        // Caso não encontre
        if (!encontrado) {
            System.out.println("O número " + numero + " não foi encontrado!");
        }

        scanner.close();
    }


}
