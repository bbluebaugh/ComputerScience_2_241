/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;
import collection.*;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
/**
 *
 * @author bwbluebaugh0
 */
public class Project2 
{
    public static void test()
    {
        ArrayList<String> words = new ArrayList<String>();
        // The name of the file to open.
        String fileName = "../COSC241_P2_EnglishWordList.txt";
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
            // Or we could just do this: 
            // ex.printStackTrace();
           
    }
        
        
        String word;
        for(int i=0; i < words.size(); i++)
        {
            word = words.get(i);
            if((word.length()) != 7)
            {
                words.remove(i);
                --i;
            }
            
        }
        
        
            int number = 0;
            String numberString;
            Scanner scan = new Scanner(System.in);
            System.out.println("Please input a 7 digit phone number, with numbers between 2 and 9: ");
            number = scan.nextInt();
            if (number < 1000000 || number > 9999999)
                    {
                     System.out.println("Invalid number.");  
                    }
            
            else
            {
            numberString = number + " ";
            if(numberString.contains("0") || numberString.contains("1"))
            {
                System.out.println("Invalid input");
                return;
            }
            System.out.println("You have typed in the number: " + numberString);
            
            String search;
            
        for(int i=0; i < 7; i++)
        {
            
            for(int j=0; j< words.size(); j++)
            {
                
                if(numberString.charAt(i) == '2')
                {
                    search = words.get(j);
                    if((search.charAt(i) != 'a' && search.charAt(i) != 'b' && search.charAt(i) != 'c'))
                    {
                        words.remove(j);
                        j--;
                    }
                }
                else if(numberString.charAt(i) == '3')
                {
                    search = words.get(j);
                    if((search.charAt(i) != 'd' && search.charAt(i) != 'e' && search.charAt(i) != 'f'))
                    {
                        words.remove(j);
                        j--;
                    }
                }
                else if(numberString.charAt(i) == '4')
                {
                    search = words.get(j);
                    if((search.charAt(i) != 'g' && search.charAt(i) != 'h' && search.charAt(i) != 'i'))
                    {
                        words.remove(j);
                        j--;
                    }
                }
                else if(numberString.charAt(i) == '5')
                {
                    search = words.get(j);
                    if((search.charAt(i) != 'j' && search.charAt(i) != 'k' && search.charAt(i) != 'l'))
                    {
                        words.remove(j);
                        j--;
                    }
                }
                else if(numberString.charAt(i) == '6')
                {
                    search = words.get(j);
                    if((search.charAt(i) != 'm' && search.charAt(i) != 'n' && search.charAt(i) != 'o'))
                    {
                        words.remove(j);
                        j--;
                    }
                }
                else if(numberString.charAt(i) == '7')
                {
                    search = words.get(j);
                    if((search.charAt(i) != 'p' && search.charAt(i) != 'q' && search.charAt(i) != 'r' && search.charAt(i) != 's'))
                    {
                        words.remove(j);
                        j--;
                    }
                }
                else if(numberString.charAt(i) == '8')
                {
                    search = words.get(j);
                    if((search.charAt(i) != 't' && search.charAt(i) != 'u' && search.charAt(i) != 'v'))
                    {
                        words.remove(j);
                        j--;
                    }
                }
                else if(numberString.charAt(i) == '9')
                {
                    search = words.get(j);
                    if((search.charAt(i) != 'w' && search.charAt(i) != 'x' && search.charAt(i) != 'y' && search.charAt(i)!= 'z'))
                    {
                        words.remove(j);
                        j--;
                    }
                }
                
            }
            
        }
        for (int i = 0; i < words.size(); i++)
        {
           System.out.println(words.get(i));
        }
    }

}
   
}