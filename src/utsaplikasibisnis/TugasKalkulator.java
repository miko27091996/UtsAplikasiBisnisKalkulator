/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utsaplikasibisnis;

/**
 *
 * @author sigit
 */
public class TugasKalkulator extends javax.swing.JFrame {

    private double total1 = 0;
    private double total2 = 0;
    private char pilih;

    public TugasKalkulator() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Jtext = new javax.swing.JTextField();
        jbtn1 = new javax.swing.JButton();
        jbtn2 = new javax.swing.JButton();
        jbtn3 = new javax.swing.JButton();
        jbtntambah = new javax.swing.JButton();
        jbtn4 = new javax.swing.JButton();
        jbtn5 = new javax.swing.JButton();
        jbtn6 = new javax.swing.JButton();
        jbtnkurang = new javax.swing.JButton();
        jbtn7 = new javax.swing.JButton();
        jbtn8 = new javax.swing.JButton();
        jbtn9 = new javax.swing.JButton();
        jbtnkali = new javax.swing.JButton();
        jbtn0 = new javax.swing.JButton();
        jbtnkoma = new javax.swing.JButton();
        jbtnhapus = new javax.swing.JButton();
        jbtnbagi = new javax.swing.JButton();
        jbtnplusminus = new javax.swing.JButton();
        jbtnsmdgn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jbtn1.setText("1");
        jbtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn1ActionPerformed(evt);
            }
        });

        jbtn2.setText("2");
        jbtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn2ActionPerformed(evt);
            }
        });

        jbtn3.setText("3");
        jbtn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn3ActionPerformed(evt);
            }
        });

        jbtntambah.setText("+");
        jbtntambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtntambahActionPerformed(evt);
            }
        });

        jbtn4.setText("4");
        jbtn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn4ActionPerformed(evt);
            }
        });

        jbtn5.setText("5");
        jbtn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn5ActionPerformed(evt);
            }
        });

        jbtn6.setText("6");
        jbtn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn6ActionPerformed(evt);
            }
        });

        jbtnkurang.setText("-");
        jbtnkurang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnkurangActionPerformed(evt);
            }
        });

        jbtn7.setText("7");
        jbtn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn7ActionPerformed(evt);
            }
        });

        jbtn8.setText("8");
        jbtn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn8ActionPerformed(evt);
            }
        });

        jbtn9.setText("9");
        jbtn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn9ActionPerformed(evt);
            }
        });

        jbtnkali.setText("x");
        jbtnkali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnkaliActionPerformed(evt);
            }
        });

        jbtn0.setText("0");
        jbtn0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn0ActionPerformed(evt);
            }
        });

        jbtnkoma.setText(",");
        jbtnkoma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnkomaActionPerformed(evt);
            }
        });

        jbtnhapus.setText("C");
        jbtnhapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnhapusActionPerformed(evt);
            }
        });

        jbtnbagi.setText("\\");
            jbtnbagi.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jbtnbagiActionPerformed(evt);
                }
            });

            jbtnplusminus.setText("+/-");

            jbtnsmdgn.setText("=");
            jbtnsmdgn.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jbtnsmdgnActionPerformed(evt);
                }
            });

            javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
            getContentPane().setLayout(layout);
            layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(49, 49, 49)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(Jtext)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jbtn1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jbtn2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jbtn3)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jbtntambah))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jbtnplusminus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jbtn0)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jbtnkoma)))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jbtnhapus)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jbtnbagi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addComponent(jbtnsmdgn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jbtn4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jbtn5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jbtn6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jbtnkurang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jbtn7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jbtn8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jbtn9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jbtnkali))))
                    .addContainerGap(175, Short.MAX_VALUE))
            );
            layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(Jtext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jbtn1)
                        .addComponent(jbtn2)
                        .addComponent(jbtn3)
                        .addComponent(jbtntambah))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jbtn4)
                        .addComponent(jbtn5)
                        .addComponent(jbtn6)
                        .addComponent(jbtnkurang))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jbtn7)
                        .addComponent(jbtn8)
                        .addComponent(jbtn9)
                        .addComponent(jbtnkali))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jbtn0)
                        .addComponent(jbtnkoma)
                        .addComponent(jbtnhapus)
                        .addComponent(jbtnbagi))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jbtnplusminus)
                        .addComponent(jbtnsmdgn))
                    .addContainerGap(104, Short.MAX_VALUE))
            );

            pack();
        }// </editor-fold>//GEN-END:initComponents

    private void jbtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn1ActionPerformed
        String jbtn1Text = Jtext.getText()
                + jbtn1.getText();
        Jtext.setText(jbtn1Text);
        // TODO add your handling code here:
    }//GEN-LAST:event_jbtn1ActionPerformed

    private void jbtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn2ActionPerformed
        String jbtn2Text = Jtext.getText()
                + jbtn2.getText();
        Jtext.setText(jbtn2Text);
