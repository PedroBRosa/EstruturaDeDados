package Pratica2.Resource;

public class No {
    public Object element;
    public No next;

    public No(Object elem) {
        element = elem;
        next = null;
    }

    public Object getElement() {
        return element;
    }

    public void setElement(Object element) {
        this.element = element;
    }

    public No getNext() {
        return next;
    }

    public void setNext(No next) {
        this.next = next;
    }
}
