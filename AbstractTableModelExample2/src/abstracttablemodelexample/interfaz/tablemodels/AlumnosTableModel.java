/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstracttablemodelexample.interfaz.tablemodels;

import abstracttablemodelexample.beans.Alumno;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Tony
 */
public class AlumnosTableModel extends AbstractTableModel {

    private ArrayList<Alumno>listalumno;
    private String[] columnas={"Nombre","Curso"};

    public AlumnosTableModel(ArrayList<Alumno> alumno) {
        this.listalumno = listalumno;
    }
    
    
    @Override
    public int getRowCount() {
       return listalumno.size(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getColumnCount() {
        return 2; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
     switch(columnIndex){
           
         case 0:
             return listalumno.get(rowIndex).getNombre();
     
         case 1:
              return listalumno.get(rowIndex).getCurso();
     }
     
     return null;
    
}

    @Override
    public String getColumnName(int column) { //Sobrecargar el método con overrride
       return columnas[column]; //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
