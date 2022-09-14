package Pratica2.Resource;


public class Lista {
    private No frist, last;

    public Lista() {
        frist = null;
        last = null;
    }

    public boolean listEmpy() {
        if (frist == null) {
            return true;
        } else {
            return false;
        }
    }

    public void insertAtBeginning(Object element) {
        No newNo = new No(element);
        if (listEmpy()) {
            last = newNo;
        } else {
            newNo.next = frist;
        }
        frist = newNo;
    }

    public void insertAtEnd(Object element) {
        No newNo = new No(element);
        if (listEmpy()) {
            frist = newNo;
        } else {
            last.next = newNo;
        }
        last = newNo;
    }

    public void printList(String mensagem) {
        int i = 1;
        No noTemp = frist;
        while (noTemp != null) {
            System.out.printf(mensagem + " " + noTemp.element + "\t");
            noTemp = noTemp.next;
        }
        System.out.printf("\n");
    }

    public int listLengh() {
        int lengh = 0;
        No noTemp = frist;
        while (noTemp != null) {
            lengh += 1;
            noTemp = noTemp.next;
        }
        return lengh;
    }

    public No get(int posicao) {
        No atual = this.frist;
        for (int i = 0; i < posicao; i++) {
            if (atual.getNext() != null) {
                atual = atual.getNext();
            }
        }
        return atual;
    }

// Nao esta funcional ainda
    public void mergList(Lista list1, Lista list2) {
        int i = 0;
        Lista mergList = new Lista();
        while (i < list1.listLengh()) {
            mergList.insertAtEnd(list1.get(i));
            i++;
        }
        i = 0;
        while (i<list2.listLengh()) {
            mergList.insertAtEnd(list2.get(i));
            i++;
        }
    }

}
