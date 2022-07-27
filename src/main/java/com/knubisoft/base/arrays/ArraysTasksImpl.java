package com.knubisoft.base.arrays;

import org.apache.commons.lang3.ArrayUtils;
import java.util.*;
public class ArraysTasksImpl implements ArraysTasks {

    @Override
    public int[] reverse(int[] array) {
        int size = array.length;
        for(int i = 0; i < size / 2; i++){
            int temp = array[i];
            array[i] = array[size - i - 1];
            array[size - i - 1] = temp;
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
        }for(int  j = 0; j < array2.length; j++){
            result[count++] = array2[j];
        }
        return result;


    }

    @Override
    public int[] findMax3InArray(int[] array) {
        if (array.length < 3) {
            return array;
        }
        int n = array.length;
        for (int i = 0; i < n - 1; i++)
            for (int j = 0; j < n - i - 1; j++)
                if (array[j] > array[j + 1]) {
                    // swap arr[j+1] and arr[j]
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;

                }
        return new int[]{array[n - 1], array[n - 2], array[n - 3]};
    }

    @Override
    public int findLongestIncreasingContinuesSubsequence(int[] array) {
        int box = 0;
        int def = 0;
        for (int i = 0; i < array.length; i++) {
            if (i > 0 && array[i-1] >= array[i]){
                def = i;
            }
            box = Math.max(box, i - def + 1);
        }
        return box;
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
