package com.dhawal;

/**
 * Created by kushagrathapar on 3/9/16.
 */
public class RecursionVsIteration {
    public static void main(String[] args) {
        int[] array = new int[10000];
        for (int i = 0; i < 10000; i++) {
            array[i] = i + 1;
        }
        int newArray[] = rotateArray(array, 7551);
        for(int value : newArray) {
            System.out.println(value);
        }
        long startTime = System.nanoTime();
        findMinimum(newArray);
        long endTime = System.nanoTime();
        System.out.println("Time taken by iteration is [" + (endTime - startTime) + "]");
        startTime = System.nanoTime();
        findMin(newArray, 0, newArray.length - 1);
        endTime = System.nanoTime();
        System.out.println("Time taken by recursion is [" + (endTime - startTime) + "]");
    }

    public static int[] rotateArray(int array[], int startIndex) {
        int newArray[] = new int[array.length];
        int j = 0;
        for (int i = startIndex; i < array.length; i++, j++) {
            newArray[j] = array[i];
        }
        for (int i = 0; i < startIndex; i++, j++) {
            newArray[j] = array[i];
        }
        return newArray;
    }

    public static int findMinimum(int[] A) {
        int low = 0;
        int high = A.length - 1;
        int mid;
        while (low < high) {
            mid = (low + high) / 2;
            if (A[low] < A[high])
                return low;
            if (A[mid] < A[high]) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }

    public static int findMin(int[] nums, int low, int high) {
        if (nums[low] <= nums[high])
            return low;
        else {
            int mid = (low + high) / 2;
            if (nums[mid] > nums[high])
                return findMin(nums, mid + 1, high);
            else
                return findMin(nums, low, mid);
        }
    }

}
