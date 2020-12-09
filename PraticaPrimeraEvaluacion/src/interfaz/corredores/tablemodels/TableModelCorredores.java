/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz.corredores.tablemodels;

import beans.Corredores;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;



/**
 *
 * @author Tony
 */
public class TableModelCorredores extends AbstractTableModel {
    private final List<Corredores>listaCorredores;
    private final String [] columnas={"Nombre","DNI","Fecha Nacimiento","Dirección","Teléfono"};

    public TableModelCorredores(ArrayList<Corredores>listaCorredores) {
    
    
        this.listaCorredores=listaCorredores;
    
    }

    
    @Override
    public int getRowCount() {
       return listaCorredores.size();
    }

    @Override
    public int getColumnCount() {
       return columnas.length;
    }

      @Override
    public String getColumnName(int column) {
        return columnas[column];
    }
     public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex)
        {
            case 0:
                return listaCorredores.get(rowIndex).getNombre();
            case 1:
                return listaCorredores.get(rowIndex).getDni();
            case 2:
                return listaCorredores.get(rowIndex).getFechaNac();
            case 3:
                 return listaCorredores.get(rowIndex).getDireccion();
            case 4:
                 return listaCorredores.get(rowIndex).getTlf();
                 
                
        }  
        return null;
    }
     
     
}
