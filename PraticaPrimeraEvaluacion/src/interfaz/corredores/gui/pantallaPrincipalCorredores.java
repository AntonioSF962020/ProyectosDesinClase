/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz.corredores.gui;

import beans.Corredores;
import interfaz.corredores.tablemodels.TableModelCorredores;
import interfaz.pantallaPrincipal;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.RowSorter;
import javax.swing.SortOrder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import logica.logicaAplicacion;

/**
 *
 * @author Tony
 */
public class pantallaPrincipalCorredores extends javax.swing.JFrame {

    private SimpleDateFormat sdf=new SimpleDateFormat();
      private TableRowSorter<TableModelCorredores> sorter;
    /**
     * Creates new form pantallaPrincipal
     */
    public pantallaPrincipalCorredores() {
        initComponents();
       rellenarTablaCorredores();
     
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTableCorredores = new javax.swing.JTable();
        jButtonFiltrar = new javax.swing.JButton();
        jTextFieldFiltrar = new javax.swing.JTextField();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuCorredores = new javax.swing.JMenu();
        jCorredoresAlta = new javax.swing.JMenuItem();
        jCorredoresBorrar = new javax.swing.JMenuItem();
        jMenuItemModificar = new javax.swing.JMenuItem();
        jMenuItemSalir = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTableCorredores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTableCorredores);

        jButtonFiltrar.setText("Filtrar");
        jButtonFiltrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFiltrarActionPerformed(evt);
            }
        });

        jMenuCorredores.setText("Corredores");

        jCorredoresAlta.setText("Añadir corredor");
        jCorredoresAlta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCorredoresAltaActionPerformed(evt);
            }
        });
        jMenuCorredores.add(jCorredoresAlta);

        jCorredoresBorrar.setText("Borrar corredor");
        jCorredoresBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCorredoresBorrarActionPerformed(evt);
            }
        });
        jMenuCorredores.add(jCorredoresBorrar);

        jMenuItemModificar.setText("Modificar corredor");
        jMenuItemModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemModificarActionPerformed(evt);
            }
        });
        jMenuCorredores.add(jMenuItemModificar);

        jMenuItemSalir.setText("Salir a inicio");
        jMenuItemSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemSalirActionPerformed(evt);
            }
        });
        jMenuCorredores.add(jMenuItemSalir);

        jMenuBar1.add(jMenuCorredores);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTextFieldFiltrar, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonFiltrar)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonFiltrar)
                    .addComponent(jTextFieldFiltrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 159, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void rellenarTablaCorredores()
    {
        TableModelCorredores tma=new TableModelCorredores(logicaAplicacion.getListaCorredores());
      
        
        jTableCorredores.setModel(tma);
      sorter= new TableRowSorter<>(tma);
           jTableCorredores.setRowSorter(sorter);
           List<RowSorter.SortKey> sortkeys=new ArrayList<>();
           sortkeys.add(new RowSorter.SortKey(0,SortOrder.ASCENDING));
         sorter.setSortKeys(sortkeys);
    }
    private void jCorredoresAltaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCorredoresAltaActionPerformed
    
        FormularioAlta alta=new FormularioAlta(this,true);
        alta.setVisible(true);
        //rellenarTablaCorredores();
        refrescarTabla();
      
    }//GEN-LAST:event_jCorredoresAltaActionPerformed

    private void jMenuItemSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemSalirActionPerformed
        pantallaPrincipal pantalla=new pantallaPrincipal();
        pantallaPrincipalCorredores pantalla2=new pantallaPrincipalCorredores();
        pantalla.setVisible(true);
        pantalla2.dispose();
    }//GEN-LAST:event_jMenuItemSalirActionPerformed

    private void jCorredoresBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCorredoresBorrarActionPerformed
       int contador=0;
        ArrayList<Corredores>listaCorredores=logicaAplicacion.getListaCorredores();
        Iterator<Corredores>it=listaCorredores.iterator();
        DefaultTableModel dtm = (DefaultTableModel) jTableCorredores.getModel();
        String resultado= JOptionPane.showInputDialog(this,"Introduce el DNI del corredor que deseas borrar","Borrar corredor");
       
         for(Corredores corredor:listaCorredores){
          
          if(resultado.equalsIgnoreCase(corredor.getDni())){
            
             dtm.removeRow(contador);
              
            
          }
          else
              contador++;

      }
         
       
    }//GEN-LAST:event_jCorredoresBorrarActionPerformed

    private void jMenuItemModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemModificarActionPerformed
        int contador=0;
        ArrayList<Corredores>listaCorredores=logicaAplicacion.getListaCorredores();
        Iterator<Corredores>it=listaCorredores.iterator();
     DefaultTableModel dtm = (DefaultTableModel) jTableCorredores.getModel();
        String resultado= JOptionPane.showInputDialog(this,"Introduce el DNI del corredor que deseas modificar");
       
         for(Corredores corredor:listaCorredores){
          
          if(resultado.equalsIgnoreCase(corredor.getDni())){
              
              dtm.removeRow(contador); //Mirar esto
              
            
             String nombre=JOptionPane.showInputDialog(this,"Introduce el nuevo nombre del corredor");
             String dni=JOptionPane.showInputDialog(this,"Introduce el nuevo nombre del corredor");
             String fecha=JOptionPane.showInputDialog(this,"Introduce el nuevo nombre del corredor");
             String direccion=JOptionPane.showInputDialog(this,"Introduce el nuevo nombre del corredor");
             String tlf=JOptionPane.showInputDialog(this,"Introduce el nuevo nombre del corredor");

             String  [] array=new String[5];
             
             array[0]=nombre;
             array[1]=dni;
             array[2]=fecha;
             array[3]=direccion;
             array[4]=tlf;
             dtm.addRow(array);
             
             jTableCorredores.setModel(dtm);
      
            
          }
          else
              contador++;

      }
         
    }//GEN-LAST:event_jMenuItemModificarActionPerformed

    private void jButtonFiltrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFiltrarActionPerformed
           RowFilter<TableModelCorredores,Integer> rf=RowFilter.regexFilter(jTextFieldFiltrar.getText(),0);
        sorter.setRowFilter(rf);
    }//GEN-LAST:event_jButtonFiltrarActionPerformed

   private void refrescarTabla(){
       DefaultTableModel dtm=new DefaultTableModel();
       dtm.setColumnIdentifiers(new String[]{"Nombre","DNI","Fecha","Dirección","Teléfono"});
      ArrayList<Corredores> listaCorredores=logicaAplicacion.getListaCorredores();
       
      for(Corredores corredor:listaCorredores){
          
          dtm.addRow(corredor.toArrayString());
      }
       jTableCorredores.setModel(dtm);
   }
  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonFiltrar;
    private javax.swing.JMenuItem jCorredoresAlta;
    private javax.swing.JMenuItem jCorredoresBorrar;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuCorredores;
    private javax.swing.JMenuItem jMenuItemModificar;
    private javax.swing.JMenuItem jMenuItemSalir;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableCorredores;
    private javax.swing.JTextField jTextFieldFiltrar;
    // End of variables declaration//GEN-END:variables
}
