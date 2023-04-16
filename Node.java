
/**
 * Node class used for implementing your linked data structures.
 */
public class Node<T> {

    private T data;
    private Node<T> next;

    /**
     * Constructs a new node with the given data and next node reference.
     *
     * @param data the data that is stored in the new node
     * @param next the next node
     */
    Node(T data, Node<T> next) {
        this.data = data;
        this.next = next;
    }

    /**
     * Constructs a new Node with only the given data.
     *
     * @param data the data stored in the new node
     */
    Node(T data) {
        this(data, null);
    }

    /**
     * Gets the data.
     *
     * @return the data
     */
    T getData() {
        return data;
    }

    /**
     * Sets the data.
     *
     * @param data the data we want to set
     */
    void setData(T data) {
        this.data = data;
    }

    /**
     * Gets the next node.
     *
     * @return the next node
     */
    Node<T> getNext() {
        return next;
    }

    /**
     * Sets the next node.
     *
     * @param next the new next node
     */
    void setNext(Node<T> next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "Node containing: " + data;
    }
}
