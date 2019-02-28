/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab;
import collection.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
/**
 *
 * @author bwbluebaugh0
 */
public class Lab8
{
 public static void test()
 {
    ArrayList<String> words = new ArrayList<String>();
        // The name of the file to open.
        String fileName = "..\\COSC241_L8_Input.txt";
        // This will reference one line at a time
        String line = null;

        try {
            // FileReader reads text files in the default encoding.
            FileReader fileReader = 
                new FileReader(fileName);

            // Always wrap FileReader in BufferedReader.
            BufferedReader bufferedReader = 
                new BufferedReader(fileReader);

            while((line = bufferedReader.readLine()) != null) {
                words.add(line);
            }   

            // Always close files.
            bufferedReader.close();         
        }
        catch(FileNotFoundException ex) {
            System.out.println(
                "Unable to open file '" + 
                fileName + "'");                
        }
        catch(IOException ex) {
            System.out.println(
                "Error reading file '" 
                + fileName + "'");                    
    }
    DLList simpleList = new DLList();
    MyDeque simpleDeque = new MyDeque();
    
    
 
    File out = new File("..\\..\\COSC241\\COSC241_L8_Output_bwbluebaugh0.txt");
try{
	if(!out.exists())
        {
		out.createNewFile();
        }
	PrintWriter output = new PrintWriter(out);
	
        
        
 for(int i =0; i < words.size(); i++)
    {
        String word = words.get(i);
        word = word.trim();
        System.out.println(word);
        
        String wordBegin = word.substring(0, (word.length()/2));
        
        String wordEnd = word.substring(word.length()/2);
       
        boolean letter = false;
        if(word.length() % 2 != 0)
        {
            wordBegin = word.substring(0, word.length()/2);
            wordEnd = word.substring(word.length()/2+1);
        } 
        for (int j = 0; j <= wordBegin.length()-1; j ++) 
        {
           
            simpleList.append(wordBegin.charAt(j));
            
        }
        for(int k = wordEnd.length()-1; k >= 0; k --)
        {
            simpleDeque.insertBack(wordEnd.charAt(k));
        }
        
        boolean palindrome = true;
        
        DLListNode test1 = simpleList.head;
        DLListNode test2 = simpleDeque.head;
        
        for(int l = 0; l < word.length()/2; l ++)
        {
           if(test1.data != test2.data)
           {
               palindrome = false;
           }
           
           if(test1.next == null || test2.next == null)
           {
               break;
           }
           test1 = test1.next;
           test2 = test2.next;
        }
        if(palindrome == true)
        {
            output.println(word + " is a palindrome.");
        }
        else if(palindrome == false)
        {
            output.println(word + " is not a palindrome.");
        }
        
        simpleList.clear();
        simpleDeque.clear();
    }
        
        
        
output.close();
}
catch(IOException e){}

    
}
}