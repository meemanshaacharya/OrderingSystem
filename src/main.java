import model.Items;
import model.Order;

import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        ArrayList<Items> item =new ArrayList<>();
        Items customer1=new Items("momo",160);
        Items customer2=new Items("pizza",460);
        Items customer3=new Items("ice_cream",100);

        item.add(customer1);
        item.add(customer2);
        item.add(customer3);
Order order1=new Order("Snacks","Momo","Deepa",20, "item",345,45,item);
order1.order_Format();
    }
}
