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
        txt1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cerrar = new javax.swing.JButton();
        enviar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        tiempo = new javax.swing.JScrollPane();
        txt_resultado = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        txt2 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txt3 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txt4 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        Fondo = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("Ingrese los siguientes datos para calcular el caudal de ingreso :");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        jLabel2.setText("Radio de la tubería:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));

        txt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt1ActionPerformed(evt);
            }
        });
        add(txt1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 60, 80, -1));

        jLabel4.setText("m");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 60, -1, -1));

        jLabel5.setText("m");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 60, -1, -1));

        cerrar.setText("CERRAR");
        cerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cerrarActionPerformed(evt);
            }
        });
        add(cerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 270, 110, -1));

        enviar.setText("CALCULAR");
        enviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enviarActionPerformed(evt);
            }
        });
        add(enviar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, 120, -1));

        jLabel1.setText("Tiempo de llenado :");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, -1, -1));

        tiempo.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        tiempo.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        txt_resultado.setEditable(false);
        txt_resultado.setColumns(20);
        txt_resultado.setRows(5);
        tiempo.setViewportView(txt_resultado);

        add(tiempo, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 340, 240, 30));

        jLabel3.setText("Velcidad de circulación del agua:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, -1));
        add(txt2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 100, 80, -1));

        jLabel6.setText("m/s");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 100, 34, 23));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("Ingrese los datos sobre el reservorio :");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, -1, -1));

        txt3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt3ActionPerformed(evt);
            }
        });
        add(txt3, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 170, 80, -1));

        jLabel7.setText("Radio del reservorio:");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, -1, -1));

        jLabel10.setText("Altura del reservorio:");
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, -1, -1));
        add(txt4, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 210, 80, -1));

        jLabel11.setText("m");
        add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 180, -1, -1));

        jLabel12.setText("m");
        add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 220, -1, -1));

        jButton1.setText("LIMPIAR");
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 270, 110, -1));

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Fondo2.jpeg"))); // NOI18N
        add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 460, 400));
    }// </editor-fold>//GEN-END:initComponents

    private void txt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt1ActionPerformed

    private void enviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enviarActionPerformed
        // TODO add your handling code here

        radtubo = Float.parseFloat(txt1.getText()); //obtiene el caudal desde el campo 1
        velagua = Float.parseFloat(txt2.getText()); //obtiene el volumen desde el usuario
        radtq = Float.parseFloat(txt3.getText());
        htq = Float.parseFloat(txt4.getText());
        txt_resultado.setEditable(false); // evita que el campo 5 se edite

        tanque tq= new tanque(radtubo, radtq, radtq, velagua, radtq, radtq);

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
    }//GEN-LAST:event_enviarActionPerformed

    private void cerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cerrarActionPerformed
        System.exit(0);
        
    }//GEN-LAST:event_cerrarActionPerformed

    private void txt3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Fondo;
    private javax.swing.JButton cerrar;
    private javax.swing.JButton enviar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane tiempo;
    private javax.swing.JTextField txt1;
    private javax.swing.JTextField txt2;
    private javax.swing.JTextField txt3;
    private javax.swing.JTextField txt4;
    private javax.swing.JTextArea txt_resultado;
    // End of variables declaration//GEN-END:variables
}
