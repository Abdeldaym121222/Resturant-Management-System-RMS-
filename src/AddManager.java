
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mohamed_Abdeldaym
 */
public class AddManager extends javax.swing.JFrame {

    Connection con = null;
    PreparedStatement ps = null;
    ResultSet rs = null;
    
    
    public AddManager() {
        initComponents();
    }
    
    private void clear(){
    
        mt1.setText("");
        mt2.setText("");
        mt3.setSelectedIndex(0);
        mt4.setText("");
        mt5.setText("");
    
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        mt1 = new javax.swing.JTextField();
        mt2 = new javax.swing.JTextField();
        mt4 = new javax.swing.JTextField();
        mt3 = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        mt5 = new javax.swing.JTextField();
        myButton6 = new MyButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLayeredPane1.setBackground(new java.awt.Color(0, 102, 102));
        jLayeredPane1.setOpaque(true);

        jLabel1.setBackground(new java.awt.Color(0, 51, 102));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("X");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("إضافة مدير جديد");

        jLayeredPane1.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)))
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("مسلسل");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(522, 37, -1, 33));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("الاسم");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(522, 95, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("الصفة");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(522, 148, -1, -1));

        mt1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        mt1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(mt1, new org.netbeans.lib.awtextra.AbsoluteConstraints(92, 36, 412, 35));

        mt2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        mt2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(mt2, new org.netbeans.lib.awtextra.AbsoluteConstraints(92, 89, 412, 35));

        mt4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        mt4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(mt4, new org.netbeans.lib.awtextra.AbsoluteConstraints(197, 247, 377, 35));

        mt3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        mt3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "كاشير", "كابتن", "مدير" }));
        jPanel1.add(mt3, new org.netbeans.lib.awtextra.AbsoluteConstraints(92, 142, 412, 35));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("Password");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(92, 302, -1, 48));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setText("UserName");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(93, 240, -1, 48));

        mt5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        mt5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(mt5, new org.netbeans.lib.awtextra.AbsoluteConstraints(197, 309, 377, 35));

        myButton6.setBackground(new java.awt.Color(0, 102, 102));
        myButton6.setForeground(new java.awt.Color(255, 255, 255));
        myButton6.setText("حفظ");
        myButton6.setBorderColor(new java.awt.Color(51, 102, 0));
        myButton6.setColor(new java.awt.Color(0, 102, 102));
        myButton6.setColorClick(new java.awt.Color(0, 153, 153));
        myButton6.setColorOver(new java.awt.Color(0, 102, 102));
        myButton6.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        myButton6.setRadius(40);
        myButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                myButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 715, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(myButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(257, 257, 257))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(myButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jLabel1MouseClicked

    private void myButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_myButton6ActionPerformed
        // TODO add your handling code here:
        
        
         // Add info
        if (mt1.getText().equals("") || mt2.getText().equals("") || mt4.getText().equals("")
                || mt5.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Missing Data");
        } else {
          
            try {
                con = DriverManager.getConnection("jdbc:mysql://localhost/resturantmanagement", "root", "");
                String Quary = "INSERT INTO `manager`(`مسلسل`, `الاسم`, `الصفة`, `username`, `password`) VALUES(?,?,?,?,?)";
                ps = con.prepareStatement(Quary);
                ps.setString(1, mt1.getText());
                ps.setString(2, mt2.getText());
                ps.setString(3, mt3.getSelectedItem().toString());
                ps.setString(4, mt4.getText());
                ps.setString(5, mt5.getText());
                ps.executeUpdate();
                clear();
                
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this,e);
            }
                 
        }
                                            

    }//GEN-LAST:event_myButton6ActionPerformed

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
            java.util.logging.Logger.getLogger(AddManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddManager().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField mt1;
    private javax.swing.JTextField mt2;
    private javax.swing.JComboBox<String> mt3;
    private javax.swing.JTextField mt4;
    private javax.swing.JTextField mt5;
    private MyButton myButton6;
    // End of variables declaration//GEN-END:variables
}
