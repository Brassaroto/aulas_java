package aula_06;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ex_1 {

    public static void main(String[] args) {
        // 1) Inicializa a ArrayList com 10 Integers
        List<Integer> lista = new ArrayList<>();
        lista.add(2);
        lista.add(5);
        lista.add(1);
        lista.add(3);
        lista.add(4);
        lista.add(9);
        lista.add(7);
        lista.add(8);
        lista.add(10);
        lista.add(6);

        // 2) Exibe a lista com índices
        System.out.print("Índices: ");
        for (int i = 0; i < lista.size(); i++) {
            // Índice exibido após cada elemento
            System.out.printf("%2d[%d]  ", lista.get(i), i);
        }
        System.out.println("\n");

        // 3) Lê do usuário o número a buscar
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o número que você deseja encontrar: ");
        int alvo = sc.nextInt();

        // 4) Procura e exibe a posição ou mensagem de não encontrado
        int pos = lista.indexOf(alvo);
        if (pos != -1) {
            System.out.printf("O número %d está localizado na posição: %d%n", alvo, pos);
        } else {
            System.out.printf("O número %d não foi encontrado!%n", alvo);
        }

        sc.close();
    }
}
