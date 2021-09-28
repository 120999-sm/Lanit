package animals;

import food.Food;
import food.Meat;

public class Wolf extends Carnivorous implements Run, Voice{
    @Override
    public void eat(Food food) {
        if (food instanceof Meat){
            System.out.println("Волк поел мясо.");
        }
        else{
            throw new IllegalArgumentException("Волк не ест траву.");
        }
    }

    @Override
    public String voice() {
        return "Волк воет на луну.";
    }

    @Override
    public String run() {
        return "Волк бежит.";
    }
}
