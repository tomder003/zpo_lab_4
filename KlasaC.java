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
public class KlasaC implements Serializable {

    public int poleC = 5;

    public KlasaC() {
    }

    public int getPoleC() {
        return poleC;
    }

    @Named("nazwa")
    public void setPoleC(int poleC) {
        this.poleC = poleC;
    }

    @Override
    public String toString() {
        return "KlasaC{" + "poleC=" + poleC + '}';
    }

}
