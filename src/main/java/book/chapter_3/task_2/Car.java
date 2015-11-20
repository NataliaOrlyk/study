package book.chapter_3.task_2;

/**
 * Created by home on 20.11.2015.
 */
public class Car {

    int distance;

    public void start() {

    }

    ;

    public void stop() {
    }

    ;

    public int drive(int howLong) {
        distance = howLong * 60;
        System.out.println("Wsy is " + distance + " km");
        return distance;
    }

}
