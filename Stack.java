import java.util.*;
public class Stack {
    int len,i,top=-1;
    ArrayList <Integer> stack;
    Stack(int l){
        len=l;
        stack=new ArrayList <Integer>(len);
    }
    void push(int val){
        if(top+1==len){
            System.out.println("Overflow!");
        }
        else{
            top++;
            if(stack.size() <= top){
                stack.add(val);
            }
            else{
                stack.set(top,val);
            }
        }
    }
    void pop(){
        if(top == -1){
            System.out.println("Underflow!");
        }
        else{
            stack.remove(top);
            top--;
        }
    }
    public static void main(String[] args) {
        Stack s=new Stack(10);
        s.push(11);
        s.push(22);
        s.push(33);
        s.push(44);
        s.pop();
        System.out.println(s.stack);
    }
}