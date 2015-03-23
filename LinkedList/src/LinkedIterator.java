/**
 * Created by Administrator on 2015/3/19.
 */
import java.util.*;
public class LinkedIterator<T> implements Iterator<T>{
    private int count;
    private LinearNode<T> current;
    public LinkedIterator(LinearNode<T> collection, int size){
        current = collection;
    }

    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public T next() {
        if(!hasNext())
            throw new NoSuchElementException();

        T result = current.getElement();
        current = current.getNext();
        return result;
    }

    @Override
    public void remove() throws UnsupportedOperationException {
        throw new UnsupportedOperationException();
    }
}
