package edu.escuelaing.arsw.app;

import java.util.*;

/**
 * Hello world!
 *
 */
public class GenericTutorial
{
    public static void main( String[] args )
    {
        List<Integer> intlist = new LinkedList<Integer>();
        intlist.add(0);
        Integer x = intlist.iterator().next();
        printCollectionOldJava(intlist);
        printCollection(intlist);

    }

    static void printCollectionOldJava(Collection c){
        Iterator i = c.iterator();
        for(int k=0; k<c.size(); k++){
            System.out.println(i.next());
        }
    }

    static void printCollection(Collection<?> c){
        for (Object e : c) {
            System.out.println(e);
        }
    }

    static <T> void fromArrayToCollection(T[] a, Collection<T> c) {
        for (T o : a) {
            c.add(o); // Correct
        }
    }
}
