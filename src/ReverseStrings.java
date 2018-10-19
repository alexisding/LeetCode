/*
344.
Write a function that takes a string as input and returns the string reversed.

Example 1:

Input: "hello"
Output: "olleh"
Example 2:

Input: "A man, a plan, a canal: Panama"
Output: "amanaP :lanac a ,nalp a ,nam A"

 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ReverseStrings {

    public String reverseStrings(String s) {
        StringBuilder sb = new StringBuilder();

        if (s != null) {
            char[] arr = s.toCharArray();
            for (int i = arr.length - 1; i >= 0; i--) {
                sb.append(arr[i]);
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        ReverseStrings rs = new ReverseStrings();

        String s = "HELLO";

        System.out.println(rs.reverseStrings(s));
    }
}
