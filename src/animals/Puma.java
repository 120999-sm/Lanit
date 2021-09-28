package animals;

import food.Food;
import food.Meat;

public class Puma extends Carnivorous implements Run, Voice{
    @Override
    public void eat(Food food) {
        if (food instanceof Meat){
            System.out.println("Пума поела мясо.");
        }
        else{
            throw new IllegalArgumentException("Пума не ест траву.");
        }
    }

    @Override
    public String voice() {
        return "Пума рычит.";
    }

    @Override
    public String run() {
        return "Пума бежит.";
    }
}
