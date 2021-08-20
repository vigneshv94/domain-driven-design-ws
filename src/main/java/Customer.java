import Cart.Cart;
import Product.Product;

public class Customer {
    Cart cart;

    Customer(Cart cart) {
        this.cart = cart;
    }

    void shoppingSpree() {
        Product ipad = new Product("iPad");
        Product heroInkPen = new Product("Hero Ink Pen");
        this.cart.add(ipad);
        this.cart.add(heroInkPen);
    }
}
