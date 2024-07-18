//S=Single Responsible
//0=Open/close principle
//L=Liskov substitution principle
//I=Interface segmented principle
//D=Dependency Inversion principle

class S1SOLIDprinciples{
    public static void main(String[] args) {
        
    }
}
//A class should have 1 reason to change=>
class Marker{
    String name;
    String color;
    int year;
    int price;

    Marker(String name,String color,int year,int price){
        this.name=name;
        this.color=color;
        this.year=year;
        this.price=price;
    }
    }

class Invoice{
    private Marker marker;
    private int quantity;

    public Invoice(Marker marker,int quantity){
        this.marker=marker;
        this.quantity=quantity;
    }

    public int calculateTotal(){
        int price=(marker.price)*this.quantity;
        return price;
    }

    public void printInvoice(){
        //print Invoice
    }
    public void saveToDB(){
        //Save the data into DB
    }
}
//THIS HAS TO SINGLE RESPONSIBLE PRINCIPLE NOT FOLLOWED SO WE NEED TO HAVE DIFFERENT CLASS WHICH SINGLE RESPONSIBILITY TO CHANGE

class InvoiceDao{
    Invoice invoice;
    public InvoiceDao(Invoice invoice){
        this.invoice=invoice;
    }
    public void saveToDB(){
        //save into the DB
    }
}
class InvoicePrinter{
    private Invoice invoice;

    public InvoicePrinter(Invoice invoice){
        this.invoice=invoice;
    }
    public void print(){
        //print the invoice
    }
}
class InvoiceCalculate{
    private Marker marker;
    private int quantity;

    public InvoiceCalculate(Marker marker,int quantity){
        this.marker=marker;
        this.quantity=quantity;
    }
    public int calculate(){
        int price=(marker.price)*this.quantity;
        return price;
    }

}

//==>Easy to maintain and use and Easy to understand

