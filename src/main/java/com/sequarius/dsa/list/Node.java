package com.sequarius.dsa.list;

import com.sequarius.dsa.common.Position;

public class Node<T> implements Position<T> {
    private T element;
    private Node<T> previous;
    private Node<T> next;

    public Node(T element, Node<T> previous, Node<T> next) {
        this.element = element;
        this.previous = previous;
        this.next = next;
    }

    public Node() {
    }

    public T getElement() {
        return element;
    }

    public T setElement(T e) {
        return null;
    }

    public Node<T> getPrevious() {
        return previous;
    }

    public void setPrevious(Node<T> previous) {
        this.previous = previous;
    }

    public Node<T> getNext() {
        return next;
    }

    public void setNext(Node<T> next) {
        this.next = next;
    }
}
