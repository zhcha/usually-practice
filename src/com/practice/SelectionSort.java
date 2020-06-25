package com.practice;

public class SelectionSort {

    public static void main(String[] args) {
        int[] arr = {5, 2, 3, 9, 8, 7, 6, 1, 4};
        for(int i : arr){
            System.out.print(i + " ");
        }
        System.out.println(" ");
        selectSort(arr);
        for(int i : arr){
            System.out.print(i + " ");
        }
    }

    static void selectSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minPos = i;
            for (int j = i + 1; j < arr.length; j++) {
                minPos = arr[j] < arr[minPos] ? j : minPos;
            }
            int temp = arr[i];
            arr[i] = arr[minPos];
            arr[minPos] = temp;
        }
    }
}
