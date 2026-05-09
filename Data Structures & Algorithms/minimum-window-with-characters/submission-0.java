class Solution {
    public String minWindow(String s, String t) {
        if (t.length() > s.length() || t.equals("")) return "";

        HashMap<Character, Integer> countT = new HashMap<>();
        HashMap<Character, Integer> window = new HashMap<>();

        for (int i = 0; i < t.length(); i++) {
            countT.put(t.charAt(i), countT.getOrDefault(t.charAt(i), 0) + 1);
        }

        int have = 0;
        int need = countT.size(); // unique chars to satisfy

        int left = 0;
        int resLength = Integer.MAX_VALUE;
        int[] res = {-1, -1};

        for (int right = 0; right < s.length(); right++) {
            char c = s.charAt(right);
            window.put(c, window.getOrDefault(c, 0) + 1);

            // Check if this char's requirement is now fully met
            if (countT.containsKey(c) && window.get(c).equals(countT.get(c))) {
                have++;
            }

            while (have == need) {
                // Update result if this window is smaller
                if (right - left + 1 < resLength) {
                    res = new int[]{left, right};
                    resLength = right - left + 1;
                }

                // Shrink from the left
                char leftChar = s.charAt(left);
                window.put(leftChar, window.get(leftChar) - 1);
                if (countT.containsKey(leftChar) && window.get(leftChar) < countT.get(leftChar)) {
                    have--;
                }
                left++;
            }
        }

        return resLength == Integer.MAX_VALUE ? "" : s.substring(res[0], res[1] + 1);
    }
}