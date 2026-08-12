class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> freq=new HashMap<>();
        for(int num:nums){
            freq.put(num,freq.getOrDefault(num,0)+1);
        }
        List<Integer>[] bucket=new ArrayList[nums.length+1];
        for(int num:freq.keySet()){
            int frequency=freq.get(num);
            if(bucket[frequency]==null){
                bucket[frequency]=new ArrayList<>();
            }
            bucket[frequency].add(num);
        }
        int[] result=new int[k];
        int index=0;
        for(int i=bucket.length-1;i>=0 && index<k ;i--){
            if(bucket[i]!=null){
                for(int num:bucket[i]){
                    result[index++]=num;
                    if(index==k)break;
                }
            }
        }
        return result;
    }
}
