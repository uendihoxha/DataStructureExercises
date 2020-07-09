package weiss.nonstandard;

// ListStack class
//
// CONSTRUCTION: with no initializer
//
// ******************PUBLIC OPERATIONS*********************
// void push( x )         --> Insert x
// void pop( )            --> Remove most recently inserted item
// AnyType top( )         --> Return most recently inserted item
// AnyType topAndPop( )   --> Return and remove most recent item
// boolean isEmpty( )     --> Return true if empty; else false
// void makeEmpty( )      --> Remove all items
// ******************ERRORS********************************
// top, pop, or topAndPop on empty stack

/**
 * List-based implementation of the stack.
 * @author Mark Allen Weiss
 */
public class ListStack<AnyType> implements Stack<AnyType>
{
    /**
     * Construct the stack.
     */
    public ListStack( )
    {
        topOfStack = null;
    }

    /**
     * Test if the stack is logically empty.
     * @return true if empty, false otherwise.
     */
    public boolean isEmpty( )
    {
        return topOfStack == null;
    }

    /**
     * Make the stack logically empty.
     */
    public void makeEmpty( )
    {
        topOfStack = null;
    }

    /**
     * Insert a new item into the stack.
     * @param x the item to insert.
     */
    public void push( AnyType x )
    {
        topOfStack = new ListNode<AnyType>( x, topOfStack );
    }

    /**
     * Remove the most recently inserted item from the stack.
     * @throws UnderflowException if the stack is empty.
     */
    public void pop( )
    {
        if( isEmpty( ) )
            throw new UnderflowException( "ListStack pop" );
        topOfStack = topOfStack.next;
    }

    /**
     * Get the most recently inserted item in the stack.
     * Does not alter the stack.
     * @return the most recently inserted item in the stack.
     * @throws UnderflowException if the stack is empty.
     */
    public AnyType top( )
    {
        if( isEmpty( ) )
            throw new UnderflowException( "ListStack top" );
        return topOfStack.element;
    }

    /**
     * Return and remove the most recently inserted item
     * from the stack.
     * @return the most recently inserted item in the stack.
     * @throws UnderflowException if the stack is empty.
     */
    public AnyType topAndPop( )
    {
        if( isEmpty( ) )
            throw new UnderflowException( "ListStack topAndPop" );

        AnyType topItem = topOfStack.element;
        topOfStack = topOfStack.next;
        return topItem;
    }

     /*
    Adding Lab 1 Exercises
    By Uendi Hoxha
    showElements(), ShowInverse(), ArrayStack(Int Capacity),Clone(),Swap()
    */

    public void showElements() {
        ListNode<AnyType> temp = new ListNode<AnyType>(null,null);
        temp = topOfStack;
        while(!(temp==null)) {
            AnyType el = temp.element;
            System.out.println(el.toString());
            temp = temp.next;
        }
        temp = null;
    }

   public void showInverse(){
        ListNode<AnyType> temp = new ListNode<AnyType>(null,null);
        temp = topOfStack;
        ListStack<AnyType> inverse = new ListStack<AnyType>();
        while(!(temp==null)){
            AnyType elem = temp.element;
            inverse.push(elem);
            temp = temp.next;
        }
        inverse.showElements();
        temp = null;
    }

    public ListStack<AnyType> Clone(){
        ListNode<AnyType> temp = new ListNode<AnyType>(null,null);
        temp = topOfStack;
        ListStack<AnyType> tempClone = new ListStack<AnyType>();
        while(!(temp==null)){
            AnyType elem = temp.element;
            tempClone.push(elem);
            temp = temp.next;
        }

        ListNode<AnyType> cloneTopofStack = new ListNode<AnyType>(null,null);
        cloneTopofStack = tempClone.topOfStack;
        ListStack<AnyType> clone = new ListStack<AnyType>();
        while(!(cloneTopofStack==null)){
            AnyType elem = cloneTopofStack.element;
            clone.push(elem);
            cloneTopofStack = cloneTopofStack.next;
        }
        return clone;
    }

    public void swap(){
        AnyType temp = topOfStack.element;
        topOfStack.element = topOfStack.next.element;
        topOfStack.next.element = temp;
    }

    private ListNode<AnyType> topOfStack;
}