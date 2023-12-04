package Floristic.flowers;

import Floristic.flowers.flwrs.*;

import java.util.Arrays;
import java.util.Random;
public class FlowerShop {
    private static int soldFlowersCount = 0;

    public static int getSoldFlowersCount() {
        return soldFlowersCount;
    }

    public static void incrementSoldFlowersCount() {
        soldFlowersCount++;
    }


    public static void main(String[] args) {
        Flower[] bouquet1 = generateRandomBouquet();
        Flower[] bouquet2 = generateRandomBouquet();
        Flower[] bouquet3 = generateRandomBouquet();
      //  Flower[] bouquet1 = {new Peony("Голландия",350,2),new Rose("Франция",270,3)}
        System.out.println("Букет 1:");
        System.out.println(Arrays.toString(bouquet1));
        System.out.println("\nЦена за первый букет " + calculateBouquetCost(bouquet1)+ " рублей");
        System.out.println("\nБукет 2:");
        System.out.println(Arrays.toString(bouquet2));
        System.out.println("\nЦена за второй букет " + calculateBouquetCost(bouquet2)+ " рублей");
        System.out.println("\nБукет 3:");
        System.out.println(Arrays.toString(bouquet3));
        System.out.println("\nЦена за третий букет " + calculateBouquetCost(bouquet3)+ " рублей");

        double totalCost = calculateBouquetCost(bouquet1) + calculateBouquetCost(bouquet2) + calculateBouquetCost(bouquet3);

        System.out.println("\nОбщая цена за все букеты в рублях :" + totalCost);
        System.out.println("Общее количество проданных цветов: " + FlowerShop.getSoldFlowersCount());
    }
    private static Flower[] generateRandomBouquet() {
        Random random = new Random();
        int bouquetSize = random.nextInt(5) + 1;
        Flower[] bouquet = new Flower[bouquetSize];

        for (int i = 0; i < bouquetSize; i++) {
            bouquet[i] = getRandomFlower();
            FlowerShop.incrementSoldFlowersCount();
        }

        return bouquet;
    }

    private static Flower getRandomFlower() {
        Random random = new Random();
        // int flowerType = random.nextInt(4);
        Flower[] flowerTypes={
        new Daisy("CША", 200, 7),
                new Orchid("Бразилия", 1000, 10),
                new Peony("Китай", 350, 6),
                new Rose("Нидерланды", 270, 5)
    };

    int randomIndex = random.nextInt(flowerTypes.length);
        return flowerTypes[randomIndex];
}

//        switch (flowerType) {
//            case 0:
//                return new Daisy("CША", 200, 7);
//            case 1:
//                return new Orchid("Бразилия", 1000, 10);
//            case 2:
//                return new Peony("Китай", 350, 6);
//            case 3:
//                return new Rose("Нидерланды", 270, 5);
//
//        }
//        return null;
//    }

    private static double calculateBouquetCost(Flower[] bouquet) {
        double cost = 0;
        for (Flower flower : bouquet) {
            cost += flower.getPrice();

    }
        return cost;
    }
}
