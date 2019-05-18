/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package genericstasks;

/**
 *
 * @author Stuart
 */
public class StudyCourse {
    
    private String courseId;
    private String courseName;
    private String courseCost;
    
    public StudyCourse(String courseId, String courseName, String courseCost){
        
        this.courseId = courseId;
        this.courseName = courseName;
        this.courseCost = courseCost;
    
    }
    
    public String toSting(){
        
        return "Course Information:\nID: " + courseId + "\nName: " + courseName + "\nCost: " +courseCost;
    
    }
    
}
