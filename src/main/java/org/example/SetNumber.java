package org.example;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class SetNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите набор чисел через запятую (например, 1, 2, 3, 4, 4, 5, 10, 11):");
        String input = scanner.nextLine();
        System.out.println(input);
        String[] numbers = input.split(",");
        System.out.println(Arrays.toString(numbers));

        HashSet <String> set = new HashSet<>();
        set.addAll(Arrays.asList(numbers));
        System.out.println(set);
        scanner.close();
    }
}
