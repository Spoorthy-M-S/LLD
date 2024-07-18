package LLD.S1SOLIDprinciples;

//Develop a library system that manages various types of library items such as books,CDs,and DVDs.
//Each item has a title ,a unique identification and a type-specific property(eg:author for books).
//The system should allow users to check out items,calculate late fees based on the item type,
//   and determine the total value of all items of library. //SOLID
public class S1LibrarySystem {

    public static void main(String[] args) {
        Book b1=new Book("spoo", "sPOO", 44, 44);
        System.out.println(b1.getValue());
        System.out.println(b1.calculateLatefee(5));
    }
}

// Single Responsibility principle

interface LibraryItems extends LateFeeCalculation{
    String gettitle();

    String getUniqueId();

   // double calculateLatefee(int days);===>STREAMLINE OUT FURTHER

    double getValue();
}
//##3)Interface segregation

interface LateFeeCalculation{
    double calculateLatefee(int days);
}



