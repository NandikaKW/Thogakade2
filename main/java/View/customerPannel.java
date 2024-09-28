/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package View;

import Controller.CustomerController;
import dto.CustomerDto;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Kaweesha
 */
public class customerPannel extends javax.swing.JPanel {
  private CustomerController customercontroller;
  


    /**
     * Creates new form customerPannel
     */
    public customerPannel() throws SQLException, ClassNotFoundException {
        customercontroller=new CustomerController();

        initComponents();
        getAll();
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
        customerId = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        btndelete = new javax.swing.JButton();
        btnsave = new javax.swing.JButton();
        btnupdate = new javax.swing.JButton();
        txtId = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        txtSalary = new javax.swing.JTextField();
        txtCity = new javax.swing.JTextField();
        txtTitle = new javax.swing.JTextField();
        txtDob = new javax.swing.JTextField();
        txtAddress = new javax.swing.JTextField();
        txtProvince = new javax.swing.JTextField();
        txtZip = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCustomer = new javax.swing.JTable();

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 25)); // NOI18N
        jLabel1.setText("Customer Form ");

        customerId.setFont(new java.awt.Font("Segoe UI", 3, 13)); // NOI18N
        customerId.setText("Customer ID");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 3, 13)); // NOI18N
        jLabel3.setText("Customer Name ");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 3, 13)); // NOI18N
        jLabel4.setText("salary");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 3, 13)); // NOI18N
        jLabel5.setText("City ");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 3, 13)); // NOI18N
        jLabel6.setText("Cutomer Title ");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 3, 13)); // NOI18N
        jLabel7.setText("DOB");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 3, 13)); // NOI18N
        jLabel8.setText("Address");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 3, 13)); // NOI18N
        jLabel9.setText("Province ");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 3, 13)); // NOI18N
        jLabel10.setText("Postal Code");

        btndelete.setFont(new java.awt.Font("Segoe UI", 3, 15)); // NOI18N
        btndelete.setText("Delete ");
        btndelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
                    btndeleteActionPerformed(evt);
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                } catch (ClassNotFoundException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        btnsave.setFont(new java.awt.Font("Segoe UI", 3, 15)); // NOI18N
        btnsave.setText("Save ");
        btnsave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsaveActionPerformed(evt);
            }
        });

        btnupdate.setFont(new java.awt.Font("Segoe UI", 3, 15)); // NOI18N
        btnupdate.setText("Update ");
        btnupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnupdateActionPerformed(evt);
            }
        });

        txtId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdActionPerformed(evt);
            }
        });

        tblCustomer.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6", "Title 7", "Title 8", "Title 9"
            }
        ));
        tblCustomer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblCustomerMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblCustomer);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(252, 252, 252))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(customerId)
                                .addGap(31, 31, 31)
                                .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtName)
                                    .addComponent(txtSalary))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtTitle))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtDob))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtCity, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(11, 11, 11)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtZip, javax.swing.GroupLayout.DEFAULT_SIZE, 211, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnupdate))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtAddress)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnsave))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtProvince)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btndelete)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(customerId)
                    .addComponent(jLabel5)
                    .addComponent(jLabel8)
                    .addComponent(btnsave)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel6)
                    .addComponent(jLabel9)
                    .addComponent(btndelete)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtProvince, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel7)
                    .addComponent(jLabel10)
                    .addComponent(btnupdate)
                    .addComponent(txtSalary, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDob, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtZip, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 402, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btndeleteActionPerformed(java.awt.event.ActionEvent evt) throws SQLException, ClassNotFoundException {//GEN-FIRST:event_btndeleteActionPerformed
        deleteCustomer();
    }//GEN-LAST:event_btndeleteActionPerformed

    private void btnsaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsaveActionPerformed
      saveCustomer();
    }//GEN-LAST:event_btnsaveActionPerformed

    private void tblCustomerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblCustomerMouseClicked
       searchCustomer();
    }//GEN-LAST:event_tblCustomerMouseClicked

    private void btnupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnupdateActionPerformed
        updateCustomer();
    }//GEN-LAST:event_btnupdateActionPerformed

    private void txtIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btndelete;
    private javax.swing.JButton btnsave;
    private javax.swing.JButton btnupdate;
    private javax.swing.JLabel customerId;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblCustomer;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtCity;
    private javax.swing.JTextField txtDob;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtProvince;
    private javax.swing.JTextField txtSalary;
    private javax.swing.JTextField txtTitle;
    private javax.swing.JTextField txtZip;
    // End of variables declaration//GEN-END:variables
    private void getAll() throws ClassNotFoundException, SQLException {
        String [] columns={"CustID","CustTitle","CustName","DOB","salary","CustAddress","City","Province","PostalCode"};
        DefaultTableModel dtm=new DefaultTableModel(columns,0){
            public  boolean isCellEditable(int row,int column){
                return false;

            }
        };
        tblCustomer.setModel(dtm);
        try{
            List<CustomerDto> customerDtos=customercontroller. getAll();
            for (CustomerDto dto:customerDtos){
                Object[]rowData = {dto.getCustID(),dto.getCustTitle(),dto.getCustName(),dto.getDob(),dto.getSalary(),dto.getAddress(),dto.getCity(),dto.getProvince(),dto.getZipCode()};
                dtm.addRow(rowData);

            }

        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this,e.getMessage());

        }

    }
    public void saveCustomer(){
        CustomerDto customerDto=new CustomerDto(
                txtId.getText(),txtTitle.getText(),txtName.getText(),txtDob.getText(),Double.parseDouble(txtSalary.getText()),txtAddress.getText(),txtCity.getText(),txtProvince.getText(),txtZip.getText()
        );
    try{
        String resp=customercontroller. saveCustomer(customerDto);
        JOptionPane.showMessageDialog(this,resp);
        getAll();
        clearTextField();


    } catch (Exception e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(this,e.getMessage());

    }
    
    
    
    }
    private void searchCustomer(){
        String customerId=(String) tblCustomer.getValueAt(tblCustomer.getSelectedRow(),0);
        try{
            CustomerDto dto=customercontroller. searchCustomer(customerId);
            if (dto!=null){
                txtId.setText(dto.getCustID());
                txtTitle.setText(dto.getCustTitle());
                txtName.setText(dto.getCustName());
                txtDob.setText(dto.getDob());
                txtSalary.setText(Double.toString(dto.getSalary()));
                txtAddress.setText(dto.getAddress());
                txtCity.setText(dto.getCity());
                txtProvince.setText(dto.getProvince());
                txtZip.setText(dto.getZipCode());

            }else{
                JOptionPane.showMessageDialog(this,"Customer Not Found");
            }

        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this,e.getMessage());

        }

    }
    public void deleteCustomer() throws ClassNotFoundException,SQLException{
        String id =(String) tblCustomer.getValueAt(tblCustomer.getSelectedRow(),0);
        System.out.println(id);

        String resp=customercontroller.deleteCustomer(id);
        JOptionPane.showMessageDialog(this,resp);
        getAll();
        clearTextField();


    
    
    }
    void clearTextField(){
        txtId.setText("");
        txtTitle.setText("");
        txtName.setText("");
        txtDob.setText("");
        txtSalary.setText("");
        txtAddress.setText("");
        txtZip.setText("");
        txtCity.setText("");
        txtProvince.setText("");


    }
    public void updateCustomer(){
        String id=txtId.getText();

        CustomerDto customerDto=new CustomerDto(
                id,
                txtTitle.getText(),
                txtName.getText(),
                txtDob.getText(),
                Double.parseDouble(txtSalary.getText()),
                txtAddress.getText(),
                txtCity.getText(),
                txtProvince.getText(),
                txtZip.getText()
        );
        try{
            String resp=customercontroller.updateCustomer(customerDto);
            JOptionPane.showMessageDialog(this,resp);
            getAll();
            clearTextField();

        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this,e.getMessage());

        }

    }
    
}
