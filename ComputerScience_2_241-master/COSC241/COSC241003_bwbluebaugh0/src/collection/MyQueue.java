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
public class MyQueue 
{
	public SLListNode front;
	public SLListNode rear;
        int size;
        
        public MyQueue()
        {
            size = 0;
        }
	public void insertBack(Object element)
	{
		if(front == null)
		{
			front = rear = new SLListNode(element, null);
			return;
		}
		rear = rear.next = new SLListNode(element, null);
                size ++;
	}

	public Object removeFront()
	{
		if(front == null)	
                {
                    return null;
                }
		Object temp = front.data;
		if(front == rear)
		{
			front = rear = null;
		}
		else
		{
			front = front.next;
		}
                size --;
		return temp;
                
	}

	public Object front()
	{
		if(front == null)
                {
                    return null;
                }
		return front.data;
	}
        
         public String toString()
                {
                    SLListNode frontTemp = front;
                    ArrayList<Object> array = new ArrayList<Object>();
                    int tempSize = size;
                    for(int i = 0; i < tempSize-1; i++)
                    {
                        array.add(front.data);
                        front = front.next;
                    }
                    
                    front = frontTemp;
                    String out = "The Queue contains: ";
                    out+= "\r\n";                    {

                    for(int i=0; i < array.size(); i++)
                    out += array.get(i) + " \r\n";
                    }
                    return out;
                }
}
