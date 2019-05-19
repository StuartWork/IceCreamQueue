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
        
        System.out.println("\nNumbers of elements in Both Lists: " + (myArrayList.size() + myLinkedList.size()));
        // TODO code application logic here
    }
    
        
        
}
