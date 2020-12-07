/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

/**
 *
 * @author Tony
 */
public class NuevosCorredores {
    
    private String nombre;
    private int dorsal;

    public NuevosCorredores(String nombre, int dorsal) {
        this.nombre = nombre;
        this.dorsal = dorsal;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDorsal() {
        return dorsal;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }
    
    public String [] toArrayString(){
        
        String s[]=new String[2];
        s[0]=nombre;
        s[1]=String.valueOf(dorsal);
        return s;
    }
    
}
