/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz.tablemodels;

import beans.Corredores;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Tony
 */
public class TableModelsCorredores extends AbstractTableModel {
    
    private ArrayList<Corredores> corredores;
    private String [] columnas={"Nombre","DNI","Fecha Nacimiento","Dirección","Teléfono"};
    
    public TableModelsCorredores(ArrayList<Corredores>correedores){
        this.corredores=corredores;
    }

    @Override
    public int getRowCount() {
        return corredores.size();
    }

    @Override
    public int getColumnCount() {
       return 5;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
       
        switch(columnIndex){
            
            case 0:
                return corredores.get(rowIndex).getNombre();
                
            case 1:
                 return corredores.get(rowIndex).getDni();
            case 2:
                 return corredores.get(rowIndex).getFechaNac();
            case 3:
         return corredores.get(rowIndex).getDireccion();
        
            case 4:
         return corredores.get(rowIndex).getTlf();
        }
        return null;
    }
    
    public String getColumnName(int column){
        return columnas[column];
    }
    
    
}
