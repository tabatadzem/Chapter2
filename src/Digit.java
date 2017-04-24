/**
 * Created by Maestro on 23.04.2017.
 */
public class Digit {
    private int mDigit;

    public Digit(int digit) {
        mDigit = digit;
    }
    public int getSum(){
        int a ,b, c, sum;
        a = (mDigit%1000);
        a= a/100;
        b= mDigit%100;
        b = b/10;
        c = mDigit %10;
        sum = a+b+c;
        return sum;
    }


}
