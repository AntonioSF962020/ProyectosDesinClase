/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz.corredores.tablemodels;

import beans.Carreras;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Tony
 */
public class TableModelCarreras extends AbstractTableModel {
    
    private final List<Carreras>listaCarreras;
        private final String [] columnas={"Nombre","Fecha","Lugar","Número máximo de participantes"};


    public TableModelCarreras(List<Carreras> listaCarreras) {
        this.listaCarreras = listaCarreras;
    }
    
    
    

    @Override
    public int getRowCount() {
return listaCarreras.size();

    }

    @Override
    public int getColumnCount() {
return columnas.length;
    }

    @Override
    public String getColumnName(int cont) {
        return columnas[cont]; //To change body of generated methods, choose Tools | Templates.
    }
    
    

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
       switch (columnIndex)
        {
            case 0:
                return listaCarreras.get(rowIndex).getNombre();
            case 1:
                return listaCarreras.get(rowIndex).getFechaCarrera();
            case 2:
                return listaCarreras.get(rowIndex).getLugar();
            case 3:
                 return listaCarreras.get(rowIndex).getMaximo();
          
                 
                
        }  
        return null;
    }
    
}
