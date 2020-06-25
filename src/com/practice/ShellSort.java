package com.practice;

public class ShellSort {

    public static void main(String[] args) {
        int[] arr = {5, 2, 3, 9, 8, 7, 6, 1, 4};
        shellSort(arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }


    static void shellSort(int[] arr) {
        int h = 1;
        while (h < arr.length / 3) {
            h = 3 * h + 1;
        }
        for (int gap = h; gap > 0; gap = (gap - 1) / 3) {
            for (int i = gap; i < arr.length; i++) {
                for (int j = i; j > gap - 1; j -= gap) {
                    if (arr[j] > arr[j - gap]) {
                        swap(arr, j, j - gap);
                    }
                }
            }
        }
    }

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
