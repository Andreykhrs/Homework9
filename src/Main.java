import java.util.Random;

public class Main {
    public static void main(String[] args) {
        task1();

    }
    // Объявить метод «сгенерироватьМассив»
    public static int[] generateRandomArray() {
        Random random = new Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
    public static void task1() {
        System.out.println("Задача №1");
        int[] arr = generateRandomArray();
       int totalSum = 0;
        for (int j : arr) {
            totalSum = totalSum + j;

        }
        System.out.println("Сумма трат за месяц составила " + totalSum + " рублей.");


        System.out.println();
        System.out.println("Задача №2");
        arr = generateRandomArray();
        int maxSum = -1;
        int minSum = 300000;
        for (int i = 0; i < arr.length; i++) {
            if (maxSum < arr[i]) {
                maxSum = arr[i];
            }
            if (minSum > arr[i]) {
                minSum = arr[i];
            }

        }
        System.out.println("Минимальная сумма трат за день составила " + minSum + " рублей. Максимальная сумма трат за день составила " + maxSum + " рублей");

        System.out.println();
        System.out.println("Задача №3");

        arr = generateRandomArray();
        totalSum = 0;
        double averageSum = 0.00;
        for (int i = 0; i < arr.length; i++) {
            totalSum = totalSum + arr[i];
            averageSum = (double) totalSum / arr.length;
            
        }
        System.out.println("Средняя сумма трат за месяц составила " + averageSum + " рублей.");

        System.out.println();
        System.out.println("Задача №4");

        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length-1; i >= 0; i--) {
            System.out.printf(String.valueOf(reverseFullName[i]));

        }



    }





}