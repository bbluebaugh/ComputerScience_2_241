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
public class SLListNode 
{
    public Object data;
    public SLListNode next;
    
	public SLListNode(Object d, SLListNode n)
	{
		data = d;
		next = n;
	}
        
	private SLListNode head;//first SLL node
	private SLListNode tail;//last SLL node
        
	
}

