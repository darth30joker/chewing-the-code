package com.davidxie.code;

public class RepeatingCharactors {
    public static int findLongestNonRepeatingSubstring(final String string) {
        int longest = 0;

        for (int i = 0; i < string.length(); i++) {
            for (int j = i + 1; j < string.length() - i; j++) {
                if (string.substring(i, j).contains(string.substring(j, j + 1))) {
                    System.out.println(String.format("Current string: %s, current character: %s",
                            string.substring(i, j), string.substring(j, j + 1)));
                    if (j - i - 1 > longest) {
                        longest = j - i - 1;
                        break;
                    }
                }
            }
        }

        return longest;
    }
}
