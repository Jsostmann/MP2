/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mp2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author jamesostmann
 */
public class MowerWareHouse {

    private final ArrayList<Mower> mowers;
    private Scanner scan;
    private String storeName;
    private String fName;

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

    public void readMowerData(String fName) {
        
        this.fName = fName;
        
        try {
            
            scan = new Scanner(new File(fName));
            
            String storename = scan.nextLine();
            
            this.storeName = storename;

            while (scan.hasNextLine()) {

                String manufacturer = scan.nextLine();
                int year = Integer.parseInt(scan.nextLine());
                String serialNumber = scan.nextLine();

                char subType = scan.nextLine().charAt(0);

                switch (subType) {

                    case 'L':
                        mowers.add(this.addLawnTractor(manufacturer, year, serialNumber));
                        break;

                    case 'C':
                        mowers.add(this.addCommercialMower(manufacturer, year, serialNumber));
                        break;

                    case 'G':
                        mowers.add(this.addGassPoweredMower(manufacturer, year, serialNumber));
                        break;

                    case 'P':
                        mowers.add(this.addPushReelMower(manufacturer, year, serialNumber));
                        break;
                }

            }

            scan.close();

        } catch (FileNotFoundException e) {

            System.err.println("Could not find file for reading.");
            System.exit(-1);

        }

    }

    public void saveMowerData() {
        
        try {
            
            PrintWriter output = new PrintWriter(new File(fName));
            output.print(this.toString());
            output.close();
            
            
        } catch (IOException e) {
            System.err.println("Could not find file for saving.");
            System.exit(-1);
        }
        
    }

    @Override
    public String toString() {

        String result = "";

        result += this.storeName + System.lineSeparator();

        for (Mower mower : mowers) {
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

        if (i > -1 && i < mowers.size()) {

            return mowers.get(i);

        } else {

            return null;
        }
    }

    public int getMowersSize() {
        return mowers.size();
    }

    public Mower removeMower(int i) {
        if (i > -1 && i < mowers.size()) {
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

        Engine engine = new Engine(engineManufacturer, horsePower, cylinders);

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

        Engine engine = new Engine(engineManufacturer, horsePower, cylinders);

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
        Engine engine = new Engine(engineManufacturer, horsePower, cylinders);
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
