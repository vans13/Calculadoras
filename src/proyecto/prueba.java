
package proyecto;

import javax.swing.*;

public class prueba extends javax.swing.JFrame {
    
     String EMPTY=new String();
     
    //Declara variables globales para guardar resultados, y ser visible en todos los metodos
     public String sal="";
     private float ant=0;
     public float n=0;
     IInterfacesita mult;
     IInterfacesita div;
     
    //se genera el primer constructor
    public prueba() {
        initComponents();
    }
    
    //se genera el segundo constructor, sobrecargado
    public prueba(float ant, float n, JButton btDividir, JButton btMultiplicar, JButton btResta, JButton btSuma, JButton btnBorrar, JLabel jLabel2, JLabel jLabel3, JPanel jPanel1, JTextField txtNumero) {
        this.ant = ant;
        this.n = n;
        this.btDividir = btDividir;
        this.btMultiplicar = btMultiplicar;
        this.btResta = btResta;
        this.btSuma = btSuma;
        this.btnBorrar = btnBorrar;
        this.jLabel2 = jLabel2;
        this.jLabel3 = jLabel3;
        this.jPanel1 = jPanel1;
        this.txtNumero = txtNumero;
    }
    
    //metodos getter y setter para los datos privados
    public float getAnt() {
        return ant;
    }

    public void setAnt(float ant) {
        this.ant = ant;
    }

    public float getN() {
        return n;
    }

    public void setN(float n) {
        this.n = n;
    }

    public JTextField getTxtNumero() {
        return txtNumero;
    }

    public void setTxtNumero(JTextField txtNumero) {
        this.txtNumero = txtNumero;
    }
    
    //metodo imprime y resetea el valor de n, y limpia la salida
    private void ImprimeResetea(String sal){
        txtSalida.setText(sal);
        n=0;
        sal="";
        txtNumero.setText("");
    }
    
