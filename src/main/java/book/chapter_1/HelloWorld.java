package book.chapter_1;

/**
 * Created by home on 18.11.2015.
 */
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println(add5ToNumber(10));
        System.out.println(add5ToNumber(15));
        System.out.println(add5ToNumber(20));
    }

    public static int add5ToNumber(int arg) {
        return  arg + 5;
    }
}
