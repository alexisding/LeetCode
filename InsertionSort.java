package com.company;

// O(n^2)
public class InsertionSort {

    // method 1
    public void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            for (int j = i; j > 0; j--) {
                if (arr[j] < arr[j - 1]) {
                    swap(arr, j, (j - 1));
                } else {
                    break;
                }
            }
        }
    }

    private static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    // method 2
    public void insertionSort2(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int e = arr[i];
            int j;
            for (j = i; j > 0 && e < arr[j - 1]; j--) {
                arr[j] = arr[j - 1];
            }
            arr[j] = e;
        }
    }

    public static void main(String[] args) {

        InsertionSort is= new InsertionSort();

        int[] arr = {3, 5, 1, 6, 0, 2, 7, 9};
        is.insertionSort2(arr);
        for (int a : arr) {
            System.out.print(a + " ");
        }
    }
}
