class Solution {
    public int[] dailyTemperatures(int[] temp) {
        Stack<Integer> stack=new Stack<>();
        int[] res=new int[temp.length];
        for(int i=0;i<temp.length;i++){
            while(!stack.isEmpty() && temp[stack.peek()]<temp[i]){
                int prev=stack.pop();
                res[prev]=i-prev;
            }
            stack.push(i);
        }
        return res;
    }
}
