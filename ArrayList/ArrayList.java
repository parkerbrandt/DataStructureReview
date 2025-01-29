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
     * Multiplies the array capacity and copies over previous array
     * O(n) time
     */
    private void resize() {
        DT[] newArr = (DT[]) new Object[this.array.length * ARRAY_RESIZE_FACTOR];

        // Copy old array to new array
        for (int i = 0; i < this.array.length; i++) {
            newArr[i] = this.array[i];
        }

        this.array = newArr;
    }

    /**
     * Adds an element to the end of the array
     * O(1) time if not resizing, O(n) time if resizing
     * Amortized Time = O(1) time
     * @param elem
     */
    public void add(DT elem) {
        // Check if need to resize first
        if (this.size >= this.array.length) {
            resize();
        }

        this.array[size] = elem;
        this.size++;
    }

    /**
     * Inserts an element into the array at index i
     * Will push all elements >= i to the "right"
     * O(n) time
     * @param elem
     * @param i
     */
    public void insert(DT elem, int i) {
        // Check if need to resize first
        if (this.size >= this.array.length) {
            resize();
        }

        DT swap = this.array[0];
        for (int j = 0; j < this.array.length; j++) {
            if (j == i) {
                swap = this.array[j];
                this.array[j] = elem;
            } else if (j > i) {
                DT temp = this.array[j];
                this.array[j] = swap;
                swap = temp;
            }
        }
        this.size++;
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
