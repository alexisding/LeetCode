/* 345.
Write a function that takes a string as input and reverse only the vowels of a string.

Example 1:

Input: "hello"
Output: "holle"
Example 2:

Input: "leetcode"
Output: "leotcede"
Note:
The vowels does not include the letter "y".
 */

public class ReverseVowelsOfAString {

    // same thought with sort array by parity
    public String reverseVowels(String s) {
        char[] arr = s.toCharArray();

        int i = 0;
        int j = arr.length - 1;

        while (i < j) {
            if (!isVowel(arr[i])) {i++;}
            if (!isVowel(arr[j])) {j--;}
            if (isVowel(arr[i]) && isVowel(arr[j])) {
                swap(arr, i, j);
                i++;
                j--;
            }
        }
        return new String(arr);
    }

    public String reverseVowels2(String s) {
        char[] arr = s.toCharArray();

        int i = 0;
        int j = arr.length - 1;

        while (i < j) {
            if (!isVowel(arr[i])) {
                i++;
            } else if (isVowel(arr[j])) {
                swap(arr, i, j);
                i++;
                j--;
            } else {
                j--;
            }
        }
        return new String(arr);
    }

    public void swap(char[] arr, int i, int j) {
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public boolean isVowel(char c) {
        return c =='a' || c =='e' || c =='i' || c =='o' || c =='u' || c =='A' || c =='E' || c =='I' || c =='O' || c =='U';
    }

    public static void main(String[] args) {
        ReverseVowelsOfAString test = new ReverseVowelsOfAString();

        String s = "leetcodeioskd";

        System.out.println(test.reverseVowels(s));
        System.out.println(test.reverseVowels2(s));
    }
}
