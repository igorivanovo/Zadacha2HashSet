import java.util.HashSet;
import java.util.Set;

public class WordsChecker {
    String text;

    public WordsChecker(String text) {
        this.text = text;
    }

    protected boolean hasWord(String word) {
        word = word.toLowerCase();
        text = text.toLowerCase();
        Set<String> set = new HashSet<>();
        String[] words = text.split("\\P{IsAlphabetic}+");
        for (int i = 0; i < words.length; i++) {
            String wordWords = words[i];
            set.add(wordWords);
        }
        if (set.contains(word)) {
            return true;
        } else return false;

    }
}
