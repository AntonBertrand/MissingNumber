package com.example.mypackage;

public class Main {

    //Given an array nums containing n distinct numbers in the range [0, n],
    // return the only number in the range that is missing from the array.

    public static void main(String[] args) {
        int[] array = {0,1,2,3,5};
        System.out.println(missingNumber(array));
    }

    public static int missingNumber(int[] nums) {

        int length = nums.length;
        int counter = 1;
        boolean flag = true;
        int missingNum = 999;

        for (int i = 0; i <= length; i++) {
            for (int j = 0; j < length; j++) {

                if (nums[j] == i) {
                    flag = true;
                    break;
                } else {

                    flag = false;
                }


            }

            if (!flag) {
                missingNum = i;
            }

        }

        return missingNum;

    }

}