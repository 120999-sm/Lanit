package animals;

import food.Food;
import food.Grass;

public class Fish extends Herbivore implements Swim{
    @Override
    public void eat(Food food) {
        if (food instanceof Grass){
            System.out.println("Рыба поела траву");
        }
        else{
            throw new IllegalArgumentException("Рыба не ест мясо");
        }
    }

    @Override
    public String swim() {
        return "Рыба плавает.";
    }
}
