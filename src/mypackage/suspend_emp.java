/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mypackage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Vishal kumar
 */
public class suspend_emp extends javax.swing.JFrame {
Connection con=null;
 ResultSet rs=null,rs1=null;
    PreparedStatement pstmt=null;
    int flag;

    /**
     * Creates new form suspend_emp
     */
    public suspend_emp() {
        initComponents();
        try{
            con=DriverManager.getConnection("jdbc:ucanaccess://.\\sp_office_emp.accdb");
        }catch(Exception e){
            System.out.println("problem in connection"+e);
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtb = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        smallrad = new javax.swing.JRadioButton();
        big_rad = new javax.swing.JRadioButton();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mypackage/logo.png"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(400, 10, 600, 150);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(153, 153, 153));
        jLabel3.setText("Developed By: Madhurendra & Vishal");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(40, 650, 240, 60);

        jLabel2.setFont(new java.awt.Font("Arial Unicode MS", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 153, 153));
        jLabel2.setText("आरक्षक एवम् प्रधान आरक्षकों को सजा");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(540, 140, 500, 40);

        jLabel5.setFont(new java.awt.Font("Arial Unicode MS", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 51, 0));
        jLabel5.setText("सजा");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(480, 360, 50, 30);

        txtb.setFont(new java.awt.Font("Arial Unicode MS", 0, 14)); // NOI18N
        jPanel1.add(txtb);
        txtb.setBounds(610, 270, 140, 30);

        jButton1.setBackground(new java.awt.Color(204, 204, 204));
        jButton1.setFont(new java.awt.Font("Arial Unicode MS", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(102, 51, 0));
        jButton1.setText("दिखाये");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(810, 270, 130, 30);

        jButton2.setBackground(new java.awt.Color(204, 204, 204));
        jButton2.setFont(new java.awt.Font("Arial Unicode MS", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(102, 51, 0));
        jButton2.setText("बढाए");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(810, 360, 130, 30);

        jTable1.setFont(new java.awt.Font("Arial Unicode MS", 0, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "बैज नंबर", "प्र.आर /आरक्षक का नाम ", "जन्मतिथि", "भर्ती दिनांक", "गृह थाना / जिला", "वतेन बढ़ोतरी दिनांक", "छोटी सजा", "बडी सजा"
            }
        ));
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(5).setPreferredWidth(30);
            jTable1.getColumnModel().getColumn(6).setPreferredWidth(15);
            jTable1.getColumnModel().getColumn(7).setPreferredWidth(15);
        }

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(190, 520, 1100, 50);

        jLabel6.setFont(new java.awt.Font("Arial Unicode MS", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 51, 0));
        jLabel6.setText("बैज नंबर ");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(470, 260, 100, 30);

        smallrad.setFont(new java.awt.Font("Arial Unicode MS", 1, 14)); // NOI18N
        smallrad.setForeground(new java.awt.Color(153, 0, 0));
        smallrad.setText("छोटी सजा");
        smallrad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                smallradActionPerformed(evt);
            }
        });
        jPanel1.add(smallrad);
        smallrad.setBounds(610, 330, 140, 30);

        big_rad.setFont(new java.awt.Font("Arial Unicode MS", 1, 14)); // NOI18N
        big_rad.setForeground(new java.awt.Color(153, 0, 0));
        big_rad.setText("बड़ी सजा");
        big_rad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                big_radActionPerformed(evt);
            }
        });
        jPanel1.add(big_rad);
        big_rad.setBounds(610, 390, 140, 30);

        jButton4.setBackground(new java.awt.Color(204, 204, 204));
        jButton4.setFont(new java.awt.Font("Arial Unicode MS", 1, 14)); // NOI18N
        jButton4.setForeground(new java.awt.Color(153, 0, 0));
        jButton4.setText("वापस");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4);
        jButton4.setBounds(140, 430, 100, 30);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 2618, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 894, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void smallradActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_smallradActionPerformed
        // TODO add your handling code here:
         big_rad.setSelected(false);
        flag=0;
    }//GEN-LAST:event_smallradActionPerformed

    private void big_radActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_big_radActionPerformed
        // TODO add your handling code here:
         smallrad.setSelected(false);
         flag=1;
    }//GEN-LAST:event_big_radActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        home ob=new home();
        ob.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
           String name;
           String date1 = null,d1,d2,d3,date2 = null,date3=null;
           String place,batch_num,bpun,spun;
        if( flag==1)
        {
             try 
            {
           pstmt=con.prepareStatement("update police_emp set long_pun = long_pun + 1 where batch_no=?");
           String  batch=txtb.getText();
          pstmt.setString(1, batch);
                    pstmt.execute();

                                JOptionPane.showMessageDialog(null,"UPDATED");
          
                                
                                pstmt=con.prepareStatement("select * from police_emp where batch_no=?");
            batch_num=txtb.getText();
            pstmt.setString(1, batch_num);    
            pstmt.execute();
            ResultSet  rs1=pstmt.getResultSet();
                                DefaultTableModel tm=(DefaultTableModel)jTable1.getModel();
                                
                                 while (true)
            {
                int c=tm.getRowCount();
                if(c==0)
                break;
                else
                tm.removeRow(0);
            }
                                 while(rs1.next())
                {
                  batch_num=rs1.getString("batch_no");
                    name=rs1.getString("emp_name");
                   d1=rs1.getString("dob");
                   d2=rs1.getString("joining_date");
                   d3=rs1.getString("sal_incrim_date");
                   place=rs1.getString("work_place");  
                   spun=rs1.getString("short_pun");
                   bpun=rs1.getString("long_pun");
        try
 {
      SimpleDateFormat simpledateformat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.S");
    java.util.Date tempDate=simpledateformat.parse(d1);
    java.util.Date tempDate1=simpledateformat.parse(d2);
     java.util.Date tempDate2=simpledateformat.parse(d3);
    SimpleDateFormat outputDateFormat = new SimpleDateFormat("dd-MMM-yyyy");           
     date1=outputDateFormat.format(tempDate);
         date2=outputDateFormat.format(tempDate1);
         date3=outputDateFormat.format(tempDate2);

  } catch (ParseException ex) 
  {
        System.out.println("Parse Exception");
  }

                 Object kk[]={batch_num,name,date1,date2,place,date3,spun,bpun};
                    tm.addRow(kk);
                }
                                
                                 
                                 
             }catch(Exception e)
                   {
                      JOptionPane.showMessageDialog(null,"could not found  "+e);
                   }
        }
        else if(flag==0)
        {
             try 
              {
           pstmt=con.prepareStatement("update police_emp set short_pun = short_pun + 1 where batch_no=?");
           String  batch=txtb.getText();
          pstmt.setString(1, batch);
                    pstmt.execute();

                                JOptionPane.showMessageDialog(null,"UPDATED");
                                
                                
                                pstmt=con.prepareStatement("select * from police_emp where batch_no=?");
            batch_num=txtb.getText();
            pstmt.setString(1, batch_num);    
            pstmt.execute();
            ResultSet  rs1=pstmt.getResultSet();
                                 DefaultTableModel tm=(DefaultTableModel)jTable1.getModel();
                                 
                                  while (true)
            {
                int c=tm.getRowCount();
                if(c==0)
                break;
                else
                tm.removeRow(0);
            }
                                 while(rs1.next())
                {
                  batch_num=rs1.getString("batch_no");
                    name=rs1.getString("emp_name");
                   d1=rs1.getString("dob");
                   d2=rs1.getString("joining_date");
                   d3=rs1.getString("sal_incrim_date");
                   place=rs1.getString("work_place");  
                   spun=rs1.getString("short_pun");
                   bpun=rs1.getString("long_pun");
        try
 {
      SimpleDateFormat simpledateformat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.S");
    java.util.Date tempDate=simpledateformat.parse(d1);
    java.util.Date tempDate1=simpledateformat.parse(d2);
     java.util.Date tempDate2=simpledateformat.parse(d3);
    SimpleDateFormat outputDateFormat = new SimpleDateFormat("dd-MMM-yyyy");           
     date1=outputDateFormat.format(tempDate);
         date2=outputDateFormat.format(tempDate1);
         date3=outputDateFormat.format(tempDate2);

  } catch (ParseException ex) 
  {
        System.out.println("Parse Exception");
  }

                 Object kk[]={batch_num,name,date1,date2,place,date3,spun,bpun};
                    tm.addRow(kk);
                }

              }catch(Exception e)
                 {
                      JOptionPane.showMessageDialog(null,"couldnotfound mkp "+e);
                 }
        }
        else
        {
             JOptionPane.showMessageDialog(null,"please select one of the two radio button ");
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
         try{ //int tot=0;
       pstmt=con.prepareStatement("select * from police_emp where batch_no=?");
            String batch_num=txtb.getText();
            pstmt.setString(1, batch_num);    
            pstmt.execute();
            ResultSet  rs1=pstmt.getResultSet();
        String name;
           String date1 = null,d1,d2,d3,date2 = null,date3=null;
           String place,spun,bpun;
           
           DefaultTableModel tm=(DefaultTableModel)jTable1.getModel();
            while (true)
            {
                int c=tm.getRowCount();
                if(c==0)
                break;
                else
                tm.removeRow(0);
            }
           
                while(rs1.next())
                {
                  batch_num=rs1.getString("batch_no");
                    name=rs1.getString("emp_name");
                   d1=rs1.getString("dob");
                   d2=rs1.getString("joining_date");
                   d3=rs1.getString("sal_incrim_date");
                   place=rs1.getString("work_place");
                   spun=rs1.getString("short_pun");
                   bpun=rs1.getString("long_pun");
        try
 {
      SimpleDateFormat simpledateformat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.S");
    java.util.Date tempDate=simpledateformat.parse(d1);
    java.util.Date tempDate1=simpledateformat.parse(d2);
    java.util.Date tempDate2=simpledateformat.parse(d3);
    SimpleDateFormat outputDateFormat = new SimpleDateFormat("dd-MMM-yyyy");           
     date1=outputDateFormat.format(tempDate);
         date2=outputDateFormat.format(tempDate1);
         date3=outputDateFormat.format(tempDate2);

  } catch (ParseException ex) 
  {
        System.out.println("Parse Exception");
  }

                 Object kk[]={batch_num,name,date1,date2,place,date3,spun,bpun};
                    tm.addRow(kk);
                }
          //  selectps.clearParameters();
       
      }catch(Exception e)
      {
          JOptionPane.showMessageDialog(null,"couldnotfound mkp "+e);
      }
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
            java.util.logging.Logger.getLogger(suspend_emp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(suspend_emp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(suspend_emp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(suspend_emp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new suspend_emp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton big_rad;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JRadioButton smallrad;
    private javax.swing.JTextField txtb;
    // End of variables declaration//GEN-END:variables
}
