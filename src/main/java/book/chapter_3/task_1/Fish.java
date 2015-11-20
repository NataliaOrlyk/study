package book.chapter_3.task_1;

/**
 * Created by home on 20.11.2015.
 */
public class Fish extends Pet {
    int currentDepth = 0;

    public int dive(int howDeep) {
        currentDepth = currentDepth + howDeep;
        System.out.println("Ныряю на глубину "
                + howDeep + " футов");
        System.out.println("Я на глубине "
                + currentDepth + " футов ниже уровня моря");
        return currentDepth;
    }

    @Override
    public String say(String aWord) {
        String phrase = "Ты чё не знаешь, что рыбы не разговаривают?";
        System.out.println(phrase);
        return phrase;
    }


}


