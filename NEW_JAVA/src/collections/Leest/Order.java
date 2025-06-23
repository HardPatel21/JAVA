package collections.Leest;

import java.util.ArrayList;

public class Order {
    public int itemCount;
    public ArrayList<MenuItem> orderedItems;

    public Order() {
        orderedItems = new ArrayList<>();
        this.itemCount = 0;
    }

    public void addItem(String itemName, RestaurantMenu menu) {
        for (MenuItem item : menu.getItems()) {
            if (item.getName().equalsIgnoreCase(itemName)) {
                orderedItems.add(item);
                System.out.println("Added: " + item.getName());
                return;
            }
        }
        System.out.println("Item not found on menu.");
    }

    public void viewOrder() {
        if (orderedItems.isEmpty()) {
            System.out.println("\nYour order is empty.");
            return;
        }

        System.out.println("\n--- Your Order ---");
        for (MenuItem item : orderedItems) {
            System.out.println("Item name: " + item.getName() + ", Price:" + item.getPrice());
        }
    }

    public double calculateTotal() {
        double total = 0;
        for (MenuItem item : orderedItems) {
            total += item.getPrice();
        }
        return total;
    }
}
