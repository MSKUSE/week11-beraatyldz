public class StackItem {
    private Object data;
    private StackItem next;

    public StackItem(Object data) {
        this.data = data;
    }

    public Object getData() {
        return data;
    }

    public StackItem getNext() {
        return next;
    }

    public void setNext(StackItem next) {
        this.next = next;
    }
}