
package collectionsexamples;

public class Product {
    int price;
    int quantity;
    String name;

    public Product(){
        
    }
    
    public Product(int price, int quantity, String name){
        this.price = price;
        this.quantity = quantity;
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Product{" + "name=" + name + '}';
    }

    

    
    
  
}
