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
