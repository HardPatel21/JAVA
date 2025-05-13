package OOPJ;

class Food {
    double price;
    String itemName;
    static String category;

    public Food(String itemName, double price) {
        this.itemName = itemName;
        this.price = price;
    }

    static {
        category = "beverages";
    }

    @Override
    public String toString() {
        return "Food{" +
                "price=" + price +
                ", itemName='" + itemName + '\'' +
                '}';
    }
}

public class FoodItem {
    public static void main(String[] args) {
        Food f = new Food("Lemon Juice", 35.90);
        System.out.println(f);
        System.out.println("Category :" + Food.category);
    }
}


