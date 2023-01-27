package model;

import java.util.ArrayList;

public class Order extends Category {
    String customer;
    int discount;
    String array_list;
    int order_id;
    int total_amount;
    ArrayList<Items> item;

    public Order(String main_category_name, String category_name, String customer, int discount, String array_list, int order_id, int total_amount, ArrayList<Items> item) {
        super(main_category_name, category_name);
        this.customer = customer;
        this.discount = discount;
        this.array_list = array_list;
        this.order_id = order_id;
        this.total_amount = total_amount;
        this.item = item;
    }

    public void order_Format(){
        System.out.println("***********************Bill***************************");
        System.out.println(this.customer);
        System.out.println("Main Category"+"  :"+this.main_category_name);
        System.out.println("Category"+"  :"+this.category_name);
        System.out.println("Items"+"  :"+this.array_list);
    }
}
