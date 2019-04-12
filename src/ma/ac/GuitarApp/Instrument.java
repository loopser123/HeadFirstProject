/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ma.ac.GuitarApp;

/**
 *
 * @author dell
 */
public abstract class Instrument {
        
    protected String serialNumber;
    protected double price;
    protected InstrumentSpecs instrumentSpecs;

    
    
    protected Instrument(String serialNumber , double price , InstrumentSpecs instrumentSpecs){
        setPrice(price);
        this.serialNumber=serialNumber;
        this.instrumentSpecs=instrumentSpecs;
    }

    public InstrumentSpecs getInstrumentSpecs() {
        return instrumentSpecs;
    }
    
    
    public void setPrice(double price) {
        this.price = price;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public double getPrice() {
        return price;
    }
    
    
    
    
}
