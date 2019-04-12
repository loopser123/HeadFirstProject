/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ma.ac.GuitarApp;

import java.util.Objects;

/**
 *
 * @author dell
 */
public abstract class InstrumentSpecs {
    
    protected Builder builder;
    protected Type type;
    protected String model;
    protected Wood backWood;
    protected Wood topWood;
    
    protected InstrumentSpecs(Builder builder ,Type type , String model , Wood backWood , Wood topWood){
        this.builder=builder;
        this.model=model;
        this.type=type;
        this.backWood=backWood;
        this.topWood=topWood;
        
    }
    
    public Builder getBuilder() {
        return builder;
    }

    public Type getType() {
        return type;
    }

    public Wood getBackWood() {
        return backWood;
    }

    public Wood getTopWood() {
        return topWood;
    }
     
    public String getModel() {
        return model;
    }

    protected boolean matches(InstrumentSpecs specs){
        
        if(this==null || specs==null)
            return false;
        if(!builder.equals(specs.getBuilder()))
            return false;
        if(!model.equals(specs.getModel()))
            return false;
        if(!type.equals(specs.getType()))
            return false;
        if(!backWood.equals(this.getBackWood()))
            return false;
        if(!topWood.equals(this.getTopWood()))
            return false;
       
       return true; 
    }
    
    
    
    
}
