import java.util.*;
public class WordsChecker {
    private Set<String> set;

    public WordsChecker(String text) {
        text.toLowerCase();
        set=new HashSet<>(List.of(text.split("\\P{IsAlphabetic}+")));
    }
    public boolean hasWord(String word){
        word.toLowerCase();
        if (set.contains(word)) return true;
        return false;
    }
}
