public class ObjectStack<T> implements Stack<T> {
    private Node<T> top; // referência para o topo da pilha

    // casinha
    private class Node<T> {
        private T data;
        private Node<T> next;

        public Node(T data) {
            this.data = data;
            next = null;
        }
        public T getData() {
            return data;
        }

        public void setData(T data) {
            this.data = data;
        }

        public Node<T> getNext() {
            return next;
        }

        public void setNext(Node<T> next) {
            this.next = next;
        }
    }

    public ObjectStack() {
        top = null;
    }

    // void push(T data);
    public void push(T data) {
        // criar a casinha
        Node<T> aux = new Node<>(data);

        // se a pilha estiver vazia
        if (isEmpty()) {
            top = aux;
        } else {
            aux.next = top;
            top = aux;
        }
    }

    // T pop();
    public T pop() {
        Node<T> aux; // etiqueta auxiliar
        T data; // valor retornado ao usuário

        // não pode ser vazia!!!
        if (isEmpty()) { // não pode desempilhar! erro!
            throw new IndexOutOfBoundsException("Pilha vazia!");
        }
        // aux = topo
        aux = top;  // etiqueta auxiliar aponta para o primeiro nó
        top = top.next; // primeiro aponta para o segundo
        aux.next = null; // desconecto o auxiliar da fila
        data = aux.data; // obter o valor para retornar
        // top aponta para aux.next, aux.next <- null

        // retorna aux.valor
        return data;
    }

    // boolean isEmpty();
    // se o topo for null é vazio
    public boolean isEmpty() {
        return (top == null);
    }
}
