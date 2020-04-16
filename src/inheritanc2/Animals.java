/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritanc2;

/**
 *
 * @author PC
 */
public class Animals {
    
   String height ;
  String eyrColor;
  String bodyColor;

    public Animals(String height, String eyrColor, String bodyColor) {
        this.height = height;
        this.eyrColor = eyrColor;
        this.bodyColor = bodyColor;
    }

    public Animals() {
    }
    
    

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getEyrColor() {
        return eyrColor;
    }

    public void setEyrColor(String eyrColor) {
        this.eyrColor = eyrColor;
    }

    public String getBodyColor() {
        return bodyColor;
    }

    public void setBodyColor(String bodyColor) {
        this.bodyColor = bodyColor;
    }
  
    void printHight(){
        System.out.println("Hight : "+this.height);
    }

 /// to print animal information 
    public String toStringAnimals() {
        return "\n  height=" + height + "\n  eyrColor= " + eyrColor + "\n  bodyColor=" + bodyColor + '}';
    }
  
    
    
}
