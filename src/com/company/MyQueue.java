package com.company;

public class MyQueue<T> {
    private final SinglyLinkedList<T> list = new SinglyLinkedList<>();

    public void add(T element) {
        list.add(element);
    }

    public int size() {
        return list.size();
    }

    public T remove() {
        if (list.size() > 0) {
            T e = list.get(0);
            list.remove(0);
            return e;
        } else {
            return null;
        }
    }
}
