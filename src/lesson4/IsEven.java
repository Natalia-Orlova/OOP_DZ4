package lesson4;

import lesson4.Interface.IsGood;

public class IsEven implements IsGood<Integer> {

    @Override
    public boolean isGood(Integer item) {
        return item % 2 == 0;
    }

}
