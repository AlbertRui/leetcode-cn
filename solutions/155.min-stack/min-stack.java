class MinStack {
    Stack<Long> stack;
    long min;
    /** initialize your data structure here. */
    public MinStack() {
        stack = new Stack<Long>();
    }
    
    public void push(int x) {
        if(stack.isEmpty()) {
            stack.push(0L); 
            min = x;
        } else {
            stack.push(x - min);
            if(x < min) min = x;
        }
    }
    
    public void pop() {
        if(stack.isEmpty()) return;
        Long num = stack.pop();
        if(num < 0) min -= num;
    }
    
    public int top() {
        Long top = stack.peek();
        if(top > 0) return (int)(min + top);
        return (int)min;
    }
    
    public int getMin() {
        return (int)min;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */