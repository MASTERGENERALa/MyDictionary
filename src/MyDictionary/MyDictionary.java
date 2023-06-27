package MyDictionary;

import java.util.HashMap;
import java.util.Map;

public class MyDictionary {
    private Map<String, String> dictionary;

    public MyDictionary() {
        dictionary = new HashMap<>();
    }

    public void addPair(String word, String translation) {
        dictionary.put(word, translation);
    }

    public String getElementAt(String word) {
        return dictionary.get(word);
    }

    public int getCount() {
        return dictionary.size();
    }
}
