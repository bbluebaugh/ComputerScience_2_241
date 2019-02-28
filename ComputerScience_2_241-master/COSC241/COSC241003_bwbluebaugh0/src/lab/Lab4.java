/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab;
import java.util.Scanner;

/**
 *
 * @author bwbluebaugh0
 */
public class Lab4 
{
    /**
     * Tester method for Lab4.
     */
    public static void test()
    {   String word;
        String cont = " ";
        boolean exit = false;
        Scanner scan = new Scanner(System.in);
        while(exit == false)//loops until user tells the program to exit
        {
        System.out.println("Type in the word you wish to check as a palindrome, with no spaces.");
        word = scan.nextLine();
        if(isPalindrome(word) == true)
        {
            System.out.println("The word is a palindrome.");
        }
        else
        {
            System.out.println("The word is either not a palindrome or the input was incorrect.");
        }
        
        System.out.println("If you want to exit the program, type an x. If you want to continue hit any other key.");
        cont = scan.nextLine();
        if(cont.compareToIgnoreCase("x") == 0)//exit condition
        {
            exit = true;
        }
        }
    }
    
    
    
    /**
     * Checks the input to see if it is a palindrome.
     * @param input
     * @return true if the input is a palindrome, false if not
     */
    public static boolean isPalindrome(String input)
    {
        input = input.toLowerCase();
       if(input.compareTo("") == 0)//nothing entered
       {
           return false;
       }
       if(input.contains(" ") == true)//input contains a whitespace
       {
           return false;
       }
       if(input.length() == 1)//single letter
       {
           return true;
       }
       if(input.length() == 2)
       {
           if(input.charAt(0) == input.charAt(1))
           {
               return true;
           }
           else
               return false;
       }
       if(input.charAt(0) == input.charAt(input.length()-1) )
       {
           return isPalindrome(input.substring(1,input.length()-1));
       }
      
       return false;
    }
}
