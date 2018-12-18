package com.sequarius.dsa.list;

import com.sequarius.dsa.common.Iterator;
import com.sequarius.dsa.common.Position;


/**
 * This is the basic list data struct.
 *
 * @param <T>
 */
public interface List<T> {
    /**
     * Get the size of the element count.
     *
     * @return The size of the element count.
     */
    Integer getSize();

    /**
     * Empty list judge.
     *
     * @return true if there are no element in this list.
     */
    Boolean isEmpty();

    /**
     * The element in the first position.
     *
     * @return The position entity in the first of the list.
     */
    Position<T> first();

    /**
     * The element in the last position
     *
     * @return The position entity in the last of the list.
     */
    Position<T> last();


    /**
     * Get the next position element after this position.
     *
     * @param p The current position of the element.
     * @return The position with element in the next position.
     */
    Position<T> getNext(Position<T> p);

    /**
     * Get the previous position element before this position.
     *
     * @param p The current position of the element.
     * @return The position with element in the previous position.
     */
    Position<T> getPrevious(Position<T> p);


    /**
     * Insert the element as the first element.
     *
     * @param e The element to insert.
     * @return The position with element in this list.
     */
    Position<T> insertFirst(T e);

    /**
     * Insert the Tlement as the last element.
     *
     * @param e The element to insert.
     * @return The position with element in this list.
     */
    Position<T> insertLast(T e);


    /**
     * Insert the element after the given position.
     *
     * @param p The given position.
     * @param e The element to insert.
     * @return The position with element in this list.
     */
    Position<T> insertAfter(Position<T> p, T e);

    /**
     * Insert the element before the given position.
     *
     * @param p The given position.
     * @param e The element to insert.
     * @return The position with element in this list.
     */
    Position<T> insertBefore(Position<T> p, T e);

    /**
     * Delete the element in this position.
     *
     * @param p The element position to remove.
     * @return The element removed
     */
    T remove(Position<T> p);


    /**
     * Delete the element at the first.
     *
     * @return The element removed
     */
    T removeFirst();

    /**
     * Delete the element at the last.
     *
     * @return The element removed
     */
    T removeLast();

    /**
     * Replace the element at t position.
     *
     * @param p The position to be replaced.
     * @param e The element to replace.
     * @return The replaced element.
     */
    T replace(Position<T> p, T e);

    /**
     * The position iterator.
     *
     * @return the iterator of the position
     */
    Iterator<Position<T>> positions();

    /**
     * The element iterator.
     *
     * @return The Iterator of the position.
     */
    Iterator<T> elements();
}