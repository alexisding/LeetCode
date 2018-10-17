/*
905.
Given an array A of non-negative integers, return an array consisting of all the even elements of A,
followed by all the odd elements of A.

You may return any answer array that satisfies this condition.

Example 1:

Input: [3,1,2,4]
Output: [2,4,3,1]
The outputs [4,2,3,1], [2,4,1,3], and [4,2,1,3] would also be accepted.
 */

public class SortArrayByParity {

    // First thought
//    public int[] sortArrayByParity(int[] arr) {
//        int[] newArr = new int[arr.length];
//        int i = 0;
//        int j = arr.length - 1;
//
//        for (int n : arr) {
//            if (n % 2 == 0) {
//                newArr[i++] = n;
//            } else {
//                newArr[j--] = n;
//            }
//        }
//        return newArr;
//    }

    // Faster method
    public int[] sortArrayByParity(int[] arr) {
        int i = 0;
        int j = arr.length - 1;

        while (i < j) {
            if (arr[i] % 2 == 0) {
                i++;
            } else if (arr[j] % 2 == 0) {
                swap(arr, i, j);
            } else {
                j--;
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
        SortArrayByParity test = new SortArrayByParity();

        int[] arr = {1, 2, 5, 8, 7, 9, 6, 4, 3};
        int[] newArr = test.sortArrayByParity(arr);

        for (int n : newArr){
            System.out.print(n + " ");
        };
    }
}
