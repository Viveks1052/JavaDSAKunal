package com.Java.Searching;


//The Ceiling of a number is the smallest element in the array which greater than or equal to target
public class CeilingOfANumber {

    public static void main(String[] args) {

        int[] arr  = {1,2,4,7,8,10,12,14,16,17,18};
        int target = 16;
        int ans = ceilingSearch(arr, target);
        System.out.println("The Ceiling value is = "+ ans);

    }

    static int ceilingSearch(int[] arr, int target){

        int start = 0;
        int end = arr.length-1;

        while(start<=end){
            int mid = start+(end-start)/2;
            if (target<arr[mid]){
                end = mid-1;

            }else if(target>arr[mid]){
                start=mid+1;

            }else if(target==arr[mid]){
                return arr[mid];
            }


        }return start;

    }

}
