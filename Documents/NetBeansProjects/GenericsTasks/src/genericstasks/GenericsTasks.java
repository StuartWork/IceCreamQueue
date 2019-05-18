/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package genericstasks;
import java.util.ArrayList;
/**
 *
 * @author Stuart
 */
public class GenericsTasks {
    
    public static ArrayList<StudyCourse> courses = new ArrayList<>();
    public static ArrayList<Employee> salesEmpList = new ArrayList<>();
    public static ArrayList<Employee> marketingList = new ArrayList<>();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        StudyCourse course1 = new StudyCourse("A101", "Art", "$1300.00");
        StudyCourse course2 = new StudyCourse("F101", "Foods", "$1000.00");
        StudyCourse course3 = new StudyCourse("M101", "Maths", "$1250.00");
        StudyCourse course4 = new StudyCourse("E101", "English", "$1500.00");
        StudyCourse course5 = new StudyCourse("C101", "Computers", "$1100.00");
        StudyCourse course6 = new StudyCourse("LS101", "Life Skills", "$500.00");
        StudyCourse course7 = new StudyCourse("MW101", "Metal Work", "$2250.00");
        //StudyCourse course8 = new StudyCourse("mathmatics");
        
        courses.add(course1);
        courses.add(course2);
        courses.add(course3);
        courses.add(course4);
        courses.add(course5);
        courses.add(course6);
        courses.add(course7);
        //courses.add("mathmatics");
        
        for (StudyCourse sc: courses)
            System.out.println(sc);
        
        Employee emp1 = new Employee(1, "Bob Jones", "Sales", 60000);
        Employee emp2 = new Employee(2, "Sue Jamies", "Sales", 70000);
        Employee emp3 = new Employee(3, "Luke Drongool", "Sales", 100000);
        Employee emp4 = new Employee("1M", "Emma Perri", "Marketing", 90000);
        Employee emp5 = new Employee("2M", "katy Park", "Marketing", 95000);
        Employee emp6 = new Employee("3M", "David Shell", "Marketing", 190000);
        
        salesEmpList.add(emp1);
        salesEmpList.add(emp2);
        salesEmpList.add(emp3);
        marketingList.add(emp4);
        marketingList.add(emp5);
        marketingList.add(emp6);
        
        System.out.println("\nSales Department Staff:");
        for (Employee e: salesEmpList){
            
            System.out.println(e);
        
        }
        System.out.println("\nMarketing Department Staff:");
        for (Employee m: marketingList){
            
            System.out.println(m);
        
        }
            
    }
    
}
