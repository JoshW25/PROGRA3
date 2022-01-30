/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.calculadora;





public class ventana1 extends javax.swing.JFrame {
    public float primernumero;
    public float segundonumero;
    public String operadornumero;
    
    
   
    
    public ventana1() {
        initComponents();
        setLocationRelativeTo(null);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton19 = new javax.swing.JButton();
        vista = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        borrar = new javax.swing.JButton();
        btndivi = new javax.swing.JButton();
        btnpor = new javax.swing.JButton();
        btnsuma = new javax.swing.JButton();
        btnresta = new javax.swing.JButton();
        btn_sen = new javax.swing.JButton();
        btn_cos = new javax.swing.JButton();
        btn_tan = new javax.swing.JButton();
        btn0 = new javax.swing.JButton();
        btn1 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        btn7 = new javax.swing.JButton();
        btn8 = new javax.swing.JButton();
        btn9 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();

        jButton19.setBackground(new java.awt.Color(0, 255, 255));
        jButton19.setFont(new java.awt.Font("Franklin Gothic Book", 0, 36)); // NOI18N
        jButton19.setForeground(new java.awt.Color(51, 51, 51));
        jButton19.setText("=");
        jButton19.setBorderPainted(false);
        jButton19.setFocusPainted(false);
        jButton19.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton19.setPressedIcon(new javax.swing.ImageIcon("C:\\Users\\movi2\\progra3\\PROGRA3\\CALCULADORA\\src\\img\\btn1.png")); // NOI18N
        jButton19.setRolloverIcon(new javax.swing.ImageIcon("C:\\Users\\movi2\\progra3\\PROGRA3\\CALCULADORA\\src\\img\\btn2.png")); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        setType(java.awt.Window.Type.POPUP);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        vista.setBackground(new java.awt.Color(0, 153, 153));
        vista.setFont(new java.awt.Font("Franklin Gothic Demi Cond", 1, 30)); // NOI18N
        vista.setForeground(new java.awt.Color(51, 51, 51));
        vista.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        getContentPane().add(vista, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 330, 50));

