/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import java.util.ArrayList;
/**
 *
 * @author juanc
 */
public class Sistema {
    
    private ArrayList <Usuario> usuarios;
    
    public Sistema(){
     
    }

    public void setUsuarios(ArrayList<Usuario> val) {
        this.usuarios = val;
    }

    public ArrayList<Usuario> getUsuarios() {
        return usuarios;
    }
}
