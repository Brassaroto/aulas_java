package dia4;

import java.util.Scanner;

public class tabuada04 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.println("Digite um número inteiro:");
        int numero = leia.nextInt();

        for (int contador = 1; contador <= 10; contador++) {
            System.out.printf("%d x %d = %d%n", numero, contador, (numero * contador));
        }

        leia.close();
    }
}
