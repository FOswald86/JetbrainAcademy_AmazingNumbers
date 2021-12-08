package numbers;

public class OneInput {

    static void handleOneInput(String[] array) {

        long l = Long.parseLong(array[0]);

        System.out.print("Properties of " + l
                + "\neven: " + EvenOdd.evenCheck(l)
                + "\nodd: " + EvenOdd.oddCheck(l)
                + "\nbuzz: " + Buzz.buzzCheck(l)
                + "\nduck: " + Duck.duckCheck(l)
                + "\npalindromic: " + Palimdrom.palindromCheck(l)
                + "\ngapful: " + Gapful.gapfulCheck(l)
                + "\nspy: " + Spy.spyCheck(l)
                + "\nsquare: " + Square.squareCheck(l)
                + "\nsunny: " + Sunny.sunnyCheck(l)
                + "\njumping: " + Jumping.checkJumping(l)
                + "\nhappy: " + HappySad.checkHappySad(l)
                + "\nsad: " + !HappySad.checkHappySad(l)
                + "\n");
    }
}