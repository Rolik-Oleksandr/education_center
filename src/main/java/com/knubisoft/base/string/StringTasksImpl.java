package com.knubisoft.base.string;

import java.util.Arrays;

public class StringTasksImpl implements StringTasks {

    @Override
    public String reverseString(String original) {
        StringBuilder builder = new StringBuilder(original);
        builder.reverse();
        return builder.toString();
    }

    @Override
    public String insertStringInMiddle(String original, String toInsert) {
        return null;
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
        return false;
    }

    @Override
    public boolean hasLowerCase(String str) {
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
        return null;
    }
}