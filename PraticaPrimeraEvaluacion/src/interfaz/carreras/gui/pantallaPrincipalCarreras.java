/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz.carreras.gui;

import beans.Carreras;
import beans.Corredores;
import beans.NuevosCorredores;
import interfaz.pantallaPrincipal;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import logica.logicaAplicacion;

/**
 *
 * @author Tony
 */
public class pantallaPrincipalCarreras extends javax.swing.JFrame {

    /**
     * Creates new form pantallaPrincipalCarreras
     */
    public pantallaPrincipalCarreras() {
        initComponents();
        refrescarTabla();
    
          
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
        jTableCarreras = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuCarreras = new javax.swing.JMenu();
        jCarrerasAlta = new javax.swing.JMenuItem();
        jComenzarCarrera = new javax.swing.JMenuItem();
        jMenuSalir = new javax.swing.JMenuItem();
        jMenuCorredores = new javax.swing.JMenu();
        jAñadirCorredores = new javax.swing.JMenuItem();
        JAñadirNuevoCorredor = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTableCarreras.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTableCarreras);

        jMenuCarreras.setText("Carreras");

        jCarrerasAlta.setText("Añadir carrera");
        jCarrerasAlta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCarrerasAltaActionPerformed(evt);
            }
        });
        jMenuCarreras.add(jCarrerasAlta);

        jComenzarCarrera.setText("Comenzar carrera");
        jComenzarCarrera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComenzarCarreraActionPerformed(evt);
            }
        });
        jMenuCarreras.add(jComenzarCarrera);

        jMenuSalir.setText("Salir a inicio");
        jMenuSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuSalirActionPerformed(evt);
            }
        });
        jMenuCarreras.add(jMenuSalir);

        jMenuBar1.add(jMenuCarreras);

        jMenuCorredores.setText("Corredores");

        jAñadirCorredores.setText("Añadir corredores");
        jAñadirCorredores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jAñadirCorredoresActionPerformed(evt);
            }
        });
        jMenuCorredores.add(jAñadirCorredores);

        JAñadirNuevoCorredor.setText("Añadir un nuevo corredor");
        JAñadirNuevoCorredor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JAñadirNuevoCorredorActionPerformed(evt);
            }
        });
        jMenuCorredores.add(JAñadirNuevoCorredor);

        jMenuBar1.add(jMenuCorredores);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 235, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jCarrerasAltaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCarrerasAltaActionPerformed
        FormularioAltaCarrera formulario=new FormularioAltaCarrera(this,true);
        formulario.setVisible(true);
        refrescarTabla();
        nuevoCorredor();
      
    }//GEN-LAST:event_jCarrerasAltaActionPerformed

    private void jMenuSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuSalirActionPerformed
        pantallaPrincipal pantallaprincipal=new pantallaPrincipal();
        pantallaPrincipalCarreras pantalla=new pantallaPrincipalCarreras();
        pantallaprincipal.setVisible(true);
        pantalla.dispose();
        
    }//GEN-LAST:event_jMenuSalirActionPerformed

    private void jComenzarCarreraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComenzarCarreraActionPerformed
      
       int resultado=JOptionPane.showConfirmDialog(this, "¿Deseas terminar la carrera?", "Terminar", JOptionPane.YES_NO_OPTION);
        
        if(resultado==JOptionPane.YES_OPTION){
           pantallaPrincipalResultadosCarrera pantalla=new pantallaPrincipalResultadosCarrera();
           pantalla.setVisible(true);
           dispose();
       }
           
    }//GEN-LAST:event_jComenzarCarreraActionPerformed

    private void jAñadirCorredoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jAñadirCorredoresActionPerformed
       DefaultTableModel dtm=(DefaultTableModel)jTableCarreras.getModel();
       
     ArrayList<Carreras>listaCarreras=logicaAplicacion.getListaCarreras();

          
        
        
     
  JOptionPane.showMessageDialog(this, "Se importarán los corredores registrados y se generará un dorsal para cada uno de ellos","Añadir corredores",JOptionPane.INFORMATION_MESSAGE);
    
          for(Carreras c:listaCarreras){
         
            
            dtm.addColumn("Corredores",c.toArrayStringCorredores());
            
           dtm.addColumn("Dorsal",c.generarDorsales());
        
        
   
        }
          jTableCarreras.setModel(dtm);
    
  
    }//GEN-LAST:event_jAñadirCorredoresActionPerformed

    
        
    
    private void JAñadirNuevoCorredorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JAñadirNuevoCorredorActionPerformed
        FormularioAltaCorredor alta=new FormularioAltaCorredor(this,true);
        alta.setVisible(true);
        nuevoCorredor();
      
       
    }//GEN-LAST:event_JAñadirNuevoCorredorActionPerformed


    private void refrescarTabla(){
        DefaultTableModel dtm=new DefaultTableModel();
   
        
        dtm.setColumnIdentifiers(new String[]{"Nombre","Fecha","Lugar","Número máximo de participantes"});
       
        
        ArrayList<Carreras>listaCarreras=logicaAplicacion.getListaCarreras();
        
        for(Carreras carrera:listaCarreras){
            
            
            dtm.addRow(carrera.toArrayString());
 
              
        }
        jTableCarreras.setModel(dtm);
       

    }
    
    private void nuevoCorredor(){
        
        ArrayList<NuevosCorredores> lista_nuevo=logicaAplicacion.getNueva_lista();
        
        DefaultTableModel dtm=(DefaultTableModel)jTableCarreras.getModel();
        
        for(NuevosCorredores nuevo:lista_nuevo){
            dtm.addColumn("Nuevo",nuevo.toArrayString());
        }
        
        jTableCarreras.setModel(dtm);
        
    }
        
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem JAñadirNuevoCorredor;
    private javax.swing.JMenuItem jAñadirCorredores;
    private javax.swing.JMenuItem jCarrerasAlta;
    private javax.swing.JMenuItem jComenzarCarrera;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuCarreras;
    private javax.swing.JMenu jMenuCorredores;
    private javax.swing.JMenuItem jMenuSalir;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableCarreras;
    // End of variables declaration//GEN-END:variables
}
