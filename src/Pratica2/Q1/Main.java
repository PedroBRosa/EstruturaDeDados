package Pratica2.Q1;

import Pratica2.Resource.Lista;

public class Main {
    public static void main(String[] args) {
        int count = 0;
        Lista lista = new Lista();
        Lista listaPriority = new Lista();

        for (int i = 1; i <= 200; i++) {
            count = i;
            if ((count % 2 != 0) && (count <= 99)) {
                listaPriority.insertAtEnd(count);
            } else {
                lista.insertAtEnd(count);
            }
        }
        lista.printList("Fila Normal");
        listaPriority.printList("Prioridade");
        listaPriority.get(5);
    }
}
