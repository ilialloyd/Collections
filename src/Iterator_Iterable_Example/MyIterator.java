package Iterator_Iterable_Example;

import java.util.Iterator;
import java.util.List;

public class MyIterator<T> implements Iterator<T> {
    //Implement the Iterator interface in your own class
    private List<T> source = null;
    private int index = 0;

    public MyIterator(List<T> source) {
        this.source = source;
    }


    @Override
    public boolean hasNext() {
        return this.index < this.source.size();
    }

    @Override
    public T next() {
        return this.source.get(this.index++);
    }
}
