package animals;

import food.Food;
import food.Meat;

public class Fox extends Carnivorous implements Run, Voice{

    @Override
    public void eat(Food food) {
        if (food instanceof Meat){
            System.out.println("Лис поел мясо.");
        }
        else{
            throw new IllegalArgumentException("Лис не ест траву.");
        }
    }

    @Override
    public String voice() {
        return "Лис издает звук.";
    }

    @Override
    public String run() {
        return "Лис бежит.";
    }
}
