import Restauran.*;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        LinkedList<Menu>link = new LinkedList<>();
        link.add(new Breakfast("БЛИНЫ" ,80,100,15));
        link.add(new Breakfast("ЯИЧНИЦА ИЗ ТРЕХ ЯИЦ",150,200,15));
        link.add(new Dinner("СИНГАПУРСКАЯ ЛАКСА", 390, 400, 25));
        link.add(new Dinner("РОЛЛЫ", 120, 200, 10));
        link.add(new Lunch("ПЛОВ", 200, 800, 25));
        link.add(new Lunch("МАНТЫ", 150,500,20));
        link.add(new Drink("COCA COLA", 80,500,0));
        link.add(new Drink("PEPSI",80,500,0));
        link.add(new Drink("КРАСНЫЙ ЧАЙ",30,700,5));
        link.add(new Salat("ОВОЩНОЙ САЛАТ",50,200,10));
        link.add(new Salat("ГРЕЧЕСКИЙ САЛАТ",150, 300, 10));



         menusCatalog(link);


    }

    public static void menusCatalog(List<Menu>meannss){
        while (true) {
            Scanner scanner = new Scanner(System.in);
            Scanner scanner1 = new Scanner(System.in);
            commands();
            Menu means = new Menu();
            int num = scanner1.nextInt();
            switch (num) {
                case 1 -> {
                    System.out.println("======================= MENU =======================");
                    means.getAll(meannss).forEach(System.out::println);

                }
                case 2 -> {
                    System.out.println("Write food's name:");
                    String word = scanner.nextLine();
                    means.getFindByName(meannss, word);
                }
                case 3 -> {
                    System.out.println("Press 1 to sort by ascending\nPress 2 to sort by descending");
                    int number = scanner.nextInt();
                    means.sortByPrice(meannss, number);
                }


            }
        }
    }
    public static void commands(){
        System.out.println("""
                         =========Welcome!!!=========
                         --------------MENU-------------
                         Press 1 to All means
                         Press 2 to find by name mean
                         Press 3 to sort by price
                         THANK YOU!!1""");
    }


}