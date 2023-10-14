import java.util.Arrays;
import java.util.Stack;

public class StackQueue {
    private Stack<Integer> stack1=new Stack<>();
    private Stack<Integer> stack2=new Stack<>();
    public void enqueue(int element){
        stack1.push(element);
    }
    public int dequeue(){
        if(IsEmpty()) {
            throw new IllegalStateException("Stack is Empty");
        }
        MoveStack1ToStack2();
        return stack2.pop();
    }

    public int peek(){
        if(IsEmpty()) {
            throw new IllegalStateException("Stack is Empty");
        }
        MoveStack1ToStack2();
        return stack2.peek();
    }
    @Override
    public String toString(){
        Integer[] arr = stack2.toArray(new Integer[stack2.size()]);
        Arrays.sort(arr);
        return Arrays.toString(arr);
    }

    public boolean IsEmpty(){
        return stack1.isEmpty() && stack2.isEmpty();
    }
    private void MoveStack1ToStack2() {
        while(!stack1.isEmpty()){
            stack2.push(stack1.pop());
        }
    }
}
