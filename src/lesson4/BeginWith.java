package lesson4;

import lesson4.Interface.IsGood;

public class BeginWith implements IsGood<String> {
    String word;

    public BeginWith(String word) {
        this.word = word;
    }

    @Override
    public boolean isGood(String item) {
        return item.startsWith(word);
    }
}
