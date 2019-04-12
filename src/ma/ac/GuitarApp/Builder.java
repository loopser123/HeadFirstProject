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
public enum Builder {
    
    Fender , Kamazi , locato ; 

    @Override
    public String toString() {
        switch(this){
            case Fender : 
                return "Fender";
            case Kamazi :
                return "Kamazi";
            case locato :
                return "locato";     
        }
        return null; 
    }
    
}
