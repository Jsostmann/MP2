/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mp2;

/**
 *
 * @author jamesostmann
 */
public class PushReelMower extends WalkBehindMower {
    
    private int numWheels;

    public int getNumWheels() {
        return numWheels;
    }

    public void setNumWheels(int numWheels) {
        this.numWheels = numWheels;
    }
    
    public PushReelMower() {
        super.setSubClassType('P');
        this.numWheels = 0;
    }
    
    @Override
    public String toString() {
        return super.toString() + this.numWheels + 
                System.lineSeparator();
    }
    
    
}