    //lee el numero ingresado
    private float lee(){
        return Float.parseFloat(txtNumero.getText());
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtNumero = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btSuma = new javax.swing.JButton();
        btResta = new javax.swing.JButton();
        btMultiplicar = new javax.swing.JButton();
        btDividir = new javax.swing.JButton();
        btnBorrar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtSalida = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 204, 204));
        jPanel1.setForeground(new java.awt.Color(204, 255, 255));

        txtNumero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumeroActionPerformed(evt);
            }
        });

        jLabel2.setText("jLabel2");

        jLabel3.setFont(new java.awt.Font("Footlight MT Light", 1, 14)); // NOI18N
        jLabel3.setText("CALCULADORA");

        btSuma.setBackground(new java.awt.Color(0, 102, 102));
        btSuma.setFont(new java.awt.Font("Bookman Old Style", 0, 12)); // NOI18N
        btSuma.setText("Sumar");
        btSuma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSumaActionPerformed(evt);
            }
        });

        btResta.setBackground(new java.awt.Color(0, 102, 102));
        btResta.setFont(new java.awt.Font("Bookman Old Style", 0, 12)); // NOI18N
        btResta.setText("Restar");
        btResta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRestaActionPerformed(evt);
            }
        });

        btMultiplicar.setBackground(new java.awt.Color(0, 102, 102));
        btMultiplicar.setFont(new java.awt.Font("Bookman Old Style", 0, 12)); // NOI18N
        btMultiplicar.setText("Multiplicación");
        btMultiplicar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btMultiplicarActionPerformed(evt);
            }
        });

        btDividir.setBackground(new java.awt.Color(0, 102, 102));
        btDividir.setFont(new java.awt.Font("Bookman Old Style", 0, 12)); // NOI18N
        btDividir.setText("División");
        btDividir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDividirActionPerformed(evt);
            }
        });

        btnBorrar.setBackground(new java.awt.Color(0, 102, 102));
        btnBorrar.setFont(new java.awt.Font("Bookman Old Style", 0, 12)); // NOI18N
        btnBorrar.setText("Borrar");
        btnBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarActionPerformed(evt);
            }
        });

        txtSalida.setColumns(20);
        txtSalida.setRows(5);
        jScrollPane1.setViewportView(txtSalida);

        jLabel1.setFont(new java.awt.Font("Footlight MT Light", 0, 12)); // NOI18N
        jLabel1.setText("Ingrese el número");
        jLabel1.setToolTipText("");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btSuma)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btMultiplicar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btResta)
                                    .addComponent(btDividir)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(80, 80, 80)
                                .addComponent(btnBorrar)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(12, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btSuma)
                                    .addComponent(btResta, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btMultiplicar)
                                    .addComponent(btDividir))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnBorrar))
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(10, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNumeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumeroActionPerformed
        
    }//GEN-LAST:event_txtNumeroActionPerformed

    //Realiza la suma
    private void btSumaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSumaActionPerformed
        //Crea objeto de la clase Sumar
        IInterfacesita sum = new Suma();
        txtSalida.setText("");
        //si es el primer número que ingresa, devuelve el mismo número
        if (ant==0) {
            ant=lee();
            sal=ant+"";
        }else{
            //lee el siguiente valor y lo suma
            n=lee();
            ant=sum.suma(ant, n);
            sal="ANS + "+n+"\n = "+ant+"";
        }
        ImprimeResetea(sal);
        
    }//GEN-LAST:event_btSumaActionPerformed
 
    private void btRestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRestaActionPerformed
        //Crea objeto de la clase Restar
        IInterfacesita res = new Restar();
        txtSalida.setText("");
        //si es el primer número que ingresa, devuelve el mismo número
        if (ant==0) {
            ant=lee();
            sal=ant+"";
        }else{
            //lee el siguiente valor y le resta al número anterior este
            n=lee();
            ant=res.resta(ant, n);
            sal="ANS - "+n+"\n = "+ant+"";
        }
        ImprimeResetea(sal);
    }//GEN-LAST:event_btRestaActionPerformed

    private void btMultiplicarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btMultiplicarActionPerformed

        txtSalida.setText("");
        //si es el primer número que ingresa, devuelve el mismo número
        if (ant==0) {
            ant=lee();
            sal=ant+"";
        }else{
            //lee el siguiente valor y lo multiplica por este
            n=lee();
            //Crea objeto de la clase Multiplicar
            mult = new Multiplicar(ant,n);
            ant=(float) mult.multiplicar();
            sal="ANS * "+n+"\n = "+ant+"";
        }
        ImprimeResetea(sal);                   
    }//GEN-LAST:event_btMultiplicarActionPerformed

    private void btDividirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDividirActionPerformed
        txtSalida.setText("");
        //si es el primer número que ingresa, devuelve el mismo número
        if (ant==0) {
            ant=lee();
            sal=ant+"";
        }else{
            //lee el siguiente valor y lo divide por este
            n=lee();
            //Crea Objeto de la clase Dividir
            div = new Dividir(ant,n);
            ant=(float) div.division();
            sal="ANS / "+n+"\n = "+ant+"";
        }
        ImprimeResetea(sal);
    }//GEN-LAST:event_btDividirActionPerformed
    
    
    //Resetea todas las variables y los datos de la calculadora
    private void btnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarActionPerformed
        txtNumero.setText("");
        txtSalida.setText("");
        sal="";
        n=0;
        ant=0;
    }//GEN-LAST:event_btnBorrarActionPerformed

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
            java.util.logging.Logger.getLogger(prueba.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(prueba.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(prueba.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(prueba.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new prueba().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btDividir;
    private javax.swing.JButton btMultiplicar;
    private javax.swing.JButton btResta;
    private javax.swing.JButton btSuma;
    private javax.swing.JButton btnBorrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtNumero;
    private javax.swing.JTextArea txtSalida;
    // End of variables declaration//GEN-END:variables
}
