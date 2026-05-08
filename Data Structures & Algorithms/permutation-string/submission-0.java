class Solution {
    public boolean checkInclusion(String s1, String s2) {

        if(s1.length() > s2.length()) {
            return false;
        }


        int freqCountStr1[] = new int[26];
        int freqCountStr2[] = new int[26];

        for(int i = 0; i<s1.length(); i++) {
            System.out.println(s1.charAt(i));
            freqCountStr1[s1.charAt(i) - 'a']++;
        }

        int left = 0;

        for (int right = 0 ; right<s2.length(); right++) {
            freqCountStr2[s2.charAt(right) - 'a']++;

            while((right - left + 1)> s1.length()) {
                freqCountStr2[s2.charAt(left) - 'a']--;
                left++;
            }

            if(Arrays.equals(freqCountStr1, freqCountStr2)){
                return true;
            }
        }

        return false;


        
    }
}
