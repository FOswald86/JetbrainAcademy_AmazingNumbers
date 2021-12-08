package numbers;

 /*
 Gapful numbers. It is a number that contains at least 3 digits and is divisible by the concatenation of its first
 and last digit without a remainder. 12 is not a Gapful number, as it has only two digits. 132 is a Gapful number,
 as 132 % 12 == 0. 7881 is another example of a Gapful number, as 7881 % 71 == 0.
 */

public class Gapful {

    static boolean gapfulCheck(long l) {
        String s = String.valueOf(l);
        boolean gapful = false;
        if (s.length() >= 3) {
            String s1 = s.substring(0, 1);
            String s2 = s.substring(s.length() - 1);
            long i = Integer.parseInt(s1.concat(s2));
            if (Long.parseLong(s) % i == 0) {
                gapful = true;
            }
        }
        return gapful;
    }
}