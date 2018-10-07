package com.davidxie.code;

import java.util.List;

public class SmileyFaces {
    public static int countSmileys(List<String> arr) {
        int count = 0;
        for (String test : arr) {
            if (test.length() < 2 || test.length() > 3) {
                continue;
            }

            if (test.length() == 2) {
                if ((test.charAt(0) == ':' || test.charAt(0) == ';') &&
                        (test.charAt(1) == ')' || test.charAt(1) == 'D')) {
                    count += 1;
                }
            }

            if (test.length() == 3) {
                if ((test.charAt(0) == ':' || test.charAt(0) == ';') &&
                        (test.charAt(1) == '-' || test.charAt(1) == '~') &&
                        (test.charAt(2) == ')' || test.charAt(2) == 'D')) {
                    count += 1;
                }
            }
        }

        return count;
    }
}
