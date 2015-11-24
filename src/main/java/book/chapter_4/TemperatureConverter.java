package book.chapter_4;

/**
 * Created by home on 24.11.2015.
 */
public class TemperatureConverter {
    /*convertTemp ����� ��� �������������� ����������. ����
�������� convertTo ����� F, �� ����������� ������ ���� ������������� � ����������,
���� C, �� � �������.*/
    public double convertTemp(int temperature, char convertTo) {
        double result = 0;
        if (convertTo == ('F')) {
            result = temperature * 1.8 + 32;
            System.out.println(result + " po Farengeitu");
        } else if (convertTo == ('C')) {
            result = (temperature - 32) / 1.8;
            System.out.println(result + " po Celciu");
        }
        return result;
    }

    public static void main(String[] args) {
        TemperatureConverter tc = new TemperatureConverter();
        tc.convertTemp(13, 'F');
    }
}

