package org.example;

import java.util.*;

public class ArrayList_Testing {
    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<>();
        arrayList.add("Красный");
        arrayList.add("Желтый");
        arrayList.add("Белый");
        arrayList.add("Зеленый");
        System.out.println(arrayList);

        for(String element : arrayList) {
            System.out.println(element);
        }

        arrayList.addFirst("Черный");
        System.out.println(arrayList);

        arrayList.set(3, "Фиолетовый");
        System.out.println(arrayList);

        arrayList.remove(1);
        System.out.println(arrayList);

        if (arrayList.contains("Черный")) {
            System.out.println("Такой цвет есть в списке");
        } else {
            System.out.println("Такого цвета нет в списке");
        }

        Collections.sort(arrayList);
        System.out.println(arrayList);

        List<String> cloneList = new ArrayList<>();
        cloneList.add("1");
        cloneList.add("2");
        cloneList.add("3");
        cloneList.add("4");

        Collections.copy(arrayList, cloneList);
        System.out.println("Здесь я скопировала наш первый список во второй. Итог: второй список равен первому" + cloneList + ", " + arrayList );

        List<String> listForShuffle = new ArrayList<>();
        listForShuffle.add("Red");
        listForShuffle.add("Green");
        listForShuffle.add("Orange");
        listForShuffle.add("White");
        listForShuffle.add("Black");
        System.out.println(listForShuffle);

        Collections.shuffle(listForShuffle);
        System.out.println(listForShuffle);

        Collections.reverse(cloneList);
        System.out.println(cloneList);

        List<String> subList = listForShuffle.subList(0, 3);
        System.out.println("List of first three elements: " + subList);

        System.out.println(arrayList.equals(cloneList));

        Collections.swap(cloneList, 1,2);
        System.out.println(cloneList);

        subList.addAll(cloneList);
        System.out.println(subList);

        cloneList.removeAll(cloneList);
        System.out.println(cloneList);

        if(cloneList.isEmpty()) {
            System.out.println("Массив пустой");
        }
    }
}
