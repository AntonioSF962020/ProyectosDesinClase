/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package proyectoprimeraevaluacion.carreras.gui;

import beans.Carreras;
import beans.Corredores;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import logica.logicaAplicacion;

/**
 *
 * @author Tony
 */
public class FormularioAltaCarrera extends javax.swing.JDialog {
    private pantallaPrincipalCarreras pantalla=new pantallaPrincipalCarreras();
    private ArrayList<Corredores>lista=logicaAplicacion.getListaCorredores();


    /** Creates new form FormularioAlta */
    public FormularioAltaCarrera(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        pantalla=(pantallaPrincipalCarreras)parent;
        
        
        initComponents();
        
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldNombre_carrera = new javax.swing.JTextField();
        jSpinnerFecha_carrera = new javax.swing.JSpinner();
        jTextFieldLugar_carrera = new javax.swing.JTextField();
        jTextFieldNumero_participantes = new javax.swing.JTextField();
        jButtonAlta_carrera = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Nombre de la carrera");

        jLabel2.setText("Fecha de la carrera");

        jLabel3.setText("Lugar de la carrera");

        jLabel4.setText("Número de participantes");

        jSpinnerFecha_carrera.setModel(new javax.swing.SpinnerDateModel());

        jButtonAlta_carrera.setText("Alta carrera");
        jButtonAlta_carrera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAlta_carreraActionPerformed(evt);
            }
        });

        jButton2.setText("Formulario registro corredor");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton2)
                        .addGap(60, 60, 60)
                        .addComponent(jButtonAlta_carrera))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextFieldNombre_carrera)
                            .addComponent(jSpinnerFecha_carrera, javax.swing.GroupLayout.DEFAULT_SIZE, 187, Short.MAX_VALUE)
                            .addComponent(jTextFieldLugar_carrera)
                            .addComponent(jTextFieldNumero_participantes))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextFieldNombre_carrera, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jSpinnerFecha_carrera, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextFieldLugar_carrera, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextFieldNumero_participantes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonAlta_carrera)
                    .addComponent(jButton2))
                .addContainerGap(98, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAlta_carreraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAlta_carreraActionPerformed
       String nombre=jTextFieldNombre_carrera.getText();
       Date fecha=(Date)jSpinnerFecha_carrera.getValue();
       String lugar=jTextFieldLugar_carrera.getText();
       int num=Integer.parseInt(jTextFieldNumero_participantes.getText());
       
     
  Carreras carrera=new Carreras(nombre,fecha,lugar,num);
       logicaAplicacion.añadirCarreras(carrera);
       setVisible(false);
           
     
       
       
     
       
    }//GEN-LAST:event_jButtonAlta_carreraActionPerformed

  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButtonAlta_carrera;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JSpinner jSpinnerFecha_carrera;
    private javax.swing.JTextField jTextFieldLugar_carrera;
    private javax.swing.JTextField jTextFieldNombre_carrera;
    private javax.swing.JTextField jTextFieldNumero_participantes;
    // End of variables declaration//GEN-END:variables

}
