/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import Controller.CustomerController;
import com.edu.ijse.db.DBConnection;
import dto.CustomerDto;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Kaweesha
 */
public class CustomerModel {
    public  List<CustomerDto> getAll() throws ClassNotFoundException,  SQLException {
        Connection connection= DBConnection.getInstance().getConnection();
        String sql="SELECT * FROM customer";
        PreparedStatement statement=connection.prepareStatement(sql);

        List<CustomerDto> customerdtos=new ArrayList<>();

        ResultSet rst=statement.executeQuery();
        while(rst.next()){
            CustomerDto dto=new CustomerDto(
                    rst.getString(1),rst.getString(2),rst.getString(3),rst.getString(4),rst.getDouble(5),rst.getString(6),rst.getString(7),rst.getString(8),rst.getString(9)
            );
            customerdtos.add(dto);
        }
        return customerdtos;


    }
    public  String saveCustomer(CustomerDto customerDto) throws SQLException, ClassNotFoundException {
        Connection connection=DBConnection.getInstance().getConnection();
        String sql="INSERT INTO customer VALUES(?,?,?,?,?,?,?,?,?)";
            PreparedStatement statement=connection.prepareStatement(sql);
            statement.setString(1,customerDto.getCustID());
            statement.setString(2,customerDto.getCustTitle());
            statement.setString(3,customerDto.getCustName());
            statement.setString(4,customerDto.getDob());
            statement.setDouble(5,customerDto.getSalary());
            statement.setString(6,customerDto.getAddress());
            statement.setString(7,customerDto.getCity());
            statement.setString(8,customerDto.getProvince());
            statement.setString(9,customerDto.getZipCode());

            int result=statement.executeUpdate();
            return result>0 ? "Sucess":"False";

    }
   public CustomerDto searchCustomer(String customerId) throws SQLException, ClassNotFoundException {
        Connection connection=DBConnection.getInstance().getConnection();
        String sql="SELECT * FROM customer WHERE custID=?";
        PreparedStatement statement=connection.prepareStatement(sql);
        statement.setString(1,customerId);

        ResultSet rst=statement.executeQuery();
             while(rst.next()){
                 CustomerDto dto=new CustomerDto();
                 dto.setCustID(rst.getString(1));
                 dto.setCustTitle(rst.getString(2));
                 dto.setCustName(rst.getString(3));
                 dto.setDob(rst.getString(4));
                 dto.setSalary(rst.getDouble(5));
                 dto.setAddress(rst.getString(6));
                 dto.setCity(rst.getString(7));
                 dto.setProvince(rst.getString(8));
                 dto.setZipCode(rst.getString(9));

                 return dto;


             }
             return null;

   }
    public String deleteCustomer(String id) throws SQLException, ClassNotFoundException {
        Connection connection=DBConnection.getInstance().getConnection();
        String sql="DELETE FROM customer WHERE custID=?";
        PreparedStatement statement=connection.prepareStatement(sql);
        statement.setString(1,id);

        int resp=statement.executeUpdate();
        return resp > 0 ? "Delete Sucess!":"Customer Not Deleted";

    }
    public String updateCustomer(CustomerDto customerDto) throws SQLException, ClassNotFoundException {
        Connection connection=DBConnection.getInstance().getConnection();
        String sql="UPDATE customer SET CustTitle=?,CustName=?,DOB=?,salary=?,CustAddress=?,City=?,Province=?,PostalCode=? WHERE CustID=?";
        PreparedStatement statement=connection.prepareStatement(sql);

        statement.setString(1,customerDto.getCustTitle());
        statement.setString(2,customerDto.getCustName());
        statement.setString(3,customerDto.getDob());
        statement.setDouble(4,customerDto.getSalary());
        statement.setString(5,customerDto.getAddress());
        statement.setString(6,customerDto.getCity());
        statement.setString(7,customerDto.getProvince());
        statement.setString(8,customerDto.getZipCode());
        statement.setString(9,customerDto.getCustID());
        int resp=statement.executeUpdate();

        return resp>0 ? "Update SucessFully ":"Not Updated";



    }


    
}
