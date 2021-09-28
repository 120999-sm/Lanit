package model;

public class Application extends Kotik{
    public static void main(String[] args) {
        Kotik first = new Kotik(5, "Мурзик", 5, "Мэу");
        Kotik second = new Kotik();

        first.liveAnotherDay();
        System.out.println("\n" +  "Имя котика: " + first.getName());
        System.out.println("\n" +  "Вес котика: " + first.getWeight());

        System.out.println("\n" + "Котики разговаривают одинаково: " + first.getMeow().equals(second.getMeow()));
        System.out.println("\n" + "Колличество котиков: " + Kotik.catsCount);
    }
}
