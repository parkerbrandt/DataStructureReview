package ArrayList;

/**
 * ArrayList Class 
 * Automatically resizes arrays when elements added exceeds current size
 */
public class ArrayList<DT> {

    /*
     * Class Properties
     */
    private static final int ARRAY_CAPACITY = 4;
    private static final int ARRAY_RESIZE_FACTOR = 2;

    
    /*
     * Properties
     */
    private DT[] array;
    int size;


    /*
     * Constructors
     */

    /**
     * Default Constructor
     * Creates an empty array
     */
    public ArrayList() {
        // Initialize variables
        this.array = (DT[]) new Object[ARRAY_CAPACITY];
        this.size = 0;
    }

    /**
     * Creates an ArrayList from previously existing array
     * @param arr previously existing array
     */
    public ArrayList(DT[] arr) {
        // Initialize variables
        this.array = arr;
        this.size = arr.length;
    }


    /*
     * Methods
     */

    /**
     * Doubles the array capacity
     */
    private void resize() {
        
    }

    /**
     * Adds an element to the end of the array
     * @param elem
     */
    public void add(DT elem) {
        // Check if need to resize first
        if (this.size >= this.array.length) {
            resize();
        }

    }

    /**
     * Adds an element to the array at index i
     * Will push all elements >= i to the "right"
     * @param elem
     * @param i
     */
    public void add(DT elem, int i) {
        // Check if need to resize first
        if (this.size >= this.array.length) {
            resize();
        }
    }

    /**
     * Returns an element at index i
     * @param i the index of the array to return
     * @return the element at index i
     */
    public DT get(int i) {
        return this.array[i];
    }

    /**
     * @return the current size of the array
     */
    public int size() {
        return this.size;
    }
}
