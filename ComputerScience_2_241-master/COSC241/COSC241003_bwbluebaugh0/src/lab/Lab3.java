/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab;
import collection.*;
import java.util.Random;
import java.lang.*;
import java.util.*;

/**
 *
 * @author bwbluebaugh0
 */
public class Lab3 
{
    public static void test()
    {
        
      MyVector numVec = new MyVector();
      
      Random random = new Random(System.nanoTime());
      int number;
      Scanner sc = new Scanner(System.in);
      int input;
     
      
      for(int i = 0; i < 150; ++i)
      {
          number = (int)random.nextLong();
          number = Math.abs(number);
          number = number/1000000;
          
          if (number < 100)
          {
              
              while(number < 100)
              {
              number *= 10;
              }
              
          }
          if(number > 999)
          {
              number = number/3;
          }
          
          numVec.append(number);
      }
      
      System.out.println(numVec.toString());
      
      MySort.bubbleSort(numVec);
      
      System.out.println("After the Bubble Sort: ");
      System.out.println(numVec.toString());
      
      System.out.println("Please type in a number between 100 and 999: ");
      input = sc.nextInt();
      
      System.out.println("The location of that value is: " + MySearch.linearSearchSorted(numVec, input));
      System.out.println();
      
      numVec.removeRange(5,55);
      System.out.println("Removed the range from 5 to 55.");
      System.out.println();
      
      System.out.println("After removing the range: \n "+ numVec.toString());
      
      numVec.reverse();
      System.out.println("The vector was reversed.");
      System.out.println();
      
      System.out.println(numVec.toString());
      
      MySort.selectionSort(numVec);
      
      System.out.println("After Selection Sort: ");
      System.out.println(numVec.toString());
      
       System.out.println("Please type in a number between 100 and 999: ");
       input = sc.nextInt();
      
       System.out.println("The location of that value is: " + MySearch.binarySearch(numVec, input));
      
      
      
      
      
    }
    
}
