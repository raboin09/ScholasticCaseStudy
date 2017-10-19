package myqueue;

import java.util.Stack;

public class MyQueue<V>{

    Stack<V> mainStack;
    Stack<V> altStack;    
    
    public MyQueue(){
        mainStack = new Stack<V>();
        altStack = new Stack<V>();
    }
    
    public boolean queue(V itemAdd){              
        
        while(!mainStack.empty()){ altStack.push(mainStack.pop()); }
        altStack.push(itemAdd);
        while(!altStack.empty()){ mainStack.push(altStack.pop()); }
        
        return true;
        
    }
    
    public boolean isEmpty(){
        
        return mainStack.empty();             
        
    }
    
    public V dequeue(){
        
        return mainStack.pop();
        
    }
    
    public V first(){
        
         return mainStack.peek();
        
    }
    
}
