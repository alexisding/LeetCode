/* 557.
Given a string, you need to reverse the order of characters in each word within a sentence
while still preserving whitespace and initial word order.

Example 1:
Input: "Let's take LeetCode contest"
Output: "s'teL ekat edoCteeL tsetnoc"
Note: In the string, each word is separated by single space and there will not be any extra space in the string.
 */

import java.util.Stack;

public class ReverseWordsInAStringIII {

    // first thought and obviously faster
    public String reverseWords(String s) {
        StringBuilder sb = new StringBuilder();

        String[] sArr = s.split(" ");
        for (int i = 0; i < sArr.length; i++) {
            char[] cArr = sArr[i].toCharArray();
            for (int j = sArr[i].length() - 1; j >= 0; j--) {
                sb.append(cArr[j]);
            }
            if (i < sArr.length - 1) {
                sb.append(" ");
            }
        }
        return sb.toString();
    }

    // use build-in method
    public String reverseWords2(String s) {
        StringBuilder sb = new StringBuilder();

        String[] sArr = s.split(" ");

        for (String word : sArr) {
            sb.append(new StringBuffer(word).reverse().toString() + " ");
        }
        return sb.toString().trim();
    }

    // use stack
    public String reverseWords3(String s) {
        StringBuilder sb = new StringBuilder();

        for (String word : s.split(" ")) {
            Stack<Character> stack = new Stack<Character>();

            for (char c : word.toCharArray()) {
                stack.push(c);
            }

            while (!stack.empty()) {
                sb.append(stack.pop());
            }
            sb.append(" ");
        }
        return sb.toString().trim();
    }

    public static void main(String[] args) {
        ReverseWordsInAStringIII test = new ReverseWordsInAStringIII();

        String s = "Let's take LeetCode contest";

        System.out.println(test.reverseWords(s));
    }
}
