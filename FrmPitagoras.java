package com.narvasoft.pitagoras;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FrmPitagoras extends javax.swing.JFrame {

 

    public FrmPitagoras() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtCatetoA = new javax.swing.JTextField();
        txtCatetoO = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtHipo = new javax.swing.JTextField();
        btnCalcular = new javax.swing.JButton();
        lblResul = new javax.swing.JLabel();
        lblSeno = new javax.swing.JLabel();
        lblCoseno = new javax.swing.JLabel();
        lblTangente = new javax.swing.JLabel();
        lblSecante = new javax.swing.JLabel();
        lblCosecante = new javax.swing.JLabel();
        lblCotangente = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Cateto Adyacente:");

        jLabel2.setText("Cateto Opuesto:");

        jLabel3.setText("Hipotenusa:");

        btnCalcular.setText("Calcular");
        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });

        lblResul.setForeground(new java.awt.Color(255, 0, 0));
        lblResul.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblSeno.setText("Seno = ");

        lblCoseno.setText("Coseno =");

        lblTangente.setText("Tangente = ");

        lblSecante.setText("Secante = ");

        lblCosecante.setText("Cosecante =");

        lblCotangente.setText("Cotangente =");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtCatetoA, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtCatetoO, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtHipo, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(15, 15, 15))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(btnCalcular))
                            .addComponent(lblResul, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblSeno)
                    .addComponent(lblCoseno)
                    .addComponent(lblTangente)
                    .addComponent(lblCosecante)
                    .addComponent(lblCotangente)
                    .addComponent(lblSecante, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCatetoA, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(lblSeno)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblCoseno)
                        .addGap(5, 5, 5)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(txtCatetoO, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(lblTangente)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblSecante)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCosecante)
                    .addComponent(txtHipo, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblCotangente)
                .addGap(49, 49, 49)
                .addComponent(lblResul, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(btnCalcular)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
        double catetoA = 0, catetoO = 0, hipo = 0;
        if ((txtCatetoA.getText().isEmpty()) && (!txtCatetoO.getText().isEmpty()) && (!txtHipo.getText().isEmpty())) {
            //en este caso vamos a calcular el Cateto Ayacente
            double temp1 = Double.parseDouble(txtHipo.getText());
            double temp2 = Double.parseDouble(txtCatetoO.getText());

            txtCatetoA.setText(Double.toString(MetodosP.catetoAdyacente(temp1, temp2)));
            lblResul.setText(" Se ha calculado  el Cateto Adyacente " + Double.toString(MetodosP.catetoAdyacente(temp1, temp2)));
    }//GEN-LAST:event_btnCalcularActionPerformed
        if ((txtCatetoO.getText().isEmpty()) && (!txtCatetoA.getText().equals("")) && (!txtHipo.getText().equals(""))) {
            //en este caso vamos a calcular el Cateto Opuesto
            double temp1 = Double.parseDouble(txtHipo.getText());
            double temp2 = Double.parseDouble(txtCatetoA.getText());

            txtCatetoO.setText(Double.toString(MetodosP.catetoOpuesto(temp1, temp2)));
            lblResul.setText(" Se ha calculado  el Cateto Opuesto " + Double.toString(MetodosP.catetoOpuesto(temp1, temp2)));

        }
        if ((txtHipo.getText().isEmpty()) && (!txtCatetoA.getText().equals("")) && (!txtCatetoO.getText().equals(""))) {
            //en este caso vamos a calcular el Cateto la hipotenusa
            double temp1 = Double.parseDouble(txtCatetoA.getText());
            double temp2 = Double.parseDouble(txtCatetoO.getText());

            txtHipo.setText(Double.toString(MetodosP.hipoTenusa(temp1, temp2)));
            lblResul.setText(" Se ha calculado  La Hipotenusa " + Double.toString(MetodosP.hipoTenusa(temp1, temp2)));
        }
        // Ahora vamos a calcular las razones trigonométricas
        catetoA = Double.parseDouble(txtCatetoA.getText());
        catetoO = Double.parseDouble(txtCatetoO.getText());
        hipo = Double.parseDouble(txtHipo.getText());
        lblSeno.setText("Seno = " + Razones.seno(catetoO, hipo));
        lblCoseno.setText("Coseno = " + Razones.coSeno(catetoA, hipo));
        lblTangente.setText("Tangente = " + Razones.coSeno(catetoO, catetoA));
        lblSecante.setText("Secante = " + Razones.seCante(hipo, catetoA));
        lblCosecante.setText("Cosecante = " + Razones.coSecante(hipo, catetoO));
        lblCotangente.setText("Cotangente = " + Razones.cotanGente(catetoA, catetoO));
    }

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
            java.util.logging.Logger.getLogger(FrmPitagoras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmPitagoras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmPitagoras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmPitagoras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmPitagoras().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalcular;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel lblCosecante;
    private javax.swing.JLabel lblCoseno;
    private javax.swing.JLabel lblCotangente;
    private javax.swing.JLabel lblResul;
    private javax.swing.JLabel lblSecante;
    private javax.swing.JLabel lblSeno;
    private javax.swing.JLabel lblTangente;
    private javax.swing.JTextField txtCatetoA;
    private javax.swing.JTextField txtCatetoO;
    private javax.swing.JTextField txtHipo;
    // End of variables declaration//GEN-END:variables

}
