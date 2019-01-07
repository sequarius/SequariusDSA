package com.sequarius.dsa.list;

import com.sequarius.dsa.common.ExceptionPositionInvalid;
import com.sequarius.dsa.common.Iterator;
import com.sequarius.dsa.common.Position;

public class IteratorPosition<T> implements Iterator<T> {
    private List<T> list;
    private Position<T> nextPosition;

    public IteratorPosition() {
    }

    public IteratorPosition(List<T> list) {
        this.list = list;
        if (!list.isEmpty()) {
            nextPosition = list.first();
        }
    }

    public Boolean hasNext() {
        return nextPosition != null;
    }

    public T getNext() {
        if (!hasNext()) {
            throw new ExceptionPositionInvalid("the iterator is at the end");
        }
        Position<T> currentPosition = nextPosition;
        if (nextPosition == list.last()) {
            nextPosition = null;
        } else {
            nextPosition = list.getNext(nextPosition);
        }
        return currentPosition.getElement();
    }
}
