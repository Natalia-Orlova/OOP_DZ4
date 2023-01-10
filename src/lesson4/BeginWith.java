package lesson4;

import lesson4.Interface.IsGood;

public class BeginWith implements IsGood<String> {

    @Override
    public boolean isGood(String item) {
        return false;
    }
}
