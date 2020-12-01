/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import beans.Corredores;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Tony
 */
public class logicaNegocio {
    
   private static ArrayList<Corredores>listaCorredores=new ArrayList<>();
   
   public static void añadirCorredores(Corredores corredores){
       listaCorredores.add(corredores);
   }
   
   public static ArrayList<Corredores>getListaCorredores(){
       return listaCorredores;
   }
    
}
