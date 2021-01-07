/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cursoemvideo;

import numerosinteiros.Decimal;
import javax.swing.JOptionPane;
import numerosinteiros.Bcd;
import numerosinteiros.Binario;
import numerosinteiros.Hexa;
import numerosinteiros.Octal;

/**
 *
 * @author INTERESTING
 */
public class Tela04 extends javax.swing.JFrame {

    /**
     * Creates new form TelaConversor
     */
    public Tela04() {
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

        btnDecimal = new javax.swing.JButton();
        btnBinario = new javax.swing.JButton();
        btnOctal = new javax.swing.JButton();
        btnHexa = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnDeciBcd = new javax.swing.JButton();
        btnBkcDec = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        btnDecimal.setText("<html>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Decimal<br>para outras bases</html>");
        btnDecimal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDecimalActionPerformed(evt);
            }
        });

        btnBinario.setText("<html>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Binário<br>para outras bases</html>");
        btnBinario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBinarioActionPerformed(evt);
            }
        });

        btnOctal.setText("<html>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Octal<br>para outras bases</html>");
        btnOctal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOctalActionPerformed(evt);
            }
        });

        btnHexa.setText("<html>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Hexadecimal<br>para outras bases</html>");
        btnHexa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHexaActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("<html>&nbsp;&nbsp;&nbsp;Conversão de <br> Números Inteiros</html> ");

        btnDeciBcd.setText("<html>Decimal para BDC</html>");
        btnDeciBcd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeciBcdActionPerformed(evt);
            }
        });

        btnBkcDec.setText("<html>BCD para Decimal</html>");
        btnBkcDec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBkcDecActionPerformed(evt);
            }
        });

        jButton1.setText("Voltar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnDecimal, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnOctal, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnDeciBcd, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnHexa)
                            .addComponent(btnBinario)
                            .addComponent(btnBkcDec, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(119, 119, 119)
                                .addComponent(jButton1))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(79, 79, 79)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDecimal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBinario))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnHexa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnOctal))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnDeciBcd, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBkcDec, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDecimalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDecimalActionPerformed
        long n = Long.parseLong(Verificar.setDecimal());
        
        //craição do objecto
        Decimal a = new Decimal();
        a.setvalor(n);
        //Apresentação das converções 
        JOptionPane.showMessageDialog(null,"<html><strong>Decimal:</strong> "+ n + 
                "<br/><br/><strong>Binario: </strong>"+ a.getBinario() +
                "<br/><br/><strong>Octal: </strong>"+ a.getOctal() +
                "<br/><br/><strong>Hexadecimal: </strong>"+ a.getHexa()+"</html>"
              ,"Convertido",JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_btnDecimalActionPerformed

    private void btnBinarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBinarioActionPerformed
        String n = Verificar.setBinario();
        Binario b = new Binario();//instância do objecto binario
        b.setValor(n);
        JOptionPane.showMessageDialog(null,"<html><strong>Binário: </strong>"+n+
                "<br><br><strong>Decimal: </strong>"+b.getDecimal()+"<br><br>"
                + "<strong>Octal: </strong>"+b.getOctal()+"<br><br><strong>Hexadecimal: "
                + "</strong>"+b.getHxa()+"</html>"
                ,"Convertido",JOptionPane.INFORMATION_MESSAGE);
         
    }//GEN-LAST:event_btnBinarioActionPerformed

    private void btnOctalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOctalActionPerformed
        long n = Long.parseLong(Verificar.setOctal());
        Octal o = new Octal();
        o.setValor(n);
        JOptionPane.showMessageDialog(null,"<html><strong>Octal: </strong>"+n+
                "<br><br><strong>Decimal: </strong>"+o.getDecimal()+"<br><br>"
                + "<strong>Binário: </strong>"+o.getBinario()+"<br><br><strong>Hexadecimal: "
                + "</strong>"+o.getHexa()+"</html>"
                ,"Convertido",JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_btnOctalActionPerformed

    private void btnHexaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHexaActionPerformed
        String f = Verificar.setHexa();
        Hexa h = new Hexa();
        h.setValor(f);
        JOptionPane.showMessageDialog(null,"<html><strong>Hexadecimal: </strong>"+f+
                "<br><br><strong>Decimal: </strong>"+h.getDecimal()+"<br><br>"
                + "<strong>Binário: </strong>"+h.getBinario()+"<br><br><strong>Octal: "
                + "</strong>"+h.getOctal()+"</html>"
                ,"Convertido",JOptionPane.INFORMATION_MESSAGE);       
    }//GEN-LAST:event_btnHexaActionPerformed

    private void btnBkcDecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBkcDecActionPerformed
        String b = Verificar.setBcdDec();
        Bcd r = new Bcd();
        r.setValor2(b);
        JOptionPane.showMessageDialog(null,"<html><strong>BCD: </strong>"+b+
                "<br><br><strong>Decimal: </strong>"+r.getDecimal()+"</html>"
                ,"Convertido",JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_btnBkcDecActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dispose();
        Tela02 t = new Tela02();
        t.setLocationRelativ­eTo(null);
        t.setVisible(true);               
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnDeciBcdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeciBcdActionPerformed
        long n = Long.parseLong(JOptionPane.showInputDialog(null,"Digite"
                + " um número Decimal:"));
        Bcd d = new Bcd();
        d.setValor1(n);
        JOptionPane.showMessageDialog(null,"<html><strong>Decimal: </strong>"+n+
                "<br><br><strong>BCD: </strong>"+d.getBCD()+"</html>"
                ,"Convertido",JOptionPane.INFORMATION_MESSAGE);        
    }//GEN-LAST:event_btnDeciBcdActionPerformed

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
            java.util.logging.Logger.getLogger(Tela04.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela04.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela04.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela04.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
       Tela04 t = new Tela04();
       t.setLocationRelativ­eTo(null);
       t.setVisible(true);       
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBinario;
    private javax.swing.JButton btnBkcDec;
    private javax.swing.JButton btnDeciBcd;
    private javax.swing.JButton btnDecimal;
    private javax.swing.JButton btnHexa;
    private javax.swing.JButton btnOctal;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}