/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Program;

import java.util.List;
import ma.ac.GuitarApp.Builder;
import ma.ac.GuitarApp.Guitar;
import ma.ac.GuitarApp.GuitarSpecs;
import ma.ac.GuitarApp.Instrument;
import ma.ac.GuitarApp.Inventory;
import ma.ac.GuitarApp.Mandolin;
import ma.ac.GuitarApp.Type;
import ma.ac.GuitarApp.Wood;
import ma.ac.GuitarApp.MandolinSpecs;
import ma.ac.GuitarApp.Style;

/**
 *
 * @author dell
 */
public class HeadFirstProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        GuitarSpecs specsOne =  new GuitarSpecs(Builder.Fender, Type.Electric, "Erin", Wood.BRAZILIAN, Wood.INDIAN,12);
//         
//        Guitar firstGuitar=new Guitar("123",112, specsOne);
//        Guitar secondGuitar = new Guitar("12345", 1234, specsOne);
//        Inventory inventory = new Inventory();
      
        Inventory inventory = new Inventory();
        GuitarSpecs gspecsone = new GuitarSpecs(Builder.Fender, Type.Electric, "Ernic", Wood.BRAZILIAN, Wood.INDIAN, 12);
        GuitarSpecs gspecstwo = new GuitarSpecs(Builder.Kamazi, Type.Acoustic,"Cubaini", Wood.BRAZILIAN, Wood.INDIAN,4);
        MandolinSpecs mspecs = new MandolinSpecs(Builder.Fender, Type.Electric, "Kramel", Wood.BRAZILIAN, Wood.INDIAN, Style.F);
        Guitar firstGuitar = new Guitar("123", 500, gspecsone);
        Guitar secondGuitar = new Guitar("124",600,gspecstwo);
        Mandolin firstMandolin = new Mandolin("125", 600, mspecs);
        inventory.add(firstGuitar);
        inventory.add(secondGuitar);
        inventory.add(firstMandolin);
        List<Instrument> results = inventory.searchTool(gspecsone);
        System.out.println(results);
        System.out.println(firstGuitar);
        
        
        
    }
    
    

    
}
