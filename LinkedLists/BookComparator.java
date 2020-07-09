
import weiss.util.Comparator;  /// for DoubleLinkedList
//import weiss.nonstandard.Comparator;  /// for queues, stacks and other lists

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */



/**
 *
 * @author hoxha
 */
public class BookComparator<Book> implements Comparator<Book>{
    public int compare(Book e, Book o) {
        //throw new UnsupportedOperationException("Not supported yet.");
        return (e.toString().compareTo(o.toString()));
    }

}
