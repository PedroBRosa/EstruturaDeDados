package Pratica1.Q2;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int minInt=999, maxInt=0;
        int [][] vet =  new int[3][4];
        Random random = new Random();
        System.out.println("====MATRIZ=====");
        for (int i = 0; i < vet.length; i++) {
            for (int j = 0; j < vet[i].length; j++) {
                vet[i][j] = random.nextInt(999);
                System.out.printf("%d\t",vet[i][j]);
                if(minInt>vet[i][j])minInt=vet[i][j];
                if(maxInt<vet[i][j])maxInt=vet[i][j];

            }
            System.out.printf("\n");
        }
        System.out.println("===============");
        System.out.println("Menor valor presente na Matriz: "+minInt);
        System.out.println("Maior valor presente na Matriz: "+maxInt);
    }
}
