package com.Java.Searching;

public class LinearSearch {

    public static void main(String[] args) {

        int[] arr = {1,2,4,2,5,2,6,7,8,9};
        int target = 2;
        int ans = searchTemplate(arr, target);
        System.out.println(ans);

    }
    public static  int searchTemplate(int[] arr, int target){

        if(arr.length<=0){
            return -1;
        }
        int count = 0;
        for(int i =0 ;i<arr.length; ++i){
            if(arr[i]==target){
                System.out.println(i);
                count++;

            }
        }return -1;
    }
}
