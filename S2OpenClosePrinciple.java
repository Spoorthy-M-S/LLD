public class S2OpenClosePrinciple {
    public static void main(String[] args) {
        
    }
    
}
//Open for Extension and close for modification

interface InvoiceDAL{
    public void save(Invoice invoice);
}
class DataBaseinvoiceDao implements InvoiceDAL{
    @Override
    public void save(Invoice invoice) {
        //Save to file
    }
}
