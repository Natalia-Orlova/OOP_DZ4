package lesson4;

import lesson4.Interface.IsGood;

public class BeginWithA implements IsGood<String> {
    @Override
    public boolean isGood(String item) {
        return item.startsWith("A");
    }
}
