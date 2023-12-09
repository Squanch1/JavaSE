package com.itheima.test;

public class Test1 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        arrayTraversal(arr);

    }

    public static void arrayTraversal( int[] arr) {
        System.out.print("[");
        //System.out.println();
        for (int i = 0; i < arr.length - 1; i++) {
            System.out.print(arr[i] + ", ");
        }
        System.out.print(arr[arr.length - 1] + "]");
    }
}
