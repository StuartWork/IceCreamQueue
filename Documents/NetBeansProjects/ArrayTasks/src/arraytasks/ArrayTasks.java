/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraytasks;
import java.util.Arrays;
/**
 *
 * @author Stuart
 */
public class ArrayTasks {
    
    private static int gradeArraySize = 5;
    
    public static char[] studentGrade = new char[gradeArraySize];

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        studentGrade[0] = 'A';
        studentGrade[1] = 'B';
        studentGrade[2] = 'D';
        studentGrade[3] = 'F';
        
        System.out.println("Grades arry:");
        displayCharArray(studentGrade);
        
        char [] newStudentGrade = new char[gradeArraySize];
        
        System.arraycopy(studentGrade, 0, newStudentGrade, 0, 2);
        newStudentGrade[2] = 'C';
        System.arraycopy(studentGrade, 2, newStudentGrade, 3, 2);
        
        System.out.println("Correct grade array:");
        displayCharArray(newStudentGrade);        

        
    }
    
}
