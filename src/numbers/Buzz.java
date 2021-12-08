package numbers;

// expand for definition
 /*
 Buzz numbers. They are numbers that are either divisible by 7 or end with 7. For example, the number 14 is a buzz number,
 since it is divisible by 7 without a remainder; the number 17 ends with 7, so it is also a buzz number.
 However, the number 75 is not a Buzz number, since it is neither divisible by 7 nor does it end with 7.
 The number 7 is a Buzz number too.
 */

public class Buzz {

    static boolean buzzCheck(long l) {
        return (l % 10 == 7 || l % 7 == 0);
    }

}
