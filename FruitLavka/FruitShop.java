package FruitLavka;

import FruitLavka.fruits.Apple;
import FruitLavka.fruits.Apricot;
import FruitLavka.fruits.Peach;

public class FruitShop {
    private static double totalCost = 0;
    private static double appleCost = 0;
    private static double apricotCost = 0;
    private static double peachCost = 0;


    public static void main(String[] args){
        Apple apple1 = new Apple(0.5);
        Apricot apricot1 = new Apricot(1);
        Peach peach1 = new Peach(0.7);
        double totalCost = apple1.calculateCost()+ apricot1.calculateCost()+ peach1.calculateCost();
        System.out.print("Общая стоимость проданных фруктов " + totalCost+ "рублей" );
        appleCost += apple1.calculateCost();
        apricotCost += apricot1.calculateCost();
        peachCost += peach1.calculateCost();

        System.out.println("\nСтоимость  проданных яблок :"+ appleCost);
        System.out.println("Стоимость  проданных абрикосов :"+ apricotCost);
        System.out.println("Стоимость  проданных персиков :" + peachCost);
    }
}
