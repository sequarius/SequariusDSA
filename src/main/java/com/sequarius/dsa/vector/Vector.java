package com.sequarius.dsa.vector;

import com.sequarius.dsa.common.ExceptionBoundaryViolation;

public interface Vector<T> {
    /**
     * Get the size of the element count.
     *
     * @return The size of the element count.
     */
    int getSize();

    /**
     * Empty list judge.
     *
     * @return true if there are no element in this vector.
     */
    boolean isEmpty();


    /**
     * Get the element in r rank.
     *
     * @param r The rank
     * @return The element in the rank
     * @throws ExceptionBoundaryViolation
     */
    T getAtRank(int r)
            throws ExceptionBoundaryViolation;

    /**
     * Replace the element in this rank
     *
     * @param r   The rank
     * @param obj The obj to replace
     * @return The previous element in the rank
     * @throws ExceptionBoundaryViolation
     */
    T replaceAtRank(int r, T obj)
            throws ExceptionBoundaryViolation;

    /**
     * Insert the element in this rank
     *
     * @param r   The rank
     * @param obj The obj to replace
     * @return The added element
     * @throws ExceptionBoundaryViolation
     */
    T insertAtRank(int r, T obj)
            throws ExceptionBoundaryViolation;

    /**
     * Remove the element in this rank
     *
     * @param r The rank
     * @return The removed element
     * @throws ExceptionBoundaryViolation
     */
    T removeAtRank(int r)
            throws ExceptionBoundaryViolation;
}
