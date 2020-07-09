package weiss.nonstandard;

// ListQueue class
//
// CONSTRUCTION: with no initializer
//
// ******************PUBLIC OPERATIONS*********************
// void enqueue( x )      --> Insert x
// AnyType getFront( )    --> Return least recently inserted item
// AnyType dequeue( )     --> Return and remove least recent item
// boolean isEmpty( )     --> Return true if empty; else false
// void makeEmpty( )      --> Remove all items
// ******************ERRORS********************************
// getFront or dequeue on empty queue
/**
 * List-based implementation of the queue.
 *
 * @author Mark Allen Weiss
 */
public class ListQueue<AnyType> implements Queue<AnyType> {

    /**
     * Construct the queue.
     */
    public ListQueue() {
        front = back = null;
    }

    /**
     * Test if the queue is logically empty.
     *
     * @return true if empty, false otherwise.
     */
    public boolean isEmpty() {
        return front == null;
    }

    /**
     * Insert a new item into the queue.
     *
     * @param x the item to insert.
     */
    public void enqueue(AnyType x) {
        if (isEmpty()) // Make queue of one element
        {
            back = front = new ListNode<AnyType>(x);
        } else // Regular case
        {
            back = back.next = new ListNode<AnyType>(x);
        }
    }

    /**
     * Return and remove the least recently inserted item from the queue.
     *
     * @return the least recently inserted item in the queue.
     * @throws UnderflowException if the queue is empty.
     */
    public AnyType dequeue() {
        if (isEmpty()) {
            throw new UnderflowException("ListQueue dequeue");
        }

        AnyType returnValue = front.element;
        front = front.next;
        return returnValue;
    }

    /**
     * Get the least recently inserted item in the queue. Does not alter the
     * queue.
     *
     * @return the least recently inserted item in the queue.
     * @throws UnderflowException if the queue is empty.
     */
    public AnyType getFront() {
        if (isEmpty()) {
            throw new UnderflowException("ListQueue getFront");
        }
        return front.element;
    }

    /**
     * Make the queue logically empty.
     */
    public void makeEmpty() {
        front = null;
        back = null;
    }

    /*
    Adding Lab 2 Exercises
    By Uendi Hoxha
     */

    public void showElements() {
        ListNode<AnyType> ownFront = front;
        while (front != null) {
            System.out.println(front.element);
            front = front.next;
        }
        front = ownFront;
    }

    public void showInverse() {

        ListQueue<AnyType> clone = this.clone();
        ListNode<AnyType> nearNode = clone.front;
        ListNode<AnyType> midNode, farNode;

        midNode = nearNode.next;
        farNode = midNode.next;

        nearNode.next = null;

        while (farNode != null) {
            midNode.next = nearNode;

            nearNode = midNode;
            midNode = farNode;
            farNode = farNode.next;
        }

        midNode.next = nearNode;
        clone.front = midNode;
        clone.showElements();
        clone = null;
    }

    public void showInverseWithStack() {

        ListQueue<AnyType> clone = this.clone();
        ListNode<AnyType> cloneFront = clone.front;

        ListStack<AnyType> stack = new ListStack<AnyType>();

        while (cloneFront != null) {
            stack.push(cloneFront.element);
            cloneFront = cloneFront.next;
        }

        stack.showElements();
        clone = null;
    }

    public ListQueue<AnyType> clone() {
        ListQueue<AnyType> clone = new ListQueue<AnyType>();
        ListNode<AnyType> ownFront = front;
        while (front != null) {
            clone.enqueue(front.element);
            front = front.next;
        }
        front = ownFront;
        return clone;
    }

    public AnyType findMinimum(Comparator<AnyType> cmp) {
        ListNode<AnyType> ownFront = front;
        AnyType minimum = front.element;
        while (front != null) {
            //System.out.println(front.element);
            if (cmp.compare(front.element, minimum) < 0) {
                minimum = front.element;
            }
            front = front.next;
        }
        front = ownFront;
        return minimum;
    }

    private ListNode<AnyType> front;
    private ListNode<AnyType> back;
}
