class MinStack {
    Stack<Integer> s=new Stack<>();
    Stack<Integer> st=new Stack<>();//tracks minimum
    
    
    public void push(int val) {
        s.push(val);
        if(st.isEmpty() || val<=st.peek())st.push(val);
    }
    
    public void pop() {
        if(s.isEmpty())return;
        if(s.peek().equals(st.peek()))st.pop();
        s.pop();
    }
    
    public int top() {
        return s.isEmpty()?-1:s.peek();
    }
    
    public int getMin() {
        return st.isEmpty()?-1:st.peek();
    }
}
