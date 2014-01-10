package problems;

//Longest common substring between two strings A and B.

import java.util.Set;

public class Problem2 {

    public String getLongestCommonSubstring(String string1, String string2) {

        StringBuilder longestCommonSubstring = new StringBuilder();

        if (string1 == null || string1.isEmpty() || string2 == null || string2.isEmpty()) return "";

// ignore case
        string1 = string1.toLowerCase();
        string2 = string2.toLowerCase();

        int[][] num = new int[string1.length()][string2.length()];

        int maxlen = 0;
        int lastSubsBegin = 0;

        for (int i = 0; i < string1.length(); i++) {
            for (int j = 0; j < string2.length(); j++) {
                if (string1.charAt(i) == string2.charAt(j)) {
                    if ((i == 0) || (j == 0))
                        num[i][j] = 1;
                    else
                        num[i][j] = 1 + num[i - 1][j - 1];

                    if (num[i][j] > maxlen) {
                        maxlen = num[i][j];
                        // generate substring from string1 => i
                        int thisSubsBegin = i - num[i][j] + 1;
                        if (lastSubsBegin == thisSubsBegin) {
                            //if the current LCS is the same as the last time this block ran
                            longestCommonSubstring.append(string1.charAt(i));
                        } else {
                            //this block resets the string builder if a different LCS is found
                            lastSubsBegin = thisSubsBegin;
                            longestCommonSubstring = new StringBuilder();
                            longestCommonSubstring.append(string1.substring(lastSubsBegin, i + 1));
                        }
                    }
                }
            }
        }

        return longestCommonSubstring.toString();
    }


}
