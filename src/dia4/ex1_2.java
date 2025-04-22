package dia4;

import java.util.Scanner;

public class ex1_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero, pares = 0, impares = 0;

        // Laço para ler 10 números
        for (int i = 1; i <= 10; i++) {
            System.out.print("Digite o " + i + "º número: ");
            numero = scanner.nextInt();

            // Condicional para verificar se é par ou ímpar
            if (numero % 2 == 0) {
                pares++;
            } else {
                impares++;
            }
        }

        // Saída com os totais
        System.out.println("\nTotal de números pares: " + pares);
        System.out.println("Total de números ímpares: " + impares);

        scanner.close();
    }
}
