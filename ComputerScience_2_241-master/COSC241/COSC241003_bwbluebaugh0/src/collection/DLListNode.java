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
public class DLListNode
{
	public Object data;
	public DLListNode next;
	public DLListNode prev;

	public DLListNode(Object d, DLListNode p, DLListNode n)
	{
		data = d;
		prev = p;
		next = n;
        }   
}
