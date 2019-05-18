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
    
    }
    
}
