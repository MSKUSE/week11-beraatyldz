import java.util.ArrayList;

public class StackArray implements Stack{

    private ArrayList <Object> stack = new ArrayList<>();

    @Override
    public void push(Object item) {
        stack.add(0,item);
    }

    @Override
    public Object pop() throws MyEmptyStackException{
        if(this.isEmpty()){
            throw new MyEmptyStackException("Stack is empty, you cant this")
        }
        return stack.remove(0);
    }

    @Override
    public void peek() {
        System.out.println("The top is " +stack.get(0));
    }

    @Override
    public boolean isEmpty() {
        return stack.size()==0;
    }
}