/*
771.
You're given strings J representing the types of stones that are jewels, and S representing the stones you have.  Each character in S is a type of stone you have.  You want to know how many of the stones you have are also jewels.

The letters in J are guaranteed distinct, and all characters in J and S are letters. Letters are case sensitive, so "a" is considered a different type of stone from "A".

Example 1:

Input: J = "aA", S = "aAAbbbb"
Output: 3
Example 2:

Input: J = "z", S = "ZZ"
Output: 0
Note:

S and J will consist of letters and have length at most 50.
The characters in J are distinct.
 */

public class JewelsAndStones {

    // method 1
    public int jewelsInStones(String S, String J) {
        int count = 0;
        for (char cj : J.toCharArray()) {
            for (char cs : S.toCharArray()) {
                if (cs == cj) {
                    count++;
                }
            }
        }
        return count;
    }

    // premium method
    public int jewelsInStonesBest(String S, String J) {
        return S.replaceAll("[^" + J + "]", "").length();
    }


    public static void main(String[] args) {

        JewelsAndStones js = new JewelsAndStones();

        String j = "aj";
        String s = "jsjsjsaaa";

//        int n = s.replaceAll("[^" + j + "]", "").length();
        System.out.println(js.jewelsInStonesBest(s, j));
//        JewelsAndStones js = new JewelsAndStones();
//        System.out.println(js.jewelsInStones(s, j));
    }
}
