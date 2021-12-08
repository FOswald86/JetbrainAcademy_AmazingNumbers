package numbers;

 /*
 A number is a Jumping number if the adjacent digits inside the number differ by 1.
 The difference between 9 and 0 is not considered as 1. Single-digit numbers are considered Jumping numbers.
 For example, 78987, and 4343456 are Jumping numbers, but 796 and 89098 are not.
 */

public class Jumping {

    static boolean checkJumping(long l) {
        while (l != 0) {
            long digit1 = l % 10;
            l = l / 10;
            if (l != 0) {
                long digit2 = l % 10;
                if (Math.abs(digit1 - digit2) != 1) {
                    return false;
                }
            }
        }
        return true;
    }
}
