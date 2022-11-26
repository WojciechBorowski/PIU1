package com.company;

import java.util.ArrayList;

public class Task {

    public boolean run(int num) {
        ArrayList<Integer> list = new ArrayList();
        int div = 0;
        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                list.add(i);
            }
        }
        for (Integer i : list) {
            div += i;
        }
        return div == num;
    }
}
