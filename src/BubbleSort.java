package com.company;

public class BubbleSort {
    // either method 1 or method 2 will work
    // method 1: O(n^2)
    public void bubbleSort1(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    swap(arr, i, j);
                }
            }
        }
    }

    // method 2: O(n^2)
    public void bubbleSort2(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    swap(arr, j, (j + 1));
                }
            }
        }
    }

    // optimized: O(n^2)
    public void bubbleSortOpt1(int[] arr) {
        boolean swapped;
        int n = arr.length;

        do {
            swapped = false;
            for (int i = 1; i < n; i++) {
                if (arr[i] < arr[i - 1]) {
                    swap(arr, i, (i - 1));
                    swapped = true;
                }
            }
            n--;
        } while (swapped);

    }

    // optimized 2: O(n^2)
    public void bubbleSortOpt2(int[] arr) {
        int n = arr.length;
        int newn;

        do {
            newn = 0;
            for (int i = 1; i < n; i++) {
                if (arr[i] < arr[i - 1]) {
                    swap(arr, i, (i - 1));
                    newn = i;
                }
            }
            n = newn;
        } while (newn > 0);
    }

    public void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    public static void main(String[] args) {
        BubbleSort test = new BubbleSort();

        int[] arr1 = {34, 12, 56, 4, 25, 1, 15};
        test.bubbleSort1(arr1);
        for (int x : arr1) {
            System.out.print(x + ", ");
        }

        System.out.println();

        int[] arr2 = {23, 45, 36, 12, 2, 65, 14};
        test.bubbleSort2(arr2);
        for (int y : arr2) {
            System.out.print(y + ", ");
        }

        System.out.println();

        int[] arr3 = {44, 53, 6, 12, 63, 74, 29};
        test.bubbleSortOpt1(arr3);
        for (int z : arr3) {
            System.out.print(z + ", ");
        }

        System.out.println();

        int[] arr4 = {32, 54, 76, 12, 4, 28, 90};
        test.bubbleSortOpt2(arr4);
        for (int a: arr4) {
            System.out.print(a + ", ");
        }
    }
}
