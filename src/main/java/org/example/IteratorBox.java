package org.example;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorBox {
    public static void main(String[] args) {
        List<HeavyBox> boxes = new ArrayList<>();

        boxes.add(new HeavyBox(3.7, 6.7, 7.6, 80));
        boxes.add(new HeavyBox(3.0, 6.0, 7.0, 20));
        boxes.add(new HeavyBox(1.5, 4.5, 2.5, 50));

        Iterator<HeavyBox> iterator = boxes.listIterator();
        while(iterator.hasNext()) {
            HeavyBox obj = iterator.next();
            System.out.println(obj);
            iterator.remove();
        }
        System.out.println(boxes);

        boxes.add(new HeavyBox(10, 10,10, 80));
        boxes.add(new HeavyBox(20, 20, 20, 20));
        boxes.add(new HeavyBox(30, 30, 30, 50));
        boxes.add(new HeavyBox(10, 40, 30, 50));
        boxes.add(new HeavyBox(60, 60, 60, 50));

        List<HeavyBox> largeBox = new ArrayList<>();

        Iterator<HeavyBox> iterator1 = boxes.iterator();
        while(iterator1.hasNext()) {
            HeavyBox heavyBox = iterator1.next();
            if(heavyBox.weight > 30) {
                largeBox.add(heavyBox);
                iterator1.remove();
                System.out.println("Вес больше 30, поэтому перемещаем ящик в коллекцию largeBox");
            }
        }
        System.out.println(largeBox);
        System.out.println(boxes);


    }
}
