package aula_07;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class ex1 {

    public static void main(String[] args) {
        Queue<String> filaClientes = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        int opcao;

        do {
            // Exibe o menu
            System.out.println("****************************************");
            System.out.println(" 1 - Adicionar Cliente na Fila");
            System.out.println(" 2 - Listar todos os Clientes");
            System.out.println(" 3 - Retirar Cliente da Fila");
            System.out.println(" 0 - Sair");
            System.out.println("****************************************");
            System.out.print("Digite uma opção: ");
            opcao = sc.nextInt();
            sc.nextLine(); // consumir ENTER

            switch (opcao) {
                case 1:
                    // Adicionar cliente
                    System.out.print("Digite o nome: ");
                    String nome = sc.nextLine();
                    filaClientes.add(nome);
                    // Exibe fila atual
                    System.out.println("Fila:");
                    filaClientes.forEach(System.out::println);
                    System.out.println("Cliente Adicionado!\n");
                    break;

                case 2:
                    // Listar clientes
                    System.out.println("Lista de Clientes na Fila:");
                    if (filaClientes.isEmpty()) {
                        System.out.println("A Fila está vazia!");
                    } else {
                        filaClientes.forEach(System.out::println);
                    }
                    System.out.println();
                    break;

                case 3:
                    // Retirar/chamar cliente
                    if (filaClientes.isEmpty()) {
                        System.out.println("A Fila está vazia!\n");
                    } else {
                        filaClientes.poll(); // remove o primeiro
                        System.out.println("Fila:");
                        if (filaClientes.isEmpty()) {
                            System.out.println("A Fila está vazia!");
                        } else {
                            filaClientes.forEach(System.out::println);
                        }
                        System.out.println("O Cliente foi Chamado!\n");
                    }
                    break;

                case 0:
                    System.out.println("Programa Finalizado!");
                    break;

                default:
                    System.out.println("Opção inválida! Tente novamente.\n");
            }
        } while (opcao != 0);

        sc.close();
    }
}
