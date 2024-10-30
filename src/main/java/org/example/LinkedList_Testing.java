package org.example;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class LinkedList_Testing {
    public static void main(String[] args) {
        List<String> firstList = new LinkedList<>();
        firstList.add("Olesia");
        firstList.add("Ilia");
        firstList.add("Anna");
        firstList.add("Maria");
        System.out.println(firstList);

        for(String element:firstList) {
            System.out.println(element);
        }
    }
}


