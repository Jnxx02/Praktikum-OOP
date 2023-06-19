import java.util.ArrayList;
import java.util.List;

interface Food {
    int getPrice();
}

class Burger implements Food {
    private int price;

    @Override
    public int getPrice() {
        return price;
    }
    
}

class Pizza implements Food {
    private int price;

    @Override
    public int getPrice() {
        return price;
    }
    
}

class Steak implements Food {
    private int price;

    @Override
    public int getPrice() {
        return price;
    }
    
}

class FoodFactory {
    public static Food getFood(String type) {
       if(type.equalsIgnoreCase("burger")) {
        return new Burger();
       } else if(type.equalsIgnoreCase("pizza")) {
        return new Pizza();
       } else if(type.equalsIgnoreCase("steak")) {
        return new Steak();
       } else {
        throw new IllegalArgumentException("Unknown food type" + type);
       }
    }
}

class Restaurant {
    public static int calculateTotal(List<Food> foods) {
        int total = 0;

        for(Food food : foods) {
            total += food.getPrice();
        }

        return total;
    }
}

public class No3 {
    public static void main(String[] args) {
        Food burger = FoodFactory.getFood("burger");
        Food pizza = FoodFactory.getFood("pizza");
        Food steak = FoodFactory.getFood("steak");

        List<Food> foods = new ArrayList<>();
        foods.add(burger);
        foods.add(pizza);
        foods.add(steak);

        int total = Restaurant.calculateTotal(foods);

        System.out.println("Total price: " + total);
    }
}
