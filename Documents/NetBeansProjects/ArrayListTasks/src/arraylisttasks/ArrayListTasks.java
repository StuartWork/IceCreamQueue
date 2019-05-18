/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraylisttasks;
import java.util.ArrayList;

/**
 *
 * @author Stuart
 */
public class ArrayListTasks {
    
    public static ArrayList shoppingList = new ArrayList();
    
    public static void main(String[] args){
        
        shoppingList.add("juice");
        shoppingList.add("bread");
        shoppingList.add("butter");
        shoppingList.add("cheese");
        
        printShoppingList(shoppingList);
    
    }
    
    private static void printShoppingList(ArrayList list){
        
        System.out.println("Shopping list:");
        for (Object s: list){
            System.out.println(s);        
        }
        System.out.println("  ");
    
    }
    
}
