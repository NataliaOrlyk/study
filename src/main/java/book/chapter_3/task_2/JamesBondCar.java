package book.chapter_3.task_2;

/**
 * Created by home on 20.11.2015.
 */
public class JamesBondCar extends Car {
    @Override
    public int drive(int howLong) {
        distance = howLong * 180;
        System.out.println(distance);
        return distance;
    }
}
