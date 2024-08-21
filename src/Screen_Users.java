
import java.awt.Color;
import java.awt.ComponentOrientation;
import java.sql.*;
import java.sql.DriverManager;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.JTableHeader;
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
public class Screen_Users extends javax.swing.JFrame {


    Connection con = null;
    PreparedStatement ps = null;
    ResultSet rs = null;
    
    public Screen_Users() {
        initComponents();
        ut1.setEnabled(false);
        ut2.requestFocus();
        Fill_table();
        table_setting();
        set_code();
    }
    
    private void table_setting() {

        // set Language from Arabic
        this.jTable1.setComponentOrientation(ComponentOrientation.UNKNOWN);

        ((DefaultTableCellRenderer) this.jTable1.getTableHeader().getDefaultRenderer())
                .setHorizontalAlignment((int) JLabel.CENTER_ALIGNMENT);

        DefaultTableCellRenderer centerRender = new DefaultTableCellRenderer();
        centerRender.setHorizontalAlignment(JLabel.CENTER);
        this.jTable1.getColumnModel().getColumn(0).setCellRenderer(centerRender);
        for (int x = 0; x < this.jTable1.getColumnCount(); x++) {
            this.jTable1.getColumnModel().getColumn(x).setCellRenderer(centerRender);

        }

        JTableHeader tb = this.jTable1.getTableHeader();
        tb.setForeground(Color.blue);
        tb.setFont(new java.awt.Font("Tahoma", 1, 14));
    
    
    }
    
     private void set_code(){
    
        int count = this.jTable1.getRowCount();
        ut1.setText(String.valueOf(count+1));
    }
    
    private void clear(){
    
     ut2.setText("");
     ut3.setText("");
     ut4.setText("");
    
    }
    
