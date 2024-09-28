package Controller;

import Model.ItemModel;
import dto.Itemdto;

import java.sql.SQLException;
import java.util.ArrayList;

public class ItemController {

    private final ItemModel  model;
    public ItemController(){
        model=new ItemModel();
    }
    public  ArrayList<Itemdto> getAllItem() throws SQLException, ClassNotFoundException {
        ArrayList<Itemdto> itemdtos=model.getAllItem();
        return itemdtos;
    }
    public  String deleteItem( String id) throws SQLException, ClassNotFoundException {
        String resp=model.deleteItem(id);
        return resp;

    }
    public  String saveItem(Itemdto itemdto) throws SQLException, ClassNotFoundException {
        String rst=model.saveItem(itemdto);
        return rst;

    }
    public Itemdto searchItem(String itemCode) throws SQLException, ClassNotFoundException {
        Itemdto dto=model.searchItem(itemCode);
        return dto;

    }
    public  String UpdateItem(Itemdto itemdto) throws SQLException, ClassNotFoundException {
        String resp=model.UpdateItem( itemdto);
        return resp;

    }

}
