package myqueue;

import java.util.LinkedList;
import java.util.Queue;

public class test {
    
    public static void main(String[] args){
                
        MyQueue<Integer> testq = new MyQueue<Integer>();
        
        testq.queue(1);
        testq.queue(2);
        testq.queue(3);
        testq.queue(4);
        
        while(!testq.isEmpty()){
            System.out.println(testq.dequeue());
        }
        
    }   
    
}
