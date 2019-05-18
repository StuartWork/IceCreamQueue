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
    public static ArrayList personArrayList = new ArrayList();
    
    public static void main(String[] args){
        
        shoppingList.add("juice");
        shoppingList.add("bread");
        shoppingList.add("butter");
        shoppingList.add("cheese");
        
        printShoppingList(shoppingList);
        
        shoppingList.add("bacon");
        shoppingList.add("eggs");
        shoppingList.add("tomatoes");
        shoppingList.add("pepper");
        shoppingList.add("salt");
        shoppingList.add("milk");
        
        printShoppingList(shoppingList);
        
        shoppingList.remove("bread");
        shoppingList.remove("butter");
        
        printShoppingList(shoppingList);
        
        personArrayList.add("007");
        personArrayList.add("Stuart Work");
        personArrayList.add("93KG");
        
        Person person1 = new Person(personArrayList.get(0).toString(),
        personArrayList.get(1).toString(),personArrayList.get(2).toString());
        
        System.out.println(person1);
    
    }
    
    private static void printShoppingList(ArrayList list){
        
        System.out.println("Shopping list:");
        for (Object s: list){
            System.out.println(s);        
        }
        System.out.println("  ");
    
    }
    
}
