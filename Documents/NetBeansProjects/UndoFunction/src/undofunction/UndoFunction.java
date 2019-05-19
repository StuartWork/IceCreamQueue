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
        while (true){
            System.out.println("Press D to enter new direction, U to cancel last entry and E to quit the program");
            input = in.nextLine();
            if (input.equals("D")){
                getDirection();
            }
            else if (input.equals("U")){
                removeDirection();
            }
            else if (input.equals("E")){
                System.out.println("Bye...");
                System.exit(0);
            }
            else{
                System.out.println("That is not a vaild command, you musr use D,U or E");
            }
        }
        // TODO code application logic here
    }
    
    public static void removeDirection(){
        if (directionList.isEmpty()){
            System.out.println("The list is empty, you cannot remove nothing.");
        }
        else{
            System.out.println(directionList.pop() + " Has been removed.");
            displayDirections();
        }
    }
    
    public static void getDirection(){
        System.out.println("Input the Direction.");
        input = in.nextLine();
        directionList.push(input);
        displayDirections();
    }
    
    public static void displayDirections(){
        System.out.println("List of Directions!");
        for (String s: directionList){
            System.out.println(s);
        }
    }
    
}
