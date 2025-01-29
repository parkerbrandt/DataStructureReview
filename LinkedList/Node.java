package LinkedList;


/**
 * Class to represent each node in a LinkedList
 * Has information on its own data and pointers to the previous and next nodes
 */
public class Node<DT> {
    
    /*
     * Properties
     */
    private DT data;
    public Node<DT> prev;
    public Node<DT> next;

    
    /*
     * Constructors
     */
    public Node(DT data) {
        // Initialize variables
        this.data = data;
        this.prev = null;
        this.next = null;
    }


    /*
     * Methods
     */
    public DT getData() {
        return this.data;
    }
}
