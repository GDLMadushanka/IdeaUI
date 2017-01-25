/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com;

import java.awt.*;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle;
import javax.swing.border.*;
import javax.swing.table.DefaultTableModel;
import java.util.Random;

/**
 *
 * @author Lahiru
 */
public class ControlPanel extends javax.swing.JFrame {
    
    DefaultTableModel model ;
   // API api = new API(this);
    
    static String[] FileArr = new String[]{"Adventures of Tintin","Jack and Jill","Glee","The Vampire Diarie","King Arthur","Windows XP","Harry Potter","Kung Fu Panda","Lady Gaga","Twilight","Windows 8","Mission Impossible","Turn Up The Music","Super Mario","American Pickers","Microsoft Office 2010","Happy Feet","Modern Family","American Idol","Hacking for Dummies"};
    Random rand = new Random(1);
   
    public void displayMessage(String message)
    {
        messageDisplay.append(message);
    }
   
    public void initializeAll()
    {
        // this method check for the current coneection and take the IPV4 address. If not connected
        // to any network interface provide an error
        jComboBox1.removeAllItems();
    }
    
    
    public ControlPanel() {
        initComponents();
        //Checking for IP address if not connected give error
        initializeAll();
        model = (DefaultTableModel) jTable1.getModel();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    // Generated using JFormDesigner Evaluation license - Lahiru Madushanka
    private void initComponents() {
        jPanel1 = new JPanel();
        Initialize = new JButton();
        jLabel4 = new JLabel();
        txtName = new JTextField();
        jLabel3 = new JLabel();
        jLabel5 = new JLabel();
        txtIP = new JTextField();
        txtPort = new JTextField();
        jButton6 = new JButton();
        jPanel2 = new JPanel();
        jComboBox1 = new JComboBox<>();
        jButton1 = new JButton();
        jScrollPane4 = new JScrollPane();
        jTextArea1 = new JTextArea();
        jLabel2 = new JLabel();
        jTextField1 = new JTextField();
        jPanel3 = new JPanel();
        jScrollPane2 = new JScrollPane();
        jTable1 = new JTable();
        jButton5 = new JButton();
        jLabel8 = new JLabel();
        jButton3 = new JButton();
        jPanel4 = new JPanel();
        jScrollPane3 = new JScrollPane();
        myFileList = new JTextArea();
        jButton4 = new JButton();
        txtNumFiles = new JTextField();
        jLabel6 = new JLabel();
        jScrollPane1 = new JScrollPane();
        messageDisplay = new JTextArea();

        //======== this ========
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        Container contentPane = getContentPane();

        //======== jPanel1 ========
        {
            jPanel1.setBorder(new TitledBorder(null, "Initialization", TitledBorder.LEADING, TitledBorder.DEFAULT_POSITION, null, new Color(51, 51, 255)));

            // JFormDesigner evaluation mark
            jPanel1.setBorder(new javax.swing.border.CompoundBorder(
                new javax.swing.border.TitledBorder(new javax.swing.border.EmptyBorder(0, 0, 0, 0),
                    "JFormDesigner Evaluation", javax.swing.border.TitledBorder.CENTER,
                    javax.swing.border.TitledBorder.BOTTOM, new java.awt.Font("Dialog", java.awt.Font.BOLD, 12),
                    java.awt.Color.red), jPanel1.getBorder())); jPanel1.addPropertyChangeListener(new java.beans.PropertyChangeListener(){public void propertyChange(java.beans.PropertyChangeEvent e){if("border".equals(e.getPropertyName()))throw new RuntimeException();}});


            //---- Initialize ----
            Initialize.setText("Register");
            Initialize.addActionListener(e -> InitializeActionPerformed(e));

            //---- jLabel4 ----
            jLabel4.setText("User Name");

            //---- jLabel3 ----
            jLabel3.setText("IP");

            //---- jLabel5 ----
            jLabel5.setText("Port ");

            //---- jButton6 ----
            jButton6.setText("Unregister");
            jButton6.addActionListener(e -> jButton6ActionPerformed(e));

            GroupLayout jPanel1Layout = new GroupLayout(jPanel1);
            jPanel1.setLayout(jPanel1Layout);
            jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup()
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup()
                            .addGroup(GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup()
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                                .addComponent(txtName, GroupLayout.PREFERRED_SIZE, 141, GroupLayout.PREFERRED_SIZE))
                            .addGroup(GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(txtIP, GroupLayout.PREFERRED_SIZE, 141, GroupLayout.PREFERRED_SIZE))
                            .addGroup(GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtPort, GroupLayout.PREFERRED_SIZE, 141, GroupLayout.PREFERRED_SIZE)))
                        .addGap(93, 93, 93)
                        .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                            .addComponent(Initialize, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton6, GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE))
                        .addContainerGap())
            );
            jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup()
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtName, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtIP, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addComponent(Initialize))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(txtPort, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addContainerGap(19, Short.MAX_VALUE))
                    .addGroup(GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton6)
                        .addContainerGap())
            );
        }

        //======== jPanel2 ========
        {
            jPanel2.setBorder(new TitledBorder(null, "Search Files", TitledBorder.LEADING, TitledBorder.DEFAULT_POSITION, null, new Color(51, 51, 255)));

            //---- jComboBox1 ----
            jComboBox1.setModel(new DefaultComboBoxModel<>(new String[] {
                "Item 1",
                "Item 2",
                "Item 3",
                "Item 4"
            }));

            //---- jButton1 ----
            jButton1.setFont(new Font("Tahoma", Font.BOLD, 14));
            jButton1.setText("Search");

            //======== jScrollPane4 ========
            {

                //---- jTextArea1 ----
                jTextArea1.setColumns(20);
                jTextArea1.setRows(5);
                jScrollPane4.setViewportView(jTextArea1);
            }

            //---- jLabel2 ----
            jLabel2.setText("Max Hop Count :");

            //---- jTextField1 ----
            jTextField1.setText("5");

            GroupLayout jPanel2Layout = new GroupLayout(jPanel2);
            jPanel2.setLayout(jPanel2Layout);
            jPanel2Layout.setHorizontalGroup(
                jPanel2Layout.createParallelGroup()
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup()
                            .addComponent(jScrollPane4)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(34, 34, 34)
                                        .addComponent(jTextField1))
                                    .addComponent(jComboBox1, GroupLayout.PREFERRED_SIZE, 219, GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton1, GroupLayout.PREFERRED_SIZE, 126, GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())
            );
            jPanel2Layout.setVerticalGroup(
                jPanel2Layout.createParallelGroup()
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup()
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jComboBox1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(jTextField1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jButton1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane4, GroupLayout.PREFERRED_SIZE, 92, GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
            );
        }

        //======== jPanel3 ========
        {
            jPanel3.setBorder(new TitledBorder(null, "Neighbours", TitledBorder.LEADING, TitledBorder.DEFAULT_POSITION, null, new Color(51, 51, 255)));

            //======== jScrollPane2 ========
            {

                //---- jTable1 ----
                jTable1.setModel(new DefaultTableModel(
                    new Object[][] {
                    },
                    new String[] {
                        "IP", "PORT"
                    }
                ) {
                    Class<?>[] columnTypes = new Class<?>[] {
                        String.class, String.class
                    };
                    boolean[] columnEditable = new boolean[] {
                        false, false
                    };
                    @Override
                    public Class<?> getColumnClass(int columnIndex) {
                        return columnTypes[columnIndex];
                    }
                    @Override
                    public boolean isCellEditable(int rowIndex, int columnIndex) {
                        return columnEditable[columnIndex];
                    }
                });
                jScrollPane2.setViewportView(jTable1);
            }

            //---- jButton5 ----
            jButton5.setText("JOIN");
            jButton5.addActionListener(e -> jButton5ActionPerformed(e));

            //---- jLabel8 ----
            jLabel8.setText("Select node and press join");

            //---- jButton3 ----
            jButton3.setText("Refresh");
            jButton3.addActionListener(e -> jButton3ActionPerformed(e));

            GroupLayout jPanel3Layout = new GroupLayout(jPanel3);
            jPanel3.setLayout(jPanel3Layout);
            jPanel3Layout.setHorizontalGroup(
                jPanel3Layout.createParallelGroup()
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel3Layout.createParallelGroup()
                            .addComponent(jScrollPane2, GroupLayout.DEFAULT_SIZE, 0, Short.MAX_VALUE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                                .addComponent(jButton5, GroupLayout.PREFERRED_SIZE, 56, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton3, GroupLayout.PREFERRED_SIZE, 71, GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())
            );
            jPanel3Layout.setVerticalGroup(
                jPanel3Layout.createParallelGroup()
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2, GroupLayout.DEFAULT_SIZE, 254, Short.MAX_VALUE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton5)
                            .addComponent(jLabel8)
                            .addComponent(jButton3))
                        .addContainerGap())
            );
        }

        //======== jPanel4 ========
        {
            jPanel4.setBorder(new TitledBorder(null, "My files", TitledBorder.LEADING, TitledBorder.DEFAULT_POSITION, null, Color.blue));

            //======== jScrollPane3 ========
            {

                //---- myFileList ----
                myFileList.setColumns(20);
                myFileList.setRows(5);
                jScrollPane3.setViewportView(myFileList);
            }

            //---- jButton4 ----
            jButton4.setText("Random Initialize");
            jButton4.addActionListener(e -> {
			jButton4ActionPerformed(e);
			jButton4ActionPerformed(e);
		});

            //---- jLabel6 ----
            jLabel6.setText("<html>Number of files<br>3 to 5</html>");

            GroupLayout jPanel4Layout = new GroupLayout(jPanel4);
            jPanel4.setLayout(jPanel4Layout);
            jPanel4Layout.setHorizontalGroup(
                jPanel4Layout.createParallelGroup()
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel4Layout.createParallelGroup()
                            .addComponent(jButton4, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel6, GroupLayout.PREFERRED_SIZE, 120, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtNumFiles, GroupLayout.PREFERRED_SIZE, 57, GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jScrollPane3, GroupLayout.Alignment.TRAILING))
                        .addContainerGap())
            );
            jPanel4Layout.setVerticalGroup(
                jPanel4Layout.createParallelGroup()
                    .addGroup(GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup()
                            .addComponent(txtNumFiles, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton4)
                        .addGap(12, 12, 12)
                        .addComponent(jScrollPane3, GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE)
                        .addContainerGap())
            );
        }

        //======== jScrollPane1 ========
        {

            //---- messageDisplay ----
            messageDisplay.setColumns(20);
            messageDisplay.setRows(5);
            jScrollPane1.setViewportView(messageDisplay);
        }

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                        .addComponent(jPanel2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel4, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addComponent(jPanel3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 291, GroupLayout.PREFERRED_SIZE)))
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGap(18, 18, 18)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                        .addGroup(GroupLayout.Alignment.TRAILING, contentPaneLayout.createSequentialGroup()
                            .addComponent(jPanel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jPanel4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                        .addComponent(jPanel3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addComponent(jPanel2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1))
                    .addContainerGap())
        );
        pack();
        setLocationRelativeTo(getOwner());
    }// </editor-fold>//GEN-END:initComponents

    private void InitializeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InitializeActionPerformed
     /*
        String ip = txtIP.getText();
        String port = txtPort.getText();
        String baseUrl = "http://"+ip+":"+port+"/DS_Project/rest";
        api.setBaseUrl(baseUrl);
        String userName = txtName.getText();
        api.sendGet("bootstrap/register/"+userName);

        */
        
          /* http://localhost:8080/DS_Project/rest/bootstrap/register/Lahiru2
        //Create JSON string and call RegisterMethod
        ObjectMapper mapper = new ObjectMapper();
        RestRequest cli = new RestRequest();
        cli.setIp(txtIP.getText());
        cli.setPort(txtPort.getText());
        cli.setUsername(txtName.getText());
        String jsonInString="";
        try {
            jsonInString = mapper.writeValueAsString(cli);
        } catch (JsonProcessingException ex) {
            Logger.getLogger(ControlPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
        api.sendPost("register", jsonInString);*/
    }//GEN-LAST:event_InitializeActionPerformed
    
    
    
   
    
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed

        myFileList.setText("");
        int max = FileArr.length-1;
        int loop = Integer.parseInt(txtNumFiles.getText());
        String[] arr = new String[loop];
        for (int i = 0; i < loop; i++) {
            int randomNum = rand.nextInt(max + 1) ;
            myFileList.append(FileArr[randomNum]+"\n");
            arr[i] = FileArr[randomNum];
        }
        /*
        Files files = new Files();
        files.setFilenames(arr);
        
        ObjectMapper mapper = new ObjectMapper();
        String jsonInString="";
        try {
            jsonInString = mapper.writeValueAsString(files);
        } catch (JsonProcessingException ex) {
            Logger.getLogger(ControlPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println(jsonInString);*/
        
       // api.sendPost("setFileNames", jsonInString);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed

        int row = jTable1.getSelectedRow();
        String IP = jTable1.getModel().getValueAt(row, 0).toString();
        int port = Integer.parseInt(jTable1.getModel().getValueAt(row, 1).toString());
     
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        /*
        String result = api.sendGet("node/showNeighbours");
        ObjectMapper mapper = new ObjectMapper();
        try {
            RestRequest[] obj = mapper.readValue(result, RestRequest[].class);
            for (int i = 0; i < obj.length; i++) {
                Object[] newRecord = {obj[i].getIp(),obj[i].getPort()};
                model.addRow(newRecord);
            }
            
        } catch (IOException ex) {
            Logger.getLogger(ControlPanel.class.getName()).log(Level.SEVERE, null, ex);
        }*/
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        /*
        String userName = txtName.getText();
        api.sendGet("bootstrap/unregister/"+userName);*/
    }//GEN-LAST:event_jButton6ActionPerformed

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
            java.util.logging.Logger.getLogger(ControlPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ControlPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ControlPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ControlPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ControlPanel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - Lahiru Madushanka
    private JPanel jPanel1;
    private JButton Initialize;
    private JLabel jLabel4;
    private JTextField txtName;
    private JLabel jLabel3;
    private JLabel jLabel5;
    private JTextField txtIP;
    private JTextField txtPort;
    private JButton jButton6;
    private JPanel jPanel2;
    private JComboBox<String> jComboBox1;
    private JButton jButton1;
    private JScrollPane jScrollPane4;
    private JTextArea jTextArea1;
    private JLabel jLabel2;
    private JTextField jTextField1;
    private JPanel jPanel3;
    private JScrollPane jScrollPane2;
    private JTable jTable1;
    private JButton jButton5;
    private JLabel jLabel8;
    private JButton jButton3;
    private JPanel jPanel4;
    private JScrollPane jScrollPane3;
    private JTextArea myFileList;
    private JButton jButton4;
    private JTextField txtNumFiles;
    private JLabel jLabel6;
    private JScrollPane jScrollPane1;
    private JTextArea messageDisplay;
    // End of variables declaration//GEN-END:variables
}
