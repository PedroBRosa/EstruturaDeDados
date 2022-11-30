package Pratica7;

import java.util.Random;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int menu;
        TreeAplica tree = escolherParametros();
        Scanner ler = new Scanner(System.in);
        do {
            System.out.println("Entre com o elemento:");
            System.out.println("----1: Menor elemento");
            System.out.println("----2: Maior elemento");
            System.out.println("----3: Árvores são idênticas?");
            System.out.println("----4: Altura");
            System.out.println("----5: Está balanceada?");
            System.out.println("----6: Sair do programa");
            System.out.println("***********************************");
            System.out.print("-> ");
            menu = ler.nextInt();

            switch (menu) {
                case 1:
                    System.out.println("Menor elemento: " + tree.min());
                    break;
                case 2:
                    System.out.println("Maior elemento: " + tree.max());
                    break;
                case 3:
                    System.out.println("Preencha uma nova árvore para comparar");
                    TreeAplica tree2 = escolherParametros();
                    System.out.println("Idênticas: " + tree.equals(tree2));
                    break;
                case 4:
                    System.out.println("Altura: " + tree.height());
                    break;
                case 5:
                    System.out.println("Balanceada: " + tree.isBalanced());
                    break;
                case 6:
                    System.out.println("Volte sempre =)");
                    break;
                default:
                    System.out.println("Opção inválida.");
                    break;
            }
        } while (menu != 6);

        ler.close();
    }

    private static TreeAplica escolherParametros() {
        int valorMaximoPermitido, quantidade;
        TreeAplica binaryTree = new TreeAplica();
        Scanner ler = new Scanner(System.in);

        System.out.print("Quantos elementos deseja inserir na árvore: ");
        quantidade = ler.nextInt();
        System.out.print("Valor máximo permitido [INTEGER]: ");
        valorMaximoPermitido = ler.nextInt();
        preencherArvore(binaryTree,quantidade,valorMaximoPermitido);

        return binaryTree;
    }

    private static void preencherArvore(TreeAplica binaryTree, int quantidade, int valorMaximoPermitido) {
        Random random = new Random();
        int num;
        System.out.println();
        while (quantidade > 0) {
            num = random.nextInt(valorMaximoPermitido);
            binaryTree.insert(num);
            System.out.println("Valor inserido: " + num);
            quantidade--;
        }
        System.out.println();
    }

}
