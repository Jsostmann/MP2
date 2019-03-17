/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mp2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author jamesostmann
 */
public class MowerWareHouse {
    
    private ArrayList<Mower> mowers;
    private Scanner scan;
    private String storeName;
    
    public MowerWareHouse() {
        this.mowers = new ArrayList<>();
        this.scan = null;
        this.storeName = null;
    }

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }
    
    public void readMowerData(String fName){
        // TODO
 
        
    }
    
    public void saveMowerData(String fName) {
        //TODO 
    }
    
    @Override
    public String toString() {
        
        String result = "";
        
        result += this.storeName + System.lineSeparator();
        
        for(Mower mower: mowers) {
            result += mower.toString();
        }
                
        return result;
    }
    
    /*
        Widgets for ArrayList
    */
    
    public void addMower(Mower m) {
        mowers.add(m);
    }
    public Mower getMower(int i) {
        
        if(i > -1 && i < mowers.size()) {
            
            return mowers.get(i);
            
        } else {
            
            return null;
        }
    }
    public int getMowersSize() {
        return mowers.size();
    }
    public Mower removeMower(int i) {
        if(i > -1 && i < mowers.size()) {
            return mowers.remove(i);
        } else {
            return null;
        }
    }
    
    /*
        Helper methods
    */
    private LawnTractor addLawnTractor(String manufacturer, int year, String serialNumber) {
        
        String engineManufacturer = scan.nextLine();
        double horsePower = Double.parseDouble(scan.nextLine());
        int cylinders = Integer.parseInt(scan.nextLine());
        
        Engine engine = new Engine(engineManufacturer,horsePower,cylinders);
        
        String model = scan.nextLine();
        double deckWidth = Double.parseDouble(scan.nextLine());
        
        LawnTractor mower = new LawnTractor();
        
        mower.setManufacturer(manufacturer);
        mower.setYear(year);
        mower.setSerialNumber(serialNumber);
        mower.setEngine(engine);
        mower.setModel(model);
        mower.setDeckWidth(deckWidth);
        
       return mower;
    }
    private CommercialMower addCommercialMower(String manufacturer, int year, String serialNumber) {
        
        String engineManufacturer = scan.nextLine();
        double horsePower = Double.parseDouble(scan.nextLine());
        int cylinders = Integer.parseInt(scan.nextLine());
        
        Engine engine = new Engine(engineManufacturer,horsePower,cylinders);
        
        String model = scan.nextLine();
        double deckWidth = Double.parseDouble(scan.nextLine());
        
        double operatingHours = Double.parseDouble(scan.nextLine());
        boolean zeroTurnRadius = Boolean.valueOf(scan.nextLine());
        
        CommercialMower mower = new CommercialMower();
        
        mower.setManufacturer(manufacturer);
        mower.setYear(year);
        mower.setSerialNumber(serialNumber);
        mower.setEngine(engine);
        mower.setModel(model);
        mower.setDeckWidth(deckWidth);
        mower.setOperatingHours(operatingHours);
        mower.setZeroTurnRadius(zeroTurnRadius);
        
        return mower;
       
    }
    private GasPoweredMower addGassPoweredMower(String manufacturer, int year, String serialNumber) {
        
        double cutWidth = Double.parseDouble(scan.nextLine());
        double wheelDiameter = Double.parseDouble(scan.nextLine());
        
        String engineManufacturer = scan.nextLine();
        double horsePower = Double.parseDouble(scan.nextLine());
        int cylinders = Integer.parseInt(scan.nextLine());
        Engine engine = new Engine(engineManufacturer,horsePower,cylinders);
        boolean selfPropelled = Boolean.valueOf(scan.nextLine());
        
        GasPoweredMower mower = new GasPoweredMower();
        
        mower.setManufacturer(manufacturer);
        mower.setYear(year);
        mower.setSerialNumber(serialNumber);
        mower.setEngine(engine);
        mower.setCutWidth(cutWidth);
        mower.setWheelDiameter(wheelDiameter);
        mower.setSelfPropelled(selfPropelled);
        
        return mower;
        
    
    }
    private PushReelMower addPushReelMower(String manufacturer, int year, String serialNumber) {
        
        double cutWidth = Double.parseDouble(scan.nextLine());
        double wheelDiameter = Double.parseDouble(scan.nextLine());
        
        int numWheels = Integer.parseInt(scan.nextLine());
        
        PushReelMower mower = new PushReelMower();
        
        mower.setManufacturer(manufacturer);
        mower.setYear(year);
        mower.setSerialNumber(serialNumber);
        mower.setCutWidth(cutWidth);
        mower.setWheelDiameter(wheelDiameter);
        mower.setNumWheels(numWheels);
        
        return mower;
        
    }
}
