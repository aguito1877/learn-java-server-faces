/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;

/**
 *
 * @author tunnes (Ayrton Felipe)
 * @author gmoraiz (Gabriel Morais)
 * @author tarcisioLima (Tarcisio Lima)
 * 
 */

public class CPF implements Serializable{
    private String codigo;
    
    public CPF(String codigo) {
        this.codigo = codigo;
    }
    
    @Override
    public String toString(){
        return this.codigo;
    }

    
}
