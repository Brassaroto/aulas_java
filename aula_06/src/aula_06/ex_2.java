package aula_06;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ex_2 {

    public static void main(String[] args) {
        // 1) Inicializa o Set com 10 Integers
        Set<Integer> conjunto = new HashSet<>();
        conjunto.add(2);
        conjunto.add(5);
        conjunto.add(1);
        conjunto.add(3);
        conjunto.add(4);
        conjunto.add(9);
        conjunto.add(7);
        conjunto.add(8);
        conjunto.add(10);
        conjunto.add(6);

        // 2) Exibe os elementos do Set
        System.out.println("Conjunto: " + conjunto);

        // 3) Lê do usuário o número a buscar
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o número que você deseja encontrar: ");
        int alvo = sc.nextInt();

        // 4) Verifica e exibe mensagem
        if (conjunto.contains(alvo)) {
            System.out.printf("O número %d foi encontrado!%n", alvo);
        } else {
            System.out.printf("O número %d não foi encontrado!%n", alvo);
        }

        sc.close();
    }
}
