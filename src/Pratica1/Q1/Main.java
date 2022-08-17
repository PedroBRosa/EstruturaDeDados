package Pratica1.Q1;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner ler = new Scanner(System.in);
        int[] vet = new int[10];
        int shared, controler = -1;
        System.out.println("Escreva o número que deseja buscar: ");
        shared = ler.nextInt();

        for (int i = 0; i < vet.length; i++) {
            vet[i] = random.nextInt(999);
            System.out.print(" " + vet[i]);
        }
        for (int i = 0; i < vet.length; i++) {
            if (shared == vet[i]) {
                controler = i + 1;
                System.out.println("\n Número encontrado na " + controler + "° pocição");
            }
        }
        if (controler == -1) System.out.println("\n Número não encontrado!");

    }
}
