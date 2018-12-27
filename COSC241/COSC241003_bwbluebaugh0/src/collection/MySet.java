
package collection;

/**
 * 10/2/15
 * @author bwbluebaugh0
 */
public class MySet extends MyVector 
{
    
    
    public MySet()
    {
        super(); 
    }

    
    
    
    public int cardinality()//returns the number of Objects contained within the set
    {
        return size;
    }
    
    
    
    
    //return a set containing the complement of the original set
    public MySet complement(MySet set)
    {
        MySet newSet = new MySet();
        
        for(int i=0; i<set.size();++i)
        { 
            if(!this.contains(set.elementAt(i)) && !newSet.contains(set.elementAt(i)))
            {
                
               newSet.insert(set.elementAt(i));
               
            }
        } 
        return newSet;
    }
    
    
    
    
    //inserts the element at the end of the set as long as it is not already contained within the set
    public boolean insert(Object element)
    {
        for(int count=0; count<this.size(); ++count)
        {
            if(this.elementAt(count)==element)
            {
                return false;
            }
        }
        
        this.append(element);
        return true;
    }
    
    
    
    
    public MySet intersection(MySet B){
        MySet anotherVec = new MySet();
        Comparable A,C;
        int i, j;
        
        for(i = 0; i < B.size(); ++i)
        {
            for(j = 0; j < this.size(); ++j)
            {
                A = (Comparable)this.elementAt(j);
                C = (Comparable)B.elementAt(i);
                if(A.compareTo(C) == 0 && !anotherVec.contains(B.elementAt(i)))
                {
                    anotherVec.insert(B.elementAt(i));
                }
            }
        }
        return anotherVec;
    }
    
    
    
    
    
    //returns true if set is a subset of the original set
    public boolean subSetOf(MySet set)
    {
        boolean isSubset = true;
        for(int i = 0; i < set.size(); ++i)
        {
            for(int j = 0; j < this.size(); ++j)
            {
                if(this.elementAt(j) == set.elementAt(i))
                    isSubset = true;
            }
            if(isSubset!= true)
            {
                isSubset = false;
                return isSubset;
            }
        }
        return isSubset;
    }
    
    
    
    //returns a set containing the difference in the complements of the two sets
    public MySet symmetricDifference(MySet set)
    {
        MySet A = new MySet();
        MySet B = new MySet();
        A = this.complement(set);
        B = set.complement(this);
        return A.union(B);
    }
    

    
    //returns a new set that is a combination of the two sets
    public MySet union(MySet set)
    {
        
        MySet temp = new MySet();
 
        for(int i = 0; i < this.size(); ++i)
        {
            temp.insert(this.elementAt(i));
        }

        for (int j = 0; j < set.size(); ++j)
        {
            if(temp.contains(set.elementAt(j))==false)
            {
                temp.insert(set.elementAt(j));
            }
        }
        return temp;
        
    }
    
    
    //overriding the toString method to have a better use for this class
    public String toString()
    {
        String str = "+++++++++++\n" +
                "the current set contains the following: \n";
        
        str += "size = " + size + "\n";
        
        for(int i = 0; i < size; ++i)
        {
            str += i + ":" + this.elementAt(i) + "\t ";
            
            if ((i+1) % 5 == 0)
            {
               str += "\n";
            }
        }
        str += "+++++++++++++ \n";
        
        return str;
    }
  
    
}