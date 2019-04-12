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
public class MandolinSpecs extends InstrumentSpecs{
   
    private Style style;
    
    public MandolinSpecs(Builder builder ,Type type , String model , Wood backWood , Wood topWood ,Style style){
        super(builder,type,model,backWood,topWood);
        this.style=style;
    }

    public Style getStyle() {
        return style;
    }

    @Override
    public boolean matches(InstrumentSpecs specs) {
       if(!super.matches(specs))
           return false;
       if(!(specs instanceof MandolinSpecs))
           return false;
       MandolinSpecs spec = (MandolinSpecs)specs;
       return style.equals(spec.getStyle());
    }
    
    
    
    
}
