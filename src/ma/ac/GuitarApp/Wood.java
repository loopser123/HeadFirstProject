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
public enum Wood {
    
    INDIAN ,BRAZILIAN ;

    @Override
    public String toString() {
       switch(this){
           case INDIAN :
               return "INDIAN";
           case BRAZILIAN :
               return "BRAZILIAN";
           
       }
        return null;
    }
    
}
