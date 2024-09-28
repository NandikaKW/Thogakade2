/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.CustomerModel;
import dto.CustomerDto;

import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Kaweesha
 */
public class CustomerController  {
    private CustomerModel customermodel=new CustomerModel();

    public   List<CustomerDto> getAll() throws ClassNotFoundException, SQLException {
        List<CustomerDto> customerDtos= customermodel.getAll();
        return customerDtos;
    }
    public String   saveCustomer(CustomerDto customerDto) throws ClassNotFoundException, SQLException {
        String resp=customermodel.saveCustomer(customerDto);
        return resp;


    }
   public CustomerDto searchCustomer(String customerId) throws ClassNotFoundException, SQLException {
        CustomerDto dto=customermodel.searchCustomer(customerId);
        return dto;

   }
    public  String  deleteCustomer(String id) throws SQLException, ClassNotFoundException {
        String resp=customermodel.deleteCustomer(id);
        return resp;

    }
    public  String updateCustomer(CustomerDto customerDto) throws SQLException, ClassNotFoundException {
        String resp=customermodel. updateCustomer(customerDto);
        return resp;

    }



}
