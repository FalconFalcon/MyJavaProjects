import java.io.*;
import java.util.*;

class Stack{
    
    int top;
    static final int Max = 1000;
    int [] a = new int[Max];
    
    Stack(){
        top = -1;
    }
    
    boolean isEmpty(){
        return (top<0);
    }
    
    int pop(){
        if (top<0) return 0;
        else return a[top--];
    }
    
    int peek(){
         if (top<0) return 0;
        else return a[top];
    }
    
    boolean push(int x){
        if (top>=Max) return false;
        else {
            a[++top] = x;
            System.out.println(x+" pushed on to stack.");
            return true;
        }
    }
    
    public static void main(String args[]){
        Stack st = new Stack();
        st.push(10);
        System.out.println(st.peek());
        st.pop();
        System.out.println(st.peek());
        st.push(20);
        st.push(30);
        System.out.println(st.isEmpty());
    }
    
    
    
}
