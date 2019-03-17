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
public class Engine {
    private String manufacturer;
    private double horsePower;
    private int cylinders;

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public double getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(double horsePower) {
        this.horsePower = horsePower;
    }

    public int getCylinders() {
        return cylinders;
    }

    public void setCylinders(int cylinders) {
        this.cylinders = cylinders;
    }
    
    public Engine() {
        this(null,0.0,0);
    }
    
    public Engine(String manufacturer, double horsePower, int cylinders) {
        this.manufacturer = manufacturer;
        this.horsePower = horsePower;
        this.cylinders = cylinders;
    }
    
    @Override
    public String toString() {
        return this.manufacturer + System.lineSeparator() + 
                this.horsePower + System.lineSeparator() + 
                this.cylinders + System.lineSeparator();
    }
    
    
}
