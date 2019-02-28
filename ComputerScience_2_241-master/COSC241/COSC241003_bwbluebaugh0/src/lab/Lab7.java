/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab;
import collection.*;
import java.util.*;
import java.io.*;
/**
 *
 * @author bwbluebaugh0
 */
public class Lab7 
{
    public static void test()
    {
        Random generator = new Random();
        MyStack stack = new MyStack();
        MyQueue queue = new MyQueue();
        int number = 0;
        
        stack.push(number);
        for(int i = 0; i < 30; i++)
        {
            number = generator.nextInt();
            number = number/100000;
            stack.push(number);
            
            queue.insertBack(number);
        }
        queue.insertBack(number += 1);
        queue.insertBack(number += 1);
        
        for(int i =0; i < 20; i++)
        {
            stack.pop();
            queue.removeFront();
        }
       
     File out = new File("..\\..\\COSC241\\COSC241_L7_Output_bwbluebaugh0.txt");
try{
	if(!out.exists())
        {
		out.createNewFile();
        }
	PrintWriter output = new PrintWriter(out);
	

output.println(stack.toString());

output.println(queue.toString());

output.close();
}
catch(IOException e){}

    
}
}
