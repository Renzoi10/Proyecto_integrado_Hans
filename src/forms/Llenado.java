/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forms;
import clases.*;
/**
 *
 * @author Renzo
 */
public class Llenado extends javax.swing.JPanel {

    float radtubo,velagua,radtq,htq;
        
    int[] ttotal = new int[3]; 
    
    public Llenado() {
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

        jLabel8 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        radtub = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        cerrar = new javax.swing.JButton();
        calcular = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        velagu = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        radres = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        altres = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        limpiar = new javax.swing.JButton();
        txt_resultado = new javax.swing.JTextField();
        Fondo = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("Ingrese los siguientes datos para calcular el caudal de ingreso :");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Radio de la tuber??a:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, -1));

        radtub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radtubActionPerformed(evt);
            }
        });
        add(radtub, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 50, 80, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("m");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 55, -1, -1));

        cerrar.setText("CERRAR");
        cerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cerrarActionPerformed(evt);
            }
        });
        add(cerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 270, 110, -1));

        calcular.setText("CALCULAR");
        calcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calcularActionPerformed(evt);
            }
        });
        add(calcular, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, 120, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Tiempo de llenado :");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 335, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Velocidad de circulaci??n del agua:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, -1));
        add(velagu, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 90, 80, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("m/s");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 95, -1, 20));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("Ingrese los datos sobre el reservorio :");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, -1, -1));

        radres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radresActionPerformed(evt);
            }
        });
        add(radres, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 170, 80, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Radio del reservorio:");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, -1, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Altura del reservorio:");
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, -1, -1));
        add(altres, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 210, 80, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("m");
        add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 175, -1, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("m");
        add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 215, -1, -1));

        limpiar.setText("LIMPIAR");
        limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limpiarActionPerformed(evt);
            }
        });
        add(limpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 270, 110, -1));
        add(txt_resultado, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 330, 180, 30));

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Fondo2.jpeg"))); // NOI18N
        add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 460, 400));
    }// </editor-fold>//GEN-END:initComponents

    private void radtubActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radtubActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radtubActionPerformed

    private void calcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calcularActionPerformed
        // TODO add your handling code here
        
        radtubo = Float.parseFloat(radtub.getText()); //
        velagua = Float.parseFloat(velagu.getText()); //
        radtq = Float.parseFloat(radres.getText());
        htq = Float.parseFloat(altres.getText());
        txt_resultado.setEditable(false); // evita que el campo 5 se edite
        Simulacions simu= new Simulacions();
        Tanque tq= new Tanque(radtubo, radtq, radtq, velagua, radtq, radtq);

        ttotal = tq.tiempo();

        System.out.println(ttotal[0]);
        System.out.println(ttotal[1]);
        System.out.println(ttotal[2]);
        if (ttotal[0]==0){
            if(ttotal[1]==0){ // si horas=0 y si minutos=0
                txt_resultado.setText(String.valueOf(ttotal[2])+" s"); }
            else{
                txt_resultado.setText(String.valueOf(ttotal[1])+" m  "+String.valueOf(ttotal[2])+" s");}//imprime hrs+min+seg
        }else{
            System.out.println("horas");
            txt_resultado.setText(String.valueOf(ttotal[0])+" h  "+String.valueOf(ttotal[1])+" m  "+String.valueOf(ttotal[2])+" s");//imprime hrs+min+seg
        }
        
        simu.tiempollenado.start();
        
        
         
    }//GEN-LAST:event_calcularActionPerformed

    private void cerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cerrarActionPerformed
        System.exit(0);
        
    }//GEN-LAST:event_cerrarActionPerformed

    private void radresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radresActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radresActionPerformed

    private void limpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpiarActionPerformed
        radtub.setText("");
        velagu.setText("");
        radres.setText("");
        altres.setText("");
        txt_resultado.setText("");
    }//GEN-LAST:event_limpiarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Fondo;
    public javax.swing.JTextField altres;
    private javax.swing.JButton calcular;
    private javax.swing.JButton cerrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JButton limpiar;
    public javax.swing.JTextField radres;
    private javax.swing.JTextField radtub;
    private javax.swing.JTextField txt_resultado;
    private javax.swing.JTextField velagu;
    // End of variables declaration//GEN-END:variables
}
