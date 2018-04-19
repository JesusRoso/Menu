/* Principal.java 28/02/2018
 * copyrigth (c) 2018 Jesus Roso, David Manosalba, Francisco Barrero
 */
package GUI.interfaz;
/**
 * la clase Postre tiene los botones para elegir un tipo de postre para el menu
 * y los datos almacenados en los botones los manda a la clase interfaz y se
 * muestran cuando se selecciona el boton imprimir
 * @author Jesus Roso
 * @author David Manosalba
 * @author Francisco Barrero
 * @version 1.4
 */
public class Postre extends javax.swing.JFrame {

    /**
     * Creates new form Postre
     */
    public Postre() {
        initComponents();
    }
    //variable estatica que almacena postres
    public static String gp = "";

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cppostredulce = new javax.swing.JComboBox<>();
        cbpostresal = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jBguardarpostredulce = new javax.swing.JButton();
        jBguardarpostresalado = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        cppostredulce.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECCIONAR POSTRE DULCE", "Helado", "Chocolate", "Arequipe", "Dulce de fruta" }));

        cbpostresal.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECCIONAR POSTRE DE SAL", "Galletas ", "Waffles", " ", " " }));

        jLabel1.setFont(new java.awt.Font("Arial Rounded MT Bold", 2, 12)); // NOI18N
        jLabel1.setText("SELECCIONE POSTRE QUE DESEA PARA EL MENU");

        jBguardarpostredulce.setText("Guardar postre dulce");
        jBguardarpostredulce.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBguardarpostredulceActionPerformed(evt);
            }
        });

        jBguardarpostresalado.setText("Guardar postre salado");
        jBguardarpostresalado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBguardarpostresaladoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(68, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(cbpostresal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cppostredulce, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(127, 127, 127))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jBguardarpostredulce)
                        .addGap(142, 142, 142))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jBguardarpostresalado)
                        .addGap(138, 138, 138))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(cppostredulce, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jBguardarpostredulce)
                .addGap(26, 26, 26)
                .addComponent(cbpostresal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jBguardarpostresalado)
                .addContainerGap(63, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBguardarpostredulceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBguardarpostredulceActionPerformed
        // seleccionada lo escogido en box y lo asigna a la variable, cierra la ventana
        gp=cppostredulce.getSelectedItem().toString();
        this.setVisible(false);
    }//GEN-LAST:event_jBguardarpostredulceActionPerformed

    private void jBguardarpostresaladoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBguardarpostresaladoActionPerformed
       // seleccionada lo escogido en box y lo asigna a la variable, cierra la ventana
        gp=cbpostresal.getSelectedItem().toString();
        this.setVisible(false);
    }//GEN-LAST:event_jBguardarpostresaladoActionPerformed

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
            java.util.logging.Logger.getLogger(Postre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Postre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Postre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Postre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Postre().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbpostresal;
    private javax.swing.JComboBox<String> cppostredulce;
    private javax.swing.JButton jBguardarpostredulce;
    private javax.swing.JButton jBguardarpostresalado;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
