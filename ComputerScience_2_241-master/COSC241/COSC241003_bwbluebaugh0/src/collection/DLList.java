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
public class DLList
{
	public DLListNode head;
	public DLListNode tail;
	
	public DLList()
	{
		head = tail = null;
	}

	//append to the end
	public void append(Object element)
	{
		if(head == null)
		{
			head = tail = new DLListNode(element, null, null);
		}
		else
		{
			tail=new DLListNode(element, tail, null);
			tail.prev.next = tail;
		}
	}

	//insert at beginning
	public void insert(Object element)
	{
		if(head == tail)
		{
			head = tail = new DLListNode(element, null, null);
		}
		else
		{
			head.prev= new DLListNode(element, null, head);
			head = head.prev;
		}
	}
	
	public void remove(Object element)
	{
		if (head == null)	
                    return;
		if(((Comparable)head.data).compareTo(element) == 0)
		{
			if(head == tail)
			{
				head = tail = null;
			}
                        else if(head == tail)
			{
{
				head = head.next;
				head.prev = null;
			}
			
		}
        }
        }
       public String toString()
       {
           String out = "The DLList contains : \n ";
        DLListNode ref = head;
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
       
       public void clear()
       {
           head = tail= null;
       }
}