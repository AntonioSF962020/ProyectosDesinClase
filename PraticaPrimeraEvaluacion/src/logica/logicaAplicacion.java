/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import beans.Carreras;
import beans.Corredores;
import beans.NuevosCorredores;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Tony
 */
public class logicaAplicacion {
    
   private static ArrayList<Corredores>listaCorredores=new ArrayList<>();
  

   
   public static void añadirCorredores(Corredores corredores){
       listaCorredores.add(corredores);
   }
   
   public static ArrayList<Corredores>getListaCorredores(){
       return listaCorredores;
   }
    
   private static ArrayList<Carreras> listaCarreras=new ArrayList<>();
   
   public static void añadirCarreras(Carreras carrera){
       listaCarreras.add(carrera);
   }
   public static ArrayList<Carreras> getListaCarreras(){
       
       return listaCarreras;
   }

   private static ArrayList<NuevosCorredores> nueva_lista=new ArrayList<>();
   
   public static void añadirNuevosCorredores(NuevosCorredores nuevo){
       
       nueva_lista.add(nuevo);
       
   }

    public static ArrayList<NuevosCorredores> getNueva_lista() {
        return nueva_lista;
    }
   
   


   
}
