import java.util.ArrayList;
public class TestOrders {
    public static void main(String[] args) {
        Item item1 = new Item("Drip Coffe", 3.0);
        Item item2 = new Item("Mocha", 4.25);
        Item item3 = new Item("Americano", 4.50);
        Item item4 = new Item("Salted Caramel Machiatto", 5.50);

        Order order1 = new Order();
        Order order2 = new Order();

        Order order3 = new Order("Rob");
        Order order4 = new Order("Chloe");
        Order order5 = new Order("Cheslyn");

        order1.addItem(item1);
        order1.addItem(item2);

        System.out.println(order1.getStatusMessage());

        order1.setReady(true);
        System.out.println(order1.getStatusMessage());
        System.out.println(order1.getOrderTotal());

        order3.addItem(item4);
        order3.addItem(item3);
        order3.addItem(item2);
        order3.displayInfo();


    }
}       
    
