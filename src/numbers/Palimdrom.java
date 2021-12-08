package numbers;

 /*
 A Palindromic number is symmetrical; in other words, it stays the same regardless of whether we read it from left or right.
 For example, 17371 is a palindromic number. 5 is also a palindromic number. 1234 is not. If read it from right,
 it becomes 4321. Add this new property to our program.
 */

public class Palimdrom {

    static boolean palindromCheck(long l) {
        String s = String.valueOf(l);
        StringBuilder str = new StringBuilder(s);
        return s.equals(str.reverse().toString());
    }

}