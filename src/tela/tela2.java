
package tela;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Paulo
 */
public class tela2 extends javax.swing.JFrame {

    public tela2() {
        initComponents();
    }

    @SuppressWarnings("unchecked")

    private void initComponents() {

        btn1hota = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        btn2horas = new javax.swing.JButton();
        btn3horas = new javax.swing.JButton();
        btn4horas = new javax.swing.JButton();
        btn5horas = new javax.swing.JButton();
        btn6horas = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 204, 204));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setFocusable(false);
        setLocation(new java.awt.Point(750, 400));
        setSize(new java.awt.Dimension(349, 225));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        btn1hota.setText("1 Hora");
        btn1hota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1hotaActionPerformed(evt);
            }
        });

        jButton1.setText("Cancelar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btn2horas.setText("2 Horas");
        btn2horas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2horasActionPerformed(evt);
            }
        });

        btn3horas.setText("3 Horas");
        btn3horas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3horasActionPerformed(evt);
            }
        });

        btn4horas.setText("4 Horas");
        btn4horas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4horasActionPerformed(evt);
            }
        });

        btn5horas.setText("5 Horas");
        btn5horas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5horasActionPerformed(evt);
            }
        });

        btn6horas.setText("6 Horas");
        btn6horas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn6horasActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Shutdown");
        jLabel1.setToolTipText("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn1hota)
                            .addComponent(btn2horas)
                            .addComponent(btn3horas))
                        .addGap(87, 87, 87)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn6horas)
                            .addComponent(btn5horas)
                            .addComponent(btn4horas)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(136, 136, 136)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(101, 101, 101)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(62, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn1hota)
                    .addComponent(btn4horas))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn2horas)
                    .addComponent(btn5horas))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn3horas)
                    .addComponent(btn6horas))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addGap(28, 28, 28))
        );

        pack();
    }

    private void btn1hotaActionPerformed(java.awt.event.ActionEvent evt) {
           try {
			Process process = Runtime.getRuntime().exec("shutdown -s -t 3600");
			Scanner leitor = new Scanner(process.getInputStream());
			while (leitor.hasNextLine()) {
				System.out.println(leitor.nextLine());
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
           try {
			Process process = Runtime.getRuntime().exec("shutdown /a");
			Scanner leitor = new Scanner(process.getInputStream());
			while (leitor.hasNextLine()) {
				System.out.println(leitor.nextLine());
			}
		} catch (IOException e) {
			e.printStackTrace();
		}         // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btn2horasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2horasActionPerformed
        try {
			Process process = Runtime.getRuntime().exec("shutdown -s -t 7200");
			Scanner leitor = new Scanner(process.getInputStream());
			while (leitor.hasNextLine()) {
				System.out.println(leitor.nextLine());
			}
		} catch (IOException e) {
			e.printStackTrace();
		} 
    }//GEN-LAST:event_btn2horasActionPerformed

    private void btn3horasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3horasActionPerformed
        try {
			Process process = Runtime.getRuntime().exec("shutdown -s -t 10800");
			Scanner leitor = new Scanner(process.getInputStream());
			while (leitor.hasNextLine()) {
				System.out.println(leitor.nextLine());
			}
		} catch (IOException e) {
			e.printStackTrace();
		} 
    }//GEN-LAST:event_btn3horasActionPerformed

    private void btn4horasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4horasActionPerformed
        try {
			Process process = Runtime.getRuntime().exec("shutdown -s -t 14400");
			Scanner leitor = new Scanner(process.getInputStream());
			while (leitor.hasNextLine()) {
				System.out.println(leitor.nextLine());
			}
		} catch (IOException e) {
			e.printStackTrace();
		} 
    }//GEN-LAST:event_btn4horasActionPerformed

    private void btn5horasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5horasActionPerformed
        try {
			Process process = Runtime.getRuntime().exec("shutdown -s -t 18000");
			Scanner leitor = new Scanner(process.getInputStream());
			while (leitor.hasNextLine()) {
				System.out.println(leitor.nextLine());
			}
		} catch (IOException e) {
			e.printStackTrace();
		} 
    }//GEN-LAST:event_btn5horasActionPerformed

    private void btn6horasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn6horasActionPerformed
       try {
			Process process = Runtime.getRuntime().exec("shutdown -s -t 21600");
			Scanner leitor = new Scanner(process.getInputStream());
			while (leitor.hasNextLine()) {
				System.out.println(leitor.nextLine());
			}
		} catch (IOException e) {
			e.printStackTrace();
		} 
    }//GEN-LAST:event_btn6horasActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowActivated

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
            java.util.logging.Logger.getLogger(tela2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(tela2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(tela2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(tela2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new tela2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn1hota;
    private javax.swing.JButton btn2horas;
    private javax.swing.JButton btn3horas;
    private javax.swing.JButton btn4horas;
    private javax.swing.JButton btn5horas;
    private javax.swing.JButton btn6horas;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
