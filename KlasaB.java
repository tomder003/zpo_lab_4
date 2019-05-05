/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lab4b;

import java.io.Serializable;
import java.time.LocalDate;

/**
 *
 * @author Darek
 */
public class KlasaB implements Serializable{
    
    private LocalDate data;
    
    public KlasaB()
    {
        
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public LocalDate getData() {
        return data;
    }
    
}