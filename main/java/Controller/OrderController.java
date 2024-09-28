package Controller;

import Model.OrderModel;
import dto.Orderdto;

import java.sql.SQLException;
import java.util.ArrayList;

public class OrderController {
    private  OrderModel model;
    public OrderController(){

        model=new OrderModel();
    }
   public  String placeOrder(Orderdto orderdto)throws SQLException,ClassNotFoundException{
          String resp=model.placeOrder(orderdto);
          return resp;

   }

    public  ArrayList<Orderdto> getAllOrders() throws SQLException, ClassNotFoundException {
        ArrayList<Orderdto> dto=model.getAllOrders();
        return dto;
    }
    public  String saveItem(Orderdto orderdto) throws SQLException, ClassNotFoundException {
        String resp=model.saveItem(orderdto);
        return resp;
    }
    public  Orderdto searchOrder( String id) throws SQLException, ClassNotFoundException {
        Orderdto orderdto=model.searchOrder( id);
        return orderdto;

    }

    public  String updateOrder( Orderdto orderdto) throws SQLException, ClassNotFoundException {
        String resp=model.updateOrder( orderdto);
        return resp;

    }

}
