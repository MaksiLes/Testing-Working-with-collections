package org.example;

import java.util.*;

public class ArrayBox {
    public static void main(String[] args) {
        List<HeavyBox> boxes = new ArrayList<>();
        boxes.add(new HeavyBox(3.7, 6.7, 7.6, 80));
        boxes.add(new HeavyBox(3.0, 6.0, 7.0, 20));
        boxes.add(new HeavyBox(1.5, 4.5, 2.5, 50));

        for(HeavyBox box : boxes) {
            System.out.println("Содержимое ящиков: " + box);
        }

        if(!boxes.isEmpty()) {
            boxes.getFirst().weight+=1;
            System.out.println("После изменения Вес первого ящика = " + boxes.getFirst().weight);
        }

        if(!boxes.isEmpty()) {
            HeavyBox box2 = boxes.get(2);
            boxes.remove(box2);
            System.out.println(boxes);
        }

        HeavyBox[] array1 = boxes.toArray(new HeavyBox[0]);
        for(HeavyBox box : array1) {
            System.out.println(box);
        }

        Queue<HeavyBox> queue = new ArrayDeque<>();
        queue.offer(new HeavyBox(5.7, 7.5, 7.0, 89));
        queue.offer(new HeavyBox(4.6, 8.0, 9.0, 90));
        queue.offer((new HeavyBox(9.0, 9.0, 9.0, 60)));
        for(HeavyBox element : queue) {
            queue.poll();
        }
        System.out.println(queue);


    }
}
