package book.chapter_3.task_2;

/**
 * Created by home on 20.11.2015.
 */
public class CarOwner {
    public static void main(String[] args) {
        Car gugyli = new Car();
        gugyli.drive(3);

        Car bmw = new Car();
        bmw.start();
        bmw.stop();
        bmw.drive(5);

        JamesBondCar jamesBondCar = new JamesBondCar();
        jamesBondCar.drive(1);
    }
}
