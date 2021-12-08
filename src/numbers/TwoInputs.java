package numbers;

public class TwoInputs {
    public static void handleTwoInputs(String[] array) {

        long l = Long.parseLong(array[0]);
        long end = Long.parseLong(array[1]);

        if (l > end) {
            end = l + end - 1;
        }

        while (l <= end) {
            System.out.println(l + " is "
                    + (Buzz.buzzCheck(l) ? "buzz, " : "")
                    + (Duck.duckCheck(l) ? "duck, " : "")
                    + (Palimdrom.palindromCheck(l) ? "palindromic, " : "")
                    + (Gapful.gapfulCheck(l) ? "gapful, " : "")
                    + (Spy.spyCheck(l) ? "spy, " : "")
                    + (Sunny.sunnyCheck(l) ? "sunny, " : "")
                    + (Square.squareCheck(l) ? "square, " : "")
                    + (Jumping.checkJumping(l) ? "jumping, " : "")
                    + (HappySad.checkHappySad(l) ? "happy, " : "sad, ")
                    + EvenOdd.evenOddCheck(l)
            );
            l++;
        }
    }
}