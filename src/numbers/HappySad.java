package numbers;

public class HappySad {

    static boolean checkHappySad(long l) {
        long slow, fast;
        slow = fast = l;
        do {
            slow = numSquareSum(slow);
            fast = numSquareSum(numSquareSum(fast));
        }
        while (slow != fast);
        return (slow == 1);
}

    static int numSquareSum(long l) {
        int squareSum = 0;
        while (l != 0) {
            squareSum += (l % 10) * (l % 10);
            l /= 10;
        }
        return squareSum;
    }
}
