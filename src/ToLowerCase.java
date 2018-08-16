public class ToLowerCase {

    public static String toLowerCase(String str) {
        StringBuilder sb = new StringBuilder();

        for (char c : str.toCharArray()) {
            if (c >= 'A' && c <= 'Z') {
                c += 32;
            }
            sb.append(c);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String s = "HELLO";

        System.out.println(toLowerCase(s));
    }
}
