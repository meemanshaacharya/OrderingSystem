package model;

public class Items extends Customer {
    String item_name;
    int item_price;

    public Items(String item_name, int item_price) {
        this.item_name = item_name;
        this.item_price = item_price;
    }
}
