class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int left = 0, right = 0, maxLen = 0;

        while (right < s.length()) {
            char ch = s.charAt(right);

            // If the character is not in the set, add it
            if (!set.contains(ch)) {
                set.add(ch);
                maxLen = Math.max(maxLen, right - left + 1);
                right++;
            } else {
                // Remove the leftmost character to shrink the window
                set.remove(s.charAt(left));
                left++;
            }
        }

        return maxLen;
    }
}
