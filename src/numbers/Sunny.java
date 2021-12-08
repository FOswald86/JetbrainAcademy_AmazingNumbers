package numbers;

// expand for definition
 /*
 N is a sunny number if N+1 is a perfect square number. In mathematics, a square number or a perfect square is an
 integer that is the square of an integer; in other words, it is the product of an integer with itself. For example,
 9 is a square number, since it equals 32 and can be written as 3×3.
 */

public class Sunny {

    static boolean sunnyCheck(long l) {
        return Math.sqrt((double) l + 1) % 1 == 0 ;
    }

}
