package com.practice;

public class BubbleSort {

    public static void main(String[] args) {
        int[] arr = {5, 2, 3, 9, 8, 7, 6, 1, 4};
        bubbleSort(arr);
        for(int i : arr){
            System.out.print(i + " ");
        }
    }

    static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
}
