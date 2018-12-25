package com.sequarius.dsa.vector;

import com.sequarius.dsa.common.ExceptionBoundaryViolation;

public class ArrayVector<T> implements Vector<T> {
    public static final String INDEX_OUT_OF_RANGE_MESSAGE = "index out of range";
    private int arraySize = 1024;
    private int elementSize;
    private T[] elementArray;

    @SuppressWarnings("unchecked")
    public ArrayVector() {
        elementArray = (T[]) new Object[arraySize];
        elementSize = 0;
    }


    public int getSize() {
        return elementSize;
    }

    public boolean isEmpty() {
        return 0 == elementSize;
    }

    public T getAtRank(int r)
            throws ExceptionBoundaryViolation {
        if (0 > r || r >= elementSize) throw new ExceptionBoundaryViolation(INDEX_OUT_OF_RANGE_MESSAGE);
        return elementArray[r];
    }

    public T replaceAtRank(int r, T obj)
            throws ExceptionBoundaryViolation {
        if (0 > r || r >= elementSize) throw new ExceptionBoundaryViolation(INDEX_OUT_OF_RANGE_MESSAGE);
        T bak = elementArray[r];
        elementArray[r] = obj;
        return bak;
    }

    public T insertAtRank(int r, T obj)
            throws ExceptionBoundaryViolation {
        // TODO: 2018/12/25
        return obj;
    }

    public T removeAtRank(int r)
            throws ExceptionBoundaryViolation {
        if (0 > r || r >= elementSize) throw new ExceptionBoundaryViolation(INDEX_OUT_OF_RANGE_MESSAGE);
        T bak = elementArray[r];
        System.arraycopy(elementArray, r + 1, elementArray, r, elementSize - r);
        elementSize--;
        return bak;
    }
}
