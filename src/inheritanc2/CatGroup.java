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
public class CatGroup extends Animals{
    boolean paly;

    public CatGroup(boolean paly, String height, String eyrColor, String bodyColor) {
        super(height, eyrColor, bodyColor);
        this.paly = paly;
    }

    public CatGroup() {
    }

    
    
    public boolean isPaly() {
        return paly;
    }

    public void setPaly(boolean paly) {
        this.paly = paly;
    }

    @Override
    public String toString() {
        return " cat info :  \n  paly=" + paly +this.toStringAnimals()+ '}';
    }
    
    
    
    
}
