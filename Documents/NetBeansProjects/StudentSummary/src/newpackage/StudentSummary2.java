/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;


public class StudentSummary2 {
    
    private String courseName;
    private int grades[][];
    
    public GradeBook(String name, int gradesArray[][]){
        
        courseName = name;
        grades = gradesArray;
        
    }
    
    public void setCourseName(String name){
        
        courseName = name;
        
    }
    
    public String getCourseName(){
        
        return courseName;
        
    }
    
    public void displayMessage(){
        
        System.out.printf("Welcome to the grade book for \n%s!\n\n",
                getCourseName());
        
    }
    
    public void processGrades(){
        
        outputgrades();
        
        System.outf()
        
    }
    
    
}
