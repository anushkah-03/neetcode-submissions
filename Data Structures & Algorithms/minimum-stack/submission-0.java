class MinStack {
    Stack<Integer> stack;
    Stack<Integer> miniStack;

    public MinStack() {
        stack = new Stack<>();
        miniStack = new Stack<>();
        
    }
    
    public void push(int val) {
        if(miniStack.isEmpty() || val<=miniStack.peek()){
            miniStack.push(val);
        }
        stack.push(val);
    }
    
    public void pop() {
        if(stack.peek().equals(miniStack.peek())){
            miniStack.pop();
        }
        stack.pop();
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        return miniStack.peek();
    }
}
