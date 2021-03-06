/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;


import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import javax.swing.JOptionPane;
import logica.logicaAplicacion;

/**
 *
 * @author Tony
 */
public class Carreras {
    private String nombre;
    private Date fechaCarrera;
    private String lugar;
    private int maximo;
    private ArrayList<Corredores>listaCorredores=logicaAplicacion.getListaCorredores();
   
   
    private SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");

    public Carreras(String nombre, Date fechaCarrera, String lugar, int maximo) {
        this.nombre = nombre;
        this.fechaCarrera = fechaCarrera;
        this.lugar = lugar;
        this.maximo = maximo;
     
    }
 

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFechaCarrera() {
        return fechaCarrera;
    }

    public void setFechaCarrera(Date fechaCarrera) {
        this.fechaCarrera = fechaCarrera;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public int getMaximo() {
        return maximo;
    }

    public void setMaximo(int maximo) {
        this.maximo = maximo;
    }

  
    
    
    public String [] toArrayString(){
        String [] s=new String[4];
        s[0]=nombre;
        s[1]=sdf.format(fechaCarrera);
        s[2]=lugar;
        s[3]=String.valueOf(maximo);
      
        return s;
    }
    
  
    public String [] toArrayStringCorredores(){
        String [] nombre=new String [listaCorredores.size()];
        int contador=0;
        for(Corredores c:listaCorredores){
            nombre[contador]=c.getNombre();
            contador++;
        }
        return nombre;
    }
 
    public String [] generarDorsales(){
        
        String dorsal[]=new String [listaCorredores.size()];
        
        int contador=0;
        
        for(Corredores c:listaCorredores){
            dorsal[contador]=String.valueOf((int)(Math.random()*100));
            contador++;
        }
        return dorsal;
    }
    }
    
 
 

        
        
    
  



