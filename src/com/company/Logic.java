package com.company;

import java.util.List;

public class Logic {
    public static List<Box> process(List<Box> list) {
        list.sort(Box::compareTo);
        return list;
    }
}