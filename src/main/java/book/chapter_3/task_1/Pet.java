package book.chapter_3.task_1;

/**
 * Created by home on 20.11.2015.
 */
public class Pet {
    int age;
    float height, weight;
    String color;

    public void sleep() {
        System.out.println("Спокойной ночи! До завтра!");
    }

    public void eat() {
        System.out.println("Я очень голоден, давайте перекусим чипсами");
    }

    public String say(String aWord) {
        return "Ну ладно!" + aWord;
    }

}
