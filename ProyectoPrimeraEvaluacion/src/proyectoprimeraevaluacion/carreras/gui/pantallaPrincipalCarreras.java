/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoprimeraevaluacion.carreras.gui;

import beans.Carreras;
import beans.Corredores;
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
        jAñadirCorredor = new javax.swing.JMenuItem();
        jMenuSalir = new javax.swing.JMenuItem();

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

        jAñadirCorredor.setText("Añadir Corredor");
        jAñadirCorredor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jAñadirCorredorActionPerformed(evt);
            }
        });
        jMenuCarreras.add(jAñadirCorredor);

        jMenuSalir.setText("Salir a inicio");
        jMenuSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuSalirActionPerformed(evt);
            }
        });
        jMenuCarreras.add(jMenuSalir);

        jMenuBar1.add(jMenuCarreras);

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

    private void jAñadirCorredorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jAñadirCorredorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jAñadirCorredorActionPerformed

    private void refrescarTabla(){
        DefaultTableModel dtm=new DefaultTableModel();
   
        
        dtm.setColumnIdentifiers(new String[]{"Nombre","Fecha","Lugar","Número máximo de participantes"});
       
        
        ArrayList<Carreras>listaCarreras=logicaAplicacion.getListaCarreras();
        
        for(Carreras carrera:listaCarreras){
            
            
            dtm.addRow(carrera.toArrayString());
    
             
       
            
        
              
        }
        jTableCarreras.setModel(dtm);
       

    }
        
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem jAñadirCorredor;
    private javax.swing.JMenuItem jCarrerasAlta;
    private javax.swing.JMenuItem jComenzarCarrera;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuCarreras;
    private javax.swing.JMenuItem jMenuSalir;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableCarreras;
    // End of variables declaration//GEN-END:variables
}
