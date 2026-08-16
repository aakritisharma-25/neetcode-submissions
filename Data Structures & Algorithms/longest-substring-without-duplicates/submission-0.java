class Solution {
    public int lengthOfLongestSubstring(String s) {
        Map<Character,Integer> map=new HashMap<>();
        int longest=0;
        int left=0;
        for(int right=0;right<s.length();right++){
            char ch=s.charAt(right);
            while(map.containsKey(ch)){
                map.remove(s.charAt(left));
                left++;
            }
            map.put(ch,right);
            int length=right-left+1;
            longest=Math.max(longest,length);
        }
        return longest;
    }
}
