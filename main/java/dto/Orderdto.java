package dto;

import java.util.ArrayList;

public class Orderdto {
    private String oid;
    private String date;
    private String custid;
  private ArrayList<OrderDetailDto> orderDetailDtos;

    public Orderdto() {
    }

    public Orderdto(String oid, String date, String custid, ArrayList<OrderDetailDto> orderDetailDtos) {
        this.oid = oid;
        this.date = date;
        this.custid = custid;
        this.orderDetailDtos = orderDetailDtos;
    }

    public String getOid() {
        return oid;
    }

    public void setOid(String oid) {
        this.oid = oid;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getCustid() {
        return custid;
    }

    public void setCustid(String custid) {
        this.custid = custid;
    }

    public ArrayList<OrderDetailDto> getOrderDetailDtos() {
        return orderDetailDtos;
    }

    public void setOrderDetailDtos(ArrayList<OrderDetailDto> orderDetailDtos) {
        this.orderDetailDtos = orderDetailDtos;
    }

    @Override
    public String toString() {
        return "Orderdto{" +
                "oid='" + oid + '\'' +
                ", date='" + date + '\'' +
                ", custid='" + custid + '\'' +
                ", orderDetailDtos=" + orderDetailDtos +
                '}';
    }
}
