package numbers;

public class EvenOdd {

    static boolean evenCheck(long l) {
        return l % 2 == 0;
    }

    static boolean oddCheck(long l) {
        return l % 2 == 1;
    }

    static String evenOddCheck(long l) {
        return l % 2 == 0 ? "even" : "odd";
    }

}