        jPanel2.setBackground(new java.awt.Color(25, 27, 40));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        borrar.setBackground(new java.awt.Color(0, 255, 255));
        borrar.setFont(new java.awt.Font("Franklin Gothic Book", 0, 36)); // NOI18N
        borrar.setForeground(new java.awt.Color(51, 51, 51));
        borrar.setText("C");
        borrar.setBorderPainted(false);
        borrar.setFocusPainted(false);
        borrar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        borrar.setPressedIcon(new javax.swing.ImageIcon("C:\\Users\\movi2\\progra3\\PROGRA3\\CALCULADORA\\src\\img\\btn1.png")); // NOI18N
        borrar.setRolloverIcon(new javax.swing.ImageIcon("C:\\Users\\movi2\\progra3\\PROGRA3\\CALCULADORA\\src\\img\\btn2.png")); // NOI18N
        borrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                borrarActionPerformed(evt);
            }
        });
        jPanel2.add(borrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 50, 50));

        btndivi.setBackground(new java.awt.Color(0, 255, 255));
        btndivi.setFont(new java.awt.Font("Franklin Gothic Book", 0, 36)); // NOI18N
        btndivi.setForeground(new java.awt.Color(51, 51, 51));
        btndivi.setText("/");
        btndivi.setBorderPainted(false);
        btndivi.setFocusPainted(false);
        btndivi.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btndivi.setPressedIcon(new javax.swing.ImageIcon("C:\\Users\\movi2\\progra3\\PROGRA3\\CALCULADORA\\src\\img\\btn1.png")); // NOI18N
        btndivi.setRolloverIcon(new javax.swing.ImageIcon("C:\\Users\\movi2\\progra3\\PROGRA3\\CALCULADORA\\src\\img\\btn2.png")); // NOI18N
        btndivi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndiviActionPerformed(evt);
            }
        });
        jPanel2.add(btndivi, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 200, 50, 50));

        btnpor.setBackground(new java.awt.Color(0, 255, 255));
        btnpor.setFont(new java.awt.Font("Franklin Gothic Book", 0, 36)); // NOI18N
        btnpor.setForeground(new java.awt.Color(51, 51, 51));
        btnpor.setText("x");
        btnpor.setBorderPainted(false);
        btnpor.setFocusPainted(false);
        btnpor.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnpor.setPressedIcon(new javax.swing.ImageIcon("C:\\Users\\movi2\\progra3\\PROGRA3\\CALCULADORA\\src\\img\\btn1.png")); // NOI18N
        btnpor.setRolloverIcon(new javax.swing.ImageIcon("C:\\Users\\movi2\\progra3\\PROGRA3\\CALCULADORA\\src\\img\\btn2.png")); // NOI18N
        btnpor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnporActionPerformed(evt);
            }
        });
        jPanel2.add(btnpor, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 140, 50, 50));

        btnsuma.setBackground(new java.awt.Color(0, 255, 255));
        btnsuma.setFont(new java.awt.Font("Franklin Gothic Book", 0, 36)); // NOI18N
        btnsuma.setForeground(new java.awt.Color(51, 51, 51));
        btnsuma.setText("+");
        btnsuma.setBorderPainted(false);
        btnsuma.setFocusPainted(false);
        btnsuma.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnsuma.setPressedIcon(new javax.swing.ImageIcon("C:\\Users\\movi2\\progra3\\PROGRA3\\CALCULADORA\\src\\img\\btn1.png")); // NOI18N
        btnsuma.setRolloverIcon(new javax.swing.ImageIcon("C:\\Users\\movi2\\progra3\\PROGRA3\\CALCULADORA\\src\\img\\btn2.png")); // NOI18N
        btnsuma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsumaActionPerformed(evt);
            }
        });
        jPanel2.add(btnsuma, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 140, 50, 50));

        btnresta.setBackground(new java.awt.Color(0, 255, 255));
        btnresta.setFont(new java.awt.Font("Franklin Gothic Book", 0, 36)); // NOI18N
        btnresta.setForeground(new java.awt.Color(51, 51, 51));
        btnresta.setText("-");
        btnresta.setBorderPainted(false);
        btnresta.setFocusPainted(false);
        btnresta.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnresta.setPressedIcon(new javax.swing.ImageIcon("C:\\Users\\movi2\\progra3\\PROGRA3\\CALCULADORA\\src\\img\\btn1.png")); // NOI18N
        btnresta.setRolloverIcon(new javax.swing.ImageIcon("C:\\Users\\movi2\\progra3\\PROGRA3\\CALCULADORA\\src\\img\\btn2.png")); // NOI18N
        btnresta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnrestaActionPerformed(evt);
            }
        });
        jPanel2.add(btnresta, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 200, 50, 50));

        btn_sen.setBackground(new java.awt.Color(0, 255, 255));
        btn_sen.setFont(new java.awt.Font("Franklin Gothic Book", 0, 18)); // NOI18N
        btn_sen.setForeground(new java.awt.Color(51, 51, 51));
        btn_sen.setText("^");
        btn_sen.setBorderPainted(false);
        btn_sen.setFocusPainted(false);
        btn_sen.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_sen.setPressedIcon(new javax.swing.ImageIcon("C:\\Users\\movi2\\progra3\\PROGRA3\\CALCULADORA\\src\\img\\btn1.png")); // NOI18N
        btn_sen.setRolloverIcon(new javax.swing.ImageIcon("C:\\Users\\movi2\\progra3\\PROGRA3\\CALCULADORA\\src\\img\\btn2.png")); // NOI18N
        btn_sen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_senActionPerformed(evt);
            }
        });
        jPanel2.add(btn_sen, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 30, 70, 50));

        btn_cos.setBackground(new java.awt.Color(0, 255, 255));
        btn_cos.setFont(new java.awt.Font("Franklin Gothic Book", 0, 18)); // NOI18N
        btn_cos.setForeground(new java.awt.Color(51, 51, 51));
        btn_cos.setText("%");
        btn_cos.setBorderPainted(false);
        btn_cos.setFocusPainted(false);
        btn_cos.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_cos.setPressedIcon(new javax.swing.ImageIcon("C:\\Users\\movi2\\progra3\\PROGRA3\\CALCULADORA\\src\\img\\btn1.png")); // NOI18N
        btn_cos.setRolloverIcon(new javax.swing.ImageIcon("C:\\Users\\movi2\\progra3\\PROGRA3\\CALCULADORA\\src\\img\\btn2.png")); // NOI18N
        btn_cos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cosActionPerformed(evt);
            }
        });
        jPanel2.add(btn_cos, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 30, 70, 50));

        btn_tan.setBackground(new java.awt.Color(0, 255, 255));
        btn_tan.setFont(new java.awt.Font("Franklin Gothic Book", 0, 18)); // NOI18N
        btn_tan.setForeground(new java.awt.Color(51, 51, 51));
        btn_tan.setText(".");
        btn_tan.setBorderPainted(false);
        btn_tan.setFocusPainted(false);
        btn_tan.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_tan.setPressedIcon(new javax.swing.ImageIcon("C:\\Users\\movi2\\progra3\\PROGRA3\\CALCULADORA\\src\\img\\btn1.png")); // NOI18N
        btn_tan.setRolloverIcon(new javax.swing.ImageIcon("C:\\Users\\movi2\\progra3\\PROGRA3\\CALCULADORA\\src\\img\\btn2.png")); // NOI18N
        btn_tan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_tanActionPerformed(evt);
            }
        });
        jPanel2.add(btn_tan, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 30, 70, 50));

        btn0.setBackground(new java.awt.Color(0, 255, 255));
        btn0.setFont(new java.awt.Font("Franklin Gothic Book", 0, 36)); // NOI18N
        btn0.setForeground(new java.awt.Color(51, 51, 51));
        btn0.setText("0");
        btn0.setBorderPainted(false);
        btn0.setFocusPainted(false);
        btn0.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn0.setPressedIcon(new javax.swing.ImageIcon("C:\\Users\\movi2\\progra3\\PROGRA3\\CALCULADORA\\src\\img\\btn1.png")); // NOI18N
        btn0.setRolloverIcon(new javax.swing.ImageIcon("C:\\Users\\movi2\\progra3\\PROGRA3\\CALCULADORA\\src\\img\\btn2.png")); // NOI18N
        btn0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn0ActionPerformed(evt);
            }
        });
        jPanel2.add(btn0, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 260, 70, 50));

        btn1.setBackground(new java.awt.Color(0, 255, 255));
        btn1.setFont(new java.awt.Font("Franklin Gothic Book", 0, 36)); // NOI18N
        btn1.setForeground(new java.awt.Color(51, 51, 51));
        btn1.setText("1");
        btn1.setBorderPainted(false);
        btn1.setFocusPainted(false);
        btn1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn1.setPressedIcon(new javax.swing.ImageIcon("C:\\Users\\movi2\\progra3\\PROGRA3\\CALCULADORA\\src\\img\\btn1.png")); // NOI18N
        btn1.setRolloverIcon(new javax.swing.ImageIcon("C:\\Users\\movi2\\progra3\\PROGRA3\\CALCULADORA\\src\\img\\btn2.png")); // NOI18N
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });
        jPanel2.add(btn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 50, 50));

        btn2.setBackground(new java.awt.Color(0, 255, 255));
        btn2.setFont(new java.awt.Font("Franklin Gothic Book", 0, 36)); // NOI18N
        btn2.setForeground(new java.awt.Color(51, 51, 51));
        btn2.setText("2");
        btn2.setBorderPainted(false);
        btn2.setFocusPainted(false);
        btn2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn2.setPressedIcon(new javax.swing.ImageIcon("C:\\Users\\movi2\\progra3\\PROGRA3\\CALCULADORA\\src\\img\\btn1.png")); // NOI18N
        btn2.setRolloverIcon(new javax.swing.ImageIcon("C:\\Users\\movi2\\progra3\\PROGRA3\\CALCULADORA\\src\\img\\btn2.png")); // NOI18N
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });
        jPanel2.add(btn2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 260, 50, 50));

        btn3.setBackground(new java.awt.Color(0, 255, 255));
        btn3.setFont(new java.awt.Font("Franklin Gothic Book", 0, 36)); // NOI18N
        btn3.setForeground(new java.awt.Color(51, 51, 51));
        btn3.setText("3");
        btn3.setBorderPainted(false);
        btn3.setFocusPainted(false);
        btn3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn3.setPressedIcon(new javax.swing.ImageIcon("C:\\Users\\movi2\\progra3\\PROGRA3\\CALCULADORA\\src\\img\\btn1.png")); // NOI18N
        btn3.setRolloverIcon(new javax.swing.ImageIcon("C:\\Users\\movi2\\progra3\\PROGRA3\\CALCULADORA\\src\\img\\btn2.png")); // NOI18N
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });
        jPanel2.add(btn3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 260, 50, 50));

        btn4.setBackground(new java.awt.Color(0, 255, 255));
        btn4.setFont(new java.awt.Font("Franklin Gothic Book", 0, 36)); // NOI18N
        btn4.setForeground(new java.awt.Color(51, 51, 51));
        btn4.setText("4");
        btn4.setBorderPainted(false);
        btn4.setFocusPainted(false);
        btn4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn4.setPressedIcon(new javax.swing.ImageIcon("C:\\Users\\movi2\\progra3\\PROGRA3\\CALCULADORA\\src\\img\\btn1.png")); // NOI18N
        btn4.setRolloverIcon(new javax.swing.ImageIcon("C:\\Users\\movi2\\progra3\\PROGRA3\\CALCULADORA\\src\\img\\btn2.png")); // NOI18N
        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });
        jPanel2.add(btn4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 50, 50));

        btn5.setBackground(new java.awt.Color(0, 255, 255));
        btn5.setFont(new java.awt.Font("Franklin Gothic Book", 0, 36)); // NOI18N
        btn5.setForeground(new java.awt.Color(51, 51, 51));
        btn5.setText("5");
        btn5.setBorderPainted(false);
        btn5.setFocusPainted(false);
        btn5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn5.setPressedIcon(new javax.swing.ImageIcon("C:\\Users\\movi2\\progra3\\PROGRA3\\CALCULADORA\\src\\img\\btn1.png")); // NOI18N
        btn5.setRolloverIcon(new javax.swing.ImageIcon("C:\\Users\\movi2\\progra3\\PROGRA3\\CALCULADORA\\src\\img\\btn2.png")); // NOI18N
        btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5ActionPerformed(evt);
            }
        });
        jPanel2.add(btn5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 200, 50, 50));

        btn6.setBackground(new java.awt.Color(0, 255, 255));
        btn6.setFont(new java.awt.Font("Franklin Gothic Book", 0, 36)); // NOI18N
        btn6.setForeground(new java.awt.Color(51, 51, 51));
        btn6.setText("6");
        btn6.setBorderPainted(false);
        btn6.setFocusPainted(false);
        btn6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn6.setPressedIcon(new javax.swing.ImageIcon("C:\\Users\\movi2\\progra3\\PROGRA3\\CALCULADORA\\src\\img\\btn1.png")); // NOI18N
        btn6.setRolloverIcon(new javax.swing.ImageIcon("C:\\Users\\movi2\\progra3\\PROGRA3\\CALCULADORA\\src\\img\\btn2.png")); // NOI18N
        btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn6ActionPerformed(evt);
            }
        });
        jPanel2.add(btn6, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 200, 50, 50));

        btn7.setBackground(new java.awt.Color(0, 255, 255));
        btn7.setFont(new java.awt.Font("Franklin Gothic Book", 0, 36)); // NOI18N
        btn7.setForeground(new java.awt.Color(51, 51, 51));
        btn7.setText("7");
        btn7.setBorderPainted(false);
        btn7.setFocusPainted(false);
        btn7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn7.setPressedIcon(new javax.swing.ImageIcon("C:\\Users\\movi2\\progra3\\PROGRA3\\CALCULADORA\\src\\img\\btn1.png")); // NOI18N
        btn7.setRolloverIcon(new javax.swing.ImageIcon("C:\\Users\\movi2\\progra3\\PROGRA3\\CALCULADORA\\src\\img\\btn2.png")); // NOI18N
        btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn7ActionPerformed(evt);
            }
        });
        jPanel2.add(btn7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 50, 50));

        btn8.setBackground(new java.awt.Color(0, 255, 255));
        btn8.setFont(new java.awt.Font("Franklin Gothic Book", 0, 36)); // NOI18N
        btn8.setForeground(new java.awt.Color(51, 51, 51));
        btn8.setText("8");
        btn8.setBorderPainted(false);
        btn8.setFocusPainted(false);
        btn8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn8.setPressedIcon(new javax.swing.ImageIcon("C:\\Users\\movi2\\progra3\\PROGRA3\\CALCULADORA\\src\\img\\btn1.png")); // NOI18N
        btn8.setRolloverIcon(new javax.swing.ImageIcon("C:\\Users\\movi2\\progra3\\PROGRA3\\CALCULADORA\\src\\img\\btn2.png")); // NOI18N
        btn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn8ActionPerformed(evt);
            }
        });
        jPanel2.add(btn8, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 140, 50, 50));

        btn9.setBackground(new java.awt.Color(0, 255, 255));
        btn9.setFont(new java.awt.Font("Franklin Gothic Book", 0, 36)); // NOI18N
        btn9.setForeground(new java.awt.Color(51, 51, 51));
        btn9.setText("9");
        btn9.setBorderPainted(false);
        btn9.setFocusPainted(false);
        btn9.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn9.setPressedIcon(new javax.swing.ImageIcon("C:\\Users\\movi2\\progra3\\PROGRA3\\CALCULADORA\\src\\img\\btn1.png")); // NOI18N
        btn9.setRolloverIcon(new javax.swing.ImageIcon("C:\\Users\\movi2\\progra3\\PROGRA3\\CALCULADORA\\src\\img\\btn2.png")); // NOI18N
        btn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn9ActionPerformed(evt);
            }
        });
        jPanel2.add(btn9, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 140, 50, 50));

        jButton1.setBackground(new java.awt.Color(0, 153, 153));
        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jButton1.setText("=");
        jButton1.setBorderPainted(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 260, 50, 50));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 360, 350));

        jPanel1.setBackground(new java.awt.Color(0, 204, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 360, 140));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void borrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_borrarActionPerformed
        
        vista.setText("");
        
        
        
        
        
        
    }//GEN-LAST:event_borrarActionPerformed

    private void btn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn7ActionPerformed
        addNumber("7");
    }//GEN-LAST:event_btn7ActionPerformed

    private void btn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn8ActionPerformed
        addNumber("8");
    }//GEN-LAST:event_btn8ActionPerformed

    private void btn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn9ActionPerformed
        addNumber("9");    }//GEN-LAST:event_btn9ActionPerformed

    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed
        // TODO add your handling code here:
        addNumber("4");
    }//GEN-LAST:event_btn4ActionPerformed

    private void btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5ActionPerformed
        // TODO add your handling code here:
        addNumber("5");
    }//GEN-LAST:event_btn5ActionPerformed

    private void btn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn6ActionPerformed
        // TODO add your handling code here:
        addNumber("6");
    }//GEN-LAST:event_btn6ActionPerformed

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
        // TODO add your handling code here:
        addNumber("1");
    }//GEN-LAST:event_btn1ActionPerformed

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
        // TODO add your handling code here:
        addNumber("2");
    }//GEN-LAST:event_btn2ActionPerformed

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
        // TODO add your handling code here:
        addNumber("3");
    }//GEN-LAST:event_btn3ActionPerformed

    private void btn0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn0ActionPerformed
        // TODO add your handling code here:
        addNumber("0");
    }//GEN-LAST:event_btn0ActionPerformed

    private void btndiviActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndiviActionPerformed
        // TODO add your handling code here:
        
        
    }//GEN-LAST:event_btndiviActionPerformed

    private void btnrestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnrestaActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_btnrestaActionPerformed

    private void btnporActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnporActionPerformed
        // TODO add your handling code here:
         this.primernumero=Float.parseFloat(this.vista.getText());
       this.operadornumero="*";
       this.vista.setText("");
       
    }//GEN-LAST:event_btnporActionPerformed

    private void btnsumaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsumaActionPerformed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_btnsumaActionPerformed

    private void btn_senActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_senActionPerformed
        // TODO add your handling code here:
         
    }//GEN-LAST:event_btn_senActionPerformed

    private void btn_cosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cosActionPerformed
        // TODO add your handling code here:
          t
    }//GEN-LAST:event_btn_cosActionPerformed

    private void btn_tanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_tanActionPerformed
        // TODO add your handling code here:
        addNumber(".");
    }//GEN-LAST:event_btn_tanActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      this.segundonumero=Float.parseFloat(this.vista.getText());
      
      switch(this.operadornumero){
          
          
          case "*": this.vista.setText(Float.toString(this.primernumero*this.segundonumero));break;
          
           // TODO add your handling code here:

          
        
      }
        
    }//GEN-LAST:event_jButton1ActionPerformed

     
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
            java.util.logging.Logger.getLogger(ventana1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ventana1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ventana1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ventana1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ventana1().setVisible(true);
            }
        });
    }
    public void addNumber(String digito){
        vista.setText(vista.getText()+digito);
    }
            

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton borrar;
    private javax.swing.JButton btn0;
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btn7;
    private javax.swing.JButton btn8;
    private javax.swing.JButton btn9;
    private javax.swing.JButton btn_cos;
    private javax.swing.JButton btn_sen;
    private javax.swing.JButton btn_tan;
    private javax.swing.JButton btndivi;
    private javax.swing.JButton btnpor;
    private javax.swing.JButton btnresta;
    private javax.swing.JButton btnsuma;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton19;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel vista;
    // End of variables declaration//GEN-END:variables
}
