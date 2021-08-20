package Cart;

import java.util.ArrayList;
import java.util.List;

import Product.Item;

public class Cart {
    List<Item> itemList = new ArrayList<Item>();

    Cart() {
    }

    public void add(Item item) {
        this.itemList.add(item);
    }
}
