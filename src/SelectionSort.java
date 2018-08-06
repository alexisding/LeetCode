package com.company;

// O(n^2)
public class SelectionSort {

    public static void selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            swap(arr, i, minIndex);
//            int temp = arr[i];
//            arr[i] = arr[minIndex];
//            arr[minIndex] = temp;
        }
    }

    private static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    public static void main(String[] args) {

//        SelectionSort ss= new SelectionSort();

        int[] arr = {3, 5, 1, 6, 0, 2, 7, 9};
        SelectionSort.selectionSort(arr);
        for (int a : arr) {
            System.out.print(a + " ");
        }
    }
}
