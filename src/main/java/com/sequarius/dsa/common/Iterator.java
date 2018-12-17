package com.sequarius.dsa.common;

public interface Iterator<T> {
    /**
     * Return true if has
     *
     * @return The iterator has next element
     */
    Boolean hasNext();

    /**
     * Return the next element
     *
     * @return The next element, return null if has no element next
     */
    T getNext();//返回迭代器中的下一元素
}