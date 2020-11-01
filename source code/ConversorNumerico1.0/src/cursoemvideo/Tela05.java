/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cursoemvideo;

import javax.swing.JOptionPane;
import numerosfraccionarios.BinarioFraq;
import numerosfraccionarios.DEcimalFraq;
import numerosfraccionarios.HexaFraq;
import numerosfraccionarios.OctalFrac;

/**
 *
 * @author INTERESTING
 */
public class Tela05 extends javax.swing.JFrame {

    /**
     * Creates new form TelaConversor
     */
    public Tela05() {
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
        btnVoltar = new javax.swing.JButton();

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
        jLabel1.setText("<html> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Conversão de <br> Números Fraccionários</html> ");

        btnVoltar.setText("voltar");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 10, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnDecimal, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnOctal, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnHexa)
                            .addComponent(btnBinario, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(121, 121, 121)
                                .addComponent(btnVoltar))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(80, 80, 80)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDecimal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBinario))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnHexa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnOctal))
                .addGap(27, 27, 27)
                .addComponent(btnVoltar)
                .addGap(22, 22, 22))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDecimalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDecimalActionPerformed
        //instância objecto verificar2 
        Verificar2 m = new Verificar2();
        
        //receber um valor pelo método setdecimal do objecto
        String n = m.setDecimal();        
        
        m.contar(n);
        
        
        long i= m.getParteInt();
        double d = m.getParteRea();
        
        //craição do objecto
        DEcimalFraq a = new DEcimalFraq();
        a.setBinario(i,d);
        a.setOctal(i,d);
        a.setHexa(i,d);
        
        //Apresentação das converções 
        JOptionPane.showMessageDialog(null,"<html><strong>Decimal:</strong> "+n+ 
               "<br/><br/><strong>Binario: </strong>"+ a.getBinario() +
                "<br/><br/><strong>Octal: </strong>"+ a.getOctal() +
                "<br/><br/><strong>Hexadecimal: </strong>"+ a.getHexa()+"</html>"
              ,"Convertido",JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_btnDecimalActionPerformed

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        //Apresentação da informação do aplicativo
         dispose();
        Tela02 t = new Tela02();
        t.setLocationRelativ­eTo(null);
        t.setVisible(true);  
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void btnBinarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBinarioActionPerformed
         String n = Verificar2.setBinario();
         
         //instacia do objecto Binario
         BinarioFraq b = new BinarioFraq();
         
        b.separar(n);
        
        b.setDecimal();
        /*b.setOctal(b.getDecimal(),n);
        b.setHexa(b.getDecimal(),n);*/
        JOptionPane.showMessageDialog(null,"<html><strong>Binário: </strong>"+n+
                 "<br/><br/><strong>Decimal: </strong>"+/*b.getDecimal()*/b.mostra()+"<br>"+b.mestre()+"<br>resultado> "+b.getDecimal()+/*"<br/><br/>"
                 + "<strong>Octal: </strong>"+b.getOctal()+"<br/><br/>"
                 +"<strong>Hexadecimal: </strong>"+b.getHexa()+*/"</html>");
    }//GEN-LAST:event_btnBinarioActionPerformed

    private void btnOctalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOctalActionPerformed
        String n = Verificar2.setOctal();
        
        //instacia do objecto octal
        OctalFrac o = new OctalFrac();
        
        o.setDecimal(n);
        o.setBinario(o.getDecimal(),n);
        o.setHexa(o.getDecimal(),n);
        JOptionPane.showMessageDialog(null,"<html><><strong>Octal:</strong> "+n
                +"<br><br><strong>Decimal:</strong> "+o.getDecimal()+"<br><br>"
                + "<strong>Binario:</strong> "+o.getBinario()+"<br><br>"
                + "<strong>Hexadecimal:</strong> "+o.getHexa()+"</html>");        
    }//GEN-LAST:event_btnOctalActionPerformed

    private void btnHexaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHexaActionPerformed
            String n = Verificar2.setHexa();
            //instancia do objecto HexaFraq
            HexaFraq o = new HexaFraq();
            
            //Metodos setters do objecto Hexadecimal
            o.setDecimal(n);
            o.setOctal(o.getDecimal(),n);
            o.setBinario(o.getDecimal(),n);
            JOptionPane.showMessageDialog(null,"<html><><strong>Hexadecimal::</strong> "+n
                +"<br><br><strong>Decimal:</strong> "+o.getDecimal()+"<br><br>"
                + "<strong>Binario:</strong> "+o.getBinario()+"<br><br>"
                + "<strong>Octal:</strong> "+o.getOctal()+"</html>");
    }//GEN-LAST:event_btnHexaActionPerformed

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
            java.util.logging.Logger.getLogger(Tela05.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela05.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela05.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela05.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        Tela05 t = new Tela05();
        t.setLocationRelativ­eTo(null);
        t.setVisible(true); 
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBinario;
    private javax.swing.JButton btnDecimal;
    private javax.swing.JButton btnHexa;
    private javax.swing.JButton btnOctal;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
