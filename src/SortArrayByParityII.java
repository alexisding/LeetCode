/* 922.
Given an array A of non-negative integers, half of the integers in A are odd, and half of the integers are even.

Sort the array so that whenever A[i] is odd, i is odd; and whenever A[i] is even, i is even.

You may return any answer array that satisfies this condition.

Example 1:

Input: [4,2,5,7]
Output: [4,5,2,7]
Explanation: [4,7,2,5], [2,5,4,7], [2,7,4,5] would also have been accepted.

Note:

2 <= A.length <= 20000
A.length % 2 == 0
0 <= A[i] <= 1000
 */

public class SortArrayByParityII {

//    public int[] sortArrayByParityII(int[] arr) {
//        if (arr.length % 2 != 0) {
//            return arr;
//        }
//
//        int[] newArr = new int[arr.length];
//        int e = 0;
//        int o = 1;
//
//        for (int n : arr) {
//            if (n % 2 == 0) {
//                newArr[e] = n;
//                e+=2;
//            } else {
//                newArr[o] = n;
//                o+=2;
//            }
//        }
//        return newArr;
//    }

    public int[] sortArrayByParityII(int[] arr) {
        if (arr.length % 2 != 0) {
            return arr;
        }

        int e = 0;
        int o = 1;

        while (e < arr.length && o < arr.length) {
            while (arr[e] % 2 == 0) { e+=2; }
            while (arr[o] % 2 == 1) { o+=2; }
            if (e < arr.length && o < arr.length) {
                swap(arr, e, o);
                e+=2;
                o+=2;
            }
        }
        return arr;
    }

    public void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        SortArrayByParityII test = new SortArrayByParityII();

        int[] arr = {1, 2, 5, 8, 7, 9, 6, 4};
        int[] newArr = test.sortArrayByParityII(arr);

        for (int n : newArr){
            System.out.print(n + " ");
        };
    }
}
