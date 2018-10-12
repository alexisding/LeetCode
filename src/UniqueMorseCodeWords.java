/*
804.
International Morse Code defines a standard encoding where each letter is mapped to a series of dots and dashes,
as follows: "a" maps to ".-", "b" maps to "-...", "c" maps to "-.-.", and so on.

For convenience, the full table for the 26 letters of the English alphabet is given below:
[".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."]

Now, given a list of words, each word can be written as a concatenation of the Morse code of each letter.
For example, "cab" can be written as "-.-.-....-", (which is the concatenation "-.-." + "-..." + ".-").
We'll call such a concatenation, the transformation of a word.

Return the number of different transformations among all words we have.

Example:
Input: words = ["gin", "zen", "gig", "msg"]
Output: 2
Explanation:
The transformation of each word is:
"gin" -> "--...-."
"zen" -> "--...-."
"gig" -> "--...--."
"msg" -> "--...--."

There are 2 different transformations, "--...-." and "--...--.".

Note:

The length of words will be at most 100.
Each words[i] will have length in range [1, 12].
words[i] will only consist of lowercase letters.
 */

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
