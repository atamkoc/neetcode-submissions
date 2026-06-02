class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        // piles.length <= h =====> edge case already handled
        // piles[i] -> banana in that pile
        // h -> total time we have
        // k -> total bananas we can eat in a single time quantity
        // ceil (piles[i] / k) -> gives the time spent while eating the bananas in pile[i]
        //trying to minimize k
        int right = 0;
        for (int pile : piles){
            right = Math.max(right,pile);
        }
        int left = 1;
        int bestSpeed = right;

        while (left<=right){
            //perform the binary search between right - left
            int mid = (right + left) / 2;
            long hourSpent = 0;
            for(int i = 0; i < piles.length; i++) {
                hourSpent += (piles[i] + mid - 1) / mid;
            }

            if (hourSpent > h){
                left = mid +1;
            }
            else{
                bestSpeed = mid;
                right = mid -1;
            }
        }


        return bestSpeed;

    }
}
