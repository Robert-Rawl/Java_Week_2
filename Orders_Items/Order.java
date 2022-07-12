import java.util.ArrayList;
// CLASS MEMBER VARIABLES
public class Order {
    private String name;
    private boolean ready;
    private ArrayList<Item> items = new ArrayList<Item>();

    public Order(){
        this.name = "Guest";
        this.ready = false;
    }
    public Order(String name ){
        this.name = name;
        this.ready = false;
    }
    public String getName(){
        return this.name;
    }
    public boolean getReady(){
        return this.ready;
    }
    public ArrayList<Item> getItems(){
        return items;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setReady(boolean ready){
        this.ready = ready;
    }
    public void setItems(ArrayList<Item> items) {
        this.items = items;
    }
    //  Add an item to the order Array
    public void addItem(Item item) {
        this.items.add(item);
    }
    //  Get Order Status, return boolean
    public String getStatusMessage(){
        if(this.ready == true){
            return "Your Order Is Ready";
        }else {
            return "Thank You for your patience. Your order should be up soon.";
        }
    }
    // Get Order Total add all items and return a total
    public double getOrderTotal(){
        double total = 0;
        for(Item i: this.items){
            total += i.getPrice();
        }
        return total;
    }
    // Display info 
    public void displayInfo(){
        System.out.println("********************");
        System.out.printf("Customer Name: %s%n", this.name);
        for(Item i: this.items) {
            System.out.println(i.getName() + " - $" + i.getPrice());
        }
        System.out.println("Total: $" + this.getOrderTotal());
    }
}