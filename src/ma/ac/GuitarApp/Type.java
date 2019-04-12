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
public enum Type {
    Acoustic ,Electric ; 

    @Override
    public String toString() {
       switch(this){
           case Acoustic :
               return "Acoustic";
           case Electric:
               return "Electric";
       }
       return null;
    }
    
    
}
