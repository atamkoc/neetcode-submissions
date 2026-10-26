class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> res = new HashMap<>();

        for(String s: strs) {
            /*
            s -> eat
            charArray -> [e,a,t]
            sorted chrArray -> [a,e,t]
            sortedS = "aet"

            res = {aet:}


            */
            char[] charArray = s.toCharArray();
            Arrays.sort(charArray);
            String sortedS = new String(charArray);
            res.putIfAbsent(sortedS, new ArrayList<>());
            res.get(sortedS).add(s);
        }

        return new ArrayList<>(res.values());
        
    }
}
