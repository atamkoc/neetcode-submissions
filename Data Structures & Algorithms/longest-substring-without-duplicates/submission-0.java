class Solution {
    public int lengthOfLongestSubstring(String s) {
        /*
        sliding window olacak
        expand duplicate character bulana kadar
        duplicate character bulunca left pointeri ilerlet
        hashmap'te tut karakterleri
        get deyince 1 donuyorsa veya 0'dan farkli bi sayi donuyorsa devam et.
        */

        HashMap<Character, Integer> charCount = new HashMap<>();
        int maxLength = 0;

        int left = 0;

        for (int right = 0; right < s.length(); right++) {
            charCount.put(s.charAt(right), charCount.getOrDefault(s.charAt(right), 0) + 1);
            System.out.println(charCount);

            while(charCount.get(s.charAt(right)) > 1) {
                //has a duplicate
                charCount.put(s.charAt(left), charCount.get(s.charAt(left)) - 1);
                left++;
            }
            maxLength = Math.max(maxLength , right - left + 1);
        }


        return maxLength;
        
    }
}
