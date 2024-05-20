package com.moiseslpz.view;

import com.moiseslpz.controller.convertCurrency;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;

public class mainView extends javax.swing.JFrame {
    
    String fromCurrency;
    String fromCurrencyValue;
    String toCurrency;
    String toCurrencyValue;

    public String getToCurrency() {
        return toCurrency;
    }

    public String getToCurrencyValue() {
        return toCurrencyValue;
    }

    public String getFromCurrency() {
        return fromCurrency;
    }

    public String getFromCurrencyValue() {
        return fromCurrencyValue;
    }

    public void setToCurrencyValue(String toCurrencyValue) {
        this.toCurrencyValue = toCurrencyValue;
    }
    
    
    
    public mainView() {
        initComponents();
        this.setTitle("CURRENCY CONVERTER");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        addItem();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fromCurrencyJTF = new javax.swing.JTextField();
        fromCurrencyJCB = new javax.swing.JComboBox<>();
        toCurrencyJTF = new javax.swing.JTextField();
        toCurrencyJCB = new javax.swing.JComboBox<>();
        clearBTN = new javax.swing.JButton();
        infoBTN = new javax.swing.JButton();
        convertBTN = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        fromCurrencyJTF.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        fromCurrencyJTF.setText("0");
        fromCurrencyJTF.setToolTipText("");
        fromCurrencyJTF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                fromCurrencyJTFKeyTyped(evt);
            }
        });

        toCurrencyJTF.setEditable(false);
        toCurrencyJTF.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        toCurrencyJTF.setText("0");

        clearBTN.setText("CLEAR");
        clearBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearBTNActionPerformed(evt);
            }
        });

        infoBTN.setText("ABOUT");
        infoBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                infoBTNActionPerformed(evt);
            }
        });

        convertBTN.setText("CONVERT");
        convertBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                convertBTNActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(clearBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(infoBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(convertBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(fromCurrencyJTF, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fromCurrencyJCB, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(toCurrencyJTF, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(toCurrencyJCB, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fromCurrencyJTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fromCurrencyJCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(toCurrencyJTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(toCurrencyJCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(clearBTN)
                    .addComponent(infoBTN)
                    .addComponent(convertBTN))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void infoBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_infoBTNActionPerformed
        JOptionPane.showMessageDialog(null, "Moisés López-Sánchez \n ALURA LATAM - G6","CHALLENG", JOptionPane.INFORMATION_MESSAGE);
        fromCurrencyJTF.requestFocus();
    }//GEN-LAST:event_infoBTNActionPerformed

    private void clearBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearBTNActionPerformed
        fromCurrencyJTF.setText("0");
        toCurrencyJTF.setText("0");
        fromCurrencyJTF.requestFocus();
    }//GEN-LAST:event_clearBTNActionPerformed

    private void fromCurrencyJTFKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fromCurrencyJTFKeyTyped
        char caracter = evt.getKeyChar();
        if (((caracter < '0') || (caracter > '9')) && (caracter != KeyEvent.VK_BACK_SPACE) && (caracter != '.' || fromCurrencyJTF.getText().contains(".")) ) {
            evt.consume();
        }
    }//GEN-LAST:event_fromCurrencyJTFKeyTyped

    private void convertBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_convertBTNActionPerformed
        
        convertCurrency convert = new convertCurrency();
        String A = fromCurrencyJCB.getSelectedItem().toString();
        String B = toCurrencyJCB.getSelectedItem().toString();
        
        if (A == null ? B == null : A.equals(B)) {
            JOptionPane.showMessageDialog(null, "Misma moneda a convertir");
        } else {
            fromCurrency = fromCurrencyJCB.getSelectedItem().toString();
            toCurrency = toCurrencyJCB.getSelectedItem().toString();
            double fromValue = Double.parseDouble(fromCurrencyJTF.getText());
            double toValue = Double.parseDouble(convert.requestAPI(fromCurrency, toCurrency));
            double total = fromValue * toValue;
            toCurrencyJTF.setText(Double.toString(total));
            
            
        }
    }//GEN-LAST:event_convertBTNActionPerformed
    
    private void addItem(){
        // Peso Mexicano
        fromCurrencyJCB.addItem("MXN");
        toCurrencyJCB.addItem("MXN");
        // Dolar Americano
        fromCurrencyJCB.addItem("USD");
        toCurrencyJCB.addItem("USD");
        // Euro
        fromCurrencyJCB.addItem("EUR");
        toCurrencyJCB.addItem("EUR");
    }
    
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new mainView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton clearBTN;
    private javax.swing.JButton convertBTN;
    private javax.swing.JComboBox<String> fromCurrencyJCB;
    private javax.swing.JTextField fromCurrencyJTF;
    private javax.swing.JButton infoBTN;
    private javax.swing.JComboBox<String> toCurrencyJCB;
    private javax.swing.JTextField toCurrencyJTF;
    // End of variables declaration//GEN-END:variables
}
