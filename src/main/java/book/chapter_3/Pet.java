package book.chapter_3;

/**
 * Created by home on 20.11.2015.
 */
public class Pet {
    int age;
    float weight;
    float height;
    String color;

    public void sleep() {
        System.out.println("��������� ����! �� ������!");
    }
    public void eat() {
        System.out.println("� ����� �������, ������� ��������� �������");
    }
    public String say(String aWord) {
        String petResponse = "�� �����!" + aWord;
        return petResponse;
    }


}
