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
public class Guitar extends Instrument {
    
    // this might be a good design
    public Guitar(String serialNumber ,double price,GuitarSpecs guitarSpecs) {
         super(serialNumber,price,guitarSpecs);
         
    }
    
   
   
  
    
}


// remarks : 
    //this could be also a choice of constructor 
    // i m not sure about this kind construction !!
    // this constructor is a bad design example because it lets the specs properties visible to the guitar class
//    public Guitar(String serialNumber , double price ,Builder builder , Type type , String model , Wood backWood ,Wood topWood ){
//        setPrice(price);
//        this.serialNumber=serialNumber;
//        this.specs= new GuitarSpecs( builder, type, model, backWood, topWood);
//    }
//    
    