package Model;

import com.edu.ijse.db.DBConnection;
import dto.CustomerDto;
import dto.Itemdto;

import java.net.ConnectException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ItemModel {

    public   ArrayList<Itemdto> getAllItem() throws SQLException, ClassNotFoundException {
        Connection connection= DBConnection.getInstance().getConnection();
        String sql="SELECT * FROM item";
        PreparedStatement preparedStatement=connection.prepareStatement(sql);
        ArrayList<Itemdto> itemdtos=new ArrayList<>();
        ResultSet rst  =preparedStatement.executeQuery();
        while(rst.next()){
            Itemdto dto = new Itemdto();
            dto.setItemcode(rst.getString(1));
            dto.setDescription(rst.getString(2));
            dto.setPacksize(rst.getString(3));
            dto.setUnitprice(rst.getDouble(4));
            dto.setQtyOnHand(rst.getInt(5));
            itemdtos.add(dto);

        }
        return itemdtos;


    }
    public  String  deleteItem( String id) throws SQLException, ClassNotFoundException {
        Connection connection=DBConnection.getInstance().getConnection();
        String sql="DELETE FROM item WHERE ItemCode=?";
        PreparedStatement preparedStatement=connection.prepareStatement(sql);
        preparedStatement.setString(1,id);
        int resp= preparedStatement.executeUpdate();
        return resp > 0 ? "Delete Sucess!":"Item  Not Deleted";

    }
    public  String saveItem(Itemdto itemdto) throws SQLException, ClassNotFoundException {
        Connection connection=DBConnection.getInstance().getConnection();
        String sql="INSERT INTO item VALUES (?,?,?,?,?)";
        PreparedStatement statement=connection.prepareStatement(sql);
        statement.setString(1,itemdto.getItemcode());
        statement.setString(2,itemdto.getDescription());
        statement.setString(3,itemdto.getPacksize());
        statement.setDouble(4,itemdto.getUnitprice());
        statement.setInt(5,itemdto.getQtyOnHand());
        int rst= statement.executeUpdate();
        return rst>0 ? "Sucessfully Svaed":"Item Cannot Be found";

    }
   public Itemdto searchItem(String itemcode) throws SQLException, ClassNotFoundException {
        Connection connection=DBConnection.getInstance().getConnection();
        String sql="SELECT * FROM item WHERE ItemCode=?";
        PreparedStatement statement=connection.prepareStatement(sql);
        statement.setString(1,itemcode);
        ResultSet rst=statement.executeQuery();
        while(rst.next()){
            Itemdto dto=new Itemdto();
            dto.setItemcode(rst.getString(1));
            dto.setDescription(rst.getString(2));
            dto.setPacksize(rst.getString(3));
            dto.setUnitprice(rst.getDouble(4));
            dto.setQtyOnHand(rst.getInt(5));

            return dto;


        }
        return null;

   }
    public  String UpdateItem( Itemdto itemdto) throws  ClassNotFoundException,SQLException{
        Connection connection=DBConnection.getInstance().getConnection();
        String sql="UPDATE item SET Description=?,PackSize=?,UnitPrice=?,QtyOnHand=?  WHERE ItemCode=?";
        PreparedStatement statement=connection.prepareStatement(sql);

        statement.setString(1,itemdto.getDescription());
        statement.setString(2,itemdto.getPacksize());
        statement.setDouble(3,itemdto.getUnitprice());
        statement.setInt(4,itemdto.getQtyOnHand());
        statement.setString(5,itemdto.getItemcode());
         int resp=statement.executeUpdate();

        return resp > 0 ? "Item Update Sucessfully!":"Item Not Updated !";
    }





}
