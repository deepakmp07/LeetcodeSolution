class MyStack {
    private Queue<Integer> a;
    private Queue<Integer> b;
    public MyStack() {
      a = new LinkedList<>();
      b = new LinkedList<>();        
    }
    
    public void push(int x) {
        a.add(x);
    }
    
    public int pop() {
        while(a.size()>1){
         b.add(a.remove());
        }
        int top = a.remove();
        Queue<Integer> temp = a;
        a = b;
        b = temp;
        return top;

    }
    
    public int top() {
        while(a.size()>1){
         b.add(a.remove());
        }
        int top = a.remove();
        Queue<Integer> temp = a;
        a = b;
        b = temp;
        a.add(top);
        return top;
    }
    
    public boolean empty() {
        return a.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */