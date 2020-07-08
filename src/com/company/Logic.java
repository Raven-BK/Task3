package com.company;

import java.util.ArrayDeque;

public class Logic {

    public static void duplicate(ArrayDeque<String> deque) {
        int size = deque.size();
        for (int i = 0; i < size; i++) {
            String element = deque.remove();
            deque.add(element);
            deque.add(element);
        }
    }

    public static void duplicate(MyQueue<String> deque) {
        int size = deque.size();
        for (int i = 0; i < size; i++) {
            String element = deque.remove();
            deque.add(element);
            deque.add(element);
        }
    }
}
