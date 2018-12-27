package lab;
import java.util.Random;
import collection.*;
import static collection.MySort.*;

/**
 *
 * @author bwbluebaugh0
 */
public class Lab5 {
    
    public static void test()
    {
        Random generator = new Random();
        generator.setSeed(20151015);
        
        long number = 0;
        
        MyVector vector = new MyVector();
        
        for(int i = 0; i <= 29999; i ++)
        {
            number = generator.nextInt(99999);
            vector.append(number);
        }
        double time1 = System.currentTimeMillis();
        bubbleSort(vector);
        double time2 = System.currentTimeMillis();
        
        double difference = time2-time1;
        
        System.out.println("Sort: bubble sort, time: " + difference + " milliseconds.");
        System.out.println("0 is: " + vector.elementAt(0));
        System.out.println("1 is: " + vector.elementAt(1));
        System.out.println("2 is: " + vector.elementAt(2));
        System.out.println("9999 is: " + vector.elementAt(9999));
        System.out.println("19999 is: " + vector.elementAt(19999));
        System.out.println("29999 is: " + vector.elementAt(29999));
        
        MyVector vector2 = new MyVector();
        
        generator.setSeed(20151015);
        for(int i = 0; i <= 29999; i ++)
        {
            number = generator.nextInt(99999);
            vector2.append(number);
        }
        time1 = System.currentTimeMillis();
        selectionSort(vector2);
        time2 = System.currentTimeMillis();
        
        difference = time2-time1;
        System.out.println("Sort: selection sort, time: " + difference + " milliseconds.");
        System.out.println("0 is: " + vector2.elementAt(0));
        System.out.println("1 is: " + vector2.elementAt(1));
        System.out.println("2 is: " + vector2.elementAt(2));
        System.out.println("9999 is: " + vector2.elementAt(9999));
        System.out.println("19999 is: " + vector2.elementAt(19999));
        System.out.println("29999 is: " + vector2.elementAt(29999));
        
        
        MyVector vec = new MyVector();
        generator.setSeed(20151015);
        
        for(int i = 0; i <= 29999; i ++)
        {
            number = generator.nextInt(99999);
            vec.append(number);
        }
        
        Comparable[] temp = new Comparable[vec.size()];
        time1 = System.currentTimeMillis();
        mergeSort(vec, temp, 0, vec.size()-1);
        time2 = System.currentTimeMillis();
        
        difference = time2-time1;
        System.out.println("Sort: merge sort, time: " + difference + " milliseconds.");
        System.out.println("0 is: " + vec.elementAt(0));
        System.out.println("1 is: " + vec.elementAt(1));
        System.out.println("2 is: " + vec.elementAt(2));
        System.out.println("9999 is: " + vec.elementAt(9999));
        System.out.println("19999 is: " + vec.elementAt(19999));
        System.out.println("29999 is: " + vec.elementAt(29999));
        
        
        generator.setSeed(20151015);
        MyVector vector3 = new MyVector();
        
        for(int i = 0; i <= 29999; i ++)
        {
            number = generator.nextInt(99999);
            vector3.append(number);
        }
        time1 = System.currentTimeMillis();
        quickSort(vector3, 0, vector3.size()-1);
        time2 = System.currentTimeMillis();
        
        difference = time2-time1;
        System.out.println("Sort: quick sort, Time: " + difference + " milliseconds.");
        System.out.println("0 is: " + vector3.elementAt(0));
        System.out.println("1 is: " + vector3.elementAt(1));
        System.out.println("2 is: " + vector3.elementAt(2));
        System.out.println("9999 is: " + vector3.elementAt(9999));
        System.out.println("19999 is: " + vector3.elementAt(19999));
        System.out.println("29999 is: " + vector3.elementAt(29999));
   
        
        MyVector vector4 = new MyVector();
        generator.setSeed(20151015);
        
        for(int i = 0; i <= 29999; i ++)
        {
            number = generator.nextInt(99999);
            vector4.append(number);
        }
        
        time1 = System.currentTimeMillis();
        insertionSort(vector4, 0, vector4.size()-1);
        time2 = System.currentTimeMillis();
        
        difference = time2-time1;
        System.out.println("Sort: insertion sort, time: " + difference + " milliseconds.");
        System.out.println("0 is: " + vector4.elementAt(0));
        System.out.println("1 is: " + vector4.elementAt(1));
        System.out.println("2 is: " + vector4.elementAt(2));
        System.out.println("9999 is: " + vector4.elementAt(9999));
        System.out.println("19999 is: " + vector4.elementAt(19999));
        System.out.println("29999 is: " + vector4.elementAt(29999));
    
        MyVector vector5 = new MyVector();
        generator.setSeed(20151015);
        
        for(int i = 0; i <= 29999; i ++)
        {
            number = generator.nextInt(99999);
            vector5.append(number);
        }
        
        time1 = System.currentTimeMillis();
        shellSort(vector5);
        time2 = System.currentTimeMillis();
        difference = time2-time1;
        System.out.println("Sort: shell sort, time: " + difference + " milliseconds.");
        System.out.println("0 is: " + vector5.elementAt(0));
        System.out.println("1 is: " + vector5.elementAt(1));
        System.out.println("2 is: " + vector5.elementAt(2));
        System.out.println("9999 is: " + vector5.elementAt(9999));
        System.out.println("19999 is: " + vector5.elementAt(19999));
        System.out.println("29999 is: " + vector5.elementAt(29999));
    }
    
    //was made to test a single sort. Disregaurd.
    public static void test2()
    {
        Random generator = new Random();
        int number = 0;
        MyVector vec = new MyVector();
        generator.setSeed(20151015);
        for(int i = 0; i < 100; i++)
        {
             number = generator.nextInt(200);
            vec.append(number);
        }
        Comparable[] temp = new Comparable[vec.size()];
        System.out.println(vec.toString());
        mergeSort(vec, temp, 0, vec.size()-1);
        System.out.println(vec.toString());
    }
}