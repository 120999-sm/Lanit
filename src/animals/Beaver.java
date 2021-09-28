package animals;

import food.Food;
import food.Grass;

public class Beaver extends Herbivore implements Run, Swim, Voice{
    @Override
    public void eat(Food food) {
        if (food instanceof Grass){
            System.out.println("Бобёр поел траву");
        }
        else{
            throw new IllegalArgumentException("Бобёр не ест мясо");
        }
    }

    @Override
    public String swim() {
        return "Бобёр плавает.";
    }

    @Override
    public String run() {
        return "Бобёр бежит.";
    }

    @Override
    public String voice() {
        return "Бобёр издает звуки.";
    }
}
