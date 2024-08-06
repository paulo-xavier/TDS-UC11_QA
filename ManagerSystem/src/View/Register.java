package View;
import java.time.LocalDate;
/*import java.time.Period;*/

import java.time.*;   

public class Register extends javax.swing.JFrame {
    
    public String endingDate; 
    public String startingDate; 
    public int personType; 
    public int bikeType;
    public long days;
    public long bikeValue;
    public long daysDiscount;
    
    public Register() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtPersonType = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtBikeType = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        txtStartingDate = new javax.swing.JFormattedTextField();
        jLabel5 = new javax.swing.JLabel();
        txtEndingDate = new javax.swing.JFormattedTextField();
        calculateButton = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        finalValue = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI Historic", 1, 18)); // NOI18N
        jLabel1.setText(" Bike Rental");

        txtPersonType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Student", "Employee" }));
        txtPersonType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPersonTypeActionPerformed(evt);
            }
        });

        jLabel2.setText("Person type");

        jLabel3.setText("Bike");

        txtBikeType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Normal", "Electric" }));
        txtBikeType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBikeTypeActionPerformed(evt);
            }
        });

        jLabel4.setText("Starting date");

        try {
            txtStartingDate.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####-##-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtStartingDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtStartingDateActionPerformed(evt);
            }
        });

        jLabel5.setText("Ending date");

        try {
            txtEndingDate.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####-##-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtEndingDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEndingDateActionPerformed(evt);
            }
        });

        calculateButton.setBackground(new java.awt.Color(12, 255, 255));
        calculateButton.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        calculateButton.setForeground(new java.awt.Color(12, 12, 12));
        calculateButton.setText("Calculate");
        calculateButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                calculateButtonMouseClicked(evt);
            }
        });
        calculateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calculateButtonActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setText("Final value");

        finalValue.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        finalValue.setText("0");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(245, 245, 245)
                .addComponent(calculateButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(192, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(45, 45, 45)
                                .addComponent(finalValue, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(27, 27, 27)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtPersonType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtBikeType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtStartingDate, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)
                                    .addComponent(txtEndingDate))))
                        .addGap(144, 144, 144))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(234, 234, 234))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPersonType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtBikeType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtStartingDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtEndingDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addComponent(calculateButton)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(finalValue))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtPersonTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPersonTypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPersonTypeActionPerformed

    private void txtBikeTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBikeTypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBikeTypeActionPerformed

    private void txtStartingDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtStartingDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtStartingDateActionPerformed

    private void txtEndingDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEndingDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEndingDateActionPerformed

    private void calculateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calculateButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_calculateButtonActionPerformed

    private void calculateButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_calculateButtonMouseClicked
      
        /*Values received from the interface*/
        this.endingDate = txtEndingDate.getText(); 
        this.startingDate = txtStartingDate.getText();
        this.personType = (Integer) txtPersonType.getSelectedItem();
        this.bikeType = (Integer) txtBikeType.getSelectedItem(); 
        
        this.days = calculateDays();
  
        this.bikeValue = bikeFinalValue();
        
        daysDiscountValue();
      
        printInfoInScreen();
          
    }//GEN-LAST:event_calculateButtonMouseClicked

    public long calculateDays() {
        /*Convert to Date*/
        LocalDate endingDateConverted = LocalDate.parse(this.endingDate);
        LocalDate startingDateConverted = LocalDate.parse(this.startingDate); 
        
        long daysResult = Duration.between(endingDateConverted.atStartOfDay(), startingDateConverted.atStartOfDay()).toDays(); 
        
        return daysResult;
    }
    
    public long bikeFinalValue() {
    
        switch (this.personType) {
            case 0 -> { 
                if (this.bikeType == 0) {
                    long total = (long) (25 - (0.5*25));
                    
                    return total;
                    
                } else {
                    return (long) (45 - (0.5*45));
                
                }
            }
                
            case 1 -> {
                if (this.bikeType == 0) {
                    long total = (long) (25 - (0.10 * 25));
                    
                    return total;
                
                } else {
                    long total = (long) (45 - (0.10 * 45));
                    
                    return total;
                }
            }
                
            default -> { 
                return 000;
            }
            
        }
    }
    
    public long daysDiscountValue() {
        if (this.days > 20) {
 
            this.bikeValue -= ((long) this.bikeType - (this.bikeValue * 0.10));
        
        } else {
            return 0;
        }        
        return 0;

    }
    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(() -> {
            new Register().setVisible(true);
        });
    }
    
    public void printInfoInScreen() {
        this.finalValue.setText(Long.toString(this.bikeValue));
    }
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton calculateButton;
    private javax.swing.JLabel finalValue;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JComboBox<String> txtBikeType;
    private javax.swing.JFormattedTextField txtEndingDate;
    private javax.swing.JComboBox<String> txtPersonType;
    private javax.swing.JFormattedTextField txtStartingDate;
    // End of variables declaration//GEN-END:variables

}
