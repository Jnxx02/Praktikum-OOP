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

enum Jenis{
    burger,
    pizza,
    steak
}

class FoodFactory {
    public static Food getFood(Jenis type) {
       switch(type) {
        case burger:
        return new Burger();

        case pizza:
        return new Pizza();

        case steak:
        return new Steak();

        default:
        throw new IllegalArgumentException("Unknown food");
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
        Food burger = FoodFactory.getFood(Jenis.burger);
        Food pizza = FoodFactory.getFood(Jenis.pizza);
        Food steak = FoodFactory.getFood(Jenis.steak);

        List<Food> foods = new ArrayList<>();
        foods.add(burger);
        foods.add(pizza);
        foods.add(steak);

        int total = Restaurant.calculateTotal(foods);

        System.out.println("Total price: " + total);
    }
}
