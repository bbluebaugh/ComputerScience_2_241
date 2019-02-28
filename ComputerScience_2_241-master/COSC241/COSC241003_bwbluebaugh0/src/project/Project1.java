
package project;
import collection.*;

/**
 * 10/2/15
 * author bwbluebaugh0
 */
public class Project1 
{
    
    
    public static  void test()
    {
        
        
        //the fibbinachi set
        MySet fibNumSet = new MySet();
        MySet oddNumSet = new MySet();
        int a = 3;
        int b = 5;
        int c;
        
        fibNumSet.insert(1);
        fibNumSet.insert(2);
        
        for(int i = 3; i <= 29; ++i)
        {
                c = a;
                a = b;
                b = c + b;
            fibNumSet.insert(c);
        }
        
        System.out.println("The Fibbonachi number set it: \n" + fibNumSet.toString());
  
        //the odd set
        for(int j=1; j<79; j=j+2)
        {
            oddNumSet.insert(j);
        }
        
        System.out.println("The Odd set is: \n" + oddNumSet.toString());
        
        
        //testing the methods
        System.out.println("The intersection of the sets is: \n" + fibNumSet.intersection(oddNumSet));
        System.out.println("The symmetric difference of the sets is: \n" + fibNumSet.symmetricDifference(oddNumSet));
        System.out.println("The union set of the sets is: \n" + fibNumSet.union(oddNumSet));
        
     
    }
}
