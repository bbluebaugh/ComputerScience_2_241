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
public class SLList 
{
    private SLListNode head;
    private SLListNode tail;
    
    public SLList()
    {
        head = tail = null;
    }
    
    public void append(Object element)
    {
        if(head == null)
        {
            head = tail = new SLListNode(element, null);
        }
        else
        {
            tail = tail.next = new SLListNode(element, null);
        }
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
}
