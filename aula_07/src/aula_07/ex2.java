package aula_07;

import java.util.Scanner;
import java.util.Stack;

public class Ex2 {

    public static void main(String[] args) {
        Stack<String> pilhaLivros = new Stack<>();
        Scanner sc = new Scanner(System.in);
        int opcao;

        do {
            // Exibe o menu
            System.out.println("****************************************");
            System.out.println(" 1 - Adicionar Livro na Pilha");
            System.out.println(" 2 - Listar todos os Livros");
            System.out.println(" 3 - Retirar Livro da Pilha");
            System.out.println(" 0 - Sair");
            System.out.println("****************************************");
            System.out.print("Digite uma opção: ");
            opcao = sc.nextInt();
            sc.nextLine(); // consome ENTER

            switch (opcao) {
                case 1:
                    // Adicionar livro
                    System.out.print("Digite o nome: ");
                    String titulo = sc.nextLine();
                    pilhaLivros.push(titulo);
                    // Exibe pilha atual
                    System.out.println("Pilha:");
                    for (int i = 0; i < pilhaLivros.size(); i++) {
                        System.out.println("  " + pilhaLivros.get(i));
                    }
                    System.out.println("Livro adicionado!\n");
                    break;

                case 2:
                    // Listar livros
                    System.out.println("Lista de Livros na Pilha:");
                    if (pilhaLivros.isEmpty()) {
                        System.out.println("A Pilha está vazia!");
                    } else {
                        for (String livro : pilhaLivros) {
                            System.out.println("  " + livro);
                        }
                    }
                    System.out.println();
                    break;

                case 3:
                    // Retirar (pop) um livro
                    if (pilhaLivros.isEmpty()) {
                        System.out.println("A Pilha está vazia!\n");
                    } else {
                        System.out.println("Pilha:");
                        for (String livro : pilhaLivros) {
                            System.out.println("  " + livro);
                        }
                        pilhaLivros.pop();
                        System.out.println("Um Livro foi retirado da pilha!\n");
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
