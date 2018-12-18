package com.sequarius.dsa.map;

import com.sequarius.dsa.common.Iterator;

public interface Map<K, V> {
    /**
     * Get the size of the map.
     *
     * @return The size of this map.
     */
    int getSize();

    /**
     * Map empty judge.
     *
     * @return true if the map size is 0.
     */
    boolean isEmpty();

    /**
     * Get the value in the keys position.
     *
     * @param key the position key
     * @return the value of the key,return null if the key is absent in this map
     */
    V get(K key);

    /**
     * Put the value in the keys position.
     *
     * @param key   The position key.
     * @param value the value to put.
     * @return the previous value of the key,return null if the key is absent in this map.
     */
    V put(K key, V value);

    /**
     * Remove the value in the keys position.
     *
     * @param key The position key.
     * @return the previous value of the key,return null if the key is absent in this map.
     */
    V remove(K key);

    /**
     * Get the iterator of the map.
     *
     * @return the iterator of the map.
     */
    Iterator<Entity<K, V>> entries();

    /**
     * the inner class for entity in the map
     *
     * @param <K> the key in the entity
     * @param <V> the value in the entity
     */
    class Entity<K, V> {
        private K key;
        private V value;

        public Entity() {
        }

        public Entity(K key, V value) {
            this.key = key;
            this.value = value;
        }

        public K getKey() {
            return key;
        }

        public void setKey(K key) {
            this.key = key;
        }

        public V getValue() {
            return value;
        }

        public void setValue(V value) {
            this.value = value;
        }
    }
}