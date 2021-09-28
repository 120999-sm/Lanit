package animals;

import food.Food;
import food.Grass;

public class Duck extends Herbivore implements Fly, Swim, Voice{
    @Override
    public void eat(Food food) {
        if (food instanceof Grass){
            System.out.println("Утка поела траву.");
        }
        else{
            throw new IllegalArgumentException("Утка не ест мясо.");
        }
    }

    @Override
    public String swim() {
        return "Утка плавает.";
    }

    @Override
    public String fly() {
        return "Утка летает.";
    }

    @Override
    public String voice() {
        return "Утка крякает.";
    }
}
