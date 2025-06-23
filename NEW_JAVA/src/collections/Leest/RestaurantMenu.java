package collections.Leest;
import java.util.ArrayList;

public class RestaurantMenu {
    public ArrayList<MenuItem> items;

    public RestaurantMenu() {
        items = new ArrayList<>();
        items.add(new MenuItem("Burger", 50));
        items.add(new MenuItem("Pizza", 100));
        items.add(new MenuItem("Salad", 30));
        items.add(new MenuItem("Pasta", 80));
    }

    public ArrayList<MenuItem> getItems() {
        return items;
    }

    public void displayMenu() {
        System.out.println("\n--- Restaurant Menu ---");
        for (int i = 0; i < items.size(); i++) {
            MenuItem item = items.get(i);
            System.out.println("Item name: " + item.getName() + ", Item Price: " + item.getPrice());
        }
    }
}
