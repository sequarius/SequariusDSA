package com.sequarius.dsa.tree;

public interface Tree<T> {

    /**
     * Get the current T in the node
     *
     * @return The current T
     */
    T getElem();


    /**
     * Save the T in this node and return the previous object.
     *
     * @param obj The object to save.
     * @return the previous object in this node.
     */
    T setElem(T obj);


    /**
     * Get the parent node of this node.
     *
     * @return The parent node of this node.
     */
    TreeLinkedList getParent();


    /**
     * Get the first child of this node.
     *
     * @return The first child of this node.
     */
    TreeLinkedList getFirstChild();


    /**
     * Get the next sibling of this node.
     *
     * @return The next sibling of this node.
     */
    TreeLinkedList getNextSibling();


    /**
     * Get the size after this node.
     *
     * @return The scale of this node
     */
    int getSize();


    /**
     * Get the height of this node.
     *
     * @return The height of the node.
     */
    int getHeight();


    /**
     * Get the depth of this node.
     *
     * @return The depth of the node.
     */
    int getDepth();
}