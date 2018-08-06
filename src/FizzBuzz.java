import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {

    public List<String> printFizzBuzz(int n) {
        List<String> list = new ArrayList<String>();

        int i = 1;

        while(i <= n) {
            if (i % 3 == 0 && i % 5 == 0) {
                list.add("FizzBuzz");
            } else if (i % 3 == 0) {
                list.add("Fizz");
            } else if (i % 5 == 0) {
                list.add("Buzz");
            } else {
                list.add("" + i);
            }
            i++;
        }

        return list;
    }


    public static void main(String[] args) {
        FizzBuzz fb = new FizzBuzz();

        List<String> list = fb.printFizzBuzz(15);
        System.out.println(list);
    }
}
