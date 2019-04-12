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
public enum Style {
    A , F ;

    @Override
    public String toString() {
       switch(this){
           case A : 
               return "A Style";
           case F :
               return "F Style";
       }
       return null;
    }
    
    
}
