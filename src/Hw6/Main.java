package Hw6;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    private static final Random RANDOM = new Random();

    public static void main(String[] args) {
        List <Integer> nums = generate(10);
        System.out.println("Сгенерированные числа: " + nums);
        task1(nums);

    }
    public static void task1(List<Integer> nums) {
        System.out.println("Задача 1");
        for (Integer number : nums) {
            if (number % 2 == 1) {
                System.out.print(number + " ");
            }
        }
    }
    private static List<Integer> generate (int n) {
        List <Integer> list = new ArrayList<>(n);
        for (int i = 0; i < n ; i++) {
            list.add(RANDOM.nextInt(5));
        }
        return list;
    }

}