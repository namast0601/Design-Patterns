package org.namast.demo.iterator;

public interface ItemIterator<T> {

    boolean hasNext();

    T next();
}