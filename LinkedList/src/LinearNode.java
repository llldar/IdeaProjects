/**
 * Created by Administrator on 2015/3/19.
 */
public class LinearNode<T> {

    private LinearNode<T> next;
    private T element;
    //create an empty node
    public LinearNode(){
        next = null;
        element = null;
    }
    //creates a node storing the specified element
    public  LinearNode(T element) {
        next = null;
        this.element = element;
    }
    //returns the node that follows this one

    public LinearNode<T> getNext() {
        return next;
    }

    public void setNext(LinearNode<T> next) {
        this.next = next;
    }

    public T getElement() {
        return element;
    }

    public void setElement(T element) {
        this.element = element;
    }
}
