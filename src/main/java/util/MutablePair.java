package main.java.util;

/**
 * Created by harrisonturton on 8/7/17.
 */
public class MutablePair<K, V> {

    private K key;
    private V val;

    public MutablePair(K key, V val) {
        this.key = key;
        this.val = val;
    }

    public K getKey() {
        return key;
    }

    public V getVal() {
        return val;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public void setVal(V val) {
        this.val = val;
    }

    public void setAll(K key, V val) {
        this.key = key;
        this.val = val;
    }
}