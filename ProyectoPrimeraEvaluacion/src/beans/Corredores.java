/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Tony
 */
public class Corredores {
    private String nombre;
    private String dni;
    private Date fechaNac;
    private String direccion;
    private int tlf;
    private SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");

    public Corredores(String nombre, String dni, Date fechaNac, String direccion, int tlf) {
        this.nombre = nombre;
        this.dni = dni;
        this.fechaNac = fechaNac;
        this.direccion = direccion;
        this.tlf = tlf;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public Date getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(Date fechaNac) {
        this.fechaNac = fechaNac;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getTlf() {
        return tlf;
    }

    public void setTlf(int tlf) {
        this.tlf = tlf;
    }
    
   
    public String [] toArrayString(){
        String []s =new String[5];
        s[0]=nombre;
        s[1]=dni;
        s[2]=sdf.format(fechaNac);
        s[3]=direccion;
        s[4]=Integer.toString(tlf);
        
        return s;
    }
    
    
   
}
