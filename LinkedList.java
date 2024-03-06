public class LinkedList<E> {
    private Node<E> head = null;
    private int size = 0;

    public void addFirst(E item) {
        head = new Node<>(item, head);
        size++;
    }

    public void addAfter(Node<E> node, E item) {
        node.next = new Node<>(item, node.next);
        size++;
    }

    public E removeAfter(Node<E> node) {
        Node<E> temp = node.next;
        if (temp != null) {
            node.next = temp.next;
            size--;
            return temp.data;
        } else {
            return null;
        }
    }

    public E removeFirst() {
        Node<E> temp = head;
        if (head != null) {
            head = head.next;
            size--;
            return temp.data;
        } else {
            return null;
        }
    }


    private static class Node<E> {
        private E data;
        private Node<E> next;

        private Node(E dataItem, Node<E> nodeRef) {
            data = dataItem;
            next = nodeRef;
        }
    }

    public static void main(String[] args) {
        LinkedList<String> names = new LinkedList<>();
        names.addFirst("Sam");
        names.addFirst("Harry");
        names.addFirst("Dick");
        names.addFirst("Tom");

        Node<String> harry = names.head.next.next;

        Node<String> bob = new Node<>("Bob", harry.next);
        harry.next = bob;
    }


}
