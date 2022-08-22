package Pratica1.Q3;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int[] vet = new int[50];
        int controler, start = 0, end = vet.length - 1, quite;
        Scanner ler = new Scanner(System.in);
        for (int i = 0; i < vet.length; i++) vet[i] = random.nextInt(0, 999);

        for (int i = 0; i < vet.length; i++) {
            for (int j = 0; j < vet.length - 1; j++) {
                if (vet[j] > vet[j + 1]) {
                    controler = vet[j];
                    vet[j] = vet[j + 1];
                    vet[j + 1] = controler;
                }
            }
        }

        //descomente a linha 25 para testar o código;//
//        for (int i = 0; i < vet.length; i++) System.out.print(vet[i]+"\t");


        System.out.println("\nEscreva o número que deseja encontrar: ");
        controler = ler.nextInt();

        while (start <= end) {
            quite = (start + end) / 2;
            if (vet[quite] == controler) {
                quite++;
                System.out.println("Número encontrado na " + quite + "° posição");
                break;
            } else if (vet[quite] < controler) {
                start = quite + 1;
            } else {
                end = quite - 1;
            }
            if (start > end) {
                System.out.println("O número não foi encontrado");
            }
        }

    }
}

