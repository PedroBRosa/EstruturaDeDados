package Pratica3.Q1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        String[] top10 = new String [10];
        Scanner scanner = new Scanner(new File("c:\\Users/pbrit/OneDrive/Documentos/Tools/frases.txt"));
        Stack stack = new Stack();
        while (scanner.hasNextLine()){
            stack.push(scanner.nextLine());
        }
        for (int i = 0; i < 10; i++) {
            top10[i] = (String) stack.pop();
            System.out.println("Top "+(i+1)+" Mais Buscado '"+top10[i]+"'");
        }
        System.out.print("\n\n\n===================================\n");
        while (!stack.empty()){
            System.out.println(stack.pop());
        }
    }
}
