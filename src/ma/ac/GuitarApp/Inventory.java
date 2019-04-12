/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ma.ac.GuitarApp;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author dell
 */
public class Inventory {

    private List<Instrument> instruments = new ArrayList<Instrument>();

    public int size() {
        return instruments.size();
    }

    public boolean contains(Instrument o) {
        return instruments.contains(o);
    }

    public boolean add(Instrument e) {
        return instruments.add(e);
    }

    public boolean remove(Instrument o) {
        return instruments.remove(o);
    }

    public Instrument get(int index) {
        return instruments.get(index);
    }
    
    public List<Instrument> searchTool(InstrumentSpecs specs){
        List<Instrument> results = new ArrayList<Instrument>();  
        for(Instrument inst : instruments){
            if(!inst.getInstrumentSpecs().matches(specs))
                continue;
            results.add(inst);    
        }
        return results;      
    }
    
    
    

}
