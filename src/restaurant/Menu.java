package restaurant;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Menu {

    public static final String RESTAURANTNAME= "Yummy Food";
    private static Date lastUpdated = new Date(1642296246795L);

    ArrayList<MenuItem> menuItems = new ArrayList<>();
    public Menu(ArrayList<MenuItem> menuItems) {
        this.menuItems = menuItems;
    }

    public void printMenu() {
        Scanner input = new Scanner(System.in);
        System.out.println("Please select from the options below: ");
        System.out.println("1-Print Whole Menu \n2-Print Single Item");
        Integer printOption = input.nextInt();

        if (printOption == 1) {
            printWholeMenu();
        }
        if (printOption == 2) {
            System.out.println("Enter Item ID# to Print:");
            Integer printSelection = input.nextInt();
            for (int i=0; i<this.menuItems.size(); i++) {
                if (this.menuItems.get(i).getID() == printSelection) {
                    System.out.println("***");
                    System.out.println("Item ID#: " + this.menuItems.get(i).getID());
                    System.out.println("Name: " + this.menuItems.get(i).getName());
                    System.out.println("Description: " + this.menuItems.get(i).getDescription());
                    System.out.println("Category: " + this.menuItems.get(i).getCategory());
                    System.out.println("Price: " + this.menuItems.get(i).getPrice());
                    System.out.println("New Item: " + this.menuItems.get(i).isNew());
                }
            }
        }
    }

    public void printWholeMenu(){
        System.out.println("**********************" + RESTAURANTNAME + "**********************");
        System.out.println("*** Menu Last Updated: " + lastUpdated + "***");
        for (int i = 0; i < this.menuItems.size(); i++) {
            System.out.println("***");
            System.out.println("Item ID#: " + this.menuItems.get(i).getID());
            System.out.println("Name: " + this.menuItems.get(i).getName());
            System.out.println("Description: " + this.menuItems.get(i).getDescription());
            System.out.println("Category: " + this.menuItems.get(i).getCategory());
            System.out.println("Price: " + this.menuItems.get(i).getPrice());
            System.out.println("New Item: " + this.menuItems.get(i).isNew());
        }
    }
    public void addItems() {
            Scanner input = new Scanner(System.in).useDelimiter("\n");

                System.out.println("***Add Items Menu (Type x to Exit)***");

                System.out.println("How Many Items to Add: ");
                int itemQuantity = input.nextInt();

                for(int i = 0; i<itemQuantity; i++) {
//                    Integer ID = this.menuItems.size() + 1;
//                    Integer ID = getID();
//                    System.out.println("Item ID#: " + ID);

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
                    this.menuItems.add(addItem);
                }
                lastUpdated = new Date();

            System.out.println("Here is the new menu with added items");
            this.printWholeMenu();
        }

    public void removeItems() {
        Scanner input = new Scanner(System.in);
        this.printWholeMenu();
        System.out.println("Which item would you like to remove? (Input Item ID#)");
        Integer removeSelection = input.nextInt();

        for (int i=0; i<menuItems.size(); i++){
            if (this.menuItems.get(i).getID() == removeSelection){
                this.menuItems.remove(i);
            }
        }
        lastUpdated = new Date();
        System.out.println("Here is the new menu with items removed");
        this.printWholeMenu();
    }

    public void checkItems(){
        Scanner input = new Scanner(System.in);
        this.printWholeMenu();
        System.out.println("What is the first item would you like to compare? (Input Item ID#)");
        Integer compare1 = input.nextInt();
        System.out.println("What is the second item would you like to compare? (Input Item ID#)");
        Integer compare2 = input.nextInt();

        Integer item1Index = 0;
        Integer item2Index = 0;

        for (int i=0; i<menuItems.size(); i++){
            if (this.menuItems.get(i).getID() == compare1){
                item1Index = i;
            }
            if (this.menuItems.get(i).getID() == compare2){
                item2Index = i;
            }
        }

        if (this.menuItems.get(item1Index).equals(this.menuItems.get(item2Index))){
            System.out.println("The items are the same");
        }
        else{
            System.out.println("The items are not the same");
        }
    }

    public void lastUpdated(){
        System.out.println("*** Menu Last Updated: "+ lastUpdated + "***");
    }
}

