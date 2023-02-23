import java.util.*;
public class WordsChecker {
    private Set<String> set;

    public WordsChecker(String text) {
        set=new HashSet<>(List.of(text.split(" ")));
    }
    public boolean hasWord(String word){
        if (set.contains(word)) return true;
        return false;
    }
}
