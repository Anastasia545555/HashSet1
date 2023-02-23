import java.util.Scanner;

public class Main {
    public static String s = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed " +
            "do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim " +
            "ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut " +
            "aliquip ex ea commodo consequat. Duis aute irure dolor in " +
            "reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla " +
            "pariatur. Excepteur sint occaecat cupidatat non proident, sunt in " +
            "culpa qui officia deserunt mollit anim id est laborum.";
    public static void main(String[] args) {
        WordsChecker wordsChecker = new WordsChecker(s);
        Scanner scan=new Scanner(System.in);
        System.out.println("Введите слово");
        String word=scan.next();

        if (wordsChecker.hasWord(word)) System.out.printf("Слово %s содержится в тексте", word);
        else System.out.printf("Слова %s в тексте нет", word);
    }
}