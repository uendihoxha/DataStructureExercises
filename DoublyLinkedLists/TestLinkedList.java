/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package weiss.util;
import weiss.nonstandard.*;

/**
 *
 * @author hoxha
 */
public class TestLinkedList {

public static void main( String [ ] args )
    {
        testLinkedList();
    }

public static void testLinkedList(){
        LinkedList<Book> myBooks = new LinkedList<Book>();

//        Book b1 = new Book("Harry Potter",1000);
//        Book b2 = new Book("The Idiot",9000);
//        Book b3 = new Book("Guns and Roses",8000);
//        Book b4 = new Book("Notes from Underground",7000);

        Book b1 = new Book("A",1000);
        Book b2 = new Book("B",9000);
        Book b3 = new Book("C",8000);
        Book b4 = new Book("D",7000);
        
        myBooks.addFirst(b3);
        myBooks.addFirst(b3);
        myBooks.addFirst(b3);
        myBooks.addFirst(b1);
        myBooks.addFirst(b1);
        myBooks.addFirst(b4);
        myBooks.addFirst(b2);
        myBooks.addFirst(b2);
        myBooks.addFirst(b1);
        myBooks.addFirst(b4);
        

//        System.out.println("Show Inverse");
//        myBooks.printInverse();
//        
//        System.out.println("Find Occurrences");
//        int count = myBooks.findOccurrences(b4, new BookComparator());
//        System.out.println(count);
//        
//        System.out.println();
//        myBooks.moveAtTheFront(b1,new BookComparator());
//        System.out.println("Show List after moveAtTheFront of element x");
//        myBooks.showList();
        
        //System.out.println();
        //System.out.println("Show List");
        //myBooks.showList();

        myBooks.removeDublicates(new BookComparator() );
        myBooks.showList();
        
//        System.out.println();
//        myBooks.substitute(b2, b1);
//        System.out.println("Show List after substitution:");
//        myBooks.showList();

//        System.out.println();
//        myBooks.remove(2, 4);
//        System.out.println("Show List after removal from index1 to index2:");
//        myBooks.showList();


//        System.out.println();
//        myBooks.swap(2, 4);
//        System.out.println("Show List after swap index1 with index2:");
//        myBooks.showList();

//        System.out.println();
//        myBooks.copyAndPaste(1, 3, 4);
//        System.out.println("Show List after copyAndPaste of index1 to index2, after index3");
//        myBooks.showList();

//        System.out.println();
//        myBooks.cutAndPaste(2, 3, 4);
//        System.out.println("Show List after cutAndPaste of index1 to index2, after index3");
//        myBooks.showList();
        
//        LinkedList<Book> anotherLibrary = new LinkedList<Book>();
//        System.out.println();
//        myBooks.cutAndPasteIntoList(1, 3, anotherLibrary.size()-1,anotherLibrary);
//        System.out.println("Show List after cutAndPaste of index1 to index2, after index3 in list2");
//        anotherLibrary.showList();

//        LinkedList<Book> anotherLibrary = new LinkedList<Book>();
//        System.out.println();
//        myBooks.cutAndPasteIntoListReverse(1, 3, anotherLibrary.size()-1,anotherLibrary);
//        System.out.println("Show List after cutAndPaste of index1 to index2, after index3 in list2 in reverse order");
//        anotherLibrary.showList();


//        System.out.println();
//        myBooks.moveAtTheFront(b3);
//        System.out.println("Show List after moveAtTheFront of element x");
//        myBooks.showList();

          System.out.println();
//        myBooks.surround(b1,b2,b3);
//        myBooks.surround(b1,b2,b3);
//        myBooks.surround(b1,b2,b3);
//        myBooks.surround(b4,b1,b2);
//        System.out.println("Show List after surround of element x with element y and z");
//        myBooks.showList();

    }

}
