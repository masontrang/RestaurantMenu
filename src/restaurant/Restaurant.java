package restaurant;

import java.util.ArrayList;
import java.util.Scanner;

public class Restaurant {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<MenuItem> menuItems = new ArrayList<>();

        MenuItem item1 = new MenuItem( "Chicken Wings", "Wings of Chickens", "Appetizer", 15.0, true);
        menuItems.add(item1);
        MenuItem item2 = new MenuItem( "French Fries", "Fries from France", "Appetizer", 10.0, true);
        menuItems.add(item2);
        MenuItem item3 = new MenuItem( "Cheese Curds", "Curds of Cheese", "Appetizer", 12.0, true);
        menuItems.add(item3);

        Menu menu = new Menu(menuItems);
        System.out.println("Welcome to the " + menu.RESTAURANTNAME + " menu");

        while(true) {
            System.out.println("Please make a selection from the choices below: \n 1-Print Menu \n 2-Add Items \n 3-Remove Items \n 4-Compare Two Menu Items \n 5-View Menu Last Updated Date");
            Integer userInput = input.nextInt();
            if (userInput == 1) {
                menu.printMenu();
            }
            if (userInput == 2) {
                menu.addItems();
            }
            if (userInput == 3) {
                menu.removeItems();
            }
            if (userInput == 4) {
                menu.checkItems();
            }
            if (userInput == 5) {
                menu.lastUpdated();
            }
        }
    }

}