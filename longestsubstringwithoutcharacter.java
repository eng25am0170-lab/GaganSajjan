import java.util.HashSet;
import java.util.Set;

public class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> seen = new HashSet<>();
        int left = 0, right = 0, maxLength = 0;

        while (right < s.length()) {
            char c = s.charAt(right);
            while (seen.contains(c)) {
                seen.remove(s.charAt(left));
                left++;
            }
            seen.add(c);
            maxLength = Math.max(maxLength, right - left + 1);
            right++;
        }

        return maxLength;
    }
}
