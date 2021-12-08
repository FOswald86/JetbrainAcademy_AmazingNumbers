package numbers;

public class PropertyInputs {

    public static void handleWithPropertyInputs(String[] array) {

        long l = Long.parseLong(array[0]);
        int orderCount = Integer.parseInt(array[1]);
        int counter = 0;

        while (counter < orderCount) {
            if (array.length == 3) {
                while (!(getCheckMethod(array[2], l))) {
                    l++;
                }
            }
            if (array.length == 4) {
                while (!(getCheckMethod(array[2], l) && getCheckMethod(array[3], l))) {
                    l++;
                }
            }
            if (array.length == 5) {
                while (!(getCheckMethod(array[2], l) && getCheckMethod(array[3], l)
                        && getCheckMethod(array[4], l))) {
                    l++;
                }
            }
            if (array.length == 6) {
                while (!(getCheckMethod(array[2], l) && getCheckMethod(array[3], l)
                        && getCheckMethod(array[4], l) && getCheckMethod(array[5], l))) {
                    l++;
                }
            }
            if (array.length == 7) {
                while (!(getCheckMethod(array[2], l) && getCheckMethod(array[3], l)
                        && getCheckMethod(array[4], l) && getCheckMethod(array[5], l)
                        && getCheckMethod(array[6], l))) {
                    l++;
                }
            }
            if (array.length == 8) {
                while (!(getCheckMethod(array[2], l) && getCheckMethod(array[3], l)
                        && getCheckMethod(array[4], l) && getCheckMethod(array[5], l)
                        && getCheckMethod(array[6], l) && getCheckMethod(array[7], l))) {
                    l++;
                }
            }
            output(l);
            counter++;
            l++;
        }
    }

    static boolean getCheckMethod(String property, long l) {
        switch (property) {
            case "BUZZ":
                return Buzz.buzzCheck(l);
            case "DUCK":
                return Duck.duckCheck(l);
            case "EVEN":
                return EvenOdd.evenCheck(l);
            case "ODD":
                return EvenOdd.oddCheck(l);
            case "PALINDROMIC":
                return Palimdrom.palindromCheck(l);
            case "GAPFUL":
                return Gapful.gapfulCheck(l);
            case "SPY":
                return Spy.spyCheck(l);
            case "SQUARE":
                return Square.squareCheck(l);
            case "SUNNY":
                return Sunny.sunnyCheck(l);
            case "JUMPING":
                return Jumping.checkJumping(l);
            case "HAPPY":
            case "-SAD":
                return HappySad.checkHappySad(l);
            case "SAD":
            case "-HAPPY":
                return !HappySad.checkHappySad(l);
            case "-BUZZ":
                return !Buzz.buzzCheck(l);
            case "-DUCK":
                return !Duck.duckCheck(l);
            case "-EVEN":
                return !EvenOdd.evenCheck(l);
            case "-ODD":
                return !EvenOdd.oddCheck(l);
            case "-PALINDROMIC":
                return !Palimdrom.palindromCheck(l);
            case "-GAPFUL":
                return !Gapful.gapfulCheck(l);
            case "-SPY":
                return !Spy.spyCheck(l);
            case "-SQUARE":
                return !Square.squareCheck(l);
            case "-SUNNY":
                return !Sunny.sunnyCheck(l);
            case "-JUMPING":
                return !Jumping.checkJumping(l);
            default:
                return false;
        }
    }

    static void output(long l) {
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
    }
}