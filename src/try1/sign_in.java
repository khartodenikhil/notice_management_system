/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package try1;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author nikhil
 */
public class sign_in extends javax.swing.JFrame {

    /**
     * Creates new form sign_in
     */
    Connection conn=conntry.connectdb();
    PreparedStatement ps=null;
    ResultSet rs=null;
    public sign_in() {
        initComponents();
        conntry.connectdb();

    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        hod_bt = new javax.swing.JButton();
        teacher_bt = new javax.swing.JButton();
        office_bt = new javax.swing.JButton();
        library_bt = new javax.swing.JButton();
        Princ_bt = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        mainframe = new javax.swing.JPanel();
        principal = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        hod = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        teacher = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        office = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable4 = new javax.swing.JTable();
        library = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTable5 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 51, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setIcon(new javax.swing.ImageIcon("C:\\Users\\nikhil\\Desktop\\images.png")); // NOI18N
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 13, 110, 123));

        hod_bt.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        hod_bt.setText("HOD");
        hod_bt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        hod_bt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                hod_btMouseClicked(evt);
            }
        });
        jPanel1.add(hod_bt, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 200, 40));

        teacher_bt.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        teacher_bt.setText("Teachers");
        teacher_bt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        teacher_bt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                teacher_btMouseClicked(evt);
            }
        });
        teacher_bt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                teacher_btActionPerformed(evt);
            }
        });
        jPanel1.add(teacher_bt, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 200, 40));

        office_bt.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        office_bt.setText("Office");
        office_bt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        office_bt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                office_btMouseClicked(evt);
            }
        });
        jPanel1.add(office_bt, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, 200, 40));

        library_bt.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        library_bt.setText("Library");
        library_bt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        library_bt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                library_btMouseClicked(evt);
            }
        });
        jPanel1.add(library_bt, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 345, 200, 40));

        Princ_bt.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        Princ_bt.setText("Principal");
        Princ_bt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Princ_bt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Princ_btMouseClicked(evt);
            }
        });
        jPanel1.add(Princ_bt, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 154, 200, 40));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Student");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 110, -1, -1));

        jPanel2.setBackground(new java.awt.Color(51, 0, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("NOTICE BOARD");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 20, -1, -1));

        jButton2.setText("LOG OUT");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 40, -1, -1));

        mainframe.setLayout(new java.awt.CardLayout());

        principal.setLayout(new java.awt.CardLayout());

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Date", "Time", "Notice"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable1);

        principal.add(jScrollPane2, "card2");

        mainframe.add(principal, "card2");

        hod.setLayout(new java.awt.CardLayout());

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Date", "Time", "Notice"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable2MouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(jTable2);

        hod.add(jScrollPane4, "card2");

        mainframe.add(hod, "card3");

        teacher.setLayout(new java.awt.CardLayout());

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Date", "Time", "Notice"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable3MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable3);

        teacher.add(jScrollPane1, "card2");

        mainframe.add(teacher, "card3");

        office.setLayout(new java.awt.CardLayout());

        jTable4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Date", "Time", "Notice"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable4MouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jTable4);

        office.add(jScrollPane3, "card2");

        mainframe.add(office, "card3");

        library.setLayout(new java.awt.CardLayout());

        jTable5.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Date", "Time", "Notice"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable5MouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(jTable5);

        library.add(jScrollPane5, "card2");

        mainframe.add(library, "card3");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(mainframe, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 573, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mainframe, javax.swing.GroupLayout.DEFAULT_SIZE, 342, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Princ_btMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Princ_btMouseClicked
        mainframe.removeAll();
        mainframe.repaint();
        mainframe.revalidate();
        
         String query="select notice_from,notice_time,notice_date,notice from notice_details where notice_from='Principal' and notice_to='Student'";
         try
           {
                 ps=conn.prepareStatement(query);
               rs=ps.executeQuery();
              DefaultTableModel model=(DefaultTableModel)jTable1.getModel();
               while(rs.next())
               {
                        
                        Object[] row=new Object[3];
                        //     vector.add(name);  
                        row[0] = rs.getString("notice_date");  
                        row[1] = rs.getString("notice_time");  
                        row[2] = rs.getString("notice"); 
                         for(int i=0;i<model.getRowCount();i++)
                        {
                            model.removeRow(i);
                        }
                        model.addRow(row);  
                        jTable1.setModel(model);
    
               }
           }
          catch(SQLException ex)
        {
            JOptionPane.showMessageDialog(null,ex);
        }
        mainframe.add(this.principal);
        mainframe.repaint();
        mainframe.revalidate();
    }//GEN-LAST:event_Princ_btMouseClicked

    private void hod_btMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hod_btMouseClicked
        mainframe.removeAll();
        mainframe.repaint();
        mainframe.revalidate();
                  String query="select notice_from,notice_time,notice_date,notice from notice_details where notice_from='HOD' and notice_to='Student'";
         try
           {
                 ps=conn.prepareStatement(query);
               rs=ps.executeQuery();
              DefaultTableModel model=(DefaultTableModel)jTable2.getModel();
               while(rs.next())
               {
                        
                        Object[] row=new Object[3];
                        //     vector.add(name);  
                        row[0] = rs.getString("notice_date");  
                        row[1] = rs.getString("notice_time");  
                        row[2] = rs.getString("notice");   
                         for(int i=0;i<model.getRowCount();i++)
                        {
                            model.removeRow(i);
                        }
                        model.addRow(row);  
                        jTable2.setModel(model);
    
               }
           }
          catch(SQLException ex)
        {
            JOptionPane.showMessageDialog(null,ex);
        } 

        mainframe.add(this.hod);
        mainframe.repaint();
        mainframe.revalidate();        // TODO add your handling code here:
    }//GEN-LAST:event_hod_btMouseClicked

    private void teacher_btMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_teacher_btMouseClicked
         mainframe.removeAll();
        mainframe.repaint();
        mainframe.revalidate();
          String query="select notice_from,notice_time,notice_date,notice from notice_details where notice_from='Teacher' and notice_to='Student'";
         try
           {
                 ps=conn.prepareStatement(query);
               rs=ps.executeQuery();
              DefaultTableModel model=(DefaultTableModel)jTable3.getModel();
               while(rs.next())
               {
                        
                        Object[] row=new Object[3];
                        //     vector.add(name);  
                        row[0] = rs.getString("notice_date");  
                        row[1] = rs.getString("notice_time");  
                        row[2] = rs.getString("notice");
                         for(int i=0;i<model.getRowCount();i++)
                        {
                            model.removeRow(i);
                        }
                        model.addRow(row);  
                        jTable3.setModel(model);
    
               }
           }
          catch(SQLException ex)
        {
            JOptionPane.showMessageDialog(null,ex);
        } 
        mainframe.add(this.teacher);
        mainframe.repaint();
        mainframe.revalidate();
        // TODO add your handling code here:
    }//GEN-LAST:event_teacher_btMouseClicked

    private void office_btMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_office_btMouseClicked
     mainframe.removeAll();
        mainframe.repaint();
        mainframe.revalidate();
          String query="select notice_from,notice_time,notice_date,notice from notice_details where notice_from='Office Staff' and notice_to='Student'";
         try
           {
                 ps=conn.prepareStatement(query);
               rs=ps.executeQuery();
              DefaultTableModel model= (DefaultTableModel)jTable4.getModel();
               while(rs.next())
               {
                        
                        Object[] row=new Object[3];
                        //     vector.add(name);  
                        row[0] = rs.getString("notice_date");  
                        row[1] = rs.getString("notice_time");  
                        row[2] = rs.getString("notice");       
                         for(int i=0;i<model.getRowCount();i++)
                        {
                            model.removeRow(i);
                        }
                        model.addRow(row);  
                        jTable4.setModel(model);
    
               }
           }
          catch(SQLException ex)
        {
            JOptionPane.showMessageDialog(null,ex);
        } 
        mainframe.add(this.office);
        mainframe.repaint();
        mainframe.revalidate();
        // TODO add your handling code here:
    }//GEN-LAST:event_office_btMouseClicked

    private void library_btMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_library_btMouseClicked
        mainframe.removeAll();
        mainframe.repaint();
        mainframe.revalidate();
          String query="select notice_from,notice_time,notice_date,notice from notice_details where notice_from='Library staff' and notice_to='Student'";
         try
           {
              ps=conn.prepareStatement(query);
              rs=ps.executeQuery();
              DefaultTableModel model=(DefaultTableModel)jTable5.getModel();
               while(rs.next())
               {
                        
                        Object[] row=new Object[3];
                        //     vector.add(name);  
                        row[0] = rs.getString("notice_date");  
                        row[1] = rs.getString("notice_time");  
                        row[2] = rs.getString("notice");
                         for(int i=0;i<model.getRowCount();i++)
                        {
                            model.removeRow(i);
                        }
                        model.addRow(row);  
                        jTable5.setModel(model);
    
               }
           }
          catch(SQLException ex)
        {
            JOptionPane.showMessageDialog(null,ex);
        } 
        mainframe.add(this.library);
        mainframe.repaint();
        mainframe.revalidate();
    }//GEN-LAST:event_library_btMouseClicked

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked

        int index=jTable1.getSelectedRow();
        DefaultTableModel model=(DefaultTableModel)jTable1.getModel();
        display_notice_table o=new display_notice_table();
        o.notice_f.setText( model.getValueAt(index, 2).toString());
        o.notice_f.setEditable(false);
        o.setVisible(true);
    }//GEN-LAST:event_jTable1MouseClicked

    private void jTable2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MouseClicked
        int index=jTable2.getSelectedRow();
        DefaultTableModel model=(DefaultTableModel)jTable2.getModel();
        display_notice_table o=new display_notice_table();
        o.notice_f.setText( model.getValueAt(index, 2).toString());
        o.notice_f.setEditable(false);
        o.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_jTable2MouseClicked

    private void jTable3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable3MouseClicked
        int index=jTable3.getSelectedRow();
        DefaultTableModel model=(DefaultTableModel)jTable3.getModel();
        display_notice_table o=new display_notice_table();
        o.notice_f.setText( model.getValueAt(index, 2).toString());
        o.notice_f.setEditable(false);
        o.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_jTable3MouseClicked

    private void jTable4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable4MouseClicked
        int index=jTable4.getSelectedRow();
        DefaultTableModel model=(DefaultTableModel)jTable4.getModel();
        display_notice_table o=new display_notice_table();
        o.notice_f.setText( model.getValueAt(index, 2).toString());
        o.notice_f.setEditable(false);
        o.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_jTable4MouseClicked

    private void jTable5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable5MouseClicked
        int index=jTable5.getSelectedRow();
        DefaultTableModel model=(DefaultTableModel)jTable5.getModel();
        display_notice_table o=new display_notice_table();
        o.notice_f.setText( model.getValueAt(index, 2).toString());
        o.notice_f.setEditable(false);
        o.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_jTable5MouseClicked

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        login a=new login();
        this.setVisible(false);
        a.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2MouseClicked

    private void teacher_btActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_teacher_btActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_teacher_btActionPerformed

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
            java.util.logging.Logger.getLogger(sign_in.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(sign_in.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(sign_in.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(sign_in.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new sign_in().setVisible(true);
            }
        });
        
       
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Princ_bt;
    private javax.swing.JPanel hod;
    private javax.swing.JButton hod_bt;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTable jTable4;
    private javax.swing.JTable jTable5;
    private javax.swing.JPanel library;
    private javax.swing.JButton library_bt;
    private javax.swing.JPanel mainframe;
    private javax.swing.JPanel office;
    private javax.swing.JButton office_bt;
    private javax.swing.JPanel principal;
    private javax.swing.JPanel teacher;
    private javax.swing.JButton teacher_bt;
    // End of variables declaration//GEN-END:variables
}
