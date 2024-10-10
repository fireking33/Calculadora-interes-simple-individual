
package forms;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * La clase {@code Calculadora} representa una interfaz gráfica de usuario
 * (GUI) para calcular el interés simple basado en el capital, la tasa de
 * interés y el número de períodos. Extiende la clase {@link JFrame} para
 * crear una ventana de aplicación.
 */
public class Calculadora extends javax.swing.JFrame {

    /**
     * Crea una nueva instancia de {@code Calculadora} y inicializa
     * los componentes de la interfaz de usuario.
     */
    public Calculadora() {
        initComponents();
    }
 /**
     * Inicializa los componentes de la interfaz de usuario.
     * Este método se genera automáticamente y se encarga de
     * configurar la disposición y las propiedades de los elementos
     * de la GUI.
     */
  
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        CajaTotal = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jTextField7 = new javax.swing.JTextField();
        CajaNum1 = new javax.swing.JTextField();
        CajaNum2 = new javax.swing.JTextField();
        CajaNum4 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 255, 204));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("INTERES SIMPLE");

        CajaTotal.setEditable(false);
        CajaTotal.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        CajaTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CajaTotalActionPerformed(evt);
            }
        });

        jTextField2.setText("Valor presente o capital");

        jTextField3.setText("Interes");
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });

        jTextField4.setText("Periodos");
        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });

        jTextField5.setText("meses");
        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });

        jTextField6.setText("%");
        jTextField6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField6ActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setText("CALCULAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTextField7.setText("Bs");
        jTextField7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField7ActionPerformed(evt);
            }
        });

        CajaNum1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        CajaNum1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CajaNum1ActionPerformed(evt);
            }
        });

        CajaNum2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        CajaNum2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CajaNum2ActionPerformed(evt);
            }
        });

        CajaNum4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        CajaNum4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CajaNum4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(150, 150, 150)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(CajaNum1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(CajaNum2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(CajaNum4, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(CajaTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CajaNum1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CajaNum2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(CajaNum4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(CajaTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(61, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 511, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
/**
     * Guarda el contenido especificado en un archivo de texto llamado
     * "resultado.txt". Si el archivo no existe, se crea uno nuevo.
     *
     * @param contenido el contenido a guardar en el archivo
     */
    private void guardarEnArchivo(String contenido) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("resultado.txt", true))) {
            writer.write(contenido);
            writer.newLine(); // Añadir una nueva línea
        } catch (IOException e) {
            // Manejo de excepción si falla la escritura en el archivo
        }
    }
    /**
     * Maneja el evento de acción del campo de texto {@code CajaTotal}.
     * @param evt el evento de acción
     */
    private void CajaTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CajaTotalActionPerformed
        
    }//GEN-LAST:event_CajaTotalActionPerformed
    /**
     * Maneja el evento de acción del campo de texto de interés.
     * @param evt el evento de acción
     */
    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        
    }//GEN-LAST:event_jTextField3ActionPerformed
 /**
     * Maneja el evento de acción del campo de texto de períodos.
     * @param evt el evento de acción
     */
    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        
    }//GEN-LAST:event_jTextField4ActionPerformed
/**
     * Maneja el evento de acción del campo de texto de meses.
     * @param evt el evento de acción
     */
    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
       
    }//GEN-LAST:event_jTextField5ActionPerformed
  /**
     * Maneja el evento de acción del campo de texto de porcentaje.
     * @param evt el evento de acción
     */
    private void jTextField6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField6ActionPerformed
       
    }//GEN-LAST:event_jTextField6ActionPerformed
/**
 * Maneja el evento de acción del campo de texto {@code jTextField7}.
 * @param evt el evento de acción
 */
    private void jTextField7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField7ActionPerformed
      
    }//GEN-LAST:event_jTextField7ActionPerformed
 /**
     * Maneja el evento de acción del campo de texto {@code CajaNum1}.
     * Este método actualmente no realiza ninguna acción.
     *
     * @param evt el evento de acción
     */
    private void CajaNum1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CajaNum1ActionPerformed
      
    }//GEN-LAST:event_CajaNum1ActionPerformed

    /**
     * Maneja el evento de acción del campo de texto {@code CajaNum2}.
     * Este método actualmente no realiza ninguna acción.
     *
     * @param evt el evento de acción
     */
    private void CajaNum2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CajaNum2ActionPerformed
        
    }//GEN-LAST:event_CajaNum2ActionPerformed
/**
     * Maneja el evento de acción del campo de texto {@code CajaNum4}.
     * Este método actualmente no realiza ninguna acción.
     *
     * @param evt el evento de acción
     */
    private void CajaNum4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CajaNum4ActionPerformed
        
    }//GEN-LAST:event_CajaNum4ActionPerformed
/**
     * Maneja el evento de acción del botón {@code jButton1}.
     * Este método calcula el interés simple y muestra el resultado
     * en el campo {@code CajaTotal}. También guarda el resultado en
     * un archivo de texto.
     *
     * @param evt el evento de acción
     */
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        double Num1, Num2, Num4, Calcular;
        Num1=Double.parseDouble(CajaNum1.getText());
        Num2=Double.parseDouble(CajaNum2.getText());
        Num4=Double.parseDouble(CajaNum4.getText());
        Calcular=Num1*Num2*Num4;
        CajaTotal.setText(String.valueOf(Calcular));
        // Guardar resultado en un archivo
        String resultado = "Capital: " + Num1 + ", Interés: " + Num2 + ", Períodos: " + Num4 + ", Total: " + Calcular;
        guardarEnArchivo(resultado);
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * El punto de entrada principal para la aplicación. Inicia la GUI
     * creando y mostrando una instancia de {@code Calculadora}.
     *
     * @param args los argumentos de línea de comandos
     */
    public static void main(String args[]) {
        /* Establecer el aspecto y comportamiento Nimbus */
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

        /* Crear y mostrar la forma */
        java.awt.EventQueue.invokeLater(() -> {
            new Calculadora().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField CajaNum1;
    private javax.swing.JTextField CajaNum2;
    private javax.swing.JTextField CajaNum4;
    private javax.swing.JTextField CajaTotal;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    // End of variables declaration//GEN-END:variables
}
