package ch03.sec01;

/**
 * Created by yeahn on 2016/12/29.
 */
public class SquareSequence implements IntSequence {
    private int i;

    public boolean hasNext() {
        return true;
    }

    public int next() {
        i++;
        return i*i;
    }
}
