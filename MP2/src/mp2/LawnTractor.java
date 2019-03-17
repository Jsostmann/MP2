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
public class LawnTractor extends Mower {
    
    private Engine engine;
    private String model;
    private double deckWidth;
    
    
    public LawnTractor() {
        this.engine = null;
        this.model = null;
        this.deckWidth = 0.0;
        super.setSubClassType('L');
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getDeckWidth() {
        return deckWidth;
    }

    public void setDeckWidth(double deckWidth) {
        this.deckWidth = deckWidth;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }
    
    
    
    @Override
    public String toString() {
        return super.toString() + this.engine.toString() + 
                this.model + System.lineSeparator() + 
                this.deckWidth + System.lineSeparator();
                
    }
    
    
   
}
