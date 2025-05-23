public interface Stack {

    void push(Object item);

    Object pop() throws MyEmptyStackException;

    void peek();

    boolean isEmpty();
}