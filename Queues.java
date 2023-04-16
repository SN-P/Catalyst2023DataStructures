/**
 * Queue class used for implementing your queue operations structures.
 */
public class Queues<T> {
    private Node<T> head, tail;
    private int size;

    public Queues() {
        size = 0;
        head = tail = null;
    }

    /*
     * Step 1 : Create a new node with given value.
     * Step 2 : Check whether queue is Empty (size == 0)
     * Step 3 : If it is empty then, set head = newNode and tail = newNode.
     * Step 4 : If it is not empty then, set tail → next = new node and tail =
     * new node.
     */
    void enqueue(T data) {
    }

    /*
     * Step 1 : Check whether queue is empty (size == 0).
     * Step 2 : If it is Empty, then display
     * "Queue is Empty!!! Deletion is not possible!!!" and terminate from the
     * function
     * Step 3 : If it is not empty then, define a T variable 'result' and set it to
     * 'head' data.
     * Step 4 : Then set 'head = head → next' and decrement size and if the size is
     * now 0 we set tail to null.
     * 
     */
    void dequeue() {
        if (size == 0) {
            throw new IllegalArgumentException("");
        }

    }
    public String toString(){
        String result = "";
        Node<T> current = head;
        while (current != null){
            result = result + current.toString() + "\n";
            current = current.getNext();
        }
        return result;
    }

}