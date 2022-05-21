package ru.job4j.array;

import java.sql.PreparedStatement;

public class ArrayChar {
    public static boolean startsWith(char[] word, char[] pref) {
        boolean result = true;
            for (int k = 0; k < pref.length; k++) {
                if (pref[k] != word[k]) {
                    result = false;
                    break;
                }
            }

        return result;
    }
}
