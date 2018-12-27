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
public class SortedSLList 
{
    private int size;
    private SLListNode head;
    private SLListNode tail;
    
    public void insert(Object element)
    {
        SLListNode newNode = new SLListNode(element, null);
        if(size == 0)
        {
            head = tail = newNode;
            size ++;
            return;
        }
        SLListNode ref = head;
        if(((Comparable)(ref.data)).compareTo(element)>=0)
                {
                   newNode.next = ref;
                   head = newNode;
                   ++size;
                   return;
                }
        while(ref.next!= null)
        {
            if(((Comparable)(ref.next.data)).compareTo(element) >= 0)
            {
                newNode.next = ref.next;
                ref.next = newNode;
                ++size;
                return;
            }
            ref = ref.next;
        }
     tail.next = newNode;
     tail = tail.next;
     ++size;
    }
    
    public void clear()
    {
        for(int i = 0; i < size -1; ++i)
        {
            
        }
    }
    
    public boolean isEmpty()
    {
        SLListNode pointer = new SLListNode(head ,null);
        for (int i = 0; i < size -1; ++i)
        {
            if(pointer != null)
            {
                return false;
            }
            head = head.next;
        }
        return true;
    }
    
    public int size()
    {
        return size;
    }
    
    public boolean remove(Object element)
    {
         if(head == null)
        {
            return false;
        }
        if(((Comparable)(head.data)).compareTo(element) == 0)
        {
            if(head == tail)
            {
                head = tail = null;
                return true;
            }
            head = head.next;
            return true;
        }
       if(head == tail)
       {
           return false;
       }
           SLListNode ref = head;
           while(ref.next != tail)
           {
               if(((Comparable)(ref.next.data)).compareTo(element) == 0)
                       {
                        ref.next = ref.next.next;   
                        return true;
                       }
               ref = ref.next;
           }
       
       if(((Comparable)(tail.data)).compareTo(element) == 0)
       {
           ref.next = null;
           tail = ref;
           return true;
       }
       return false;
    }
    
     public String toString()
    {
        String out = "The SLList contains : \n ";
        SLListNode ref = head;
        if (head == null)
        {
            return out + "0 nodes.";
        }
        else
        {
            out += "head -> \t";
        }
        while(ref.next != null)
        {
            out += ref.data + "\t -> \t";
            ref = ref.next;
        }
        out += ref.data + "\t -> null";
        return out;
    }
}
