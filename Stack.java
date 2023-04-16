/**
 * Stack class used for implementing your stack operations structures.
 */
public class Stack<T> {
    Node<T> top;
    int size;

    public Stack() {
        size = 0;
        top = null;
    }

    /**
     * Initialise a node
     * Update the value of that node by data i.e. node->data = data
     * Now link this node to the top of the linked list
     * And update top pointer to the current node
     * 
     * @param data
     */
    public void push(T data) {

    }

    /**
     * Step 1: Check if there is any node present or not, if not then return.
     * Step 2: Otherwise return the value of top node of the linked list
     */
    public T peek() {
        return null;
    }

    /**
     * Step 1: First Check whether there is any node present in the linked list or
     * not, if not then return
     * Step 2: Otherwise move forward the top node by 1 step
     */
    public void pop() {

    }

    public void display() {
        if (top == null) {
            System.out.printf("\nStack Underflow");
            return;
        } else {
            Node<T> curr = top;
            while (curr != null) {
                // print node data
                System.out.print(curr.getData());
                // assign curr next to temp
                curr = curr.getNext();
                if (curr != null)
                    System.out.print(" -> ");
            }
        }
    }
}