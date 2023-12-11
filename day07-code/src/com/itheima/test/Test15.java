package com.itheima.test;

/**
 * 二维数组实现对数据的分组管理
 * 完成季度营业额和全年营业额的求和
 */
public class Test15 {
    public static void main(String[] args) {
        int[][] arr = getArr();
        for (int i=0;i<arr.length;i++) {
            System.out.println("第"+(i+1)+"个季度的营业额是"+getQuarterSum(arr[i])+"元");
        }
        System.out.println("全年的营业额是"+getYearSum(arr)+"元");
    }

    private static int[][] getArr() {
        int[][] arr = {
                {22, 66, 44},
                {77, 33, 88},
                {15, 45, 65},
                {11, 66, 99}
        };
        return arr;
    }

    public static  int getYearSum(int[][] arr){
        int sum =0;
        for (int i = 0; i < arr.length; i++) {
            sum+=getQuarterSum(arr[i]);
        }
        return sum;
    }
    public static int getQuarterSum(int[] arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
        }
        return sum;
    }
}
