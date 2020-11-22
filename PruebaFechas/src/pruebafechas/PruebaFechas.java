/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebafechas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Tony
 */
public class PruebaFechas {
    
    public static void main(String [] args){
        SimpleDateFormat dsf=new SimpleDateFormat("dd-MM-yyyy");
        Date d=new Date();
        
        System.out.println(dsf.format(d)); 
        String s="10-10-2010";
        try{
            d=dsf.parse(s); 
        }catch(ParseException e){
            System.out.println("Hubo un error en la fecha")
;        }
        System.out.println(d.toString());
       
    }
}
