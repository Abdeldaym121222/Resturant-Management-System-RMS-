
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mohamed_Abdeldaym
 */
public class Screen_pilot extends javax.swing.JFrame {

    Connection con = null;
    PreparedStatement ps = null;
    ResultSet rs = null;
    
    public Screen_pilot() {
        initComponents();
        set_code();
        Fill_table();
        new client().table_setting(this.jTable1);
        pt1.setEnabled(false);
    }
    
    private void set_code(){
    
        int count = this.jTable1.getRowCount();
        pt1.setText(String.valueOf(count+1));
    }
    
    private void clear(){
    
     pt2.setText("");
     pt3.setText("");
     pt4.setText("");
    
    }
    
    private void Fill_table(){

    try{
            con = DriverManager.getConnection("jdbc:mysql://localhost/resturantmanagement","root","");
            String Quary = "SELECT الكود, الاسم FROM `pilot`";
            ps = con.prepareStatement(Quary);
            rs = ps.executeQuery();
            jTable1.setModel(DbUtils.resultSetToTableModel(rs));
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, e);
        }
    new client().table_setting(this.jTable1);
    }
    
    private void Search(){
    
        if(search2.getText().equals(""))
           this.Fill_table();
        else{
            try{
            con = DriverManager.getConnection("jdbc:mysql://localhost/resturantmanagement","root","");
            String Quary = "SELECT * FROM `pilot` where الكود='"+search2.getText()+"' or الاسم='"+search2.getText()+"'";
            ps = con.prepareStatement(Quary);
            rs = ps.executeQuery();
            jTable1.setModel(DbUtils.resultSetToTableModel(rs));
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, e);
        }
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        pt4 = new javax.swing.JTextField();
        pt3 = new javax.swing.JTextField();
        pt2 = new javax.swing.JTextField();
        pt1 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel20 = new javax.swing.JLabel();
        myButton17 = new MyButton();
        myButton15 = new MyButton();
        myButton14 = new MyButton();
        myButton12 = new MyButton();
        myButton13 = new MyButton();
        myButton11 = new MyButton();
        search2 = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("شاشة ادخال الطيارين");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 200, -1, 40));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 0));
        jLabel2.setText("اسم الطيار");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1210, 290, -1, 30));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 0));
        jLabel3.setText("الحالة");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1210, 330, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 0));
        jLabel4.setText("الحضور");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1210, 370, -1, -1));

        pt4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        pt4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(pt4, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 370, 310, -1));

        pt3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        pt3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(pt3, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 330, 310, -1));

        pt2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        pt2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(pt2, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 290, 310, -1));

        pt1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        pt1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(pt1, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 250, 310, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 0));
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/search.png"))); // NOI18N
        jLabel5.setText("بحث");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 170, -1, 30));

        jTable1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "الكود", "الاسم"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setRowHeight(28);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, 370, 330));

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 0));
        jLabel20.setText("الكود");
        getContentPane().add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(1210, 240, -1, 40));

        myButton17.setForeground(new java.awt.Color(0, 255, 0));
        myButton17.setText("بحث");
        myButton17.setBorderColor(new java.awt.Color(0, 102, 102));
        myButton17.setColor(new java.awt.Color(0, 102, 102));
        myButton17.setColorClick(new java.awt.Color(0, 153, 153));
        myButton17.setColorOver(new java.awt.Color(0, 102, 102));
        myButton17.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        myButton17.setRadius(50);
        myButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                myButton17ActionPerformed(evt);
            }
        });
        getContentPane().add(myButton17, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 30, 90, 70));

        myButton15.setForeground(new java.awt.Color(0, 255, 0));
        myButton15.setText("جديد");
        myButton15.setBorderColor(new java.awt.Color(0, 102, 102));
        myButton15.setColor(new java.awt.Color(0, 102, 102));
        myButton15.setColorClick(new java.awt.Color(0, 153, 153));
        myButton15.setColorOver(new java.awt.Color(0, 102, 102));
        myButton15.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        myButton15.setRadius(50);
        myButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                myButton15ActionPerformed(evt);
            }
        });
        getContentPane().add(myButton15, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 30, 90, 70));

        myButton14.setForeground(new java.awt.Color(0, 255, 0));
        myButton14.setText("تعديل");
        myButton14.setBorderColor(new java.awt.Color(0, 102, 102));
        myButton14.setColor(new java.awt.Color(0, 102, 102));
        myButton14.setColorClick(new java.awt.Color(0, 153, 153));
        myButton14.setColorOver(new java.awt.Color(0, 102, 102));
        myButton14.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        myButton14.setRadius(50);
        myButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                myButton14ActionPerformed(evt);
            }
        });
        getContentPane().add(myButton14, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 30, 90, 70));

        myButton12.setForeground(new java.awt.Color(0, 255, 0));
        myButton12.setText("حذف");
        myButton12.setBorderColor(new java.awt.Color(0, 102, 102));
        myButton12.setColor(new java.awt.Color(0, 102, 102));
        myButton12.setColorClick(new java.awt.Color(0, 153, 153));
        myButton12.setColorOver(new java.awt.Color(0, 102, 102));
        myButton12.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        myButton12.setRadius(50);
        myButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                myButton12ActionPerformed(evt);
            }
        });
        getContentPane().add(myButton12, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 30, 90, 70));

        myButton13.setForeground(new java.awt.Color(0, 255, 0));
        myButton13.setText("حفظ");
        myButton13.setBorderColor(new java.awt.Color(0, 102, 102));
        myButton13.setColor(new java.awt.Color(0, 102, 102));
        myButton13.setColorClick(new java.awt.Color(0, 153, 153));
        myButton13.setColorOver(new java.awt.Color(0, 102, 102));
        myButton13.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        myButton13.setRadius(50);
        myButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                myButton13ActionPerformed(evt);
            }
        });
        getContentPane().add(myButton13, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 30, 90, 70));

        myButton11.setForeground(new java.awt.Color(0, 255, 0));
        myButton11.setText("خروج");
        myButton11.setBorderColor(new java.awt.Color(0, 102, 102));
        myButton11.setColor(new java.awt.Color(0, 102, 102));
        myButton11.setColorClick(new java.awt.Color(0, 153, 153));
        myButton11.setColorOver(new java.awt.Color(0, 102, 102));
        myButton11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        myButton11.setRadius(50);
        myButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                myButton11ActionPerformed(evt);
            }
        });
        getContentPane().add(myButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(1220, 30, 90, 70));

        search2.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        search2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        search2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                search2KeyReleased(evt);
            }
        });
        getContentPane().add(search2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, 290, -1));

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/home-background-image.png"))); // NOI18N
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
       int row = this.jTable1.getSelectedRow();
       String click_row = this.jTable1.getModel().getValueAt(row, 0).toString();
       try{
            con = DriverManager.getConnection("jdbc:mysql://localhost/resturantmanagement","root","");
            String Quary = "SELECT *FROM `pilot` where الكود = '"+click_row+"'";
            ps = con.prepareStatement(Quary);
            rs = ps.executeQuery();
            if(rs.next()){
            
                pt1.setText(String.valueOf(rs.getInt("الكود")));
                pt2.setText(rs.getString("الاسم"));
                pt3.setText(rs.getString("الحالة"));
                pt4.setText(rs.getString("الحضور")); 
            }
       
       }catch(Exception e){
           JOptionPane.showMessageDialog(this, e);
       }
    }//GEN-LAST:event_jTable1MouseClicked

    private void myButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_myButton11ActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_myButton11ActionPerformed

    private void search2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_search2KeyReleased
        // TODO add your handling code here:
        Search();
    }//GEN-LAST:event_search2KeyReleased

    private void myButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_myButton12ActionPerformed
        // TODO add your handling code here:
        
        // Delete
        try{
             con = DriverManager.getConnection("jdbc:mysql://localhost/resturantmanagement","root","");
             String Quary = "DELETE FROM `pilot` WHERE الكود =?";
             ps = con.prepareStatement(Quary);
             ps.setString(1, pt1.getText());
             ps.executeUpdate();          
             clear();
             Fill_table();
             set_code();
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, e);
        }
    }//GEN-LAST:event_myButton12ActionPerformed

    private void myButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_myButton13ActionPerformed
        // TODO add your handling code here:
        
        // Add
        try{
             con = DriverManager.getConnection("jdbc:mysql://localhost/resturantmanagement","root","");
             String Quary = "INSERT INTO `pilot`(`الكود`, `الاسم`, `الحالة`, `الحضور`) VALUES(?,?,?,?)";
             ps = con.prepareStatement(Quary);
             ps.setString(1, pt1.getText());
             ps.setString(2, pt2.getText());
             ps.setString(3, pt3.getText());
             ps.setString(4, pt4.getText());
             ps.executeUpdate();
             clear();
             Fill_table();
             set_code();
        }catch(Exception e){
        
            JOptionPane.showMessageDialog(null, e);
        
        }
    }//GEN-LAST:event_myButton13ActionPerformed

    private void myButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_myButton15ActionPerformed
        // TODO add your handling code here:
        clear();
        set_code();
    }//GEN-LAST:event_myButton15ActionPerformed

    private void myButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_myButton17ActionPerformed
        // TODO add your handling code here:
        search2.requestFocus();
    }//GEN-LAST:event_myButton17ActionPerformed

    private void myButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_myButton14ActionPerformed
        // TODO add your handling code here:
        
           // Update
        try{
               con = DriverManager.getConnection("jdbc:mysql://localhost/resturantmanagement","root","");
               String Quary = "UPDATE `pilot` SET `الكود`=?,`الاسم`=?,`الحالة`=?,`الحضور`=? WHERE الكود = '"+pt1.getText()+"'";
               ps = con.prepareStatement(Quary);
               ps.setString(1, pt1.getText());
               ps.setString(2, pt2.getText());
               ps.setString(3, pt3.getText());
               ps.setString(4, pt4.getText());
               ps.executeUpdate();
               clear();
               Fill_table();
               set_code();
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, e);
        }
    }//GEN-LAST:event_myButton14ActionPerformed

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
            java.util.logging.Logger.getLogger(Screen_pilot.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Screen_pilot.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Screen_pilot.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Screen_pilot.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Screen_pilot().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private MyButton myButton11;
    private MyButton myButton12;
    private MyButton myButton13;
    private MyButton myButton14;
    private MyButton myButton15;
    private MyButton myButton17;
    private javax.swing.JTextField pt1;
    private javax.swing.JTextField pt2;
    private javax.swing.JTextField pt3;
    private javax.swing.JTextField pt4;
    private javax.swing.JTextField search2;
    // End of variables declaration//GEN-END:variables
}
