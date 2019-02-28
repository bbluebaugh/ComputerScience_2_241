/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collection;

import java.util.ArrayList;

/**
 *
 * @author bwbluebaugh0
 */
public class MyDeque extends DLList
{
	public MyDeque()
	{
		super();
	}
	public Object front()
	{
		if(head == null)
			return null;
		return head.data;
	}
	public Object back()
	{
		if(head == null)
			return null;
		return tail.data;
	}
	public void insertBack(Object element)
	{
		append(element);
	}
	public Object removeBack()
	{
           
		if(head == null)
			return null;
		Object temp = tail.data;
		if(head == tail)
		{
			head = tail = null;
			return temp;
		}
		tail = tail.prev;
		tail.next = null;
		return temp;
	}
	public void insertFront(Object element)
	{
		insert(element);
	}
	public Object removeFront()
	{
		if(head == null)
			return null;
		Object temp = head.data;
		if(head == tail)
		{
			head = tail = null;
		}
		else //could implement as same as removeBack as far as else statement vs return statement
		{
			head = head.next;
			head.prev = null;
		}
		return temp;
	}
        public String toString()
        {
                   String out = "The Deque contains : \n ";
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
}