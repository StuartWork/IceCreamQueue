/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;


public class StudentSummary2Test {
    
    public static void main(String args[]){
        
        int gradesArray[][] = {{87, 96, 70},
                                {64, 78, 54},
                                {100, 100, 97},
                                {42, 57, 68},
                                {57, 87, 97},
                                {97, 87, 77},
                                {88,99,44},
                                {89, 66, 78},
                                {78, 54, 49},
                                {88, 92, 100}};
        
        StudentSummary2 myStudentSummary2 = new StudentSummary2(
                "Intoduction to Arrays", gradesArray);
        myStudentSummary2.displayMessage();
        myStudentSummary2.processGrades();
        
    }
    
}