    private void Fill_table(){

    try{
            con = DriverManager.getConnection("jdbc:mysql://localhost/resturantmanagement","root","");
            String Quary = "SELECT `الكود`, `اسم المستخدم` FROM `user`";
            ps = con.prepareStatement(Quary);
            rs = ps.executeQuery();
            jTable1.setModel(DbUtils.resultSetToTableModel(rs));
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, e);
        }
    }
    
    private void Search(){
    
        if(search.getText().equals(""))
           this.Fill_table();
        else{
            try{
            con = DriverManager.getConnection("jdbc:mysql://localhost/resturantmanagement","root","");
            String Quary = "SELECT * FROM `user` where الكود='"+search.getText()+"' or `اسم المستخدم`='"+search.getText()+"'";
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
        ut1 = new javax.swing.JTextField();
        ut2 = new javax.swing.JTextField();
        ut3 = new javax.swing.JTextField();
        ut4 = new javax.swing.JTextField();
        myButton6 = new MyButton();
        jLabel5 = new javax.swing.JLabel();
        search = new javax.swing.JTextField();
        myButton8 = new MyButton();
        myButton9 = new MyButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        myButton10 = new MyButton();
        myButton11 = new MyButton();
        myButton12 = new MyButton();
        myButton13 = new MyButton();
        myButton14 = new MyButton();
        myButton15 = new MyButton();
        myButton17 = new MyButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("شاشة ادخال المستخدمين");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 220, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 0));
        jLabel2.setText("اسم المستخدم");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1210, 300, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 0));
        jLabel3.setText("كود المستخدم");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1210, 330, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 0));
        jLabel4.setText("كلمة السر");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1210, 370, -1, -1));

        ut1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        ut1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(ut1, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 250, 310, -1));

        ut2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        ut2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(ut2, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 290, 310, -1));

        ut3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        ut3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(ut3, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 330, 310, -1));

        ut4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        ut4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(ut4, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 370, 310, -1));

        myButton6.setForeground(new java.awt.Color(255, 255, 255));
        myButton6.setText("شاشات المستخدم");
        myButton6.setBorderColor(new java.awt.Color(0, 102, 102));
        myButton6.setColor(new java.awt.Color(0, 102, 102));
        myButton6.setColorClick(new java.awt.Color(0, 153, 153));
        myButton6.setColorOver(new java.awt.Color(0, 102, 102));
        myButton6.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        myButton6.setRadius(30);
        getContentPane().add(myButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 440, -1, 54));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 0));
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/search.png"))); // NOI18N
        jLabel5.setText("بحث");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(394, 170, 70, 30));

        search.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        search.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        search.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchKeyReleased(evt);
            }
        });
        getContentPane().add(search, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, 340, -1));

        myButton8.setForeground(new java.awt.Color(255, 255, 255));
        myButton8.setText("لصق الصلاحيات");
        myButton8.setBorderColor(new java.awt.Color(0, 102, 102));
        myButton8.setColor(new java.awt.Color(0, 102, 102));
        myButton8.setColorClick(new java.awt.Color(0, 153, 153));
        myButton8.setColorOver(new java.awt.Color(0, 102, 102));
        myButton8.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        myButton8.setRadius(30);
        getContentPane().add(myButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 40, -1, 54));

        myButton9.setBackground(new java.awt.Color(0, 102, 102));
        myButton9.setForeground(new java.awt.Color(255, 255, 255));
        myButton9.setText("نسخ الصلاحيات");
        myButton9.setBorderColor(new java.awt.Color(51, 102, 0));
        myButton9.setColor(new java.awt.Color(0, 102, 102));
        myButton9.setColorClick(new java.awt.Color(0, 153, 153));
        myButton9.setColorOver(new java.awt.Color(0, 102, 102));
        myButton9.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        myButton9.setRadius(30);
        getContentPane().add(myButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, -1, 54));

        jTable1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "اسم المستخدم", "كود المستخدم"
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

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 450, 360));

        myButton10.setForeground(new java.awt.Color(255, 255, 255));
        myButton10.setText("صلاحيات المستخدم");
        myButton10.setBorderColor(new java.awt.Color(0, 102, 102));
        myButton10.setColor(new java.awt.Color(0, 102, 102));
        myButton10.setColorClick(new java.awt.Color(0, 153, 153));
        myButton10.setColorOver(new java.awt.Color(0, 102, 102));
        myButton10.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        myButton10.setRadius(30);
        getContentPane().add(myButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 440, -1, 54));

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

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 0));
        jLabel6.setText("الكود");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1210, 260, -1, -1));

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/home-background-image.png"))); // NOI18N
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void myButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_myButton11ActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_myButton11ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        
        // Table Click
        
       int row = this.jTable1.getSelectedRow();
       String click_row = this.jTable1.getModel().getValueAt(row, 0).toString();
       try{
            con = DriverManager.getConnection("jdbc:mysql://localhost/resturantmanagement","root","");
            String Quary = "SELECT *FROM `user` where الكود = '"+click_row+"'";
            ps = con.prepareStatement(Quary);
            rs = ps.executeQuery();
            if(rs.next()){
            
                ut1.setText(String.valueOf(rs.getInt("الكود")));
                ut2.setText(rs.getString("اسم المستخدم"));
                ut3.setText(rs.getString("كود المستخدم"));
                ut4.setText(rs.getString("كلمة السر")); 
            }
       
       }catch(Exception e){
           JOptionPane.showMessageDialog(this, e);
       }
    }//GEN-LAST:event_jTable1MouseClicked

    private void searchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchKeyReleased
        // TODO add your handling code here:
        
        //Search
         Search();
    }//GEN-LAST:event_searchKeyReleased

    private void myButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_myButton12ActionPerformed
        // TODO add your handling code here:
        
         // Delete
        try{
             con = DriverManager.getConnection("jdbc:mysql://localhost/resturantmanagement","root","");
             String Quary = "DELETE FROM `user` WHERE الكود =?";
             ps = con.prepareStatement(Quary);
             ps.setString(1, ut1.getText());
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
             String Quary = "INSERT INTO `user`(`الكود`, `اسم المستخدم`, `كود المستخدم`, `كلمة السر`) VALUES(?,?,?,?)";
             ps = con.prepareStatement(Quary);
             ps.setString(1, ut1.getText());
             ps.setString(2, ut2.getText());
             ps.setString(3, ut3.getText());
             ps.setString(4, ut4.getText());
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
        // New User
         clear();
        set_code();
    }//GEN-LAST:event_myButton15ActionPerformed

    private void myButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_myButton17ActionPerformed
        // TODO add your handling code here:
        
        // Search
        search.requestFocus();
    }//GEN-LAST:event_myButton17ActionPerformed

    private void myButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_myButton14ActionPerformed
        // TODO add your handling code here:
        
            // Update
        try{
               con = DriverManager.getConnection("jdbc:mysql://localhost/resturantmanagement","root","");
               String Quary = "UPDATE `user` SET `الكود`=?,`اسم المستخدم`=?,`كود المستخدم`=?,`كلمة السر`=? WHERE الكود = '"+ut1.getText()+"'";
               ps = con.prepareStatement(Quary);
               ps.setString(1, ut1.getText());
               ps.setString(2, ut2.getText());
               ps.setString(3, ut3.getText());
               ps.setString(4, ut4.getText());
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
            java.util.logging.Logger.getLogger(Screen_Users.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Screen_Users.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Screen_Users.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Screen_Users.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Screen_Users().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private MyButton myButton10;
    private MyButton myButton11;
    private MyButton myButton12;
    private MyButton myButton13;
    private MyButton myButton14;
    private MyButton myButton15;
    private MyButton myButton17;
    private MyButton myButton6;
    private MyButton myButton8;
    private MyButton myButton9;
    private javax.swing.JTextField search;
    private javax.swing.JTextField ut1;
    private javax.swing.JTextField ut2;
    private javax.swing.JTextField ut3;
    private javax.swing.JTextField ut4;
    // End of variables declaration//GEN-END:variables
}
