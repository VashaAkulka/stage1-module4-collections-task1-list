package com.epam.mjc.collections.list;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ListSorter {
    public void sort(List<String> sourceList) {
        sourceList.sort(new ListComparator());
    }
}

class ListComparator implements Comparator<String> {
    @Override
    public int compare(String a, String b) {
        int fun1 = (int) (Math.pow(Integer.parseInt(a), 2) * 5 + 3);
        int fun2 = (int) (Math.pow(Integer.parseInt(b), 2) * 5 + 3);
        if (fun1 != fun2) return fun1 - fun2;
        else return Integer.parseInt(a) - Integer.parseInt(b);
    }
}
