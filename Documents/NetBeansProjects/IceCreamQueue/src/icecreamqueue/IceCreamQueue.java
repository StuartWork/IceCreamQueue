/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package icecreamqueue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;





/**
 *
 * @author Stuart
 */
public class IceCreamQueue {
    
    public static Queue<String> customerQueue = new LinkedList();
    public static Scanner in = new Scanner(System.in);
    public static String cutomerArrival;
    public static int queueNumber = 0;    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        addCustomer();
        Timer timer = new Timer();
        timer.schedule(new IceCreamServing(), 0, 3000);
        
        // TODO code application logic here
    }

    private static void addCustomer() {
        for (int i=1; i<7; i++){
            customerQueue.add("Customer "+ i);
        }
    }
    
    public static class IceCreamServing extends TimerTask{
        
        public void run(){
            System.out.println("Sales Assistant is ready for next customer");
            if (customerQueue.isEmpty()){
                System.out.println("There is no customers waiting");
                System.exit(0);
            }
            else if (customerQueue.size() == 1){
                System.out.println("The customer with number " + customerQueue.poll() + " is getting served");
                System.out.println("There is no customers waiting");
            }
            else{
                System.out.println("The customer with number " + customerQueue.poll() + " is getting served");
                System.out.println("The customer with tickets are in the queue " + customerQueue.toString());
            }
        }
    }
    
}
