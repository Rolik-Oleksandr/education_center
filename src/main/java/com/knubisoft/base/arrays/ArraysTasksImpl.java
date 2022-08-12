package com.knubisoft.base.arrays;

import com.google.common.base.Supplier;
import org.apache.commons.lang3.ArrayUtils;
import java.util.*;
import java.util.stream.StreamSupport;

public class ArraysTasksImpl implements ArraysTasks {

    @Override
    public int[] reverse(int[] array) {
        int len = array.length;
        for (int i = 0; i < len / 2; i++) {
            int temp = array[i];
            array[i] = array[len - i - 1];
            array[len - i - 1] = temp;
        }
        return array;
    }


    @Override
    public int[] mergeArrays(int[] array1, int[] array2) {
        int[] result = new int[array1.length + array2.length];
        int count = 0;
        for (int i = 0; i < array1.length; i++) {
            result[i] = array1[i];
            count++;
        }
        for (int j = 0; j < array2.length; j++) {
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
            if (i > 0 && array[i - 1] >= array[i]) {
                def = i;
            }
            box = Math.max(box, i - def + 1);
        }
        return box;
    }


    @Override
    public int sumOfAllUniqueElements(int[] array) {
        int len = array.length;
        int sum = 0;
        for (int i = 0; i < len; i++) {
            for (int j = 0; j <= i; j++) {
                if (j == i) {
                    sum += array[i];
                }
                if (array[i] == array[j]) {
                    break;
                }
            }
        }
        return sum;

    }

    @Override
    public int[] moveZeroes(int[] array) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != 0) {
                array[count++] = array[i];
            }
        }
        while (count < array.length) {
            array[count++] = 0;
        }
        return array;


    }

    @Override
    public int findFinalValue(int[] nums, int original) {
        int count = 0;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == original || nums[i] == count * 2) {
                count = nums[i];
            }
        }
        if (count == 0)
            return original;

        return count * 2;
    }

    @Override
    public String longestCommonPrefix(String[] words) {
//        if(words.length == 0){
//            return "";
//        }
//        for(String word: words){
//            for(int i  = 0; i < word.length(); i++){
//
//            }
//        }
        return null;
    }

    @Override
    public int missingNumber(int[] array) {
        for (int i = 0; i <= array.length; i++) {
            boolean isTrue = false;
            for (int num : array) {
                if (num == i) {
                    isTrue = true;
                    break;
                }
            }
            if (!isTrue) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public boolean containsDuplicate(int[] array) {
        boolean isTrue = false;
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    count++;
                }
            }
        }
        if(count >= 1){
            isTrue = true;
        }
        return isTrue;


    }
}
