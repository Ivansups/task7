package ru.vsu.ccs.vvp24.klimov_i_p.task_7_30;

import java.util.LinkedHashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        String a = "";
        int[] b = {4, 6, 1, 2, 1, 2, 3, 2, 3, 5, 4, 7, 4, 1, 5, 1, 5, 6};
        Set<String> res = new LinkedHashSet<>();
        for (int i : b) {
            a += i;
        }
        for (int i = 0; i < a.length() - 1; i++) {
            String substring = a.substring(i, i + 2);
            int count = countOccurrences(a, substring);
            if (count > 1) {
                res.add(substring.repeat(count));
            }
        }
        System.out.println(res);
    }

    public static int countOccurrences(String str, String substr) {
        int count = 0;
        int index = 0;
        while ((index = str.indexOf(substr, index)) != -1) {
            count++;
            index += substr.length();
        }
        return count;
    }
}

