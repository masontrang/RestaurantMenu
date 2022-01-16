package restaurant;

import java.util.ArrayList;
import java.util.HashMap;

public class Restaurant {
    public static void main(String[] args) {

        ArrayList<MenuItem> menuItems = new ArrayList<>();
        MenuItem item1 = new MenuItem("Chicken Wings", "Wings of Chickens", "Appetizer", 15.0, true);
        menuItems.add(item1);
        MenuItem item2 = new MenuItem("French Fries", "Fries from France", "Appetizer", 10.0, true);
        menuItems.add(item2);
        MenuItem item3 = new MenuItem("Cheese Curds", "Curds of Cheese", "Appetizer", 12.0, true);
        menuItems.add(item3);

        Menu.printMenu(menuItems);
        Menu.addItems(menuItems);



//        for (int i = 0; i< menuItems.size(); i++) {
//            System.out.println("Name: " + menuItems.get(i).getName());
//            System.out.println("Description: " + menuItems.get(i).getDescription());
//            System.out.println("Category: " + menuItems.get(i).getCategory());
//            System.out.println("Price: " + menuItems.get(i).getPrice());
//            System.out.println("New Item: " + menuItems.get(i).isNew());
//        }



//        MenuItem item = new MenuItem("Chicken Wings", "Wings of Chickens", "Appetizer", 10.0, true);
//        System.out.println("Name: " + item.getName());
//        System.out.println("Description: " + item.getDescription());
//        System.out.println("Category: " + item.getCategory());
//        System.out.println("Price: " + item.getPrice());
//        System.out.println("New: " + item.isNew());
//        printMenu(item);
    }

//    public static ArrayList<MenuItem> baseMenu() {
//
//
//    }





//    public static ArrayList<HashMap<String, String>> addItem(){
//    return 0 ;
//    }

//    public static String printMenu(item){
//        System.out.println("Name: " + item.getName());






}
