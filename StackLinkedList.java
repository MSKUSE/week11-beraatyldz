public class StackLinkedList implements Stack {

    private StackItem top;

    @Override
    public void push(Object item) {
        StackItem newBox = new StackItem(item);
        StackItem previousTop = top;
        newBox.setNext(previousTop);
        top = newBox;
    }

    @Override
    public Object pop() {
        if(top == null){

            throw new MyEmptyStackException("Stack is empty");
        }
        Object item = top.getData();
        top = top.getNext();
        return item;
    }

    @Override
    public void peek() {
        System.out.println("The top is " + top.getData());
    }

    @Override
    public boolean isEmpty() {
        return top == null;
    }
}