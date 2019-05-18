/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package genericstasks;

/**
 *
 * @author Stuart
 * @param <T>
 */
public class Employee<T> {
    
    T id;
    String name;
    String department;
    Float salary;
    
    public Employee(T id, String name, String department, float salary){
        
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;                
    
    }
    
    @Override
    public String toString(){
        
        return "Employee Information:\nEmployee ID: " + id + "\nName: " + name + "\nDepartment: " 
                + department + "\nSalary: " + salary;
    
    }
    
}
