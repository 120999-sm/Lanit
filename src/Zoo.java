import animals.*;
import food.Food;
import food.Grass;
import food.Meat;

import java.util.ArrayList;
import java.util.List;

public class Zoo {
    public static void main(String[] args) {
        Worker worker = new Worker();

        Fish fish = new Fish();
        Duck duck = new Duck();
        Beaver beaver = new Beaver();

        Fox fox = new Fox();
        Puma puma = new Puma();
        Wolf wolf = new Wolf();

        Food meat = new Meat();
        Food grass = new Grass();

        //Тесты
        worker.feed(wolf, meat);
        // Не отработает
        // worker.feed(wolf, grass);
        // worker.getVoice(fish);


        //Пруд
        List<Swim> pond = new ArrayList<>();

        pond.add(fish);
        pond.add(duck);
        pond.add(beaver);

        for (Swim animal : pond){
            System.out.println(animal.swim());
        }
    }
}
