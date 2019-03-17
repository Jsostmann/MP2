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
public abstract class Mower {
    
    private String manufacturer;
    private int year;
    private String serialNumber;
    private char subClassType;
    
    public Mower() {
        
        this(null,0,null);
    
    }
    
    public Mower(String manufacturer, int year, String serialNumber) {
        
        this.manufacturer = manufacturer;
        this.year = year;
        this.serialNumber = serialNumber;
        this.subClassType = 'A';
       
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public char getSubClassType() {
        return subClassType;
    }

    public void setSubClassType(char subClassType) {
        this.subClassType = subClassType;
    }
    
    
    
    @Override
    public String toString() {
        return this.manufacturer + System.lineSeparator() + 
                this.year + System.lineSeparator() + 
                this.serialNumber + System.lineSeparator() + 
                this.subClassType + System.lineSeparator();
    }
    
}
