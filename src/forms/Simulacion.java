/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forms;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import static java.lang.System.exit;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.UIManager;

/**
 *
 * @author USUARIO
 */
public class Simulacion extends javax.swing.JFrame {
    
    FondoPanel2 fondo = new FondoPanel2();
    
    
    int seg;
    
    Thread tiempollenado = new Thread(){
        public void run(){
            try{
                for(seg = 0; seg<=100; seg++){
                    reservorio.setValue(seg);
                    tiempollenado.sleep(100);
                }
            }catch(Exception e){
            }
        }
    };
    Thread tiempotubollenado = new Thread(){
        public void run(){
            try{
                for(int i=1; i<=100; i++){
                    tubollenado.setValue(i);
                    tiempotubollenado.sleep(1);
                }
            }catch(Exception e){
            }
        }
    };
    Thread tiempovaciado = new Thread(){
        public void run(){
            try{
                for(int i=seg; i>=0; seg--){
                    reservorio.setValue(seg);
                    tiempovaciado.sleep(100);
                    if(seg==0){
                       tubovaciado.setValue(0); 
                    }
                }
            }catch(Exception e){
            }
        }
    };
    
    Thread tiempotubovaciado = new Thread(){
        public void run(){
            try{
                for(int i=1; i<=100; i++){
                    tubollenado.setValue(0);
                    tubovaciado.setValue(i);
                    tiempotubovaciado.sleep(1);
                }
            }catch(Exception e){
            }
        }
    };

    public Simulacion() {
        initComponents();
        if(reservorio){
            
        }
        botonvaciado.setVisible(false);
        
        this.setLocationRelativeTo(null);
        UIManager.put( "nimbusOrange", new Color(   38, 139, 210 ) );    
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new FondoPanel2();
        reservorio = new javax.swing.JProgressBar();
        tubollenado = new javax.swing.JProgressBar();
        tubovaciado = new javax.swing.JProgressBar();
        botonllenado = new javax.swing.JButton();
        botonvaciado = new javax.swing.JButton();
        fondosimu = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        reservorio.setOrientation(1);
        reservorio.setToolTipText("1");
        reservorio.setPreferredSize(new java.awt.Dimension(146, 250));
        reservorio.setRequestFocusEnabled(false);
        jPanel1.add(reservorio, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 50, 170, 259));

        tubollenado.setPreferredSize(new java.awt.Dimension(146, 25));
        jPanel1.add(tubollenado, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 120, -1));

        tubovaciado.setPreferredSize(new java.awt.Dimension(146, 25));
        jPanel1.add(tubovaciado, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 280, 110, -1));

        botonllenado.setText("Llenado");
        botonllenado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonllenadoActionPerformed(evt);
            }
        });
        jPanel1.add(botonllenado, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 320, -1, -1));

        botonvaciado.setText("Vaciado");
        botonvaciado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonvaciadoActionPerformed(evt);
            }
        });
        jPanel1.add(botonvaciado, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 320, -1, -1));
        jPanel1.add(fondosimu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 400));

        jButton1.setText("X");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 10, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 382, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 401, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonllenadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonllenadoActionPerformed
        tiempollenado.start();
        botonllenado.setVisible(false);
        tiempotubollenado.start();
    }//GEN-LAST:event_botonllenadoActionPerformed

    private void botonvaciadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonvaciadoActionPerformed
        tiempovaciado.start();
        botonvaciado.setVisible(false);
        tiempotubovaciado.start();
    }//GEN-LAST:event_botonvaciadoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        exit(0);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Simulacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Simulacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Simulacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Simulacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Simulacion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonllenado;
    private javax.swing.JButton botonvaciado;
    private javax.swing.JLabel fondosimu;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JProgressBar reservorio;
    private javax.swing.JProgressBar tubollenado;
    private javax.swing.JProgressBar tubovaciado;
    // End of variables declaration//GEN-END:variables
    class FondoPanel2 extends JPanel{
        private Image imagen;

        @Override
        public void paint(Graphics g){
            imagen = new ImageIcon(getClass().getResource("../imagenes/fondosimu.png")).getImage();

            g.drawImage(imagen,0,0, getWidth(),getHeight(),this);

            setOpaque(false);

            super.paint(g);
        }
    }
}
