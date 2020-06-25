package com.practice;

public class InsertionSort {

    public static void main(String[] args) {
        int[] arr = {5, 2, 3, 9, 8, 7, 6, 1, 4};
        insertionSort(arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    static void insertionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j > 0; j--) {
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }
            }
        }
    }
}
