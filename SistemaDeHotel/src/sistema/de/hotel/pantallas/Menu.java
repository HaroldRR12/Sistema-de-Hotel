/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package sistema.de.hotel.pantallas;

/**
 *
 * @author CALUFA
 */
public class Menu extends javax.swing.JFrame {

    /**
     * Creates new form Menu
     */
    public Menu() {
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

        jFrame1 = new javax.swing.JFrame();
        jFrame2 = new javax.swing.JFrame();
        jFrame3 = new javax.swing.JFrame();
        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        btnreserv = new javax.swing.JButton();
        btnTH = new javax.swing.JButton();
        btnclienteimg = new javax.swing.JButton();
        btnrest = new javax.swing.JButton();
        btnadicion = new javax.swing.JButton();
        btncliente = new javax.swing.JButton();
        btnRegistro = new javax.swing.JButton();
        btnH = new javax.swing.JButton();
        btnreservimg = new javax.swing.JButton();
        btnrestimg = new javax.swing.JButton();
        btnTHimg = new javax.swing.JButton();
        btnRegistroimg = new javax.swing.JButton();
        btnadicionimg = new javax.swing.JButton();
        btnHimg = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jFrame2Layout = new javax.swing.GroupLayout(jFrame2.getContentPane());
        jFrame2.getContentPane().setLayout(jFrame2Layout);
        jFrame2Layout.setHorizontalGroup(
            jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame2Layout.setVerticalGroup(
            jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jFrame3Layout = new javax.swing.GroupLayout(jFrame3.getContentPane());
        jFrame3.getContentPane().setLayout(jFrame3Layout);
        jFrame3Layout.setHorizontalGroup(
            jFrame3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame3Layout.setVerticalGroup(
            jFrame3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnreserv.setText("Lista de Reservaciones");
        btnreserv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnreservActionPerformed(evt);
            }
        });

        btnTH.setText("Tipos de habitaciones");
        btnTH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTHActionPerformed(evt);
            }
        });

        btnclienteimg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/Clientes.png"))); // NOI18N
        btnclienteimg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnclienteimgActionPerformed(evt);
            }
        });

        btnrest.setText("Restaurante");
        btnrest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnrestActionPerformed(evt);
            }
        });

        btnadicion.setText("Adicionales");
        btnadicion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnadicionActionPerformed(evt);
            }
        });

        btncliente.setText("Clientes");
        btncliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnclienteActionPerformed(evt);
            }
        });

        btnRegistro.setText("Registro Usuario");
        btnRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistroActionPerformed(evt);
            }
        });

        btnH.setText("Habitaciones");
        btnH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHActionPerformed(evt);
            }
        });

        btnreservimg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/Reservaciones.png"))); // NOI18N
        btnreservimg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnreservimgActionPerformed(evt);
            }
        });

        btnrestimg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/Restaurante.png"))); // NOI18N
        btnrestimg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnrestimgActionPerformed(evt);
            }
        });

        btnTHimg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/tipos de habitaciones .png"))); // NOI18N
        btnTHimg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTHimgActionPerformed(evt);
            }
        });

        btnRegistroimg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/Registro.jpg"))); // NOI18N
        btnRegistroimg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistroimgActionPerformed(evt);
            }
        });

        btnadicionimg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/Adicionales .png"))); // NOI18N
        btnadicionimg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnadicionimgActionPerformed(evt);
            }
        });

        btnHimg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/habitaciones.png"))); // NOI18N
        btnHimg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHimgActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Sitka Subheading", 3, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Menu Principal ");

        jButton1.setText("Registro de Reservas");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/registro de reservas.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Registro Usuario");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(89, 89, 89)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 837, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnreservimg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnreserv, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(92, 92, 92))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(100, 100, 100)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(btnrest, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnrestimg))
                                .addGap(111, 111, 111)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnTHimg)
                                    .addComponent(btnTH)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnadicionimg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnadicion, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(135, 135, 135)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnclienteimg, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btncliente, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(btnRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(88, 88, 88)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnH, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnHimg))
                                .addGap(0, 12, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(btnRegistroimg))))
                        .addContainerGap(126, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnreservimg)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnrestimg, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnTHimg, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnHimg, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnreserv, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnrest, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnTH, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnH, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 123, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnclienteimg, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnadicionimg, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnRegistroimg, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnRegistro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btncliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnadicion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(17, 17, 17))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnrestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnrestActionPerformed
        // TODO add your handling code here:
        Restaurante rest=new Restaurante();
        rest.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnrestActionPerformed

    private void btnRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistroActionPerformed
        // TODO add your handling code here:
            Registro registro = new Registro();
            registro.setVisible(true);
            dispose();
        
    }//GEN-LAST:event_btnRegistroActionPerformed

    private void btnHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHActionPerformed
        RegistrarHabitacion rh = new RegistrarHabitacion();
            rh.setVisible(true);
            dispose();
    }//GEN-LAST:event_btnHActionPerformed

    private void btnrestimgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnrestimgActionPerformed
        // TODO add your handling code here:
        Restaurante rest=new Restaurante();
        rest.setVisible(true);
        dispose();
        
    }//GEN-LAST:event_btnrestimgActionPerformed

    private void btnTHimgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTHimgActionPerformed
        RegistrarTipoDeHabitacion rtdh = new RegistrarTipoDeHabitacion();
        rtdh.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnTHimgActionPerformed

    private void btnRegistroimgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistroimgActionPerformed
        // TODO add your handling code here:     
        Registro registro = new Registro();
        registro.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnRegistroimgActionPerformed

    private void btnTHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTHActionPerformed
        // TODO add your handling code here:
            RegistrarTipoDeHabitacion rtdh = new RegistrarTipoDeHabitacion();
            rtdh.setVisible(true);
            dispose();
    }//GEN-LAST:event_btnTHActionPerformed

    private void btnHimgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHimgActionPerformed
        RegistrarHabitacion rh = new RegistrarHabitacion();
            rh.setVisible(true);
            dispose();
    }//GEN-LAST:event_btnHimgActionPerformed

    private void btnadicionimgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnadicionimgActionPerformed
        // TODO add your handling code here:
        AdicionalesAgregar aag = new AdicionalesAgregar();
            aag.setVisible(true);
            dispose();
    }//GEN-LAST:event_btnadicionimgActionPerformed

    private void btnadicionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnadicionActionPerformed
        // TODO add your handling code here:
         AdicionalesAgregar aag = new AdicionalesAgregar();
            aag.setVisible(true);
            dispose();
    }//GEN-LAST:event_btnadicionActionPerformed

    private void btnclienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnclienteActionPerformed
        // TODO add your handling code here:
         ResgistroCliente rc = new ResgistroCliente();
            rc.setVisible(true);
            dispose();
    }//GEN-LAST:event_btnclienteActionPerformed

    private void btnclienteimgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnclienteimgActionPerformed
        // TODO add your handling code here:
         ResgistroCliente rc = new ResgistroCliente();
            rc.setVisible(true);
            dispose();
    }//GEN-LAST:event_btnclienteimgActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
            RegistrarReservas rras = new RegistrarReservas();
            rras.setVisible(true);
            dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
            RegistrarReservas rras = new RegistrarReservas();
            rras.setVisible(true);
            dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btnreservimgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnreservimgActionPerformed
        // TODO add your handling code here:
        Listar_Reservas LR  = new Listar_Reservas();
            LR.setVisible(true);
            dispose();
    }//GEN-LAST:event_btnreservimgActionPerformed

    private void btnreservActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnreservActionPerformed
        // TODO add your handling code here:
        Listar_Reservas LR  = new Listar_Reservas();
            LR.setVisible(true);
            dispose();
    }//GEN-LAST:event_btnreservActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        Registro registro = new Registro();
        registro.setVisible(true);
        dispose();

    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnH;
    private javax.swing.JButton btnHimg;
    private javax.swing.JButton btnRegistro;
    private javax.swing.JButton btnRegistroimg;
    private javax.swing.JButton btnTH;
    private javax.swing.JButton btnTHimg;
    private javax.swing.JButton btnadicion;
    private javax.swing.JButton btnadicionimg;
    private javax.swing.JButton btncliente;
    private javax.swing.JButton btnclienteimg;
    private javax.swing.JButton btnreserv;
    private javax.swing.JButton btnreservimg;
    private javax.swing.JButton btnrest;
    private javax.swing.JButton btnrestimg;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JFrame jFrame2;
    private javax.swing.JFrame jFrame3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables
}
