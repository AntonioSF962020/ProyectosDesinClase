/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Calculadora.gui;

/**
 *
 * @author Tony
 */
public class Calculadora extends javax.swing.JFrame {

    private boolean igual, iniciar=true,operacion1,operacion2;// Cuatro variables booleanas
    //Iniciar: sirve para declarar si un boton ha sido pulsado
    //operacion1,operacion2: sirven para identificar tanto el operando 1 como el operando 2 se han introducido
    //Igual: tiene la misma función que iniciar
    
    private double resultado, operando1,operando2; // Tres variables tipo double que albergan las operaciones
    private String tipoOperacion; //Variable tipo String. Sirve como un identificador al tipo de operación
    //que se realiza

    /**
     * Creates new form Calculadora
     */
    public Calculadora() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btncambiosigno = new javax.swing.JButton();
        btnC = new javax.swing.JButton();
        btnborrar = new javax.swing.JButton();
        btn7 = new javax.swing.JButton();
        btnoff = new javax.swing.JButton();
        btn8 = new javax.swing.JButton();
        btn9 = new javax.swing.JButton();
        btnmas = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        btnmenos = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btnpor = new javax.swing.JButton();
        btn1 = new javax.swing.JButton();
        btn0 = new javax.swing.JButton();
        btncoma = new javax.swing.JButton();
        btnigual = new javax.swing.JButton();
        btndividir = new javax.swing.JButton();
        pantalla = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btncambiosigno.setText("+/-");
        btncambiosigno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncambiosignoActionPerformed(evt);
            }
        });

        btnC.setText("C");
        btnC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCActionPerformed(evt);
            }
        });

        btnborrar.setText("del");
        btnborrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnborrarActionPerformed(evt);
            }
        });

        btn7.setText("7");
        btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn7ActionPerformed(evt);
            }
        });

        btnoff.setText("off");
        btnoff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnoffActionPerformed(evt);
            }
        });

        btn8.setText("8");
        btn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn8ActionPerformed(evt);
            }
        });

        btn9.setText("9");
        btn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn9ActionPerformed(evt);
            }
        });

        btnmas.setText("+");
        btnmas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmasActionPerformed(evt);
            }
        });

        btn5.setText("5");
        btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5ActionPerformed(evt);
            }
        });

        btn6.setText("6");
        btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn6ActionPerformed(evt);
            }
        });

        btnmenos.setText("-");
        btnmenos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmenosActionPerformed(evt);
            }
        });

        btn4.setText("4");
        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });

        btn2.setText("2");
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });

        btn3.setText("3");
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });

        btnpor.setText("*");
        btnpor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnporActionPerformed(evt);
            }
        });

        btn1.setText("1");
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });

        btn0.setText("0");
        btn0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn0ActionPerformed(evt);
            }
        });

        btncoma.setText(".");
        btncoma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncomaActionPerformed(evt);
            }
        });

        btnigual.setText("=");
        btnigual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnigualActionPerformed(evt);
            }
        });

        btndividir.setText("/");
        btndividir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndividirActionPerformed(evt);
            }
        });

        pantalla.setEditable(false);
        pantalla.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btn7, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn8, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btn9, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnmas, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btn6, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnmenos, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnpor, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btn0, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btncoma, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnigual, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btndividir, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btncambiosigno, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnC, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnborrar, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnoff, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(pantalla, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(89, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(pantalla, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btncambiosigno)
                    .addComponent(btnC)
                    .addComponent(btnborrar)
                    .addComponent(btnoff))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn7)
                    .addComponent(btn8)
                    .addComponent(btn9)
                    .addComponent(btnmas))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn4)
                    .addComponent(btn5)
                    .addComponent(btn6)
                    .addComponent(btnmenos))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn1)
                    .addComponent(btn2)
                    .addComponent(btn3)
                    .addComponent(btnpor))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn0)
                    .addComponent(btncoma)
                    .addComponent(btnigual)
                    .addComponent(btndividir))
                .addContainerGap(54, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCActionPerformed

     if(pantalla.getText().length()>0){
         pantalla.setText(pantalla.getText().toString().substring(0,pantalla.getText().length()-1));
         //Con el metodo substring obtenemos la subcadena del texto de la pantalla, en este caso los números
         //A partir del substring, la pantalla va actualizándose de forma que se van borrando 1 a 1 los caracteres
         
     }
    }//GEN-LAST:event_btnCActionPerformed

    private void btnborrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnborrarActionPerformed
      pantalla.setText(""); //Hacemos que se borre todo lo escrito en la pantalla
      
         //Reseteamos todas las variables al estado original
        iniciar=true;
        operacion1=true;
        operacion2=true;
        igual=true;
        operando1=0;
        operando2=0;
        resultado=0;
      
    }//GEN-LAST:event_btnborrarActionPerformed

    private void btnoffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnoffActionPerformed

        setVisible(false);
    }//GEN-LAST:event_btnoffActionPerformed

    private void btn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn7ActionPerformed
    if(iniciar==true){ //Establecemos que el botón está de primera mano sin accionar
            
            pantalla.setText("");
            pantalla.setText("7"); //Establecemos que la pantalla se escriba 1 al pulsar
            iniciar=false; //indicamos que el boton ha sido accionado
            
        }
        else{
            pantalla.setText(pantalla.getText()+ "7"); //Se establece que, si el botón está accionado, 
            //escriba 1 igualmente en la pantalla
        }
    }//GEN-LAST:event_btn7ActionPerformed

    private void btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5ActionPerformed
      if(iniciar==true){ 
            
            pantalla.setText("");
            pantalla.setText("5"); 
            iniciar=false; 
            
        }
        else{
            pantalla.setText(pantalla.getText()+ "5"); 
           
        }
    }//GEN-LAST:event_btn5ActionPerformed

    private void btn0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn0ActionPerformed
   if(iniciar==true){ 
            
            pantalla.setText("");
            pantalla.setText("0"); 
            iniciar=false; 
            
        }
        else{
            pantalla.setText(pantalla.getText()+ "0"); 
        
        }
      
    }//GEN-LAST:event_btn0ActionPerformed

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
        
        if(iniciar==true){ 
            
            pantalla.setText("");
            pantalla.setText("1"); 
            iniciar=false; 
            
        }
        else{
            pantalla.setText(pantalla.getText()+ "1"); 
         
        }
    }//GEN-LAST:event_btn1ActionPerformed

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
     if(iniciar==true){ 
            
            pantalla.setText("");
            pantalla.setText("2"); 
            iniciar=false;
            
        }
        else{
            pantalla.setText(pantalla.getText()+ "2");
         
        }
        
    }//GEN-LAST:event_btn2ActionPerformed

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
 
         if(iniciar==true){ 
            
            pantalla.setText("");
            pantalla.setText("3");            
            iniciar=false; 
            
        }
        else{
            pantalla.setText(pantalla.getText()+ "3"); 
           
        }
    }//GEN-LAST:event_btn3ActionPerformed

    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed
      
         if(iniciar==true){
            
            pantalla.setText("");
            pantalla.setText("4"); 
            iniciar=false; 
            
        }
        else{
            pantalla.setText(pantalla.getText()+ "4"); 
           
        }
    }//GEN-LAST:event_btn4ActionPerformed

    private void btn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn6ActionPerformed
    
         if(iniciar==true){ 
            
            pantalla.setText("");
            pantalla.setText("6"); 
            iniciar=false; 
            
        }
        else{
            pantalla.setText(pantalla.getText()+ "6"); 
          
        }
    }//GEN-LAST:event_btn6ActionPerformed

    private void btn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn8ActionPerformed
        if(iniciar==true){ 
            
            pantalla.setText("");
            pantalla.setText("8"); 
            iniciar=false; 
            
        }
        else{
            pantalla.setText(pantalla.getText()+ "8"); 
           
        }
    }//GEN-LAST:event_btn8ActionPerformed

    private void btn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn9ActionPerformed
         if(iniciar==true){ 
            
            pantalla.setText("");
            pantalla.setText("9"); 
            iniciar=false;
            
        }
        else{
            pantalla.setText(pantalla.getText()+ "9"); 
   
        }
    }//GEN-LAST:event_btn9ActionPerformed

    private void btncomaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncomaActionPerformed
       if(iniciar==true){

            pantalla.setText("");
           pantalla.setText(".");
            iniciar=false;

        }else{
            pantalla.setText(pantalla.getText() + ".");

        }
    }//GEN-LAST:event_btncomaActionPerformed

    private void btnmasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmasActionPerformed
     igual=true;
     iniciar=true; //igual e iniciar indican que el botón no ha sido accionado;
     
     if(operacion1==true){
         operando1=Double.parseDouble(pantalla.getText().toString());
         operacion1=false; //Establecemos que la acción del botón ha finalizado para el operando
         
         
     }
     
     else{
         
         if(operacion2==true){
             
             operando2=Double.parseDouble(pantalla.getText().toString());
             operacion2=false;
             
         }
         else{
             
             Operaciones(operando1,operando2); //Método que controla todas las operaciones
             
         }
     }
     tipoOperacion="+";
     
    }//GEN-LAST:event_btnmasActionPerformed

    private void btnmenosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmenosActionPerformed
     igual=true;
     iniciar=true; 
     
     if(operacion1==true){
         operando1=Double.parseDouble(pantalla.getText().toString());
         operacion1=false; 
         
         
     }
     
     else{
         
         if(operacion2==true){
             
             operando2=Double.parseDouble(pantalla.getText().toString());
             operacion2=false;
             
         }
         else{
             
             Operaciones(operando1,operando2); 
             
         }
     }
     tipoOperacion="-";
    }//GEN-LAST:event_btnmenosActionPerformed

    private void btnporActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnporActionPerformed
        
          igual=true;
     iniciar=true; 
     
     if(operacion1==true){
         operando1=Double.parseDouble(pantalla.getText().toString());
         operacion1=false;
         
         
     }
     
     else{
         
         if(operacion2==true){
             
             operando2=Double.parseDouble(pantalla.getText().toString());
             operacion2=false;
             
         }
         else{
             
             Operaciones(operando1,operando2); 
             
         }
     }
     tipoOperacion="*";
    
    }//GEN-LAST:event_btnporActionPerformed

    private void btndividirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndividirActionPerformed
       igual=true;
     iniciar=true; 
     
     if(operacion1==true){
         operando1=Double.parseDouble(pantalla.getText().toString());
         operacion1=false; 
         
         
     }
     
     else{
         
         if(operacion2==true){
             
             operando2=Double.parseDouble(pantalla.getText().toString());
             operacion2=false;
             
         }
         else{
             
             Operaciones(operando1,operando2);
             
         }
     }
     tipoOperacion="/";
                                
    }//GEN-LAST:event_btndividirActionPerformed

    public void Operaciones(double num1,double num2){ //Método que realiza las operaciones de la calculadora
        switch(tipoOperacion){ //Según el identificador, realiza la operación elegida
            
            case "+":
                resultado= num1+num2;
                pantalla.setText(resultado + " ");
                num1=Double.parseDouble(pantalla.getText().toString());//Agregamos el resultado para encadenar operaciones
                
                break;
                
            case "-":
                resultado= num1-num2;
                pantalla.setText(resultado + " ");
                num1=Double.parseDouble(pantalla.getText().toString());//Agregamos el resultado para encadenar operaciones
                
                break;
                
            case "*":
                
                resultado= num1*num2;
                pantalla.setText(resultado + " ");
                num1=Double.parseDouble(pantalla.getText().toString());//Agregamos el resultado para encadenar operaciones
                
                break;
                
            case "/":
                resultado= num1/num2;
                pantalla.setText(resultado + " ");
                num1=Double.parseDouble(pantalla.getText().toString());//Agregamos el resultado para encadenar operaciones
                
                break;
        }
    }
    private void btnigualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnigualActionPerformed
    
        iniciar=true;
        operacion1=true;
        if(igual=true){
            if(tipoOperacion==null){ //Si no se introduce ningún tipo de operación no se hace nada
                
            }
            else{
                operando2=Double.parseDouble(pantalla.getText().toString()); //Obtenemos el segundo operador
                Operaciones(operando1,operando2);
                igual=false;
                
            }
        }
    }//GEN-LAST:event_btnigualActionPerformed

    private void btncambiosignoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncambiosignoActionPerformed
      double numero1=0,numero2=0,opuesto=0; //Variables para albergar en una el número de la pantalla y 
      //cambiar de signo
      
      numero2=Double.parseDouble(pantalla.getText().toString()); //Albergamos el número de la pantalla
      opuesto=numero1-numero2; //Establecemos una resta de forma que, como el número 1 está igualado a 0
      //siempre va a dar negativo
      pantalla.setText(opuesto + " ");
    }//GEN-LAST:event_btncambiosignoActionPerformed
// TODO add your handling code here:
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculadora().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn0;
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btn7;
    private javax.swing.JButton btn8;
    private javax.swing.JButton btn9;
    private javax.swing.JButton btnC;
    private javax.swing.JButton btnborrar;
    private javax.swing.JButton btncambiosigno;
    private javax.swing.JButton btncoma;
    private javax.swing.JButton btndividir;
    private javax.swing.JButton btnigual;
    private javax.swing.JButton btnmas;
    private javax.swing.JButton btnmenos;
    private javax.swing.JButton btnoff;
    private javax.swing.JButton btnpor;
    private javax.swing.JTextField pantalla;
    // End of variables declaration//GEN-END:variables
}
