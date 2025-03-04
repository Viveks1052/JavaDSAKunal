package com.Java.Searching;


//Most important concepts for Product based companies.
public class BinarySearch {

    public static void main(String[] args) {

        int[] arr = {1,2,3,4,6,7,8,9,10,11,12,34};
        int target = 10;

        int ans = Searching(arr, target);
        System.out.println(ans);

    }

    static int Searching(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;

        while(start<=end){
            int mid = start +(end-start)/2;

            if(target>arr[mid]){
                start = mid+1;
            }else if (target<arr[mid]){
                end = mid-1;
            }else{
                return mid; // answer
            }
        } return -1;
    }
}
