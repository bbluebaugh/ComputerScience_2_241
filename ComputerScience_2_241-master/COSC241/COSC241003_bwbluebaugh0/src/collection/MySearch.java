/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collection;

/**
 *
 * @author bwbluebaugh0
 */
public class MySearch 
{
    private MySearch()
    {
        
    }
    
    public static int binarySearch(MyVector vec, Comparable target)
    {
        int first = 0;
        int last = vec.size() - 1;
        int middle;
        
        while(last >= first)
        {
            middle = (first + last)/2;
        if(target.compareTo(vec.elementAt(middle))<0)
        {
            last = middle - 1;
        }
        else if(target.compareTo(vec.elementAt(middle))> 0)
        {
            first = middle+1;
        }
        else
        {
            return middle;
        }
        }
        return -1;
    }
    
    public static int linearSearchSorted(MyVector vec, Comparable target)
    {
        for( int i = 0; i < vec.size(); ++i)
        {
            if(target.compareTo((Comparable)vec.elementAt(i)) == 0)
            {
                return i;
            }
            else if(target.compareTo((Comparable)vec.elementAt(i))<0)
            {
                return -1;
            }
        }
        return -1;
}
}