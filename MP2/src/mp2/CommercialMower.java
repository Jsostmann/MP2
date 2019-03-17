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
public class CommercialMower extends LawnTractor {
    
    private double operatingHours;
    private boolean zeroTurnRadius;

    public double getOperatingHours() {
        return operatingHours;
    }

    public void setOperatingHours(double operatingHours) {
        this.operatingHours = operatingHours;
    }

    public boolean isZeroTurnRadius() {
        return zeroTurnRadius;
    }

    public void setZeroTurnRadius(boolean zeroTurnRadius) {
        this.zeroTurnRadius = zeroTurnRadius;
    }
    
   
    public CommercialMower() {
        super.setSubClassType('C');
        this.operatingHours = 0.0;
        this.zeroTurnRadius = false;
    }
    
    @Override   
    public String toString() {
        return super.toString() + this.operatingHours + 
                System.lineSeparator() + this.zeroTurnRadius + 
                System.lineSeparator();
    }
}
