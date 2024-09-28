package dto;

public class Itemdto {
    private String itemcode;
    private  String description;
    private  String packsize;
    private  double unitprice;
    private  int QtyOnHand;

    public Itemdto() {
    }

    public Itemdto(String itemcode, String description, String packsize, double unitprice, int qtyOnHand) {
        this.itemcode = itemcode;
        this.description = description;
        this.packsize = packsize;
        this.unitprice = unitprice;
        QtyOnHand = qtyOnHand;
    }

    public String getItemcode() {
        return itemcode;
    }

    public void setItemcode(String itemcode) {
        this.itemcode = itemcode;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPacksize() {
        return packsize;
    }

    public void setPacksize(String packsize) {
        this.packsize = packsize;
    }

    public double getUnitprice() {
        return unitprice;
    }

    public void setUnitprice(double unitprice) {
        this.unitprice = unitprice;
    }

    public int getQtyOnHand() {
        return QtyOnHand;
    }

    public void setQtyOnHand(int qtyOnHand) {
        QtyOnHand = qtyOnHand;
    }

    @Override
    public String toString() {
        return "Itemdto{" +
                "itemcode='" + itemcode + '\'' +
                ", description='" + description + '\'' +
                ", packsize='" + packsize + '\'' +
                ", unitprice=" + unitprice +
                ", QtyOnHand=" + QtyOnHand +
                '}';
    }
}
