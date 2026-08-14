class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set=new HashSet<>();
        for(int n:nums){
            set.add(n);
        }
        int longest=0;
        for(int num:set){
            if(!set.contains(num-1)){
                int currentnum=num;
                int length=1;
                while(set.contains(currentnum+1)){
                    currentnum++;
                    length++;
                }
                longest=Math.max(longest,length);
            }
        }
        return longest;
    }
}
