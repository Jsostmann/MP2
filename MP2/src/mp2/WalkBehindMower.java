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
public abstract class WalkBehindMower extends Mower {
    private double cutWidth;
    private double wheelDiameter;
    
    public WalkBehindMower() {
        this.cutWidth = 0.0;
        this.wheelDiameter = 0.0;
        
    }

    public double getCutWidth() {
        return cutWidth;
    }

    public void setCutWidth(double cutWidth) {
        this.cutWidth = cutWidth;
    }

    public double getWheelDiameter() {
        return wheelDiameter;
    }

    public void setWheelDiameter(double wheelDiameter) {
        this.wheelDiameter = wheelDiameter;
    }
    @Override 
    public String toString() {
        return super.toString() + this.cutWidth + 
                System.lineSeparator() + this.wheelDiameter + 
                System.lineSeparator();
    }
    
    
}
