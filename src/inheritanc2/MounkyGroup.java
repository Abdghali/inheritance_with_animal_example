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
public class MounkyGroup extends Animals{
    
   Boolean clam;
    public MounkyGroup(Boolean clam, String height, String eyrColor, String bodyColor) {
        super(height, eyrColor, bodyColor);
        this.clam = clam;
    }

    public MounkyGroup() {
    }
    
    

    public Boolean getClam() {
        return clam;
    }

    public void setClam(Boolean clam) {
        this.clam = clam;
    }

  
    @Override
    public String toString() {
        return "MounkyGroup{" + "clam=" + clam + '}';
    }

   
   
   
   
}
