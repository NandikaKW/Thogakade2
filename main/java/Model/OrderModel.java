package Model;

import com.edu.ijse.db.DBConnection;
import dto.OrderDetailDto;
import dto.Orderdto;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.UUID;

public class OrderModel {
    public ArrayList<Orderdto> getAllOrders() throws SQLException, ClassNotFoundException {
        Connection connection = DBConnection.getInstance().getConnection();
        String sql = "SELECT * FROM orders";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        ArrayList<Orderdto> orderdtos = new ArrayList<>();
        ResultSet rst = preparedStatement.executeQuery();
        while (rst.next()) {
            Orderdto dto = new Orderdto();
            dto.setOid(rst.getString(1));
            dto.setDate(rst.getString(2));
            dto.setCustid(rst.getString(3));
            orderdtos.add(dto);
        }
        return orderdtos;


    }

    public String saveItem(Orderdto orderdto) throws SQLException, ClassNotFoundException {
        Connection connection = DBConnection.getInstance().getConnection();
        String sql = "INSERT INTO orders values (?,?,?)";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setString(1, orderdto.getOid());
        statement.setString(2, orderdto.getDate());
        statement.setString(3, orderdto.getCustid());

        int rst = statement.executeUpdate();
        return rst > 0 ? "Sucessfully Saved!" : "Order Cannot be Saved !";


    }

    public Orderdto searchOrder(String id) throws SQLException, ClassNotFoundException {
        Connection connection = DBConnection.getInstance().getConnection();
        String sql = "SELECT * FROM orders WHERE OrderID=?";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setString(1, id);

        ResultSet rst = statement.executeQuery();

        if (rst.next()) {
            String o_Id = rst.getString(1);
            String date = rst.getString(2);
            String custId = rst.getString(3);

            // Retrieve order details from the database
            ArrayList<OrderDetailDto> orderDetailDtos = getOrderDetails(o_Id);

            Orderdto dto = new Orderdto(o_Id, date, custId, orderDetailDtos);
            return dto;
        } else {
            return null;
        }
    }

    // Helper method to retrieve order details
    private ArrayList<OrderDetailDto> getOrderDetails(String o_Id) throws SQLException, ClassNotFoundException {
        Connection connection = DBConnection.getInstance().getConnection();
        String sql = "SELECT * FROM orderdetail WHERE OrderID=?";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setString(1, o_Id);

        ResultSet rst = statement.executeQuery();
        ArrayList<OrderDetailDto> orderDetailDtos = new ArrayList<>();

        while (rst.next()) {
            OrderDetailDto orderDetailDto = new OrderDetailDto(rst.getString(2), rst.getInt(3), rst.getDouble(4));
            orderDetailDtos.add(orderDetailDto);
        }

        return orderDetailDtos;
    }

    public String updateOrder(Orderdto orderdto) throws SQLException, ClassNotFoundException {
        Connection connection = DBConnection.getInstance().getConnection();
        String sql = "UPDATE orders SET OrderDate=?,CustID=? WHERE OrderID=?";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setString(1, orderdto.getDate());
        statement.setString(2, orderdto.getCustid());
        statement.setString(3, orderdto.getOid());

        int resp = statement.executeUpdate();
        return resp > 0 ? " Order  Update Sucessfully!" : "Order Not Updated !";


    }
    public   String  placeOrder(Orderdto orderdto) throws SQLException, ClassNotFoundException {
      Connection connection=DBConnection.getInstance().getConnection();
      try{
          connection.setAutoCommit(false);
          String ordersql="INSERT INTO Orders VALUES(?,?,?)";
          PreparedStatement orderstatement=connection.prepareStatement(ordersql);
          orderstatement.setString(1,orderdto.getOid());
          orderstatement.setString(2,orderdto.getDate());
          orderstatement.setString(3,orderdto.getCustid());

          boolean isOrderSaved=orderstatement.executeUpdate()>0;

          if (isOrderSaved){
              boolean isOrderDetailSaved=true;
              for (OrderDetailDto orderDetailDto:orderdto.getOrderDetailDtos()){
                  String orderDetailSql="INSERT INTO OrderDetail VALUES(?,?,?,?)";
                  PreparedStatement orderdetailstatement=connection.prepareStatement(orderDetailSql);

                  orderdetailstatement.setString(1,orderdto.getOid());
                  orderdetailstatement.setString(2,orderDetailDto.getItemCode());
                  orderdetailstatement.setInt(3,orderDetailDto.getQty());
                  orderdetailstatement.setDouble(4,orderDetailDto.getDiscount());

                  if(!(orderdetailstatement.executeUpdate()>0)){
                      isOrderDetailSaved=false;

                  }

              }
              if(isOrderDetailSaved){
                  boolean isItemUpdated=true;
                  for(OrderDetailDto orderDetailDto:orderdto.getOrderDetailDtos()){
                     String itemUpdateSql="UPDATE item SET QtyOnHand=QtyOnHand-? WHERE ItemCode=?";

                     PreparedStatement itemStatement=connection.prepareStatement(itemUpdateSql);
                     itemStatement.setInt(1,(orderDetailDto.getQty()));
                     itemStatement.setString(2,(orderDetailDto.getItemCode()));

                     if(!(itemStatement.executeUpdate()>0)){
                         isItemUpdated=false;

                     }

                  }
                  if(isItemUpdated){
                      connection.commit();;
                      return  " saved";

                  }else{
                      connection.rollback();
                      return  "Item update Error !";
                  }


              }else{
                  connection.rollback();
                  return "Order Detail Save Error !";
              }
          }else{
              connection.rollback();
              return "Order Not Saved!";
          }


      } catch (Exception e) {
          connection.rollback();
          throw e;

      }
    }
}