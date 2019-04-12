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
public class GuitarSpecs extends InstrumentSpecs {
    
    private int numStrings;

    public GuitarSpecs(Builder builder, Type type,String model ,Wood backWood, Wood topWood,int numStrings) {
        super(builder,type,model,backWood,topWood);
        this.numStrings=numStrings;
    }
    public int getNumStrings() {
        return numStrings;
    }

    @Override
   public boolean matches(InstrumentSpecs specs) {
        
        if(!super.matches(specs))
            return false;
        if(!(specs instanceof GuitarSpecs))
            return false ;
        GuitarSpecs spec = (GuitarSpecs)specs;
        return numStrings == spec.getNumStrings();
    
    }

    
    
    
}
