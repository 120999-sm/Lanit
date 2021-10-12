package model;

public class Kotik {

    public static int catsCount = 0;

    private int energy;

    private int prettiness;

    private int weight;

    private String name;

    private String meow;

    public Kotik(){
        this.energy = 0;
        catsCount++;
        setKotik(7, "Пушок", 7, "Мяу");
    }

    public Kotik(int prettiness, String name, int weight, String meow){
        this.energy = 0;
        catsCount++;
        this.prettiness = prettiness;
        this.name = name;
        this.weight = weight;
        this.meow = meow;
    }

    public static int getCatsCount() {
        return catsCount;
    }

    public static void setCatsCount(int catsCount) {
        Kotik.catsCount = catsCount;
    }

    public int getEnergy() {
        return energy;
    }

    public void setEnergy(int energy) {
        this.energy = energy;
    }

    public int getPrettiness() {
        return prettiness;
    }

    public void setPrettiness(int prettiness) {
        this.prettiness = prettiness;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMeow() {
        return meow;
    }

    public void setMeow(String meow) {
        this.meow = meow;
    }

    public void setKotik(int prettiness, String name, int weight, String meow){
        this.prettiness = prettiness;
        this.name = name;
        this.weight = weight;
        this.meow = meow;
    }

    public boolean play(){
        if (this.energy > 0){
            System.out.println("Котик поиграл");
            this.energy--;
            return true;
        }
        else {
            eat();
            return false;
        }
    }
    
    public boolean sleep(){
        if (this.energy > 0){
            System.out.println("Котик поспал");
            this.energy--;
            return true;
        }
        else {
            eat();
            return false;
        }
    }
    
    public boolean chaseMouse(){
        if (this.energy > 0){
            System.out.println("Котик поймал мышь");
            this.energy--;
            return true;
        }
        else {
            eat();
            return false;
        }
    }

    public boolean fight(){
        if (this.energy > 0){
            System.out.println("Котик подрался");
            this.energy--;
            return true;
        }
        else {
            eat();
            return false;
        }
    }

    public boolean eat(int satiety){
        this.energy += satiety;
        System.out.println("Котик хочет кушать. Котик покушал.");
        return true;
    }

    public boolean eat(int satiety, String foodName){
        this.energy += satiety;
        System.out.println("Котик хочет кушать. Котик покушал " + foodName);
        return true;
    }

    public boolean eat(){
        eat(1, "Friskes");
        return true;
    }

    public void liveAnotherDay(){
        for (int i = 0; i < 24; i++) {
            int randomInt = (int)((Math.random() * 5) + 1);
            switch (randomInt){
                case 1:
                    play();
                    break ;
                case 2:
                    sleep();
                    break ;
                case 3:
                    chaseMouse();
                    break ;
                case 4:
                    fight();
                    break ;
                case 5:
                    eat();
                    break ;
            }
        }
    }

}
