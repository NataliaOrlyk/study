package book.chapter_3.task_1;

/**
 * Created by home on 20.11.2015.
 */
public class Fish extends Pet {
    int currentDepth = 0;

    public int dive(int howDeep) {
        currentDepth = currentDepth + howDeep;
        if (currentDepth > 100) {
            System.out.println("Я маленькая рыбка " +
                    " и не могу плавать глубже 100 метров");
            currentDepth = currentDepth - howDeep;
        } else {
            System.out.println("Погружаюсь ещё на " + howDeep +
                    " метров");
            System.out.println("Я на глубине " + currentDepth +
                    " метров");
        }
        return currentDepth;
    }

    @Override
    public String say(String aWord) {
        String phrase = "Ты чё не знаешь, что рыбы не разговаривают?";
        System.out.println(phrase);
        return phrase;
    }


}


