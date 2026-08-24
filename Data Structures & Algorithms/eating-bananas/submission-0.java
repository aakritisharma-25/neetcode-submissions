class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int left=1;
        int right=0;
        for(int pile:piles){
            right=Math.max(pile,right);
        }
        while(left<=right){
            int k=left+(right-left)/2;
            long hour=0;
            for(int pile:piles){
                hour+=(pile+k-1L)/k;
            }
            if(hour<=h)right=k-1;
            else left=k+1;
        }
        return left;
    }
}