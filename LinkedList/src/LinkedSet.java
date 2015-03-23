import java.util.*;

/**
 * Created by Administrator on 2015/3/19.
 */
public class LinkedSet<T> implements Set<T>{
    private static Random rand = new Random();
    private int count;
    private LinearNode<T> contents;

    public LinkedSet() {
        count = 0;
        contents = null;
    }

    @Override
    public int size() {
        return count;
    }

    @Override
    public boolean isEmpty() {
        return (count == 0);
    }

    @Override
    public boolean contains(Object target) {
        int NOT_FOUND = 0;
        int search = NOT_FOUND;

        for (int index = 0;index < count && search == NOT_FOUND;index ++) {
            if(contents.getElement().equals(target))
                search = index;
        }

        return (search != NOT_FOUND);
    }

    @Override
    public Iterator iterator() {
        return new LinkedIterator(contents,count);
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public boolean add(T element) {
        if (!(contains(element))) {
            LinearNode<T> node = new LinkedSet<T>(element);
            node.setNext(contents);
            contents = node;
            count++;
        }
    }


    @Override
    public T remove(Object target) throws EmptySetException,NoSuchElementException {
        boolean found = false;
        LinearNode<T> previous,current;
        T result;

        if(isEmpty())
            throw new EmptySetException();

        if(contents.getElement().equals(target)) {
            result = contents.getElement();
            contents = contents.getNext();
        }
        else{
            previous = contents;
            current = contents.getNext();
            for(int look=1;look <count && !found;look++) {
                if(current.getElement().equals(target))
                    found =true;
                else{
                    previous = current;
                    current = current.getNext();
                }
            }
            if (!found)
                throw new NoSuchElementException();

            result = current.getElement();
            previous.setNext(current.getNext());
        }

        count--;

        return result;
    }

    @Override
    public boolean addAll(Collection c) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public boolean removeAll(Collection c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection c) {
        return false;
    }

    @Override
    public boolean containsAll(Collection c) {
        return false;
    }

    @Override
    public T[] toArray(T[] a) {
        return (new T[0]);
    }

    public T removeRandom() throws EmptySetException {
        LinearNode<T> previous,current;
        T result = null;

        if(isEmpty())
            throw new EmptySetException();


        int choice = rand.nextInt(count) +1;

        if(choice == 1) {
            result = contents.getElement();
            contents = contents.getNext();
        }
        else {
            previous = contents;
            for (int skip =2;skip <choice;skip ++) {
                previous = previous.getNext();
            }
            current = previous.getNext();
            result = current.getElement();
            previous.setNext(current.getNext());
        }
        count--;
        return result;
    }
}


