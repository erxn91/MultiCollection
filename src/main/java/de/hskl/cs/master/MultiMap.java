package de.hskl.cs.master;

import java.util.*;

public class MultiMap<K, V> {

    private static MultiBagEntry multiBagEntry;
    private Map<K, Collection<V>> _container;

    public MultiMap() {
        this._container = new HashMap<>();
    }

    public void clear() {
        this._container.clear();
    }

    public boolean containsKey(K key) {
        return this._container.containsKey(key);
    }

    public boolean containsValue(V value) {
        return true;
    }

    public Set<MultiBagEntry<? extends K, ? extends V>> entrySet() {
        return null;
    }

    public Collection<V> get(K key) {
        return this._container.get(key);
    }

    public boolean isEmpty() {
        return this._container.isEmpty();
    }

    public Set<K> keySet() {
        return null;
    }

    public boolean put(K key, V value) {
        return true;
    }

    public void putAll(MultiMap<K, V> multiMap) { }

    public boolean remove(K key) {
        return this._container.remove(key) != null;
    }

    public int size() {
        return this._container.size();
    }

    public Collection<V> values() {
        return null;
    }
}

class MultiBagEntry<K, V> {

}