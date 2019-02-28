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
public class MyStack {
    	
		public SLListNode top;
                int size;
                public MyStack()
                {
                    size = 0;
                }
                
                //remove from top
		public Object pop()
		{
			if(top == null)
				return null;
			Object temp = top.data;
			top = top.next;
                        size --;
			return temp;
		}
                
                //add to top
		public void push(Object element)
		{
			SLListNode oldfirst = top;
                        top = new SLListNode(element, top);
                        top.next = oldfirst;
                            size++;
		}
                
                //return top
		public Object top()
		{
			return top == null?null:top.data;
		}
                
                public int size()
                {
                    return size;
                }
                
                public String toString()
                {
                    SLListNode topTemp = top;
                    ArrayList<Object> array = new ArrayList<Object>();
                    int tempSize = size;
                    for(int i = 0; i < tempSize-1; i++)
                    {
                        array.add(top.data);
                        top = top.next;
                    }
                    
                    top = topTemp;
                    
                    String out = "The stack contains: ";
                    out+= "\r\n";
                    for(int i=0; i< array.size(); i++)
                    {
                    out += array.get(i) + " \r\n";
                    }
                    return out;
                }
}
