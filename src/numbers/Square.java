package numbers;

 /*
 a square number or a perfect square is an integer that is the square of an integer; in other words, it is the
 product of an integer with itself. For example, 9 is a square number, since it equals 32 and can be written as 3×3.
 */

public class Square {

    static boolean squareCheck(long l) {
        return Math.sqrt((double) l) % 1 == 0;
    }

}
