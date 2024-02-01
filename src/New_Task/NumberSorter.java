package New_Task;

import java.util.Arrays;
import java.util.Scanner;

public class NumberSorter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите не более 10 цифр через ПРОБЕЛ:");

        int[] numbers = new int[10];
        int count = 0;

        while (count < 10 && scanner.hasNextInt()) {
            numbers[count] = scanner.nextInt();
            count++;
        }

        Arrays.sort(numbers, 0, count);

        System.out.println("Отсортированые Числа:");
        for (int i = 0; i < count; i++) {
            System.out.print(numbers[i] + " ");
        }

        scanner.close();
    }
}
