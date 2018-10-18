package de.hskl.cs.master;

import java.util.*;

public class MultiMap<K, V> {

    //private MultiBagEntry multiBagEntry;
    private Set<MultiBagEntry<? extends K, ? extends V>> _container;

    public MultiMap() {
        this._container = new HashSet<>();
    }

    public void clear() {
        this._container.clear();
    }

    public boolean containsKey(K key) {
        return true;
    }

    public boolean containsValue(V value) {
        return true;
    }

    public Set<MultiBagEntry<? extends K, ? extends V>> entrySet() {
        return this._container;
    }

    public Collection<V> get(K key) {
        return null;
    }

    public boolean isEmpty() {
        return this._container.isEmpty();
    }

    public Set<K> keySet() {
        return null;
    }

    public boolean put(K key, V value) {
        MultiBagEntry<K, V> entry = new MultiBagEntry<>();
        return true;
    }

    public void putAll(MultiMap<K, V> multiMap) { }

    public boolean remove(K key) {
        return true;
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