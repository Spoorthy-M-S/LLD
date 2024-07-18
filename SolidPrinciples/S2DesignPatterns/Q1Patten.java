package LLD.S2DesignPatterns;
/**
 * Develop a platform for a fictional online shopping platform called "ShopWorld".
 * The system should include the management of
 * product listings,user accounts,and the ordering process.
 * 
 * REQUIREMENTS:
 * 1)User management=>Name,password[user authen,and authorization]
 * 2)Product Management=>diff categories
 * 3)Order Processing=add product,place order
 */

/**
 * CREATIONAL DESIGN PROJECT:
 * HELPS IN:
 * 1)Standardization of Object Creation
 * 2)Enhanced Flexibility
 * 3)Encapsulation of object Creation
 * 4)Improved Reusability
 * 5)Scalability and Maintainability
 */

/*
 * SINGLETON DESIGN PATTERN
 */
public class Q1Patten {

    public static void main(String[] args) {
        // Product electronic1=new Product();==>Leads to messy so we create a new
        // interface called Product
        // Product stat1=new Product();
    }
}

/*
 * SINGLETON ,so that only one instance/object can be created
 */
class UserDataBase {
    private static UserDataBase userInstance;

    private UserDataBase() {
        // Makes the constructor Private
    }

    // synchronization makes shore only 1 method/Threads gets executed at once
    public static synchronized UserDataBase getInstance() {
        if (userInstance == null) {
            userInstance = new UserDataBase();
        }
        return userInstance;
    }
}

interface Product {
    void displayInfo();
}

class clothing implements Product {
    public void displayInfo() {
        System.out.println("This is a clothing Product!");
    }
}
class Productfactory{
    Product createproduct(String categ){
        switch(categ.toLowerCase()){
            case "electronics":
            return new ElectronicProduct();
            case "clothing":
            return new ClothingProduct();
            default:
            throw new IllegalArgumentException("Invalid categ"+categ);
        }
    }
}
class ElectronicProduct{
    Product ElectronicProduct(){
       return 
    }
}