package restaurant;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import restaurant.MenuItem;


public class Menu {

    private static final String RESTAURANTNAME= "Food Place";
    private static Date lastUpdated = new Date(1642296246795L);
    private String categories;

    ArrayList<MenuItem> menuItems = new ArrayList<>();
    public Menu(ArrayList<MenuItem> menuItems) {
        this.menuItems = menuItems;
    }


//    MenuItem.setName("Potato")

    public static void printMenu(ArrayList<MenuItem> items) {
        System.out.println("**********************" + RESTAURANTNAME + "**********************");
        System.out.println("*** Menu Last Updated: "+ lastUpdated + "***");
        for (int i = 0; i < items.size(); i++) {
            System.out.println("***");
            System.out.println("Name: " + items.get(i).getName());
            System.out.println("Description: " + items.get(i).getDescription());
            System.out.println("Category: " + items.get(i).getCategory());
            System.out.println("Price: " + items.get(i).getPrice());
            System.out.println("New Item: " + items.get(i).isNew());
        }


    }

    public static void addItems(ArrayList<MenuItem> items) {
            Scanner input = new Scanner(System.in);

                System.out.println("***Add Items Menu (Type x to Exit)***");

                System.out.println("How Many Items to Add: ");
                int itemQuantity = input.nextInt();

                for(int i = 0; i<itemQuantity; i++) {

                    System.out.println("Input Name: ");
                    String nameInput = input.next();

                    System.out.println("Input Description: ");
                    String descriptionInput = input.next();

                    System.out.println("Input Category: ");
                    String categoryInput = input.next();

                    System.out.println("Input Price: ");
                    Double priceInput = input.nextDouble();

                    System.out.println("Input is Item New (true/false): ");
                    Boolean isNewInput = input.nextBoolean();

                    MenuItem addItem = new MenuItem(nameInput, descriptionInput, categoryInput, priceInput, isNewInput);
                    items.add(addItem);
                }
                lastUpdated = new Date();

            System.out.println("Here is the new menu with added items");
            printMenu(items);
        }


}

