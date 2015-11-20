package book.chapter_3;

/**
 * Created by home on 20.11.2015.
 */
public class Fish extends Pet {
    int currentDepth=0;
    public int dive(int howDeep){
        currentDepth=currentDepth + howDeep;
        System.out.println("Ныряю на глубину "
                + howDeep + " футов");
        System.out.println("Я на глубине "
                + currentDepth + " футов ниже уровня моря");
        return currentDepth;
    }

}
