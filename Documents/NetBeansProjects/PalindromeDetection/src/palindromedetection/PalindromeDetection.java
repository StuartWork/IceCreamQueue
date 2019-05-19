/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package palindromedetection;
import java.util.LinkedList;
import java.util.Scanner;

/**
 *
 * @author Stuart
 */
public class PalindromeDetection {
    
    private static Scanner in = new Scanner(System.in);
    private static String input;
    private static LinkedList<String> palindromeList = new LinkedList();
    private static String[] splitInput;
    private static int palindromeLength;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        getPalindrome();
        
        if (palindromeList.size()<=1){
            System.out.println("Not enough letters and/or numbers to make a decision");        
        }
        else {
            while(palindromeList.size()>=0){
                if (palindromeList.size()>1){
                    if (palindromeList.getFirst().equals(palindromeList.getLast())){
                        palindromeList.removeFirst();
                        palindromeList.removeLast();
                    }
                    else{
                        System.out.println("The word and/or number is not a palindrome");
                        return;
                    }
                }
                else{
                    System.out.println("The word and/or number is a palindrome");
                    return;
                }
            }
        }
        
        // TODO code application logic here
    }
    
    public static void getPalindrome(){
        System.out.println("Input test data for palindrome\n");
        input = in.nextLine();
        palindromeLength = input.length();
        splitInput = new String[palindromeLength];
        splitInput = input.split("");
        
        for (String s: splitInput){
            palindromeList.add(s);
        }
    }
    
}
