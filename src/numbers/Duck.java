package numbers;

// expand for definition
 /*
 Duck number. A Duck number is a positive number that contains zeroes. For example, 3210, 8050896, 70709 are Duck numbers.
 Note that a number with a leading 0 is not a Duck number. So, numbers like 035 or 0212 are not Duck numbers. Although,
 01203 is a Duck, since it has a trailing 0.
 */

public class Duck {

    static boolean duckCheck(long l) {
        while (l != 0) {
            if (l % 10 == 0)
                return true;
            l = l / 10;
        }
        return false;
    }
}