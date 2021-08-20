import java.util.HashMap;
import java.util.Map;

import Cart.Cart;
import Product.Item;
import Product.Product;

public class Customer {
    Cart cart;

    Customer(Cart cart) {
        this.cart = cart;
    }

    void shoppingSpree() {
        Item iPad = new Item(new Product("iPad Pro"), 1);
        this.cart.add(iPad);

        Item heroInkPen = new Item(new Product("Hero Ink Pen"), 1);
        this.cart.add(heroInkPen);

        Item cricketBat = new Item(new Product("GM Cricket bat"), 2);
        this.cart.add(cricketBat);

        this.cart.remove(iPad);
    }
}
