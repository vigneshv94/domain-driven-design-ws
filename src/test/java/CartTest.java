import Cart.Cart;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

class CartTest {
    Map<String, Integer> items = new HashMap<String, Integer>();
    void setUp() {

        items.put("iPad", 400);
    }

    @Test
    void addIpadToCart() {

        Cart cart = new Cart();
        cart.add(items.get("iPad"));
    }
}
