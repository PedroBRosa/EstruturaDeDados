package Pratica2.Q2;


import Pratica2.Resource.*;

public class Main {
    public static void main(String[] args) {
        // Codigo para testar o mergList
        int count = 0;
        Lista lista = new Lista();
        Lista listaPriority = new Lista();

        for (int i = 1; i <= 10; i++) {
            count = i;
            if ((count % 2 != 0) && (count <= 99)) {
                listaPriority.insertAtEnd(count);
            } else {
                lista.insertAtEnd(count);
            }
        }
        Lista lista1 = new Lista();
        lista1.mergList(lista, listaPriority);

    }
}
