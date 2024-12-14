package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("Задание 1");

        int[] costPerMonth = {501, 1000, 2536, 300, 720};
        int sumCost = 0;

        for (int j : costPerMonth) {
            sumCost += j;
        }
        System.out.println("Сумма трат за месяц составила " + sumCost + " рублей");

        System.out.println("Задание 2");

        int maxCost = costPerMonth[1];
        int minCost = costPerMonth[2];
        for (int j : costPerMonth) {
            if (maxCost < j) {
                maxCost = j;
            } else if (minCost > j) {
                minCost = j;
            }
        }
        System.out.println("Минимальная сумма трат за неделю составила " + minCost + " рублей. Максимальная сумма трат за неделю составила " +
                maxCost + " рублей");
        System.out.println(maxCost);


        System.out.println("Задание 3");

        System.out.println("Средняя сумма трат за месяц составила " + (double) maxCost / costPerMonth.length + " рублей");

        System.out.println("Задание 4");

        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        char[] reverseReverse = new char[reverseFullName.length];

        for (int i = 0; i < reverseFullName.length; i++) {
            reverseReverse[i] = reverseFullName[reverseFullName.length - 1 -i];
            System.out.print(reverseReverse[i]);
        }

    }
}
