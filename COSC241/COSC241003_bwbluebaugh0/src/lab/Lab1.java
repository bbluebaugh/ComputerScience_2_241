
package lab;

import java.util.*;

/**
 *
 * @author bwbluebaugh0
 */
public class Lab1 {
    
    public static void test(String [] args)
    {
        Vector<Object> vector = new Vector<Object>();
        int primitiveInt = 241;
        Integer wrapperInt = new Integer(3542);
        String str = "Atticus";
        vector.add(primitiveInt);
        vector.add(wrapperInt);
        vector.add(str);
        vector.add(2, new Integer(2158));
        System.out.println("The elements of the vector: " + vector);
        System.out.println("The size of the vector is: " + vector.size());
        System.out.println("The element at psotion 2 is: " + vector.elementAt(2));
        System.out.println("The first element of vector is: " + vector.firstElement());
        System.out.println("The last element of vector is: " + vector.lastElement());
        vector.removeElementAt(1);
        System.out.println("The elements of vector: " + vector);
        System.out.println("The size of vecter is: " + vector.size());
        System.out.println("The elements at position 2 is: " + vector.elementAt(2));
        System.out.println("The first element of vector is: " + vector.firstElement());
        System.out.println("The last element of vector is: " + vector.lastElement());
        vector.clear();
        
        System.out.println("The elements of the vector: " + vector);
        
        for(String x: args)
        {
            vector.add(x);
        }
        System.out.println("The elements of the vector: " + vector);
        
        for(int i = 1; i < vector.size(); i++)
        {
            vector.removeElementAt(i);
        }
        System.out.println("The elements of the vector: " + vector);
        
    }

}
