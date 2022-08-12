package com.knubisoft.base.string;

import java.util.Arrays;
import java.util.Locale;

public class StringTasksImpl implements StringTasks {

    @Override
    public String reverseString(String original) {
        if (original == null){
            throw new IllegalArgumentException();
        }
        StringBuilder builder = new StringBuilder(original);
        builder.reverse();
        return builder.toString();
    }

    @Override
    public String insertStringInMiddle(String original, String toInsert) {
        if ( original == null || original.isEmpty() ) {
            throw new IllegalArgumentException();
        }
        if ( toInsert == null || toInsert.isEmpty() ) {
            throw new IllegalArgumentException();
        }

        int middleIndex = original.length() / 2;
        StringBuilder updatedString = new StringBuilder(original).insert(middleIndex, toInsert);

        return updatedString.toString();
    }

    @Override
    public String insertSymbolInString(String original, char toInsert, int position) {
        return null;
    }

    @Override
    public String appendToString(StringBuilder original, String toAppend) {
        return null;
    }

    @Override
    public boolean isPalindrome(String palindrome) {
        if(palindrome == null){
            throw new NullPointerException();
        }
        boolean isTrue = false;
        StringBuilder builder = new StringBuilder(palindrome);
        builder.reverse();
        if(builder.toString().equals(palindrome)){
            isTrue = true;
        }
        return isTrue;
    }

    @Override
    public boolean hasLowerCase(String str) {
//        boolean isTrue = false;
//        char[] arr = new char[str.length()];
//        arr = str.toCharArray();
//        if(arr[0] == ){
//
//        }
        return false;
    }

    @Override
    public String uniqueCharacters(String str) {
        return null;
    }

    @Override
    public String removeAllCharacters(String str, char charToRemove) {
        return null;
    }

    @Override
    public String toCamelCase(String str) {
        return null;
    }

    @Override
    public String getCountRepeatableString(String str) {
        if (str == null) {
            throw new IllegalArgumentException();
        }
        StringBuilder builder = new StringBuilder();
        int len = str.length();
        for (int i = 0; i < len; i++) {
            int find = 0;
            for (int j = i; j < len; j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    find++;
                    if (find > 9) {
                        find = 1;
                    }
                    builder.append(find);
                }
            }
        }
        return builder.toString();
    }

    @Override
    public String sortStringCharactersAsc(String str) {
        if (str == null) {
            throw new IllegalArgumentException();
        }
        String[] arr = str.split("");
        Arrays.sort(arr);
        String sorted = "";
        for (int i = 0; i < arr.length; i++) {
            sorted += arr[i];
        }
        return sorted;
    }
}