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
    private static int subjectArraySize = 3;
    
    public static char[] studentGrade = new char[gradeArraySize];
    public static String [] subjectNames = new String[gradeArraySize];
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
        String[] newSubjectArray;
        
        System.arraycopy(studentGrade, 0, newStudentGrade, 0, 2);
        newStudentGrade[2] = 'C';
        System.arraycopy(studentGrade, 2, newStudentGrade, 3, 2);
        
        System.out.println("Correct grade array:");
        displayCharArray(newStudentGrade);        

        subjectNames[0] = "Mathematics";
        subjectNames[1] = "Science";
        subjectNames[2] = "Physical Education";
        
        System.out.println("Second element in subjects array:" + subjectNames[1] + "\n");
         
        newSubjectArray = Arrays.copyOf(subjectNames, 5);
        newSubjectArray[3] = "English";
        newSubjectArray[4] = "Fine Arts";
        
        System.out.println("All subjects array:");
        for (int i = 0; i< newSubjectArray.length; i++){
            System.out.println(newSubjectArray[i]);
        }
    }       
 public static void displayCharArray(char[] arrayToDisplay){
        for (int i = 0; i< arrayToDisplay.length; i++){
            System.out.println(arrayToDisplay[i]);
        }
        System.out.println("\n");
        }
        
        
}