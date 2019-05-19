/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collectioninterfacetask;
import java.util.ArrayList;
import java.util.LinkedList;

/**
 *
 * @author Stuart
 */
public class CollectionInterfaceTask {
    
    private static ArrayList myArrayList = new ArrayList();
    private static LinkedList myLinkedList = new LinkedList();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        myArrayList.add(3.14);
        myArrayList.add(2.72);
        myArrayList.add(1.13);
        
        myLinkedList.add(3.14);
        myLinkedList.add(2.72);
        myLinkedList.add(1.13);
        
        System.out.println("Numbers of elements in the Array List: " + myArrayList.size());
        System.out.println("\nArray List");
        for (Object o:myArrayList){
            System.out.println(o);
        }
        
        System.out.println("\nNumbers of elements in the Linked List: " + myLinkedList.size());
        System.out.println("\nLinked List");
        for (Object o:myLinkedList){
            System.out.println(o);
        }
        
        System.out.println("\nNumbers of elements in Both Lists: " + (myArrayList.size() + myLinkedList.size() + "\n"));
        
        if (myArrayList.contains(3.14)){
            System.out.println("Array List contains 3.14, removing it now.");
            myArrayList.remove(3.14);
        }
        else
            System.out.println("Array List does not contain 3.14");
        
        if (myLinkedList.contains(3.14)){
            System.out.println("Linked List contains 3.14, removing it now.");
            myLinkedList.remove(3.14);
        }
        else
            System.out.println("Linked List does not contain 3.14");
        
        System.out.println("\nNew Array List");
        for (Object o:myArrayList){
            System.out.println(o);
        }
            
        System.out.println("\nNew Linked List");
        for (Object o:myLinkedList){
            System.out.println(o);
        }

        // TODO code application logic here
    }
    
        
        
}
