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
public class GasPoweredMower extends WalkBehindMower {
    
    private Engine engine;
    private boolean selfPropelled;

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public boolean isSelfPropelled() {
        return selfPropelled;
    }

    public void setSelfPropelled(boolean selfPropelled) {
        this.selfPropelled = selfPropelled;
    }
    
    public GasPoweredMower() {
        super.setSubClassType('G');
        this.engine = null;
        this.selfPropelled = false;
    }
    
    @Override
    public String toString() {
        return super.toString() + this.engine.toString() + 
               this.selfPropelled + System.lineSeparator();
    }
    
    
}
