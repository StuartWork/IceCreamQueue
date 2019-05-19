/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package undofunction;
import java.util.Scanner;
import java.util.Stack;
/**
 *
 * @author Stuart
 */
public class UndoFunction {
    
    private static Scanner in = new Scanner(System.in);
    private static String input;
    private static Stack<String> directionList = new Stack();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
    public static void removeDirection(){
        if (directionList.isEmpty()){
            System.out.println("The list is empty, you cannot remove nothing.");
        }
        else{
            System.out.println(directionList.pop() + "Has been removed.");
            displayDirections();
        }
    }
    
    public static void displayDirections(){
        System.out.println("List of Directions!");
        for (String s: directionList){
            System.out.println(s);
        }
    }
    
}
