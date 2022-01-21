package restaurant;

public class MenuItem {
    public static Integer itemID = 1;
    private int ID;
    public String name;
    public String description;
    public String category;
    public Double price;
    public Boolean isNew;



    public MenuItem(String name, String description, String category, Double price, Boolean isNew) {
        this.ID = itemID;
        itemID++;
        this.name = name;
        this.description = description;
        this.category = category;
        this.price = price;
        this.isNew = isNew;
    }

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isNew() {
        return isNew;
    }

    public void setNew(boolean aNew) {
        isNew = aNew;
    }
}
