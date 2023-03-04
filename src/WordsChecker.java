import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class WordsChecker {
    private Set<String> text;

    public WordsChecker(String text) {
        this.text = new HashSet<>(List.of(text.split("\\P{IsAlphabetic}+")));
    }

    public boolean hasWord(String searchWord) {
        return text.contains(searchWord.toLowerCase());
    }
}
