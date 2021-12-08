package numbers;

 /*
 Spy number. A number is said to be Spy if the sum of all digits is equal to the product of all digits.
 */

public class Spy {

    static boolean spyCheck(long l) {
        long product=1, sum=0, lastdigit;
        while(l>0) {
            lastdigit=l%10;
            sum=sum+lastdigit;
            product=product*lastdigit;
            l=l/10;
        }
        if(sum==product)
            return true;
        else
            return false;
    }

}