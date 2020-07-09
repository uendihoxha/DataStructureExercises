/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package weiss.nonstandard;

/**
 *
 * @author hoxha
 */
public class TestProgram {

public static void main( String [ ] args )
    {

        /// Stack operations
        System.out.println("Stack Operations");
        System.out.println("Array Implementation");
        testStackArray();


        System.out.println("LinkedList Implementation");
        testStackList();


//        testQueueArray();
//        testQueueList();
//        testLinkedList();

        //testBinarySearchTree();

    }


public static void testLinkedList(){
        LinkedList<Book> myBooks = new LinkedList<Book>();

        Book b1 = new Book("Harry Potter",1000);
        Book b2 = new Book("The Idiot",9000);
        Book b3 = new Book("Guns and Roses",8000);
        Book b4 = new Book("Notes from Underground",7000);


        myBooks.insert(b1,myBooks.zeroth());
        myBooks.insert(b2,myBooks.zeroth());
        myBooks.insert(b3,myBooks.zeroth());
        myBooks.insert(b4,myBooks.zeroth());
        myBooks.insert(b1,myBooks.zeroth()); /// last added

        System.out.println("ShowElements");
        LinkedList.printList(myBooks);

        LinkedListIterator<Book> itr = myBooks.findLast(b1);

        myBooks.removeAll(b1);
        System.out.println("After removal:");
        LinkedList.printList(myBooks);

        System.out.println("Clone");
        LinkedList<Book> cloneBooks = myBooks.clone();
        LinkedList.printList(myBooks);

        Book b = myBooks.findMinimum(new BookComparator());

        System.out.println("Minimum: " + b.toString());
    }

public static void testQueueList(){
        ListQueue<Book> myBooks = new ListQueue<Book>();

        Book b1 = new Book("Harry Potter",1000);
        Book b2 = new Book("The Idiot",9000);
        Book b3 = new Book("Guns and Roses",8000);
        Book b4 = new Book("Notes from Undergroundt",7000);

        myBooks.enqueue(b1);
        myBooks.enqueue(b2);
        myBooks.enqueue(b3);
        myBooks.enqueue(b4);

        System.out.println("ShowElements");
        myBooks.showElements();

        System.out.println("Showinverse");
        myBooks.showInverse();

        System.out.println("Clone");
        ListQueue<Book> cloneBooks = myBooks.clone();
        cloneBooks.showElements();

        Book b = myBooks.findMinimum(new BookComparator());

        System.out.println("Minimum: " + b.toString());

                //// Second version of Minimum:

        System.out.println("Second version of Minimum: ");
        b = findMinimum(myBooks,new BookComparator());
        System.out.println("Minimum: " + b.toString());

    }

public static void testQueueArray(){
        ArrayQueue<Book> myBooks = new ArrayQueue<Book>();

        Book b1 = new Book("Harry Potter",1000);
        Book b2 = new Book("The Idiot",9000);
        Book b3 = new Book("Guns and Roses",8000);
        Book b4 = new Book("Notes from Undergroundt",7000);

        myBooks.enqueue(b1);
        myBooks.enqueue(b2);
        myBooks.enqueue(b3);
        myBooks.enqueue(b4);

        System.out.println("ShowElements");
        myBooks.showElements();

        System.out.println("Showinverse");
        myBooks.showInverse();

        System.out.println("Clone");
        ArrayQueue<Book> cloneBooks = myBooks.clone();
        cloneBooks.showElements();

        Book b = myBooks.findMinimum(new BookComparator());

        System.out.println("Minimum: " + b.toString());

        //// Second version of Minimum:

        System.out.println("Second version of Minimum: ");
        b = findMinimum(myBooks,new BookComparator());
        System.out.println("Minimum: " + b.toString());

    }

 public static void testStackArray(){
        ArrayStack<Book> myBooks = new ArrayStack<Book>();
        
        Book b1 = new Book("Harry Potter",1000);
        Book b2 = new Book("The Idiot",9000);
        Book b3 = new Book("Guns and Roses",8000);
        Book b4 = new Book("Notes from Undergroundt",7000);

        myBooks.push(b1);
        myBooks.push(b2);
        myBooks.push(b3);
        myBooks.push(b4);

        System.out.println("ShowElements");
        myBooks.showElements();

        System.out.println("Showinverse");
        myBooks.showInverse();

        System.out.println("Clone");
        ArrayStack<Book> cloneBooks = myBooks.Clone();
        cloneBooks.showElements();

        System.out.println("Swap");
        myBooks.swap();
        myBooks.showElements();
    }


    public static void testStackList(){
        ListStack<Book> myBooks = new ListStack<Book>();
        
        Book b1 = new Book("harry potter",1000);
        Book b2 = new Book("The Idiot",9000);
        Book b3 = new Book("Guns and Roses",8000);

        myBooks.push(b1);
        myBooks.push(b2);
        myBooks.push(b3);

        System.out.println("ShowElements");
        myBooks.showElements();

        System.out.println("Showinverse");
        myBooks.showInverse();

        System.out.println("Clone");
        ListStack<Book> cloneBooks = myBooks.Clone();
        cloneBooks.showElements();

        System.out.println("Swap");
        myBooks.swap();
        myBooks.showElements();
    }


    //// Second version of findMinimum that exploits compareTo of Book

    public static Book findMinimum(ArrayQueue<Book> q,BookComparator comp){
        ArrayQueue<Book> q2 = q.clone();
        Book minimum = q2.getFront();
        q2.dequeue();
        while(!q2.isEmpty()){
            Book current = q2.getFront();
            q2.dequeue();
            if(comp.compare(current, minimum) <0)
                minimum = current;
        }
        return minimum;
    }

    public static Book findMinimum(ListQueue<Book> q,BookComparator comp){
        ListQueue<Book> q2 = q.clone();
        Book minimum = q2.getFront();
        q2.dequeue();
        while(!q2.isEmpty()){
            Book current = q2.getFront();
            q2.dequeue();
            if(comp.compare(current, minimum) <0)
                minimum = current;
        }
        return minimum;
    }


    public static void testBinarySearchTree(){
        BinarySearchTree<Book> myBooks = new BinarySearchTree<Book>();

        Book b1 = new Book("Harry Potter",1000);
        Book b2 = new Book("The Idiot",9000);
        Book b3 = new Book("Guns and Roses",8000);
        Book b4 = new Book("Notes from Underground",7000);
        Book b5 = new Book("The Gambler",7000);
        Book b6 = new Book("Humiliated and Insulted",7000);
        Book b7 = new Book("Angels",7000);



        myBooks.insert(b1);
        myBooks.insert(b2);
        myBooks.insert(b3);
        myBooks.insert(b4);
        myBooks.insert(b5);
        myBooks.insert(b6);
        myBooks.insert(b7);


        Book low = new Book("A",7000);
        Book high = new Book("J",7000);

        System.out.println("Show Tree, In order visit:");
        myBooks.printInOrder(myBooks.root);

        System.out.println("Show Tree, Post order visit:");
        myBooks.printPreOrder(myBooks.root);

        System.out.println("Show Tree, In order visit:");
        myBooks.printInOrder(myBooks.root);

        System.out.println("Show Tree, Post order visit:");
        myBooks.printPostOrder(myBooks.root);

        System.out.println("Print in Range");
        myBooks.printInRange(myBooks.root, low, high);


        System.out.println("Replacing one book");
        myBooks.findAndReplace(b7, low,myBooks.root );

        System.out.println("Show Tree, In order visit:");
        myBooks.printInOrder(myBooks.root);

    }

}
