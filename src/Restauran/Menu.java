package Restauran;

import java.util.Comparator;
import java.util.List;

public class Menu implements MenuAble{
    private String name;
    private int price;
    private int weight;
    private int timeForPreparing;





























    @Override
    public List<Menu> getAll(List<Menu> means) {
        return means;
    }


    @Override
    public void getFindByName(List<Menu> means, String word) {
        for (Menu mens : means) {
            if (mens.getName().toLowerCase().equals(word.toLowerCase())){
                System.out.println(mens);
            }
        }
    }



    @Override
    public void remove(List<Menu> means) {

    }

    @Override
    public void create(List<Menu> means) {

    }

    @Override
    public void sortByPrice(List<Menu> means, int num) {
        switch (num){
            case 1 -> {
                means.sort(Menu.sortByPriceAscending);
                for (Menu menu : means) {
                    System.out.println(
                            "\nprice: " + menu.getPrice() +
                                    "\nname: " + menu.getName() +
                                    "\nweight: " + menu.getWeight() +
                                    "\n======================================"

                    );
                }

            }
            case 2 -> {
                means.sort(Menu.sortByPriceDescending);
                for (Menu menues : means) {
                    System.out.println(
                            "\nprice: " + menues.getPrice() +
                                    "\nname: " + menues.getName() +
                                    "\nweight: " + menues.getWeight() +
                                    "\n======================================"
                    );
                }
            }
        }
    }






    @Override
    public String toString() {
        return "name : " + name + '\'' +
                "price : " + price +
                "weight : " + weight +
                "timeForPreparing : " + timeForPreparing + '\'' +
                '}';
    }

    public Menu(String name, int price, int weight, int timeForPreparing) {
        this.name = name;
        this.price = price;
        this.weight = weight;
        this.timeForPreparing = timeForPreparing;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getTimeForPreparing() {
        return timeForPreparing;
    }

    public Menu() {
    }

    public void setTimeForPreparing(int timeForPreparing) {
        this.timeForPreparing = timeForPreparing;
    }


    public static Comparator<Menu> sortByPriceAscending = new Comparator<Menu>() {
        @Override
        public int compare(Menu o1, Menu o2) {
            return o1.getPrice() - o2.getPrice();
        }
    };
    public static Comparator<Menu> sortByPriceDescending = new Comparator<Menu>() {
        @Override
        public int compare(Menu o1, Menu o2) {
            return o2.getPrice() - o1.getPrice();
        }
    };

}
