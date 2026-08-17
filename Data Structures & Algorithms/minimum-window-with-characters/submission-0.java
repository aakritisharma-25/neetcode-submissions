class Solution {
    public String minWindow(String s, String t) {
        if(s.length()<t.length() || t.length()==0)return "";
        int[] freq=new int[128];
        for(char ch:t.toCharArray()){
            freq[ch]++;
        }
        int left=0;
        int count=0;
        int minlength=Integer.MAX_VALUE;
        int start=0;
        for(int right=0;right<s.length();right++){
            char ch=s.charAt(right);
            if(freq[ch]>0){
                count++;
            }
            freq[ch]--;
            while(count==t.length()){
                if(right-left+1<minlength){
                    minlength=right-left+1;
                    start=left;
                }
                char leftchar=s.charAt(left);
                freq[leftchar]++;
                if(freq[leftchar]>0){
                    count--;
                }
                left++;
            }
        }
    if(minlength==Integer.MAX_VALUE)return "";
    return s.substring(start,start+minlength);
    }
}
