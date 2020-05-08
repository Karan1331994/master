/*Design a stack that supports push, pop, top, and retrieving the minimum element in constant time.

push(x) -- Push element x onto stack.
pop() -- Removes the element on top of the stack.
top() -- Get the top element.
getMin() -- Retrieve the minimum element in the stack.
 

Example 1:

Input
["MinStack","push","push","push","getMin","pop","top","getMin"]
[[],[-2],[0],[-3],[],[],[],[]]

Output
[null,null,null,null,-3,null,0,-2]

Explanation
MinStack minStack = new MinStack();
minStack.push(-2);
minStack.push(0);
minStack.push(-3);
minStack.getMin(); // return -3
minStack.pop();
minStack.top();    // return 0
minStack.getMin(); // return -2
 

Constraints:

Methods pop, top and getMin operations will always be called on non-empty stacks.
*/

class MinStack {

    /** initialize your data structure here. */
    int top=-1;
        int size=10000;
        long arr[]=new long[size];
        long min;
    
    public MinStack() {
               
        
    }
   
    
    public void push(long x) {
        
        if(top==size-1)
            return;
        else if(top==-1)
        {
            min=x;
            arr[++top]=x;
            
            
            return;
        }
        else if(x<min)
        {
            long t;
                t=2*x-min;

                arr[++top]=t;
                min=x;
            
            return;
        }
        else
        {
            arr[++top]=x;
           
            return;
        }
    }
    
    public void pop() {
        if(top==-1)
            return;
        long x=arr[top];
        if(x<min)
        {
            min=2*min-x;

        }
        top=top-1;
        if(top==-1)
            min=0;
        
            return;
        
    }
    
    public long top() {
        if(top==-1)
            return -1;
        else
        {
            long x=arr[top];
            if(x<min)
            {
                return min;
            }
           
            return arr[top];
        }
    }
    
    public long getMin() {
        if(top==-1)
        {
            return 0;
        }

        return min;
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