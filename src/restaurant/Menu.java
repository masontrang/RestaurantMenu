package restaurant;

import java.util.Date;

public class Menu {
    public static void main(String[] args) {
    String RESTAURANTNAME= "";
    Date lastUpdated;
//    private String categories;
//    private Hashmap<String, Array> menuItem;

        MenuItem item = new MenuItem();
        item.setName("Chicken Wings");
        item.setDescription("Wings of Chickens");
        item.setCategory("Appetizer");
        item.setPrice(10.0);
        item.setNew(true);

        System.out.println("Name: " + item.getName());
        System.out.println("Description: " + item.getDescription());
        System.out.println("Category: " + item.getCategory());
        System.out.println("Price: " + item.getPrice());
        System.out.println("New: " + item.isNew());






}
}
