/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lab4b;

import java.io.Serializable;
import javax.inject.Named;

/**
 *
 * @author Darek
 */
public class KlasaA implements Serializable{
    
    /*public @interface Named{
    }*/
    private String poleA;
    
    public KlasaA(){
        
    }

    public void setPoleA(String poleA) {
        this.poleA = poleA;
    }
    
    @Named("metodka")
    public String getPoleA() {
        return poleA;
    }
    
    
}