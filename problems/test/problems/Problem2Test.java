package problems;


import org.hamcrest.core.IsEqual;
import org.junit.Test;

import static org.junit.Assert.assertThat;

public class Problem2Test {

    @Test
    public void shouldGiveLongestCommonSubstringBetweenTwoStrings() throws Exception {
        Problem2 problem2 = new Problem2();
        assertThat("string",IsEqual.equalTo(problem2.getLongestCommonSubstring("string", "string")));
        assertThat("string",IsEqual.equalTo(problem2.getLongestCommonSubstring("string1", "string2")));

        String string1="commonLongestSubstring";
        String string2="commonLongestSubstring";
        assertThat(problem2.getLongestCommonSubstring(string1,string2),IsEqual.equalTo("commonLongestSubstring"));
    }
}
