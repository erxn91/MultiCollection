package de.hskl.cs.master;

import java.util.*;

public class MultiSet<V> {

    private int _size;
    private Map<V, Integer> _table;

    public MultiSet() {
        this._size = 0;
        this._table = new HashMap<>();
    }

    public void add(V value) {
        int counter = 1;
        if(this.contains(value)) {
            counter = this._table.get(value);
            counter++;
            this._table.replace(value, counter);
        } else {
            this._table.put(value, counter);
            this._size++;
        }
    }

    public void clear() {
        this._table.clear();
    }

    public boolean contains(V value) {
        return this._table.containsKey(value);
    }

    public boolean isEmpty() {
        return this._size == 0;
    }

    public void remove(Object o) {
        int counter = this._table.get(o);
        if(counter > 1) {
            counter--;
            V value = (V)o;
            this._table.replace(value, counter);
        } else {
            this._table.remove(o);
            this._size--;
        }
    }

    public int size() {
        return this._size;
    }

    public Integer get(V value) {
        return this._table.get(value);
    }
}