package com.sequarius.dsa.common;

public interface Position<T> {
    /**
     * Get the element in this position
     *
     * @return The element in this position
     */
    T getElement();

    /**
     * Set the element in this position and return the previous element
     *
     * @param e The element to be set in this position
     * @return The previous element
     */
    T setElement(T e);//
}