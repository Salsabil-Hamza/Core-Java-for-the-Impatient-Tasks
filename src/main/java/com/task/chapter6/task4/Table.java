package com.task.chapter6.task4;

import java.util.ArrayList;
import java.util.List;

public class Table<K,V> {

    List<Entry<K,V>> list = new ArrayList<>();

    public void set(K key, V value){
        list.add(new Entry<>(key,value));
    }

    public void setKey(K key){
        list.add(new Entry<>(key,null));
    }

    public void setValue(K key,V value){
        list.stream().filter(kvEntry -> kvEntry.getKey().equals(key)).findFirst().get().setValue(value);
    }

    public void deleteKey(K key){
        list.removeIf(kvEntry -> kvEntry.getKey().equals(key));
    }

    public V getValue(K key){
        return  list.stream().filter(kvEntry -> kvEntry.getKey().equals(key)).findFirst().get().getValue();
    }

    class Entry<K, V> {
        private K key;
        private V value;

        public Entry(K key, V value) {
            this.key = key;
            this.value = value;
        }

        public void setValue(V value) {
            this.value = value;
        }

        public K getKey() { return key; }
        public V getValue() { return value; }
    }

}
