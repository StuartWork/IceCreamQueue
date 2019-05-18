/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraylisttasks;

/**
 *
 * @author Stuart
 */
public class Person {
    
    private String id;
    private String name;
    private String weight;
    
    public Person(String id, String name, String weight){
        
        this.id = id;
        this.name = name;
        this.weight = weight;
    
    }
    
    public String getId(){
        return id;
    }
    
    public void setId(String id){
        this.id = id;
    }
    
    public String getName(){
        return name;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public String getWeight(){
        return weight;
    }
    
    public void setWeight(String weiht){
        this.weight = weight;
    }
    
    @Override
    public String toString(){
        
        return "Person Information:\nID: " + id + "\nName: " + name + "\nWeight: " + weight;
    
    }
    
}
