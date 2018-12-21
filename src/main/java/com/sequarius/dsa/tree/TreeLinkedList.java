package com.sequarius.dsa.tree;

public class TreeLinkedList<T> implements Tree<T> {
    private T element;
    private TreeLinkedList<T> parent;
    private TreeLinkedList<T> firstChild;
    private TreeLinkedList<T> nextSibling;

    public TreeLinkedList() {
    }

    public TreeLinkedList(T element, TreeLinkedList<T> parent, TreeLinkedList<T> firstChild, TreeLinkedList<T> nextSibling) {
        this.element = element;
        this.parent = parent;
        this.firstChild = firstChild;
        this.nextSibling = nextSibling;
    }


    public T getElem() {
        return element;
    }

    public T setElem(T obj) {
        T previousElement = element;
        this.element = obj;
        return previousElement;
    }

    public TreeLinkedList getParent() {
        return this.parent;
    }

    public TreeLinkedList getFirstChild() {
        return this.firstChild;
    }

    public TreeLinkedList getNextSibling() {
        return this.nextSibling;
    }

    public int getSize() {
        int size = 1;
        // the next is first child.
        TreeLinkedList subtree = firstChild;
        while (subtree != null) {
            size += subtree.getSize();
            // the count of sibling next
            subtree = subtree.getNextSibling();
        }
        return size;
    }

    public int getHeight() {
        int height = Integer.MIN_VALUE;
        TreeLinkedList subtree = firstChild;
        while (subtree != null) {
            height = Math.max(height, subtree.getHeight());
            subtree = subtree.getNextSibling();
        }
        return height + 1;
    }

    public int getDepth() {
        int depth = 0;
        TreeLinkedList p = parent;
        while (p != null) {
            depth++;
            p = p.getParent();
        }
        return depth;
    }
}
