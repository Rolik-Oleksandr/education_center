package com.knubisoft.base.arrays;

import org.apache.commons.lang3.ArrayUtils;

public class ArraysTasksImpl implements ArraysTasks {

    @Override
    public int[] reverse(int[] array) {
        //array = {1, 2, 3, 4, 5};
        int size = array.length;
        for (int i = 0; i < size / 2; i++) {
            int temp = array[i];
            array[i] = array[size - 1 - i];
            array[size - 1 - i] = temp;
        }
        return array;
    }

    @Override
    public int[] mergeArrays(int[] array1, int[] array2) {
        int[] result = new int[array1.length + array2.length];
        int count = 0;
        for(int i = 0; i < array1.length; i++){
            result[i] = array1[i];
            count++;
        }
        for(int j = 0; j < array2.length; j++){
            result[count++] = array2[j];
        }
        return result;

    }

    @Override
    public int[] findMax3InArray(int[] array) {
//        if (array.length < 3) {
//            return array;
//        }
//        int[] result = new int[3];
//        int max = 0;
//
//        for(int i = 0; i < array.length; i++){
//            if(array[i] > max){
//                max = array[i];
//            }
//        }
//        return result;
    }

    @Override
    public int findLongestIncreasingContinuesSubsequence(int[] array) {
        return -1;
    }

    @Override
    public int sumOfAllUniqueElements(int[] array) {
        return -1;
    }

    @Override
    public int[] moveZeroes(int[] array) {
        return null;
    }

    @Override
    public int findFinalValue(int[] nums, int original) {
        return -1;
    }

    @Override
    public String longestCommonPrefix(String[] words) {
        return null;
    }

    @Override
    public int missingNumber(int[] array) {
        return -1;
    }

    @Override
    public boolean containsDuplicate(int[] array) {
        return false;
    }
}
