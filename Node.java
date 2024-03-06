public class Node<E> {
    private E data;
    private Node<E> next;

    public Node(E dataItem) {
        data = dataItem;
        next = null;
    }

    public Node(E dataItem, Node<E> nodeRef) {
        data = dataItem;
        next = nodeRef;
    }
}
