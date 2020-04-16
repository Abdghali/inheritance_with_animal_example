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
public class DogsGroup extends Animals{
   boolean Protection;

    public DogsGroup(boolean Protection, String height, String eyrColor, String bodyColor) {
        super(height, eyrColor, bodyColor);
        this.Protection = Protection;
    }

    public DogsGroup() {
    }

    public boolean isProtection() {
        return Protection;
    }

    public void setProtection(boolean Protection) {
        this.Protection = Protection;
    }

    @Override
    public String toString() {
        return"Dog inf : \n Protection=" + Protection + this.toStringAnimals() + '}';
    }
   
    
    
}
