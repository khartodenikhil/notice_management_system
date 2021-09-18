/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package try1;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.JOptionPane;

/**
 *
 * @author nikhil
 */
public class new_notice extends javax.swing.JFrame {
   
    Connection conn=conntry.connectdb();
    PreparedStatement ps=null;
    ResultSet rs=null;
    
    public new_notice() {
        initComponents();
        conntry.connectdb();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        to_msg = new javax.swing.JComboBox();
        send_btn = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        notice_content = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        from_txt = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setText("From");

        to_msg.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "HOD", "Teacher", "Student", "Library Staff", "Office Staff" }));

        send_btn.setText("Send");
        send_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                send_btnMouseClicked(evt);
            }
        });

        notice_content.setColumns(20);
        notice_content.setRows(5);
        jScrollPane2.setViewportView(notice_content);

        jLabel2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel2.setText("To");

        from_txt.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        from_txt.setText("edd");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(212, 212, 212)
                        .addComponent(send_btn))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 496, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(28, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(from_txt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(to_msg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(89, 89, 89))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                    .addContainerGap(324, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(160, 160, 160)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(from_txt)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(to_msg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(send_btn)
                .addContainerGap(72, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(38, 38, 38)
                    .addComponent(jLabel2)
                    .addContainerGap(311, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void send_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_send_btnMouseClicked
        
        Calendar cal=new GregorianCalendar();
        int month=cal.get(Calendar.MONTH);
        int year=cal.get(Calendar.YEAR);
        int day=cal.get(Calendar.DAY_OF_MONTH);
         
        cal.getTime();
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss"); 
        String time_txt=sdf.format(cal.getTime());
        String date_txt=(year+"/"+month+"/"+day);
        
        
        String notice=notice_content.getText();
        String notice_from=from_txt.getText();
        String notice_to=to_msg.getSelectedItem().toString();
        
        if(notice.length()<99)
        {
         PreparedStatement ps;
            String query="insert into try.notice_details (notice_from,notice,notice_to,notice_time,notice_date)values(?,?,?,?,?)";
         try
           {
               ps=conn.prepareStatement(query);
               ps.setString(1, notice_from);
               ps.setString(2, notice);
               ps.setString(3, notice_to);
               ps.setString(4, time_txt);
               ps.setString(5, date_txt);
               int i= ps.executeUpdate();
               JOptionPane.showMessageDialog(null, "record succesfully added");
               
                  if(from_txt.getText().equalsIgnoreCase("Principal"))
                    {
                        principal_frame a= new principal_frame();
                        a.setVisible(true);
                        this.setVisible(false);
                    }
                     if(from_txt.getText().equalsIgnoreCase("HOD"))
                    {
                        hod_frame a= new hod_frame();
                        a.setVisible(true);
                        this.setVisible(false);
                    }
                      if(from_txt.getText().equalsIgnoreCase("Teacher"))
                    {
                        teacher_frame a= new teacher_frame();
                        a.setVisible(true);
                        this.setVisible(false);
                    }
                       if(from_txt.getText().equalsIgnoreCase("Library Staff"))
                    {
                        library_frame a= new library_frame();
                        a.setVisible(true);
                        this.setVisible(false);
                    }
                        if(from_txt.getText().equalsIgnoreCase("office staff"))
                    {
                        office_staff_frame a= new office_staff_frame();
                        a.setVisible(true);
                        this.setVisible(false);
                    }
           }
          catch(SQLException ex)
        {
            JOptionPane.showMessageDialog(null,ex);
        }
       }
       else
        {
             JOptionPane.showMessageDialog(null, "Notice length seems to be too long");
        }
               
 
// TODO add your handling code here:
    }//GEN-LAST:event_send_btnMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new new_notice().setVisible(true);
            }
        });
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel from_txt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private static javax.swing.JTextArea notice_content;
    private javax.swing.JButton send_btn;
    public static javax.swing.JComboBox to_msg;
    // End of variables declaration//GEN-END:variables
}
