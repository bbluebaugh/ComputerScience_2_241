/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab;
import collection.*;

/**
 *
 * @author bwbluebaugh0
 */
public class Lab6 
{
    public static void test()
    {
    SLList simpleList = new SLList();
    int number = 0;
    for (int i = 1; i <= 30; ++i)
    {
        number = i*i;
        simpleList.append(number);
    }
    System.out.println("The original SLList: ");
    System.out.println(simpleList.toString());
    
    simpleList.remove(25);
    simpleList.remove(36);
    simpleList.remove(64);
    simpleList.remove(100);
    simpleList.remove(400);
    
    System.out.println("The altered SLList: ");
    System.out.println(simpleList.toString());
    
    SortedSLList sortedList = new SortedSLList();
    for (int i = 1; i <= 30; ++i)
    {
        number = i*i;
        sortedList.insert(number);
    }
    
    System.out.println("The original SortedSLList: ");
    System.out.println(sortedList.toString());
    
    sortedList.remove(1);
    sortedList.remove(25);
    sortedList.remove(36);
    sortedList.remove(64);
    sortedList.remove(144);
    sortedList.remove(400);
    sortedList.remove(900);
    
    System.out.println("The removed SortedSLList: ");
    System.out.println(sortedList.toString());
    
    sortedList.insert(1);
    sortedList.insert(64);
    sortedList.insert(400);
    sortedList.insert(900);
    
    System.out.println("The added SortedSLLIst: ");
    System.out.println(sortedList.toString());
}
}