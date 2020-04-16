/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritanc2;

import java.util.ArrayList;

/**
 *
 * @author PC
 */
public class Inheritanc2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
 
//         ArrayList<Course> as= new ArrayList<Course>();
//          as.add(C2)      
     
     // array of courcess
      //  Course[] arrayOfCourses = {C1, C2};
       // Course[] arrayOfCourses2 = {C2, C3};
        
        
  
        
        
        
        
        
        
        
        
       
        MounkyGroup m = new MounkyGroup();
        m.setBodyColor("Wihte");
        m.setHeight("long");
        m.setEyrColor("blue");
        m.setClam(Boolean.TRUE);
       
        System.out.println("Color Body : "+m.getBodyColor()); 
        System.out.println("Hight : "+m.getHeight()); 
        System.out.println("Eye Color : "+ m.getEyrColor()); 
        System.out.println("Clam : "+ m.getClam()); 
           
        System.out.println("____________________________________________");
        CatGroup cat = new CatGroup(true,"short","blue","white");
        System.out.println( cat.toString());    
       
        System.out.println("____________________________________________");
        DogsGroup dog = new DogsGroup(true,"short","blue","white");
        System.out.println( dog.toString());  
        
    }
    
}
