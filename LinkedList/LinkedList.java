package LinkedList;


/**
 * Class for LinkedList Implementation
 * Mainly acts as wrapper for linked series of Nodes
 */
public class LinkedList<DT> {
    
    /*
     * Properties
     */
    private Node<DT> head;


    /*
     * Constructors
     */
    public LinkedList() {

    }


    /*
     * Methods
     */

    /**
     * Adds an element to the end of the Linked List
     * @param data
     */
    public void add(DT data) {
        Node<DT> node = this.head;
        while (node.next != null) {
            node = node.next;
        }
        node.next = new Node<>(data);
    }

    /**
     * Adds an element to the front of the Linked List
     * @param data
     */
    public void push(DT data) {
        Node<DT> newNode = new Node<DT>(data);
        newNode.next = this.head;
        this.head.prev = newNode;

        this.head = newNode;
    }

    /**
     * Removes the last element in the Linked List
     * @return the removed element
     */
    public Node<DT> remove() {
        Node<DT> node = head;
        while (node.next != null) {
            node = node.next;
        }
        node.prev.next = null;

        return node;
    }

    /**
     * Removes the first element of the Linked List
     * @return the removed element
     */
    public Node<DT> pop() {
        Node<DT> node = head;
        this.head = head.next;

        return node;
    }

    /**
     * Removes a specific element from the LinkedList
     * @param data the data that is to be deleted from the list
     * @return the removed element
     */
    public Node<DT> delete(DT data) {
        Node<DT> node = head;

        while(node.next != null) {
            if (node.next.getData().equals(data)) {
                // Found the element to remove in the next pointer
                // Adjust next and prev pointers to "delete" the node
                node.next = node.next.next;
                node.next.prev = node;
            }
        }

        return node;
    }

    /**
     * Reverses the Linked List
     */
    public void reverse() {
        Node<DT> node = head;
        while (node.next != null) {
            node = node.next;
        }

        // Set the head to be the "end" of the list
        this.head = node;

        // For each node, swap its next and previous pointers to reverse the list
        while (node.prev != null) {
            Node<DT> swap = node.next;
            node.next = node.prev;
            node.prev = swap;

            node = node.next;
        }
    }
}
