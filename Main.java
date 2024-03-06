public class Main {
    public static void main(String[] args) {
        Node<String> tom = new Node<>("Tom");
        Node<String> dick = new Node<>("Dick");
        Node<String> harry = new Node<>("Harry");
        Node<String> sam = new Node<>("Sam");

        tom.next = dick;
        dick.next = harry;
        harry.next = sam;

        // Insert "Bill" before "Tom"
        Node<String> billNode = new Node<>("Bill", names.head);
        names.head = billNode;
        names.size++;

        // Insert "Sue" before "Sam"
        Node<String> sueNode = new Node<>("Sue", names.head.next.next.next);
        names.head.next.next.next = sueNode;
        names.size++;

        // Remove "Bill"
        names.head = names.head.next;
        names.size--;

        // Remove "Sam"
        Node<String> samNode = names.head.next;
        names.head.next = samNode.next;
        names.size--;

        // Print the elements of the modified linked list
        Node<String> current = names.head;
        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }

    }
}
