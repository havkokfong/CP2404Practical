public class ItemSold {
    private int invoiceNumber;
    private String description;
    private int price;

    public int getInvoiceNumber(){
        return invoiceNumber;
    }

    public int getPrice(){
        return price;
    }

    public String getDescription(){
        return description;
    }

    public void setInvoiceNumber(int invoice){
        invoiceNumber = invoice;
    }

    public void setDescription(String descript){
        description = descript;
    }

    public void setPrice(int set_price){
        price = set_price;
    }
}