// TODO add your handling code here:
    }//GEN-LAST:event_jbtn2ActionPerformed

    private void jbtn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn3ActionPerformed
        String jbtn3Text = Jtext.getText()
                + jbtn3.getText();
        Jtext.setText(jbtn3Text);
        // TODO add your handling code here:
    }//GEN-LAST:event_jbtn3ActionPerformed

    private void jbtn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn4ActionPerformed
        String jbtn4Text = Jtext.getText()
                + jbtn4.getText();
        Jtext.setText(jbtn4Text);        // TODO add your handling code here:
    }//GEN-LAST:event_jbtn4ActionPerformed

    private void jbtn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn5ActionPerformed
        String jbtn5Text = Jtext.getText()
                + jbtn5.getText();
        Jtext.setText(jbtn5Text);        // TODO add your handling code here:
    }//GEN-LAST:event_jbtn5ActionPerformed

    private void jbtn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn6ActionPerformed
        String jbtn6Text = Jtext.getText()
                + jbtn6.getText();
        Jtext.setText(jbtn6Text);        // TODO add your handling code here:
    }//GEN-LAST:event_jbtn6ActionPerformed

    private void jbtn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn7ActionPerformed
        String jbtn7Text = Jtext.getText()
                + jbtn7.getText();
        Jtext.setText(jbtn7Text);        // TODO add your handling code here:
    }//GEN-LAST:event_jbtn7ActionPerformed

    private void jbtn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn8ActionPerformed
        String jbtn8Text = Jtext.getText()
                + jbtn8.getText();
        Jtext.setText(jbtn8Text);        // TODO add your handling code here:
    }//GEN-LAST:event_jbtn8ActionPerformed

    private void jbtn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn9ActionPerformed
        String jbtn9Text = Jtext.getText()
                + jbtn9.getText();
        Jtext.setText(jbtn9Text);        // TODO add your handling code here:
    }//GEN-LAST:event_jbtn9ActionPerformed

    private void jbtn0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn0ActionPerformed
        String jbtn0Text = Jtext.getText()
                + jbtn0.getText();
        Jtext.setText(jbtn0Text);// TODO add your handling code here:
    }//GEN-LAST:event_jbtn0ActionPerformed

    private void jbtntambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtntambahActionPerformed
        String button_text = jbtntambah.getText();
        getOperator(button_text);// TODO add your handling code here:
    }//GEN-LAST:event_jbtntambahActionPerformed

    private void jbtnkurangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnkurangActionPerformed
        String button_text = jbtnkurang.getText();
        getOperator(button_text);// TODO add your handling code here:
    }//GEN-LAST:event_jbtnkurangActionPerformed

    private void jbtnkaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnkaliActionPerformed
        String button_text = jbtnkali.getText();
        getOperator(button_text);        // TODO add your handling code here:
    }//GEN-LAST:event_jbtnkaliActionPerformed

    private void jbtnbagiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnbagiActionPerformed
        String button_text = jbtnbagi.getText();
        getOperator(button_text);        // TODO add your handling code here:
    }//GEN-LAST:event_jbtnbagiActionPerformed

    private void jbtnkomaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnkomaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbtnkomaActionPerformed

    private void jbtnhapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnhapusActionPerformed
        total2 = 0;
        Jtext.setText("");// TODO add your handling code here:
    }//GEN-LAST:event_jbtnhapusActionPerformed

    private void jbtnsmdgnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnsmdgnActionPerformed
        switch (pilih) {
            case '+':
                total2 = total1
                        + Double.parseDouble(Jtext.getText());
                break;
            case '-':
                total2 = total1
                        - Double.parseDouble(Jtext.getText());
                break;
            case '*':
                total2 = total1
                        * Double.parseDouble(Jtext.getText());
                break;
            case '/':
                total2 = total1
                        / Double.parseDouble(Jtext.getText());
                break;

        }
        Jtext.setText(Double.toString(total2));
        total1 = 0;
// TODO add your handling code here:
    }//GEN-LAST:event_jbtnsmdgnActionPerformed

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
            java.util.logging.Logger.getLogger(TugasKalkulator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TugasKalkulator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TugasKalkulator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TugasKalkulator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TugasKalkulator().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Jtext;
    private javax.swing.JButton jbtn0;
    private javax.swing.JButton jbtn1;
    private javax.swing.JButton jbtn2;
    private javax.swing.JButton jbtn3;
    private javax.swing.JButton jbtn4;
    private javax.swing.JButton jbtn5;
    private javax.swing.JButton jbtn6;
    private javax.swing.JButton jbtn7;
    private javax.swing.JButton jbtn8;
    private javax.swing.JButton jbtn9;
    private javax.swing.JButton jbtnbagi;
    private javax.swing.JButton jbtnhapus;
    private javax.swing.JButton jbtnkali;
    private javax.swing.JButton jbtnkoma;
    private javax.swing.JButton jbtnkurang;
    private javax.swing.JButton jbtnplusminus;
    private javax.swing.JButton jbtnsmdgn;
    private javax.swing.JButton jbtntambah;
    // End of variables declaration//GEN-END:variables

    private void getOperator(String button_text) {
        //To change body of generated methods, choose Tools | Templates.
    }
}
