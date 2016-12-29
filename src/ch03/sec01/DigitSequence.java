package ch03.sec01;

/**
 * Created by yeahn on 2016/12/29.
 */
public class DigitSequence implements IntSequence {
    private int number;

    public DigitSequence(int num) {
        number = num;
    }

    public boolean hasNext() {
        return number != 0;
    }

    public int next() {
        int result = number % 10;
        number /= 10;
        return result;
    }

    public int rest() {
        return number;
    }
}
