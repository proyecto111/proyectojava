/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinal1.vista;

/**
 *
 * @author PC
 */
public class ventanaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form ventanaPrincipal
     */
    public ventanaPrincipal() {
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

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        botonMenu = new proyectofinal1.recursos.rsbuttom.RSButtonMetro();
        panelSesion = new javax.swing.JPanel();
        etiquetaUsuario = new javax.swing.JLabel();
        panelMenu = new javax.swing.JPanel();
        rSButtonMetro2 = new proyectofinal1.recursos.rsbuttom.RSButtonMetro();
        rSButtonMetro3 = new proyectofinal1.recursos.rsbuttom.RSButtonMetro();
        botonProduccion = new proyectofinal1.recursos.rsbuttom.RSButtonMetro();
        rSButtonMetro5 = new proyectofinal1.recursos.rsbuttom.RSButtonMetro();
        rSButtonMetro6 = new proyectofinal1.recursos.rsbuttom.RSButtonMetro();
        rSButtonMetro7 = new proyectofinal1.recursos.rsbuttom.RSButtonMetro();
        contenedorFrames = new javax.swing.JPanel();
        tarjetas = new javax.swing.JPanel();
        rSButtonMetro1 = new proyectofinal1.recursos.rsbuttom.RSButtonMetro();
        tarjetaProduccion = new proyectofinal1.recursos.rsbuttom.RSButtonMetro();
        tarjetaGastos = new proyectofinal1.recursos.rsbuttom.RSButtonMetro();
        tarjetaInsumos = new proyectofinal1.recursos.rsbuttom.RSButtonMetro();
        rSButtonMetro11 = new proyectofinal1.recursos.rsbuttom.RSButtonMetro();
        rSButtonMetro12 = new proyectofinal1.recursos.rsbuttom.RSButtonMetro();
        panelProduccion = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaProduccion = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(0, 102, 255));
        jPanel2.setPreferredSize(new java.awt.Dimension(30, 459));

        botonMenu.setBackground(new java.awt.Color(0, 102, 255));
        botonMenu.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        botonMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectofinal1/recursos/img/menu.png"))); // NOI18N
        botonMenu.setBorderPainted(false);
        botonMenu.setColorBorde(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        botonMenu.setColorHover(new java.awt.Color(0, 204, 255));
        botonMenu.setColorNormal(new java.awt.Color(0, 102, 255));
        botonMenu.setColorPressed(new java.awt.Color(255, 255, 255));

        panelSesion.setOpaque(false);

        javax.swing.GroupLayout panelSesionLayout = new javax.swing.GroupLayout(panelSesion);
        panelSesion.setLayout(panelSesionLayout);
        panelSesionLayout.setHorizontalGroup(
            panelSesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 129, Short.MAX_VALUE)
        );
        panelSesionLayout.setVerticalGroup(
            panelSesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 44, Short.MAX_VALUE)
        );

        etiquetaUsuario.setForeground(new java.awt.Color(255, 255, 255));
        etiquetaUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectofinal1/recursos/img/usuario.png"))); // NOI18N
        etiquetaUsuario.setText("--");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(botonMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(722, 722, 722)
                .addComponent(etiquetaUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelSesion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelSesion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(etiquetaUsuario)
                            .addComponent(botonMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        panelMenu.setBackground(new java.awt.Color(51, 51, 51));

        rSButtonMetro2.setText("Gastos");
        rSButtonMetro2.setColorHover(new java.awt.Color(102, 102, 102));
        rSButtonMetro2.setColorNormal(new java.awt.Color(51, 51, 51));
        rSButtonMetro2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonMetro2ActionPerformed(evt);
            }
        });

        rSButtonMetro3.setText("Insumos");
        rSButtonMetro3.setColorHover(new java.awt.Color(102, 102, 102));
        rSButtonMetro3.setColorNormal(new java.awt.Color(52, 51, 51));
        rSButtonMetro3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonMetro3ActionPerformed(evt);
            }
        });

        botonProduccion.setText("Produccion");
        botonProduccion.setColorHover(new java.awt.Color(102, 102, 102));
        botonProduccion.setColorNormal(new java.awt.Color(51, 51, 51));
        botonProduccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonProduccionActionPerformed(evt);
            }
        });

        rSButtonMetro5.setText("pedidos/envios");
        rSButtonMetro5.setColorHover(new java.awt.Color(102, 102, 102));
        rSButtonMetro5.setColorNormal(new java.awt.Color(51, 51, 51));
        rSButtonMetro5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonMetro5ActionPerformed(evt);
            }
        });

        rSButtonMetro6.setText("Estadisticas");
        rSButtonMetro6.setColorHover(new java.awt.Color(102, 102, 102));
        rSButtonMetro6.setColorNormal(new java.awt.Color(51, 51, 51));

        rSButtonMetro7.setText("Configuracion");
        rSButtonMetro7.setColorHover(new java.awt.Color(102, 102, 102));
        rSButtonMetro7.setColorNormal(new java.awt.Color(51, 51, 51));

        javax.swing.GroupLayout panelMenuLayout = new javax.swing.GroupLayout(panelMenu);
        panelMenu.setLayout(panelMenuLayout);
        panelMenuLayout.setHorizontalGroup(
            panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(rSButtonMetro6, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE)
            .addComponent(rSButtonMetro5, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addComponent(botonProduccion, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addComponent(rSButtonMetro3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addComponent(rSButtonMetro2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addComponent(rSButtonMetro7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        panelMenuLayout.setVerticalGroup(
            panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMenuLayout.createSequentialGroup()
                .addComponent(rSButtonMetro2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(rSButtonMetro3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(botonProduccion, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(rSButtonMetro5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(rSButtonMetro6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(rSButtonMetro7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        contenedorFrames.setBackground(new java.awt.Color(255, 255, 255));
        contenedorFrames.setLayout(new java.awt.CardLayout());

        tarjetas.setBackground(new java.awt.Color(255, 255, 255));

        rSButtonMetro1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectofinal1/recursos/img/viaje200.png"))); // NOI18N
        rSButtonMetro1.setOpaque(false);

        tarjetaProduccion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectofinal1/recursos/img/insumos200.png"))); // NOI18N
        tarjetaProduccion.setOpaque(false);

        tarjetaGastos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectofinal1/recursos/img/gastos200.png"))); // NOI18N
        tarjetaGastos.setOpaque(false);

        tarjetaInsumos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectofinal1/recursos/img/insum200.png"))); // NOI18N
        tarjetaInsumos.setOpaque(false);

        rSButtonMetro11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectofinal1/recursos/img/configuracion200.png"))); // NOI18N
        rSButtonMetro11.setOpaque(false);

        rSButtonMetro12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectofinal1/recursos/img/estadisticas200.png"))); // NOI18N
        rSButtonMetro12.setOpaque(false);

        javax.swing.GroupLayout tarjetasLayout = new javax.swing.GroupLayout(tarjetas);
        tarjetas.setLayout(tarjetasLayout);
        tarjetasLayout.setHorizontalGroup(
            tarjetasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tarjetasLayout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addGroup(tarjetasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rSButtonMetro1, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tarjetaGastos, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addGroup(tarjetasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tarjetaInsumos, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rSButtonMetro12, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addGroup(tarjetasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rSButtonMetro11, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tarjetaProduccion, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(118, 147, Short.MAX_VALUE))
        );
        tarjetasLayout.setVerticalGroup(
            tarjetasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tarjetasLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(tarjetasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tarjetaInsumos, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tarjetaGastos, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tarjetaProduccion, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 72, Short.MAX_VALUE)
                .addGroup(tarjetasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rSButtonMetro12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rSButtonMetro1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rSButtonMetro11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40))
        );

        contenedorFrames.add(tarjetas, "card2");

        panelProduccion.setBackground(new java.awt.Color(255, 255, 255));
        panelProduccion.setFocusable(false);

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));

        tablaProduccion.setBackground(new java.awt.Color(255, 255, 255));
        tablaProduccion.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tablaProduccion.setOpaque(false);
        jScrollPane1.setViewportView(tablaProduccion);

        javax.swing.GroupLayout panelProduccionLayout = new javax.swing.GroupLayout(panelProduccion);
        panelProduccion.setLayout(panelProduccionLayout);
        panelProduccionLayout.setHorizontalGroup(
            panelProduccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelProduccionLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 746, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(94, Short.MAX_VALUE))
        );
        panelProduccionLayout.setVerticalGroup(
            panelProduccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelProduccionLayout.createSequentialGroup()
                .addGap(140, 140, 140)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(161, Short.MAX_VALUE))
        );

        contenedorFrames.add(panelProduccion, "card3");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 1012, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(panelMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(contenedorFrames, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(contenedorFrames, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rSButtonMetro3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonMetro3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rSButtonMetro3ActionPerformed

    private void rSButtonMetro5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonMetro5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rSButtonMetro5ActionPerformed

    private void rSButtonMetro2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonMetro2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rSButtonMetro2ActionPerformed

    private void botonProduccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonProduccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonProduccionActionPerformed

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
            java.util.logging.Logger.getLogger(ventanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ventanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ventanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ventanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ventanaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public proyectofinal1.recursos.rsbuttom.RSButtonMetro botonMenu;
    public proyectofinal1.recursos.rsbuttom.RSButtonMetro botonProduccion;
    public javax.swing.JPanel contenedorFrames;
    public javax.swing.JLabel etiquetaUsuario;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JPanel panelMenu;
    public javax.swing.JPanel panelProduccion;
    public javax.swing.JPanel panelSesion;
    private proyectofinal1.recursos.rsbuttom.RSButtonMetro rSButtonMetro1;
    private proyectofinal1.recursos.rsbuttom.RSButtonMetro rSButtonMetro11;
    private proyectofinal1.recursos.rsbuttom.RSButtonMetro rSButtonMetro12;
    private proyectofinal1.recursos.rsbuttom.RSButtonMetro rSButtonMetro2;
    private proyectofinal1.recursos.rsbuttom.RSButtonMetro rSButtonMetro3;
    private proyectofinal1.recursos.rsbuttom.RSButtonMetro rSButtonMetro5;
    private proyectofinal1.recursos.rsbuttom.RSButtonMetro rSButtonMetro6;
    private proyectofinal1.recursos.rsbuttom.RSButtonMetro rSButtonMetro7;
    public javax.swing.JTable tablaProduccion;
    public proyectofinal1.recursos.rsbuttom.RSButtonMetro tarjetaGastos;
    public proyectofinal1.recursos.rsbuttom.RSButtonMetro tarjetaInsumos;
    private proyectofinal1.recursos.rsbuttom.RSButtonMetro tarjetaProduccion;
    public javax.swing.JPanel tarjetas;
    // End of variables declaration//GEN-END:variables
}
