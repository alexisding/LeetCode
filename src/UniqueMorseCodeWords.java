import java.util.HashSet;
import java.util.Set;

public class UniqueMorseCodeWords {

    public int uniqueMorseRepresentations(String[] words) {

        String[] morse = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};

        if (words.length > 100 || words.length < 0) {
            return 0;
        }

        Set<String> set = new HashSet<String>();

        for (int i = 0; i < words.length; i++) {
            if (words[i].length() > 12 || words[i].length() < 1 ) {
                return 0;
            }

            char[] arr = words[i].toCharArray();
            StringBuilder sb = new StringBuilder();

            for (char c : arr) {
                sb.append(morse[c-97]);
            }

            set.add(sb.toString());
        }

        return set.size();
    }

    public static void main(String[] args) {

        UniqueMorseCodeWords test = new UniqueMorseCodeWords();

        String[] words = {"gin", "zen", "gig", "msg"};
        System.out.println(test.uniqueMorseRepresentations(words));
    }
}
