package book.chapter_4;

/**
 * Created by home on 24.11.2015.
 */
public class TemperatureConverter {
    /*convertTemp метод для преобразования температур. Если
аргумент convertTo равен F, то температура должна быть преобразована в Фаренгейты,
если C, то в Цельсии.*/
    public String convertTemp(int temperature, char convertTo) {
        double result;
        if (convertTo.equals("F")) {
            result = temperature * 1.8 + 32;
            System.out.println(result + "po Farengeitu");
        } else if (convertTo.equals("C")) {
            result = (temperature - 32) / 1.8;
            System.out.println(result + "po Celciu");

        }
        return result;
    }

    public static void main(String[] args) {
        TemperatureConverter tc = new TemperatureConverter();
        tc.convertTemp(10,'F');
    }
}

